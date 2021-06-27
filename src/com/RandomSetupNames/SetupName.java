package com.RandomSetupNames;

public class SetupName {
    private static final RandomName womansNames;
    private static final RandomName malesName;

    static {
        womansNames = new RandomWomanName();
        malesName = new RandomMalesNames();
    }

    public static RandomName getName(Gender name){
        switch (name){
            case WOMANS: return womansNames;
            case MALES: return malesName;
        }
        throw new RuntimeException();
    }

}
