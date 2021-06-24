package com.RandomSetupNames;

public class SetupName {
    private static final RandomName maleName;
    private static final RandomName womanName;

    static {
        maleName = new RandomMaleName();
        womanName = new RandomWomanNames();
    }

    public static RandomName getName(Gender name){
        switch (name){
            case WOMANS: return maleName;
            case MALES: return womanName;
        }
        throw new RuntimeException();
    }

}
