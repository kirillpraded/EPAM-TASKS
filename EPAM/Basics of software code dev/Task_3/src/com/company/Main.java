package com.company;


import java.util.Scanner;



import static java.lang.Math.*;

//вычисляем значение по формуле
public class Main {

    public static double calculatingByTheFormula(double x, double y){
        double result = ((sin(x)+cos(y))/(cos(x)- sin(y)))*tan(x*y);
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Программа вычисляет значение выражения ((sin(x) + cos(y))/(cos(x)-sin(y)))*tg(x*y)");
        //сычитывает с клавиатуры
        Scanner scanner = new Scanner(System.in);


        System.out.println("Введите Ваш Х: ");
        double x = scanner.nextDouble();
        System.out.println("Введите Ваш Y: ");
        double y = scanner.nextDouble();


        System.out.println("Значения переменных: x = " + x + ", y = "+ y  + "\n" +
                "Результаты вычилсение по формуле ((sin(x) + cos(y))/(cos(x)-sin(y)))*tg(x*y): \n"
                + calculatingByTheFormula(x, y));
        scanner.close();
    }
}
