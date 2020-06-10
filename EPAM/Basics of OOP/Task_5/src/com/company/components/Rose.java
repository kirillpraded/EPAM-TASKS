package com.company.components;

import java.io.Serializable;
import java.util.Objects;

public class Rose extends Flower implements Serializable {
    private String description;

    public Rose(String description) {
        super("Rose");
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
