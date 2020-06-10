package com.company;

// Формула :
// (b + (b^2 + 4*a*c)^(1/2))/(2*a)) - a^3*c + b^(-2)

import java.util.Scanner;

public class Main {

    public static double calculatingByTheFormula(double a, double b, double c){

        double result;

        result = (b + Math.sqrt(Math. pow(b, 2) + 4*a*c))/(2*a) - Math. pow(a, 3) * c + Math. pow(b, -2);

        return result;
    }


    public static void main(String[] args) {
        //b a c 
        System.out.println("Вычисляем значение выражения по формуле (b + (b^2 + 4*a*c)^(1/2))/(2*a)) - a^3*c + b^(-2) ");

        //сканнер, принимает числа с клавиатуры
        Scanner scanner = new Scanner(System.in);


        System.out.println("Введите a: ");
        double a = scanner.nextDouble();

        System.out.println("Введите b: ");
        double b = scanner.nextDouble();

        System.out.println("Введите c: ");
        double c = scanner.nextDouble();

        System.out.println("Значения переменных: a = " + a + ", b = "+ b + ", c = "+ c + "\n" +
                "Результаты вычилсение по формуле z = (b + (b^2 + 4*a*c)^(1/2))/(2*a)) - a^3*c + b^(-2): \n"
                + calculatingByTheFormula(a, b, c));
        scanner.close();
    }

}
