package com.company;

import java.util.Scanner;

//ветвления, задание номер 2
public class FirstExample {
    public static int max(int a, int b){
        if (a > b){
            return a;
        } else {
            return b;
        }
    }

    public static  int min(int a, int b){
        if (a < b){
            return a;
        }else {
            return b;
        }
    }
    public static void main(String[] args) {
        System.out.println("Находим max(min(a,b), min(c,d))");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите a:");
        int a = scanner.nextInt();

        System.out.println("Введите b:");
        int b = scanner.nextInt();

        System.out.println("Введите c:");
        int c = scanner.nextInt();

        System.out.println("Введите d:");
        int d = scanner.nextInt();

        System.out.println("Результат max(min(a,b), min(c,d)) = " + max(min(a, b), min(c, d)));
        scanner.close();
    }
}
