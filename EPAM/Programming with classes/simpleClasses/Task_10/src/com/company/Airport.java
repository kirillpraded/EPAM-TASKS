package com.company;

import java.time.DayOfWeek;
import java.util.ArrayList;
import java.util.Date;

//a) список рейсов для заданного пункта назначения;
//b) список рейсов для заданного дня недели;
//c) список рейсов для заданного дня недели, время вылета для которых больше заданног
public class Airport {
    private String airportName;
    private ArrayList<Airline> airlines;

    public Airport(String airportName) {
        this.airportName = airportName;
        this.airlines = new ArrayList<Airline>();
    }

    public void addAirline(String destination, String flightNumber, String planeType, Date departureTime, DayOfWeek[] dayOfWeek) {
        airlines.add(new Airline(destination, flightNumber, planeType, departureTime, dayOfWeek));
    }

    public ArrayList<Airline> airlinesToDestination(String destination) {
        ArrayList<Airline> airlines = new ArrayList<>();
        for (Airline airline : this.airlines) {
            if (airline.getDestination().equals(destination)) {
                airlines.add(airline);
            }
        }
        return airlines;
    }

    public ArrayList<Airline> flightDays(DayOfWeek dayOfWeek) {
        ArrayList<Airline> airlines = new ArrayList<>();
        for (Airline airline : this.airlines) {
            for (DayOfWeek day : airline.getDayOfWeek()) {
                if (day == dayOfWeek) {
                    airlines.add(airline);
                    break;
                }
            }
        }
        return airlines;
    }

    public ArrayList<Airline> flightDays(DayOfWeek dayOfWeek, Date departureTime) {
        ArrayList<Airline> airlines = new ArrayList<>();
        for (Airline airline : this.airlines) {
            for (DayOfWeek day : airline.getDayOfWeek()) {
                if (day == dayOfWeek) {
                    if (airline.getDepartureTime().compareTo(departureTime) >= 0) {
                        airlines.add(airline);
                        break;
                    }

                }
            }
        }
        return airlines;
    }

    public String getAirportName() {
        return airportName;
    }

    public void setAirportName(String airportName) {
        this.airportName = airportName;
    }

    ArrayList<Airline> getAirlines() {
        return airlines;
    }

    public void setAirlines(ArrayList<Airline> airlines) {
        this.airlines = airlines;
    }
}
