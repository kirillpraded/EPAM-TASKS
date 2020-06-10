package com.company;

import java.util.Scanner;
// Задана последовательность N вещественных чисел. Вычислить сумму чисел, порядковые номера которых
//являются простыми числами.
//Задание 6, массивы
public class Main {
// Фактически, программа проверяет именно индексы, являюися ли они простыми числами.
// чтобы посчитать порядковые номера, необходимо в
// строке 26 написать isSimple(i+1) и ввести проверку на IndexOutOFBoundExc
    public static boolean isSimple(int index){
        if (index < 2) return false;
        int temp;
        for (int i = 2; i <= (index / 2.0) + 1; i++) {
            temp = index % i;
            if (temp == 0) {
                return false;
            }
        }
        return true;
    }

    public static int countElements(int[] array){
        int counter = 0;
        for(int i = 0; i < array.length; i++){
            if(isSimple(i)){
                counter+=array[i];
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        // простые числа - числа, которые делятся только на 1 и на себя
        System.out.println("Программа вычисляет сумму чисел, порядковые номера которых\n" +
                "являются простыми числами.");
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
        System.out.println("результат вычисления : " + countElements(array));
        scanner.close();
    }
}
