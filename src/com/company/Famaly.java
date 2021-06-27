package com.company;

import java.util.Set;

public class Famaly {
    Set<AbstractHuman> famaly;

    public Famaly(Set<AbstractHuman> famaly) {
        this.famaly = famaly;
    }

    public Set<AbstractHuman> getFamaly() {
        return famaly;
    }

    public void setFamaly(Set<AbstractHuman> famaly) {
        this.famaly = famaly;
    }

    @Override
    public String toString() {
        return String.format("В семье %s человека", famaly.size());
    }


}
