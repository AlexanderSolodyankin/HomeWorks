package com.company.TaskA;

import java.util.List;

public interface ThePour {
    static void thePour(List<Liquid> list){
        for ( Liquid element: list) {
            if(element instanceof Juice) element.thePour();
        }
    }
}
