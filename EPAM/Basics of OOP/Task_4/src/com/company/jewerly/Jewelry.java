package com.company.jewerly;

public class Jewelry extends Treasure {

    private String descriptionOfTreasure;

    public Jewelry(String name, double value, String descriptionOfTreasure) {
        super.setName(name);
        super.setPrice(value);
        this.descriptionOfTreasure = descriptionOfTreasure;
    }

    @Override
    public String getDescription() {
        return descriptionOfTreasure;
    }

    @Override
    public void setDescription(String description) {
        descriptionOfTreasure = description;
    }


    @Override
    public String toString() {
        return ("Name: "+  super.getName() + "; price: " + super.getPrice() + "; jewelry: " + descriptionOfTreasure);
    }
}
