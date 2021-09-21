package com.company;

public class Element <E>{
    private E thisElem;
    private Element<E> nextElem;
    private Element<E> prevElem;

    public Element() {
    }

    public Element(E thisElem, Element<E> nextElem, Element<E> prevElem) {
        this.thisElem = thisElem;
        this.nextElem = nextElem;
        this.prevElem = prevElem;
    }

    public E getThisElem() {
        return thisElem;
    }

    public void setThisElem(E thisElem) {
        this.thisElem = thisElem;
    }

    public Element<E> getNextConteiner() {
        return nextElem;
    }

    public void setNextElem(Element<E> nextElem) {
        this.nextElem = nextElem;
    }

    public E getNextElement(){
        return this.nextElem.getThisElem();
    }

    public Element<E> getPrevConteiner() {
        return prevElem;
    }
    public E getPrevElement(){
        return this.prevElem.getThisElem();
    }

    public void setPrevElem(Element<E> prevElem) {
        this.prevElem = prevElem;
    }
}
