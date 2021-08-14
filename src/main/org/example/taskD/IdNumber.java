package org.example.taskD;

public class IdNumber {
    private int id;

    public IdNumber(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "IdNumber{" +
                "id=" + id +
                '}';
    }
}
