package com.Connectors;

public interface ConnectSQL_Interface {
    void CreateTableSQL(String write);
    void InsertTable(String insert);
    void AddColumsInTable(String table, String column);
}
