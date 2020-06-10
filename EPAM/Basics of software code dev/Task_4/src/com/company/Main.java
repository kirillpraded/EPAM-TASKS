package com.company;


import java.util.Scanner;

public class Main {
    public static double swapParts(double number){
        double theIntegerPart = Math.floor(number);

        double theDoublePart = number - theIntegerPart;

        double result = theIntegerPart/1000 + theDoublePart*1000;

        return result;

    }

    public static void main(String[] args) {
        System.out.println("Программа свапает значения nnn и ddd местами (nnn.ddd)");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число: ");
        double number = scanner.nextDouble();


        System.out.println("Результат \"переворота\" числа: ");
        //выводим только три знака после запятой
        System.out.printf("%.3f", swapParts(number));
        scanner.close();
    }
}
