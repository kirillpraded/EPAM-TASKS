package com.company;
//эскалейд на 21
public class Wheel {
    private int size;
    private String wheelProfile;//low or high

    public Wheel(int size, String wheelProfile) {
        this.size = size;
        this.wheelProfile = wheelProfile;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getWheelProfile() {
        return wheelProfile;
    }

    public void setWheelProfile(String wheelProfile) {
        this.wheelProfile = wheelProfile;
    }

    @Override
    public String toString() {
        return "Wheel {" +
                "size=" + size +
                ", wheelProfile='" + wheelProfile + '\'' +
                '}';
    }
}
