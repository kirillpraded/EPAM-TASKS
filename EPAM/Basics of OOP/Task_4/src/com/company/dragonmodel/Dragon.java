package com.company.dragonmodel;

public class Dragon {
    private String name;
    private Cave cave;

    public Dragon(String name){
        this.name = name;
        cave = new Cave();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Cave getCave() {
        return cave;
    }

    public void setCave(Cave cave) {
        this.cave = cave;
    }
}
