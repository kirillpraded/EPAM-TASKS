package com.company;

import java.util.Scanner;

//4. Даны действительные числа а1 ,а2 ,..., аn . Поменять местами наибольший и наименьший элементы.
public class Main {
    public static void changeElements(int[] array) {
        System.out.println("Начальный массив :");
        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println();
        //меняем элементы местами
        int max=array[0];
        int indexOfMax = 0;
        int min=array[0];
        int indexOfMin= 0;
        for (int i = 0; i < array.length; i++){
            if(array[i] > max){
                max = array[i];
                indexOfMax = i;
            }
            if(array[i] < min){
                min = array[i];
                indexOfMin = i;
            }
        }
        array[indexOfMax] = min;
        array[indexOfMin] = max;
        System.out.println("Конечный массив :");
        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
    }

    public static void main(String[] args) {
        System.out.println("Программа меняет местами наибольший и наименьший элементы массива");
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
        changeElements(array);
        scanner.close();
    }
}
