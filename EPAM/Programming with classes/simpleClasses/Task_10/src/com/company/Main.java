package com.company;

import java.text.ParseException;
import java.time.DayOfWeek;
import java.util.ArrayList;
import java.util.Date;

//10. Создать класс Airline, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы
//и метод toString(). Создать второй класс, агрегирующий массив типа Airline, с подходящими конструкторами и
//методами. Задать критерии выбора данных и вывести эти данные на консоль.
//Airline: пункт назначения, номер рейса, тип самолета, время вылета, дни недели.
//Найти и вывести:
//a) список рейсов для заданного пункта назначения;
//b) список рейсов для заданного дня недели;
//c) список рейсов для заданного дня недели, время вылета для которых больше заданног
public class Main {
    public static void print(ArrayList<Airline> arrayList){
        for(Airline airline : arrayList){
            System.out.println(airline.toString());
        }
    }

    public static void main(String[] args) throws ParseException {
	    Airport airport = new Airport("Национальный аэропорт Минск-1" );
        airport.addAirline("Москва", "2432", "Boeing 737",
                Airline.simpleDateFormat.parse("12:15"), new DayOfWeek[]{DayOfWeek.TUESDAY, DayOfWeek.WEDNESDAY,
                        DayOfWeek.THURSDAY, DayOfWeek.FRIDAY, DayOfWeek.SUNDAY});
        airport.addAirline("Рига", "9732", "Boeing 737",
                Airline.simpleDateFormat.parse("08:15"), new DayOfWeek[]{DayOfWeek.TUESDAY});
        airport.addAirline("Варшава", "4325", "Boeing 737",
                Airline.simpleDateFormat.parse("18:05"), new DayOfWeek[]{DayOfWeek.SATURDAY});
        airport.addAirline("Одесса", "1043", "Boeing 737",
                Airline.simpleDateFormat.parse("19:45"), new DayOfWeek[]{DayOfWeek.MONDAY, DayOfWeek.TUESDAY,
                        DayOfWeek.WEDNESDAY, DayOfWeek.THURSDAY, DayOfWeek.FRIDAY, DayOfWeek.SATURDAY});
        airport.addAirline("Сан-хосе", "4423", "Boeing 737",
                Airline.simpleDateFormat.parse("20:30"), new DayOfWeek[]{DayOfWeek.MONDAY});

        ArrayList<Airline> airlinesToDestination = airport.airlinesToDestination("Сан-хосе");
        ArrayList<Airline> flightDays = airport.flightDays(DayOfWeek.TUESDAY);

        Date date = Airline.simpleDateFormat.parse("08:30");
        ArrayList<Airline> ad = airport.flightDays(DayOfWeek.TUESDAY, date);
        print(ad);
    }
}
