package com.company;


import java.util.Scanner;

//Task 1, выполняем вычисление по формуле z = ((a-3)*b/2) + c
public class Main {

    public static double calculatingByTheFormula(double a, double b, double c){

        double z = ((a-3)*b/2) + c;

        return z;
    }

    
    public static void main(String[] args) {
        System.out.println("Программа выполняет вычисление по формуле z = ((a-3)*b/2) + c");

        //сканнер, принимает числа с клавиатуры
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите a: ");
        double a = scanner.nextDouble();

        System.out.println("Введите b: ");
        double b = scanner.nextDouble();

        System.out.println("Введите c: ");
        double c = scanner.nextDouble();

        System.out.println("Значения переменных: a = " + a + ", b = "+ b + ", c = "+ c + "\n" +
                "Результаты вычилсение по формуле z = ((a-3)*b/2) + c: \n"
                + calculatingByTheFormula(a, b, c));
        scanner.close();
    }
}
