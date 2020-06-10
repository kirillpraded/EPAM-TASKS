package com.company;

import java.util.Scanner;
//2. Дана последовательность действительных чисел а1 ,а2 ,..., ап. Заменить все ее члены, большие данного Z, этим
//        числом. Подсчитать количество замен.
//Массивы, второе задание
public class Main {
    public static int replaceNumber(int[] array, int z){
        int counter = 0;
        for(int i = 0;i < array.length; i++){
            if (array[i] > z){
                counter++;
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        System.out.println("Задайте последовательность чисел, число Z. Программа заменит все элементы большие " +
                "данного числа этим числом и выведет количество замен");
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

        System.out.println("Введите число Z: ");
        int z = scanner.nextInt();

        System.out.println("Число замен в массиве = " + replaceNumber(array, z));
        scanner.close();

    }
}
