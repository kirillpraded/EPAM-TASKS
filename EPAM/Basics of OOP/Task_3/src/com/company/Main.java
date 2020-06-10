package com.company;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {

    public static void main(String[] args) {
        int year = 2020;
        Calendar calendar = new Calendar(year);
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");

        calendar.addHoliday(LocalDate.parse("01.01." + year, dateTimeFormatter), "Новый год");
        calendar.addHoliday(LocalDate.parse("08.03." + year, dateTimeFormatter), "Международный женский день");
        calendar.addHoliday(LocalDate.parse("09.05." + year, dateTimeFormatter), "День победы");
        calendar.addHoliday(LocalDate.parse("03.07." + year, dateTimeFormatter), "День независимости");

        calendar.printHolidays();


    }
}
