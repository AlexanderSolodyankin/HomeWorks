package com.company;


import com.Connectors.ConnectSQL_BaseClass;
import com.Connectors.ConnectSQL_Interface;
import com.company.ExamIVPraticeSQLTask2.News;
import com.company.ExamIVPraticeSQLTask2.NewsSQLConect;
import com.company.ExamIVPraticeSQLTask2.SQLNews;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        // Создание таблицы с проверкой на ее существования
        ConnectSQL_Interface table = new ConnectSQL_BaseClass();
        table.DDLInterface("create table if not exists news_Alexander(" +
                " id serial primary key," +
                "name_news varchar(100) not null," +
                "news_info varchar(500) not null," +
                "data_news timestamp not null);");
        System.out.println();
        // создание строки в таблице
        NewsSQLConect delyNews = new SQLNews();
        delyNews.InsertNews("Новые новости",
                "Сегодня на повестке дня идет новое создание строки по новостям", "2021-07-25 13:59");
        System.out.println();

        // перенос информации из таблицы в массив для вывода на консоль
        List<News> allNews = delyNews.OutNews();
        for (int i = 0; i < allNews.size(); i++) {
            System.out.println(allNews.get(i).getHead());
            System.out.println(allNews.get(i).getText());
        }
        System.out.println();
        /*
         * При выводе даты постоянно выводит ошибку не могу понять в чем причина
         * java.lang.ClassCastException: class java.sql.Date cannot be cast to class javax.xml.crypto.Data
         * (java.sql.Date is in module java.sql of loader 'platform'; javax.xml.crypto.Data is in module
         * java.xml.crypto of loader 'platform')
         *  по данной причине я сдался и перестал использовать класс DATA
         */

        // Изменение текста в таблице
        delyNews.UpdeitNews("Измененый заголовок","Текст после Изменения", 1);
        System.out.println();
        allNews = delyNews.OutNews();
        for (int i = 0; i < allNews.size(); i++) {
            System.out.println(allNews.get(i).getHead());
            System.out.println(allNews.get(i).getText());
        }
        System.out.println();

        // Удоление строки в таблице
        delyNews.DeleteWriteNews(1);
        System.out.println();

        //Удаление таблицы из базы данных
        table.DDLInterface("drop table news_Alexander cascade;");
    }
}

