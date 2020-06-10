package com.company;

import java.util.Scanner;

public class Main {

    public static boolean checkPoint(int x, int y){
        if(y <= 0 && y >=-3 && x >=-4 && x <=4){
            return  true;
        } else if(y > 0 && y <=4 && x>=-2 && x <=2){
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println("Программа определяет, соответствует точка (x, y) области определения");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число x: ");
        int x = scanner.nextInt();

        System.out.println("Введите число y: ");
        int y = scanner.nextInt();

        System.out.println("Результат проверки точки: " + checkPoint(x,y));
        scanner.close();
    }
}
