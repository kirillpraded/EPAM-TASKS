package com.company;

import java.util.Scanner;
//1. Написать метод(методы) для нахождения наибольшего общего делителя и наименьшего общего кратного двух
//натуральных чисел:
public class Main {

    public static int findNOD(int a, int b) {
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        return a;
    }

    public static int findNOK(int a, int b){
        return (a*b)/findNOD(a, b);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число : ");
        int a = scanner.nextInt();
        System.out.println("Введите второе число : ");
        int b = scanner.nextInt();
        System.out.println("НОД чисел = " + findNOD(a,b));
        System.out.print("НОК чисел = " + findNOK(a,b));
        scanner.close();
    }
}
