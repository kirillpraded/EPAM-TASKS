package com.company.components;

import java.io.Serializable;

public abstract class Flower implements Serializable {
    private String name;


    public Flower(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public abstract String getDescription();

    public abstract void setDescription(String description);

    public void setName(String name) {
        this.name = name;
    }
    @Override
    public abstract String toString();
}

