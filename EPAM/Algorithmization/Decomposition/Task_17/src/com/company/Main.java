package com.company;

import java.util.Scanner;

//17. Из заданного числа вычли сумму его цифр. Из результата вновь вычли сумму его цифр и т.д. Сколько таких
//действий надо произвести, чтобы получился нуль? Для решения задачи использовать декомпозицию.
public class Main {

    public static int getCounter(int number){
        int sumOfNums = getSumOfNums(number);
        int counter = 0;
        while (number > 0){
            number-=sumOfNums;
            counter++;
        }
        return counter;
    }

    public static int getSumOfNums(int number){
        int sum = 0;
        while(number != 0){
            sum += (number % 10);
            number/=10;
        }
        return sum;
    }

    public static void main(String[] args) {
        //также можно ввести проверку, делится ли число на сумму его цифр, чтобы не получать ответ с ошибкой
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int number = scanner.nextInt();
        System.out.println("Из числа "+ number + " нужно вычесть "+getCounter(number) + " раз его сумму цифр, чтобы получить <=нуля.");
        scanner.close();
    }
}
