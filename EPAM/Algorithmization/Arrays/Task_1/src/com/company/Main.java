package com.company;

import java.util.Scanner;
//1. В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.
//Массивы, 1 задание
public class Main {
    public static int sumOfElements(int[] array, int k){
        int counter = 0;
        for(int i = 0;i < array.length; i++){
            if (array[i] % k == 0){
                counter+=array[i];
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите размер массива: ");
        int sizeOfArray = scanner.nextInt();
        // объявляем наш массив размерностью sizeOfArray
        int[] array = new int[sizeOfArray];
        for(int i = 0; i <sizeOfArray;i++){
            System.out.println("Введите " + (i+1) + " элемент массива");
            int number = scanner.nextInt();
            array[i] = number;
        }

        System.out.println("Введите делитель: ");
        int k = scanner.nextInt();

        System.out.println("Сумма элементов, которые кратны делителю = " + sumOfElements(array, k));
        scanner.close();

    }
}
