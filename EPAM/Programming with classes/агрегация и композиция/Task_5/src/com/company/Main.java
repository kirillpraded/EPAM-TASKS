package com.company;

import java.util.ArrayList;

//5. Туристические путевки. Сформировать набор предложений клиенту по выбору туристической путевки
//различного типа (отдых, экскурсии, лечение, шопинг, круиз и т. д.) для оптимального выбора. Учитывать
//возможность выбора транспорта, питания и числа дней. Реализовать выбор и сортировку путевок.
public class Main {

    public static void main(String[] args) {

        TourManager tourManager = new TourManager("TEZ TOUR");
        Tourist tourist = new Tourist("Kirill Praded");

        tourManager.addTour(new Tour("Барселона", TypeOfTour.SHOPPING,
                TypeOfTransport.BUS, TypeOfFood.NO_FOOD, 14, 250.0));
        tourManager.addTour(new Tour("Рио-де-Жанейро", TypeOfTour.EXCURSION,
                TypeOfTransport.AIRPLANE, TypeOfFood.ALL_INCLUSIVE, 5, 1000.0));
        tourManager.addTour(new Tour("Лос-Анжелес", TypeOfTour.TREATMENT,
                TypeOfTransport.AIRPLANE, TypeOfFood.NO_FOOD, 12, 1049.0));
        tourManager.addTour(new Tour("Москва", TypeOfTour.EXCURSION,
                TypeOfTransport.CAR, TypeOfFood.ALL_INCLUSIVE, 7, 600.0));
        tourManager.addTour(new Tour("Прага", TypeOfTour.SHOPPING,
                TypeOfTransport.TRAIN, TypeOfFood.NO_FOOD, 3, 549.0));
        tourManager.addTour(new Tour("Мальдивы", TypeOfTour.TREATMENT,
                TypeOfTransport.AIRPLANE, TypeOfFood.ALL_INCLUSIVE, 14, 340.0));


        System.out.println("Выбор по экскурсии:");
        ArrayList<Tour> selectByTour = tourManager.findByTour(TypeOfTour.EXCURSION);
        TourManager.printTours(selectByTour);

        System.out.println("\nВыбор по типу транспорта:");
        ArrayList<Tour> selectByTransport = tourManager.findByTransport(TypeOfTransport.AIRPLANE);
        TourManager.sortByNumberOfDays(selectByTransport);
        TourManager.printTours(selectByTransport);

        System.out.println("\nВыбор по типу питания:");
        ArrayList<Tour> selectByFood = tourManager.findByFood(TypeOfFood.ALL_INCLUSIVE);
        TourManager.sortByNumberOfDays(selectByFood);
        TourManager.printTours(selectByFood);


        tourManager.addTourist(tourist, selectByFood.get(0));
    }

}
