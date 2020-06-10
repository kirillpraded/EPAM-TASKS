package com.company.dragonmodel;

import com.company.jewerly.Coin;
import com.company.jewerly.Jewelry;
import com.company.jewerly.Treasure;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Cave {
    private ArrayList<Treasure> treasures;

    public Cave() {
        this.treasures = new ArrayList<>();
        addTreasuresFromFile();
    }

    public ArrayList<Treasure> getTreasures() {
        return treasures;
    }

    public void addTreasuresFromFile(){
        try {
            FileReader fileReader = new FileReader("src/com/company/resources/treasures.txt");
            Scanner scanner = new Scanner(fileReader);
            while (scanner.hasNextLine()) {
                String [] treasureLine = scanner.nextLine().split(" - ");
                String treasureType = treasureLine[0];
                String treasureName = treasureLine[1];
                double treasurePrice = Double.parseDouble(treasureLine[2]);
                String descriptionOfTreasure = treasureLine[3];
                //Coin - Chinese Porcelain Vase - 999 - Qianlong Pot, 18th Century
                switch (treasureType) {
                    case "Jewelry":
                        treasures.add(new Jewelry(treasureName, treasurePrice, descriptionOfTreasure));
                        break;
                    case "Coin":
                        treasures.add(new Coin(treasureName, treasurePrice, descriptionOfTreasure));
                        break;
                }
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл с сокровищами не найден");
        }

    }
    public void printAllTreasures(){
        for(Treasure treasure : treasures){
            System.out.println(treasure);
        }
    }

    public void getMostExpensive(){
        Treasure treasure = treasures.get(0);
        for(Treasure treas : treasures){
            if(treas.getPrice() > treasure.getPrice()){
                treasure = treas;
            }
        }
        System.out.println(treasure);
    }
    public void getForRange(double min, double max){
        for(Treasure treas : treasures){
            if(treas.getPrice() >= min && treas.getPrice() <= max){
                System.out.println(treas);
            }
        }

    }
/*
    public void addTreasure() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1)Добавить ювелирное украшение\n2)Добавить монету");
        int i = scanner.nextInt();
        Treasure treasure;
        switch (i)
        {
            case 1:

        }
        treasures.add(treasure);
    }

 */
}
