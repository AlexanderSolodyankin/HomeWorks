package com.company;

public enum YearsMonth {
    JANUERY(1),
    FEBRUARY(2),
    MARCH(3),
    APRIL(4),
    MAY(5),
    JUNE(6),
    JULE(7),
    AUGUST(8),
    SEPTEMBER(9),
    OKTOBER(10),
    NOVEMBER(11),
    DESEMBER(12);

    private int countMonth;

    YearsMonth(){}
    private YearsMonth(int countMonth){
        this.countMonth = countMonth;
    }
    public int getCountMounth(){
        return countMonth;
    }
}
