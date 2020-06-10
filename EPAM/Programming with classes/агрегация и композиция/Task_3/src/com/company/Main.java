package com.company;

import java.util.ArrayList;
import java.util.Scanner;

//3. Создать объект класса Государство, используя классы Область, Район, Город. Методы: вывести на консоль
//столицу, количество областей, площадь, областные центры.
public class Main {

    public static void main(String[] args) {
        ArrayList<Area> areas = new ArrayList<Area>();
        areas.add(new Area("area1"));
        areas.add(new Area("area2"));

        ArrayList<Area> areas2 = new ArrayList<Area>();
        areas2.add(new Area("area3"));
        areas2.add(new Area("area4"));

        ArrayList<Area> areas3 = new ArrayList<Area>();
        areas3.add(new Area("area5"));
        areas3.add(new Area("area6"));

        ArrayList<Area> areas4 = new ArrayList<Area>();
        areas4.add(new Area("area7"));
        areas4.add(new Area("area8"));

        ArrayList<Area> areas5 = new ArrayList<Area>();
        areas5.add(new Area("area9"));
        areas5.add(new Area("area10"));

        ArrayList<Area> areas6 = new ArrayList<Area>();
        areas6.add(new Area("area11"));
        areas6.add(new Area("area12"));

        ArrayList<Region> regions = new ArrayList<>();
        regions.add(new Region(new City("Minsk", true), areas, 39854.0));
        regions.add(new Region(new City("Vitebsk", false), areas2, 40051.0));
        regions.add(new Region(new City("Brest", false), areas3, 32700.0));
        regions.add(new Region(new City("Gomel", false), areas4, 40372.0));
        regions.add(new Region(new City("Grodno", false), areas5, 25100.0));
        regions.add(new Region(new City("Mogilev", false), areas6, 35043.0));

        Country belarus = new Country(regions);
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("\n1)Узнать столицу" +
                    "\n2)Узнать количество областей" +
                    "\n3)Узнать площадь страны" +
                    "\n4)Областные центры\n");
            int i = scanner.nextInt();
            if(i == 0){break;}
            switch (i){
                case 1:
                    System.out.println("Столица - " + belarus.getCapital());
                    break;
                case 2:
                    System.out.println("Количество областей - " + belarus.getAmountOfCentres());
                    break;
                case 3:
                    System.out.println("Площадь страны - " + belarus.getSquare());
                    break;
                case 4:
                    System.out.println("Областные центры: ");
                    belarus.getCentres();
                    break;
            }
        }
        scanner.close();
    }
}
