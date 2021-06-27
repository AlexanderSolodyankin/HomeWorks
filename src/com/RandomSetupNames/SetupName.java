package com.RandomSetupNames;

public class SetupName {
    private static final RandomName maleName;
    private static final RandomName womanName;

    static {
        maleName = new RandomWomansName();
        womanName = new RandomMalesNames();
    }

    public static RandomName getName(Gender name){
        switch (name){
            case MALES: return maleName;
            case WOMANS: return womanName;
        }
        throw new RuntimeException();
    }

}
