package com.company;

import com.company.components.Flower;
import com.company.components.Rose;
import com.company.components.Tulip;
import com.company.components.Сhamomile;
import com.company.wrap.Color;
import com.company.wrap.Wrap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

public class Composition implements Serializable {
    private Wrap wrap;
    private ArrayList<Flower> flowers;

    public Composition(Wrap wrap) {
        this.wrap = wrap;
        this.flowers = new ArrayList<>();
    }
    public Composition() {
        this.flowers = new ArrayList<>();
    }

    public void printAllFlowers(){
        for(Flower flower : flowers){
            System.out.println(flower);
        }
    }

    public void addFlower() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1)Добавить розу\n2)Добавить тюльпан\n3)Добавить ромашку");
        int i = scanner.nextInt();
        String description;
        BufferedReader bufferdReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            switch (i) {
                case 1:
                    System.out.println("Введите описание");
                    description = bufferdReader.readLine();
                    flowers.add(new Rose(description));
                    break;
                case 2:
                    System.out.println("Введите описание");
                    description = bufferdReader.readLine();
                    flowers.add(new Tulip(description));
                    break;
                case 3:
                    System.out.println("Введите описание");
                    description = bufferdReader.readLine();
                    flowers.add(new Сhamomile(description));
                    break;
            }

        }  catch (IOException e) {
            System.out.println("ОшИБКА");
            e.printStackTrace();
        }
    }

    public Wrap getWrap() {
        return wrap;
    }

    public void setWrap() {
        Scanner scanner = new Scanner(System.in);
        //RED, GREEN, BLUE, YELLOW, WHITE, WAVE, NIGHT, SUPERRED
        System.out.println("Выбираем цвет\n" +
                "1)RED\n" +
                "2)GREEN\n" +
                "3)BLUE\n" +
                "4)YELLOW\n" +
                "5)WHITE\n" +
                "6)WAVE\n" +
                "7)NIGHT\n" +
                "8)SUPERRED\n");
        int i = scanner.nextInt();
        BufferedReader bufferdReader = new BufferedReader(new InputStreamReader(System.in));

        String descr;
        try {
            switch (i) {
                case 1:
                    System.out.print("Введите описание: ");
                    descr = bufferdReader.readLine();
                    this.wrap = new Wrap(Color.RED, descr);
                    break;
                case 2:
                    System.out.print("Введите описание: ");
                    descr = bufferdReader.readLine();
                    this.wrap = new Wrap(Color.GREEN, descr);
                    break;
                case 3:
                    System.out.print("Введите описание: ");
                    descr = bufferdReader.readLine();
                    this.wrap = new Wrap(Color.BLUE, descr);
                    break;
                case 4:
                    System.out.print("Введите описание: ");
                    descr = bufferdReader.readLine();
                    this.wrap = new Wrap(Color.YELLOW, descr);
                    break;
                case 5:
                    System.out.print("Введите описание: ");
                    descr = bufferdReader.readLine();
                    this.wrap = new Wrap(Color.WHITE, descr);
                    break;
                case 6:
                    System.out.print("Введите описание: ");
                    descr = bufferdReader.readLine();
                    this.wrap = new Wrap(Color.WAVE, descr);
                    break;
                case 7:
                    System.out.print("Введите описание: ");
                    descr = bufferdReader.readLine();
                    this.wrap = new Wrap(Color.NIGHT, descr);
                    break;
                case 8:
                    System.out.print("Введите описание: ");
                    descr = bufferdReader.readLine();
                    this.wrap = new Wrap(Color.SUPERRED, descr);
                    break;
                default:
                    this.wrap = new Wrap(Color.RED, "descr");
                    break;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public ArrayList<Flower> getFlowers() {
        return flowers;
    }

    public void setFlowers(ArrayList<Flower> flowers) {
        this.flowers = flowers;
    }

    @Override
    public String toString() {
        return "Composition {" +
                "wrap " + wrap.toString() +
                ", flowers=" + flowers +
                '}';
    }


}
