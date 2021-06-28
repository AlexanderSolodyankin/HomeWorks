package com.company;


import com.RandomSetupFamaly.EnumViewHous;

import com.RandomSetupFamaly.SetupHous;

public class Main {

    public static void main(String[] args) {
        AbstractHome apartaments = SetupHous.SetupHous(EnumViewHous.APARTAMENTS);
        AbstractHome hotel = SetupHous.SetupHous(EnumViewHous.HOTEL);
        AbstractHome hostel = SetupHous.SetupHous(EnumViewHous.HOSTEL);
        System.out.println(apartaments);

    }
}

