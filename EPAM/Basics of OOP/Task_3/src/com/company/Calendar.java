package com.company;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

public class Calendar {
    private int year;
    private ArrayList<Holiday> holidays;

    public Calendar(int year) {
        this.year = year;
        this.holidays = new ArrayList<>();
        addWeekend(year);
    }

    private void addWeekend(int year) {
        LocalDate localDate = LocalDate.of(year, 1, 1);
        while (localDate.getDayOfWeek() != DayOfWeek.SATURDAY
                && localDate.getDayOfWeek() != DayOfWeek.SUNDAY) {
            localDate = localDate.plusDays(1);
        }
        while (localDate.getYear() == year) {
            if (localDate.getDayOfWeek() == DayOfWeek.SATURDAY) {
                holidays.add(new Holiday(localDate, "Суббота"));
                localDate = localDate.plusDays(1);
            } else if(localDate.getDayOfWeek() == DayOfWeek.SUNDAY) {
                holidays.add(new Holiday(localDate, "Воскресенье"));
                localDate = localDate.plusDays(6);
            } else { localDate = localDate.plusDays(1); }
        }
    }


    public void addHoliday(LocalDate holidayDate, String nameOfHoliday)
    {
        holidays.add(new Holiday(holidayDate, nameOfHoliday));
        //                                           сначала сортируем по дате      затем по названию
        holidays.sort(Comparator.comparing(Holiday::getHolidayDate).thenComparing(Holiday::getName));
    }

    public Holiday removeHoliday(String nameOfHoliday) {
        Holiday removedHoliday = null;
        Iterator<Holiday> holidayIterator = holidays.iterator();
        while (holidayIterator.hasNext()) {
            Holiday nextHoliday = holidayIterator.next();
            if (nextHoliday.getName().equals(nameOfHoliday)) {
                removedHoliday = nextHoliday;
                holidayIterator.remove();
            }
        }
        return removedHoliday;
    }

    public void printHolidays() {
        for (Holiday holiday : holidays) {
            System.out.println(holiday);
        }
    }

    class Holiday {
        private LocalDate holidayDate;
        private String name;

        public Holiday(LocalDate holiday, String nameOfHoliday) {
            this.holidayDate = holiday;
            this.name = nameOfHoliday;
        }

        public LocalDate getHolidayDate() {
            return holidayDate;
        }

        public String getName() {
            return name;
        }

        @Override
        public String toString() {
            return "Holiday {" + holidayDate.format(DateTimeFormatter.ofPattern("dd.MM.yyyy")) +
                    " - " + name + '}';
        }
    }
}

