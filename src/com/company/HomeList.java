package com.company;

import java.util.Arrays;

public class HomeList<T>{
    private T value;
    private T[] array;

    public HomeList() {
        this.array = (T[]) new Object[0];
    }

    public T getFerstElement(){
        return this.array[0];
    }
    public T getLastElement(){
        return this.array[this.array.length -1];
    }
    public T getElementByIndex(int a){
        return this.array[a];
    }

    public int getIndexElement(T element){
        for (int i = 0; i < this.array.length; i++) {
            if(element.equals(this.array[i])){
                return i;
            }
        }
        return -1;
    }

    public void addElement(T element){
        this.array = newArray(this.array);
        this.value = element;
        this.array[this.array.length -1] = this.value;
    }


    public T[] newArray(T[] arr){
        T[] newArr = (T[]) new Object[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        return (T[]) newArr;
    }

    public T getNextElement(T element){
        int index = getIndexElement(element);
        if(index >= 0){
         return  getNextElement(index);
        }
        return null;
    }
    public T getPreviosElement(T element){
        int index = getIndexElement(element);
        if(index >= 0){
            return  getPreviosElement(index);
        }
        return null;
    }


    public T getNextElement(int a){
        if(this.array[a+1]!= null){
            return this.array[a+1];
        }else
           System.out.println("Not foundelement in array!!!!!");
        return null;
    }
    public T getPreviosElement(int a){
        if(this.array[a-1]!= null){
            return this.array[a-1];
        }else
            System.out.println("Not foundelement in array!!!!!");
        return null;
    }

}
