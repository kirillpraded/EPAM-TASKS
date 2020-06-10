package com.company;

import java.util.Scanner;

// Второе задание, циклы
public class Main {

    public static double calculatingFunc(double x){
        double y;
        if (x > 2){
            y = x;
        } else {
            y = -x;
        }
        return y;
    }

    public static void main(String[] args) {
        System.out.println("Вычисляем значения функции на отрезке [a, b] c шагом h");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите а: ");
        double a = scanner.nextDouble();

        System.out.println("Введите b: ");
        double b = scanner.nextDouble();

        System.out.println("Введите h: ");
        double h = scanner.nextDouble();

        for(double x = a; x <= b; x+=h){
            System.out.print("При х = ");
            System.out.printf("%.2f", x);
            System.out.print(" y = ");
            System.out.printf("%.2f", calculatingFunc(x));
            System.out.println();
        }
        scanner.close();
    }
}
