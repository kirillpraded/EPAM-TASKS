package com.company;

import java.util.ArrayList;
import java.util.Comparator;

public class TourManager {
    private String name;
    private ArrayList<Tour> tours;
    private ArrayList<Tourist> tourists;

    public TourManager(String name) {
        this.name = name;
        this.tours = new ArrayList<>();
        this.tourists = new ArrayList<>();
    }

    public void addTour(Tour tour){
        this.tours.add(tour);
    }
    public void addTourist(Tourist tourist, Tour tour){
        tourist.setTour(tour);
        tourists.add(tourist);
    }

    public ArrayList<Tour> findByTour(TypeOfTour typeOfTour){
        ArrayList<Tour> tourByType = new ArrayList<>();
        for(Tour tour : tours){
            if(tour.getType().equals(typeOfTour)){
                tourByType.add(tour);
            }
        }
        return tourByType;
    }
    public ArrayList<Tour> findByTransport (TypeOfTransport transport){
        ArrayList<Tour> packages = new ArrayList<>();
        for (Tour tour : tours) {
            if (tour.getTransport().equals(transport)) {
                packages.add(tour);
            }
        }
        return packages;
    }
    public ArrayList<Tour> findByFood (TypeOfFood food){
        ArrayList<Tour> packages = new ArrayList<>();
        for (Tour tour : tours) {
            if (tour.getFood().equals(food)) {
                packages.add(tour);
            }
        }
        return packages;
    }


    public static void printTours (ArrayList<Tour> packages) {
        if (packages.size() == 0) {
            System.out.println("not found");
            return;
        }
        for (Tour tour : packages) {
            System.out.println("Город: "+tour.getCity()+ "; Тип: "+ tour.getType()+"; Транспорт: "+ tour.getTransport()+
                    "; Тип питания: " + tour.getFood()+"; Количество дней: "+ tour.getAmountOfDays()+"; Стоимость: "+ tour.getPrice());
        }
    }

    public void sortByPrice() {
        tours.sort(Comparator.comparing(Tour::getPrice));
    }

    public void sortByNumberOfDays() {
        tours.sort(Comparator.comparing(Tour::getAmountOfDays));
    }

    public static void sortByPrice(ArrayList<Tour> tour) {
        tour.sort(Comparator.comparing(Tour::getPrice));
    }

    public static void sortByNumberOfDays(ArrayList<Tour> tour) {
        tour.sort(Comparator.comparing(Tour::getAmountOfDays));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Tour> getTours() {
        return tours;
    }

    public void setTours(ArrayList<Tour> tours) {
        this.tours = tours;
    }

    public ArrayList<Tourist> getTourists() {
        return tourists;
    }

    public void setTourists(ArrayList<Tourist> tourists) {
        this.tourists = tourists;
    }
}
