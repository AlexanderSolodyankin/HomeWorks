package com.company;

import java.util.Objects;

public class Day {
    private String month;
    private int numb;

    public Day() {
    }

    public Day(String month, int numb) {
        this.month = month;
        this.numb = numb;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public int getNumb() {
        return numb;
    }

    public void setNumb(int numb) {
        this.numb = numb;
    }

    @Override
    public String toString() {
        return String.format("День недели: %s, Число: %s", month, numb);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Day day = (Day) o;
        return this.month.equals(day.getMonth());
    }

    @Override
    public int hashCode() {
//        return Objects.hash(month, numb);
        return 1;
    }
}
