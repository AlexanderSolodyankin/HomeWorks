package com.company;

public class HomeGeneric <T, E>{
    private T type;
    private E enit;

    public T getType() {
        return type;
    }

    public void setType(T type) {
        this.type = type;
    }

    public E getEnit() {
        return enit;
    }

    public void setEnit(E enit) {
        this.enit = enit;
    }

    public String getClassInfoT(){
       return  "Ferst class: " + type.getClass() + " hashCode: " + type.hashCode();
    }


    public String getClassInfoE(){
        return  "Second class: " + enit.getClass() + " hashCode: " + enit.hashCode();
    }

    public boolean check(){
        return type.hashCode() == enit.hashCode();
    }
}

/**
 * Для чего нужны Generics?
 * удобство использования методов общих для всех обьектов и классов.
 * Абстрактные возможности котоыре позволяют не повторять постоянно повторяющиеся код.
 * как примермассив в качестве хранения большого количества данных.
 *
 * Примеры Generic классов в Java?
 * листы, мапы, клас Object, цикл foreach
 *
 * Почему плохо создавать поля так: Object value; нежели T value?
 * потому что может произойти колизия в логике что приведет к ошибке.
 * и чтобы не было путаницы в использовании того или другого метода за ним закрепляется класс
 * что позволяет не путаться в использовании одного и того же генерика.
 * так же не вижу смысл обьявлять Object в геенерике так как сам класс object в него можно передать.
 */
