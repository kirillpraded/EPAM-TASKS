package com.company;

import java.util.Scanner;

//10. Дан целочисленный массив с количеством элементов п. Сжать массив, выбросив из него каждый второй
//элемент (освободившиеся элементы заполнить нулями). Примечание. Дополнительный массив не использовать.
//Массивы, 10 задание
public class Main {

    public static int[] removeEverySecondElement(int[] array){
        for(int i = 0; i < array.length; i++){
            if(i % 2 == 1){
                array[i] = 0;
            }
        }
        return array;
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

        int[] resultArray = removeEverySecondElement(array);
        System.out.println("Заменяем каждый второй элемент нулём... ");
        for (int i = 0; i < resultArray.length; i++){
            System.out.print(resultArray[i] + ", ");
        }
        scanner.close();
    }
}
