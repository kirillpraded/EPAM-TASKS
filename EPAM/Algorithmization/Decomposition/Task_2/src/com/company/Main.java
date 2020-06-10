package com.company;

import java.util.Scanner;
//2. Написать метод(методы) для нахождения наибольшего общего делителя четырех натуральных чисел.
public class Main {
    public static int min(int a, int b){
        if (a > b){
            return b;
        }
        return a;
    }

    public static String findNOD(int a, int b, int c, int d){
        int numToStart = min(min(a, b), min(c, d));
        while (true) {
            if (numToStart == 0){return "Для этих чисел нет НОД большего нуля";}
            if(a % numToStart == 0 && b % numToStart == 0 &&  c % numToStart == 0 && d % numToStart == 0 ){
                return numToStart+" является наибольшим общим делителем";
            }
            numToStart--;
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое число : ");
        int a = scanner.nextInt();

        System.out.println("Введите первое число : ");
        int b = scanner.nextInt();

        System.out.println("Введите первое число : ");
        int c = scanner.nextInt();

        System.out.println("Введите первое число : ");
        int d = scanner.nextInt();

        System.out.println(findNOD(a,b,c,d));

        scanner.close();
    }
}
