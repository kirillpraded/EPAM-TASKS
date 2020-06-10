package com.company;

import java.util.ArrayList;

public class Country {
    private ArrayList<Region> regions;
    private double square;

    public Country(ArrayList<Region> regions) {
        this.regions = regions;
        for(Region region : regions) {
            this.square += region.getSquare();
        }
    }

    public ArrayList<Region> getRegions() {
        return regions;
    }
//етоды: вывести на консоль
////столицу, количество областей, площадь, областные центры.
    public int getAmountOfPages(){
        return regions.size();
    }

    public City getCapital(){
        for (Region region : regions){
            City capital = region.getCity();
            if (capital.isCapital()){
                return capital;
            }
        }
        return null;
    }
    public int getAmountOfCentres(){
        return regions.size();
    }

    public void getCentres(){
        for (Region region : regions){
            City city = region.getCity();
            System.out.print(city + ", ");
        }
    }

    public void setRegions(ArrayList<Region> regions) {
        this.regions = regions;
    }

    public double getSquare() {
        return square;
    }

    public void setSquare(double square) {
        this.square = square;
    }
}
