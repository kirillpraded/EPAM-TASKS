package com.company;

import java.util.Scanner;
//5. Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для которых аi > i.
//Пятое задание, массивы
public class Main {

    public static void printer(int[] array){
        for (int i = 0; i < array.length; i++){
            if(array[i] > i){
                System.out.println(array[i] + " больше своего индекса " + i);
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Программа выводит на печать только те числа, для которых а(i) > i");
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
        System.out.println("Вывод : ");
        printer(array);
        scanner.close();
    }
}
