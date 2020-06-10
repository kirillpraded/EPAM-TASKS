package com.company;


import java.util.Scanner;

// Дан числовой ряд и некоторое число е, найти сумму тех членов ряда, модуль которых больше или равен заданному е.
// Задание 5, циклы
public class Main {


    public static double findOutCounter(int amountOfMembers, double e){

        double member;
        double result = 0;

        for (int i = 1; i <=amountOfMembers; i++){
            member = (1/Math.pow(2, i)) + (1/Math.pow(3, i));
            if(Math.abs(member) >= e){
                result += member;
            }
        }
        return result;

    }

    public static void main(String[] args) {
        System.out.println("Программа находит сумму тех членов ряда, модуль которых больше или равен заданному е.");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите е: ");
        double e = scanner.nextDouble();

        System.out.println("Введите количество членов ряда");
        int amountOfMembers = scanner.nextInt();

        System.out.print("Сумма членов ряда, модуль которых больше e = " );
        System.out.printf("%.5f", findOutCounter(amountOfMembers, e));

        scanner.close();
    }
}
