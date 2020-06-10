package com.company;

import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

//14. Натуральное число, в записи которого n цифр, называется числом Армстронга, если сумма его цифр,
//возведенная в степень n, равна самому числу. Найти все числа Армстронга от 1 до k. Для решения задачи
//использовать декомпозицию.

// ошибка в формулировке задания. Числа армстронга - числа, в которых сумма каждого из цифр возведена в степень n, а не сумма его цифр
public class Main {

    public static void print(int k) {
        for (int i = 1; i <= k; i++) {
            if (isArmstrongNumber(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static boolean isArmstrongNumber(int number) {
        int sum = 0;
        int[] array = new int[findLengthNumber(number)];
        int n = number;
        for (int i = array.length; i > 0; i--) {
            array[i - 1] = n - (n / 10) * 10;
            n /= 10;
        }
        for (int x : array) {
            sum += Math.pow(x, array.length);
        }
        return number == sum;
    }
    public static int findLengthNumber(int n) {
        int length = 0;
        while (n >= 1) {
            length++;
            n /= 10;
        }
        return length;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите числа, до которых будут искаться числа Армстронга");
        int numberTo = scanner.nextInt();
        print(numberTo);
        scanner.close();
    }
}
