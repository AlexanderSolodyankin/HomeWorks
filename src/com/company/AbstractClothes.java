package com.company;

public abstract class AbstractClothes {
    private AbstractPacket leftPacket;
    private AbstractPacket rightPacket;

    public AbstractClothes(AbstractPacket leftPacket, AbstractPacket rightPacket) {
        this.leftPacket = leftPacket;
        this.rightPacket = rightPacket;
    }
    public AbstractClothes() {
        this.leftPacket = new LeftPacket();
        this.rightPacket = new RightPacket();
    }

    public AbstractPacket getLeftPacket() {
        return leftPacket;
    }

    public void setLeftPacket(AbstractPacket leftPacket) {
        this.leftPacket = leftPacket;
    }

    public AbstractPacket getRightPacket() {
        return rightPacket;
    }

    public void setRightPacket(AbstractPacket rightPacket) {
        this.rightPacket = rightPacket;
    }

    @Override
    public String toString(){

        return String.format("В левом кормане лежит: %s\n" +
                "В правом кормане лежит: %s", leftPacket.showLed(), rightPacket.showLed());

    }
}

