package com.company;

import java.util.Scanner;

//Циклы, первое задание
public class Main {

    public static int loopOver(int num){
        int result = 0;

        for (int i = 1; i <= num; i++){
            result+=i;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println("Программа суммирует все числа от 1 до введенного пользователем");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число: ");
        int number = scanner.nextInt();

        System.out.println("Сумма чисел от 1 до " + number + " включительно = " + loopOver(number));
        scanner.close();
    }
}
