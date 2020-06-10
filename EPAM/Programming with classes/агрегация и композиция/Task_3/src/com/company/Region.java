package com.company;

import java.util.ArrayList;

public class Region {
    private City city;
    private ArrayList<Area> areas;
    private double square;

    public Region(City city, ArrayList<Area> areas, double square) {
        this.city = city;
        this.areas = areas;
        this.square = square;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public ArrayList<Area> getAreas() {
        return areas;
    }

    public void setAreas(ArrayList<Area> areas) {
        this.areas = areas;
    }

    public double getSquare() {
        return square;
    }

    public void setSquare(double square) {
        this.square = square;
    }
}
