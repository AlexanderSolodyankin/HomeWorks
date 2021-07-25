package com.Connectors;

public interface ConnectSQL_Interface {
    void DDLInterface(String write);
    void DMLInterface(String insert);
    void AddColumsInTable(String table, String column);

}
