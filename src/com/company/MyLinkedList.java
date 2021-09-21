package com.company;


public class MyLinkedList<E> {
    private Element<E> ferstElem;
    private Element<E> lastElem;
    private int countElem = 0;

    public MyLinkedList() {
        this.ferstElem = new Element<>();
        this.lastElem = new Element<>();
    }

    public Element<E> getFerstElem() {
        return ferstElem;
    }

    public void setFerstElem(Element<E> ferstElem) {
        this.ferstElem = ferstElem;
    }

    public Element<E> getLastElem() {
        return lastElem;
    }

    public void setLastElem(Element<E> lastElem) {
        this.lastElem = lastElem;
    }

    public int getSize() {
        return countElem;
    }

    public void setCountElem(int countElem) {
        this.countElem = countElem;
    }

    public E getIndexElement(int index){
        Element<E> getIndex = this.ferstElem;
        for (int i = 0; i < index; i++) {
            getIndex = getIndex.getNextConteiner();
        }
        return getIndex.getThisElem();
    }



    public void addFerstElem(E ferstElem){
        if(this.ferstElem.getThisElem() != null){
            Element<E> nextElem = this.ferstElem;
            this.ferstElem = new Element<>(ferstElem,nextElem,null);
            nextElem.setPrevElem(this.ferstElem);
        }else {
            this.ferstElem.setThisElem(ferstElem);
            this.ferstElem.setNextElem(this.lastElem);
            this.ferstElem.setPrevElem(null);
        }
        this.countElem++;
    }

    public void addLastElem(E lastElem) {
        if (this.ferstElem.getThisElem() == null && this.lastElem.getThisElem() == null) {
            addFerstElem(lastElem);
        }
        if(this.ferstElem.getThisElem() != null && this.lastElem.getThisElem() == null){
            this.lastElem.setThisElem(lastElem);
            this.lastElem.setNextElem(null);
            this.lastElem.setPrevElem(ferstElem);
            this.countElem++;
        }
        if(this.lastElem.getThisElem() != null){
            Element<E> prev = this.lastElem;
            this.lastElem = new Element<>(lastElem,null,prev);
            this.countElem++;
        }
    }




}



