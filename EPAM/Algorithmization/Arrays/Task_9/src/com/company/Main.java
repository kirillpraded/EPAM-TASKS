package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//9. В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число. Если таких
//чисел несколько, то определить наименьшее из них.
//Массивы, 9 задание
public class Main {
    public static int getMostFreqNumber(int[] array) {
        int[] frequency = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j]) {
                    frequency[i]++;
                }
            }
        }

        int result = array[0];
        int frequencyRes = frequency[0];
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > frequencyRes) {
                frequencyRes = frequency[i];
                result = array[i];
            }
            if ((frequencyRes == frequency[i]) && (array[i] < result)) {
                result = array[i];
            }
        }
        return result;

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
        System.out.println("Наиболее часто встречающееся число в массиве = " + getMostFreqNumber(array));
        scanner.close();
    }
}
