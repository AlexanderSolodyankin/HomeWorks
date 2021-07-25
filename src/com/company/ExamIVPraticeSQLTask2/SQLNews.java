package com.company.ExamIVPraticeSQLTask2;

import com.Connectors.PostgreSQL_Connect;


import javax.xml.crypto.Data;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class SQLNews extends PostgreSQL_Connect implements NewsSQLConect {
    @Override
    public void InsertNews(String heading, String text, String data) {
        try(Connection connection = connect();
            PreparedStatement statement = connection.prepareStatement
                    (String.format("insert into news_Alexander(name_news, news_info,data_news)" +
                            "values('%s','%s','%s');", heading, text, data))){
            statement.executeUpdate();
            System.err.println("Данные успешно внесены в Базу данных");
        }catch (Exception e){
            System.err.println(e.getClass().getName()+": "+e.getMessage());
            System.exit(0);
        }
    }

    @Override
    public List<News> OutNews() {
        List<News> newsAll = new ArrayList<>();
        try (Connection connection = connect();
        PreparedStatement statement = connection.prepareStatement("select * from news_Alexander;");
             ResultSet resultSet = statement.executeQuery()){

            while (resultSet.next()){
                News news = new News();
                news.setId(resultSet.getInt("id"));
                news.setHead(resultSet.getString("name_news"));
                news.setText(resultSet.getString("news_info"));
                news.setPublication(resultSet.getString("data_news"));
                newsAll.add(news);
            }
            System.err.println("Получение данных успешно");
        }catch (Exception e){
            System.err.println(e.getClass().getName()+": " + e.getMessage());
            System.exit(0);
        }
        return newsAll;
    }

    @Override
    public void DeleteWriteNews(int numID) {
        try(Connection connection = connect(); Statement statement = connection.createStatement()){
            statement.executeUpdate(String.format
                    ("delete  from news_alexander where id = %s;", numID));
            System.err.println("Данные успешно удалены");

        }catch (Exception e){
            System.err.println(e.getClass().getName()+": " + e.getMessage());
            System.exit(0);
        }
    }

    @Override
    public void UpdeitNews(String heading, String text, int id) {
        try(Statement statement = connect().createStatement()){
            statement.executeUpdate(String.format("update  news_alexander set \"name_news\" = '%s'" +
                    "where id = %s;" +
                    "update  news_alexander set \"news_info\" = '%s'" +
                    "where id = %s;", heading, id, text, id));

            System.err.println("Изменение текста в таблице произошло успешно");
        }catch (Exception e){
            System.err.println(e.getClass().getName()+": " + e.getMessage());
            System.exit(0);
        }
    }
}
