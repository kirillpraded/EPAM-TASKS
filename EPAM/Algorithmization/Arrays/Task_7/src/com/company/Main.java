package com.company;

import java.util.Scanner;

//Даны действительные числа
//a a an
//
//
//. Найти
//max(a1 + a2n,a2 + a2n−1, ... an + an+1)
//.
    // Массивы, 7 задание
public class Main {
    //Не понял, как получить доступ по индексу 2n, если массив ограничен индексом n
    //index out of bound exc
    //Предположим, что размер массива = 2n, а n - середина массива
    private static double findMax(int[] array){
        double max = array[0]+array[array.length-1];
        for (int i = 0; i < array.length/2; i++){
            if(array[i] + array[array.length-1-i] > max){
                max = array[i] + array[array.length-1-i];
            }

        }
        return  max;
    }

    public static void main(String[] args) {
        System.out.println("Программа находит масимальный элемент по формуле max(a1 + a2n,a2 + a2n−1, ... an + an+1) ");
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
        System.out.println( "max(a1 + a2n,a2 + a2n−1, ... an + an+1 = " +findMax(array));
        scanner.close();
    }
}
