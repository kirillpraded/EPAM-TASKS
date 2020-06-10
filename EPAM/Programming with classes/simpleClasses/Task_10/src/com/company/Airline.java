package com.company;

import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.util.Arrays;
import java.util.Date;

//Airline: пункт назначения, номер рейса, тип самолета, время вылета, дни недели.
public class Airline {
    private String destination;
    private String flightNumber;
    private String planeType;
    private Date departureTime;
    private DayOfWeek[] dayOfWeek;
    public static SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm");

    public Airline(String destination, String flightNumber, String planeType, Date departureTime, DayOfWeek[] dayOfWeek) {
        this.destination = destination;
        this.flightNumber = flightNumber;
        this.planeType = planeType;
        this.departureTime = departureTime;
        this.dayOfWeek = dayOfWeek;
    }

    @Override
    public String toString() {

        return "Airline {" +
                "destination='" + destination + '\'' +
                ", flightNumber='" + flightNumber + '\'' +
                ", planeType='" + planeType + '\'' +
                ", departureTime=" + simpleDateFormat.format(departureTime)+
                ", dayOfWeek=" + Arrays.toString(dayOfWeek) +
                '}';
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getPlaneType() {
        return planeType;
    }

    public void setPlaneType(String planeType) {
        this.planeType = planeType;
    }

    public Date getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(Date departureTime) {
        this.departureTime = departureTime;
    }

    public DayOfWeek[] getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(DayOfWeek[] dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }
}
