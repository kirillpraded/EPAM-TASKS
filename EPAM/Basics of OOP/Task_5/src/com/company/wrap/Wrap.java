package com.company.wrap;

import java.io.Serializable;

public  class Wrap implements Serializable {
    private Color color;
    private String description;

    public Wrap(Color color, String description) {
        this.color = color;
        this.description = description;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return
                "color=" + color +
                ", description='" + description + '\'' +
                '}';
    }
}
