package com.company;




public class Main {

    public static void main(String[] args) {
        AbstractClothes shorts = new Shorts();
        shorts.getLeftPacket().putObject(new BisnesCard());
        shorts.getLeftPacket().putObject(new Money());
        shorts.getLeftPacket().putObject(new Note());
        shorts.getRightPacket().putObject(new Clip());
        shorts.getRightPacket().putObject(new Coin());
        shorts.getRightPacket().putObject(new Key());
        System.out.println(shorts);





    }
}

