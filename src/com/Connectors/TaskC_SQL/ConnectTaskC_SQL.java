package com.Connectors.TaskC_SQL;

public interface ConnectTaskC_SQL {
    void CreateTableSQL(String write);
    void InsertTable(String insert);
    void addColumsInTable(String table, String column);

}
