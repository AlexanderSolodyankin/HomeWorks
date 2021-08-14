package org.example.Connectors;



public interface ConnectSQL_Interface {
    void createTableSQL(String write);
    void insertTable(String insert);
    void addColumsInTable(String table, String column);

}
