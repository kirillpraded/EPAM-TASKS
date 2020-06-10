package com.company;

import java.util.Scanner;

//8. Дана последовательность целых чисел a1 a2... an
// Образовать новую последовательность, выбросив из
//исходной те члены, которые равны
//min( a1, a1,... ,an )
//Массивы, 8 задание
public class Main {
    public static int[] getNewArray(int[] array){
        int min = array[0];
        //ищем минимальный элемент
        for(int i = 0; i < array.length; i++){
            if(array[i] < min){
                min = array[i];
            }
        }
        //ищем количество элементов, равных min
        int counterOfMin = 0;
        for(int i = 0; i < array.length; i++) {
            if (array[i] == min) {
                counterOfMin++;
            }
        }
        int[] newArray = new int[array.length - counterOfMin];
        //заполняем новый массив
        int k = 0;
        for (int i = 0; i < array.length;i++){
            if(array[i] == min){
                continue;
            }
            newArray[k] = array[i];
            k++;
        }
        return  newArray;
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
        int[] finalArray = getNewArray(array);

        System.out.print("Конечный массив, с удалёнными элементами = " );
        for (int i = 0; i < finalArray.length; i++){
            System.out.print(finalArray[i] + ", ");
        }
        scanner.close();
    }
}
