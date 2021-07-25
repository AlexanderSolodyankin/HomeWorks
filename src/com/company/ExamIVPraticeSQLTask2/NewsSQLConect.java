package com.company.ExamIVPraticeSQLTask2;

import java.util.List;

public interface NewsSQLConect {
    void InsertNews(String heading, String text, String date);
    List<News> OutNews();
    void DeleteWriteNews(int numID);
    void UpdeitNews(String heading, String text, int id);
}
