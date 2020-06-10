package com.company;

import java.util.Scanner;
//3. Дан массив действительных чисел, размерность которого N. Подсчитать, сколько в нем отрицательных,
//положительных и нулевых элементов.
// массивы, 3 задание
public class Main {

    private static void amountOfDifferentNumbers(int[] array) {
        int counterZero=0;
        int counterPlus=0;
        int counterMinus=0;

        for(int i = 0; i < array.length; i++){
            if(array[i] > 0){
                counterPlus++;
            } else if(array[i] < 0){
                counterMinus++;
            } else {counterZero++;}
        }
        System.out.println("Количество положительных чисел = " + counterPlus + "\n"+
                            "Количество отрицательных чисел = " + counterMinus + "\n" +
                            "Количество нулей = " + counterZero + "\n");
    }

    public static void main(String[] args) {
        System.out.println("");
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

        amountOfDifferentNumbers(array);
        scanner.close();
    }


}
