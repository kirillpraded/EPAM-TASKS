package com.company.components;

import java.io.Serializable;

public class Сhamomile extends Flower implements Serializable {
    private String description;

    public Сhamomile(String description) {
        super("Chamomile");
        this.description = description;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Type: " + this.getName()+ "; " + this.description;
    }
}
