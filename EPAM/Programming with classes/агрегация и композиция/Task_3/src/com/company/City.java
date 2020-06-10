package com.company;

public class City {
    private String name;
    private boolean isCapital;

    public City(String name, boolean isCapital) {
        this.name = name;
        this.isCapital = isCapital;
    }

    public boolean isCapital() {
        return isCapital;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "City {" +
                "name='" + name + '\'' +
                '}';
    }
}
