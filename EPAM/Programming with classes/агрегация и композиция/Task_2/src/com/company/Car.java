package com.company;

import java.util.Arrays;

public class Car {
    private String model;
    private Engine engine;
    private Wheel[] wheels;
    private double fuel;

    public Car(String model, Engine engine, Wheel[] wheels) {
        this.model = model;
        this.engine = engine;
        this.wheels = wheels;
        this.fuel = 70.0;
    }

    public void drive(){
        System.out.println("Едем...\n Расход - 10.0 на 100км.");
        this.fuel-=10.0;
        System.out.println("Остаток топлива = " + this.fuel);
    }

    public void refill(){
        System.out.println("Заправляем полный бак. 70 литров.");
        this.fuel = 70.0;
    }

    public void changeWheel(Wheel wheel, int number){
        System.out.println("Меняем колесо номер " + number);
        this.wheels[number] = wheel;
    }

    @Override
    public String toString() {
        return "Car {" +
                "model='" + model + '\'' +
                ", engine=" + engine +
                ", wheels=" + Arrays.toString(wheels) +
                ", fuel=" + fuel +
                '}';
    }
}
