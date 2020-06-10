package com.company;

public class Time {
    private int hours;
    private int minutes;
    private int seconds;

    public Time(int hours, int minutes, int seconds) {
        if(hours <= 24 && hours >= 0) {
            this.hours = hours;
        } else {
            this.hours = 0;
        }
        if(minutes >=0 && minutes <=60) {
            this.minutes = minutes;
        } else {
            this.minutes = 0;
        }
        if(seconds >=0 && seconds <=60) {
            this.seconds = seconds;
        } else {
            this.seconds = 0;
        }
    }

    public void setHours(int hours) {
        this.hours = this.hours + hours;
        if(this.hours <= 24 && this.hours >= 0) {
        } else {
            this.hours = 0;
        }
    }

    public void setMinutes(int minutes) {
        this.minutes = this.minutes + minutes;
        if(this.minutes >=0 && this.minutes <=60) {
        } else {
            this.minutes = 0;
        }
    }

    public void setSeconds(int seconds) {
        this.seconds = this.seconds + seconds;
        if(this.seconds >=0 && this.seconds <=60) {
        } else {
            this.seconds = 0;
        }
    }

    public String getTime(){
        return "Текущее время " + hours + ":" + minutes + ":" + seconds;
    }
}
