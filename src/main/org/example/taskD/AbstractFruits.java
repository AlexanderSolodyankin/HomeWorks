package org.example.taskD;

public abstract class AbstractFruits {
    private String name;
    private boolean integrity;

    public AbstractFruits(String name, boolean integrity) {
        this.name = name;
        this.integrity = integrity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isIntegrity() {
        return integrity;
    }

    public void setIntegrity(boolean integrity) {
        this.integrity = integrity;
    }

    @Override
    public String toString() {
        return String.format("%s: %s",name, integrity?"Червивые" : "Хорошие");
    }
}
