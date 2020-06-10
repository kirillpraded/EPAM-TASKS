package com.company;

public class Tour {
    private String city;
    private TypeOfTour type;
    private TypeOfTransport transport;
    private TypeOfFood food;
    private int amountOfDays;
    private double price;

    public Tour(String city, TypeOfTour type, TypeOfTransport transport, TypeOfFood food, int amountOfDays, double price) {
        this.city = city;
        this.type = type;
        this.transport = transport;
        this.food = food;
        this.amountOfDays = amountOfDays;
        this.price = price;
    }


    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public TypeOfTour getType() {
        return type;
    }

    public void setType(TypeOfTour type) {
        this.type = type;
    }

    public TypeOfTransport getTransport() {
        return transport;
    }

    public void setTransport(TypeOfTransport transport) {
        this.transport = transport;
    }

    public TypeOfFood getFood() {
        return food;
    }

    public void setFood(TypeOfFood food) {
        this.food = food;
    }

    public int getAmountOfDays() {
        return amountOfDays;
    }

    public void setAmountOfDays(int amountOfDays) {
        this.amountOfDays = amountOfDays;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
