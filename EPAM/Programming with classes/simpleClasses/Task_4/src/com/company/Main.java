package com.company;

import java.text.ParseException;

//4. Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления.
//Создайте данные в массив из пяти элементов типа Train, добавьте возможность сортировки элементов массива по
//номерам поездов. Добавьте возможность вывода информации о поезде, номер которого введен пользователем.
//Добавьте возможность сортировки массив по пункту назначения, причем поезда с одинаковыми пунктами
//назначения должны быть упорядочены по времени отправления.
public class Main {

    public static void main(String[] args) throws ParseException {
        Train [] trains = new Train[5];
        trains[0] = new Train("Minsk", 537, "14:31");
        trains[1] = new Train("Vilnius", 12, "12:00");
        trains[2] = new Train("Moscow", 221, "13:44");
        trains[3] = new Train("Berlin", 1, "05:22");
        trains[4] = new Train("Kiev", 76, "08:20");
        //сортировка по номерам
        Train.sortByNumber(trains);
        //поезд по номеру
        System.out.println();
        System.out.println((Train.getTrainByNumber(trains, 133)).toString());
        //сортировка по пункту назначения
        System.out.println();
        Train.sortByDestinationPlace(trains);
    }
}
