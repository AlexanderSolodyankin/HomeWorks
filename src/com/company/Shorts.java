package com.company;

public class Shorts extends AbstractClothes{

    @Override
    public String toString() {
        return String.format("Шорты\n" +
                "%s",super.toString());
    }
}
