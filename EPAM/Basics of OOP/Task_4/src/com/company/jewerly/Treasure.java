package com.company.jewerly;

public abstract class Treasure {
    private String name;
    private double price;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public abstract String getDescription();

    public abstract void setDescription(String description);

    @Override
    public abstract String toString();
}
