package com.company;

public class OldGenerics {
    private Object val;

    public OldGenerics(Object arg) {
        val = arg;
    }

    public String toString() {
        return "(" + val + ")";
    }

    public Object getVal() {
        return val;
    }

}
