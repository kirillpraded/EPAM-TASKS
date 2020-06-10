package com.company;
//Модуль 1 Задача 1 Одномерные массивы. Сортировки -> Заданы два одномерных массива с различным количеством элементов
// и натуральное число k. Объединить их в один массив, включив второй массив между k-м и (k+1) - м элементами первого,
// при этом не используя дополнительный массив. Не использовать дополнительный массив , исключая тот , который будет
// являтся объединением
//первого и второго массива ?
//Такой вопрос был ранее, вот ответ:
//Ответ: третий массив, в котором вы объедините первые два должен существовать, а вот другие дополнительные - нет

import java.util.Random;
import java.util.Scanner;

//Заданы два одномерных массива с различным количеством элементов и натуральное число k.
// Объединить их в один массив, включив второй массив между k-м и (k+1) - м элементами первого,
// при этом не используя дополнительный массив.
public class Main {
    public static void print(int[] array){
        System.out.println();
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
    }

    public static int[] concatenateArrays(int[] first, int[] second, int k){
        int count = 0;
        int[] finalArray = new int[(first.length+second.length)];
        for (int i = 0; i < finalArray.length; i++) {
            if (k > i){
                finalArray[i] = first[i];
            }else if (count < k) {
                finalArray[i] = second[count];
                count++;
            }else
                finalArray[i] = first[i - k - 1];
        }
        return finalArray;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер первого массива");
        int sizeOne = scanner.nextInt();
        System.out.println("Введите размер второго массива");
        int sizeTwo = scanner.nextInt();
        int[] firstArray = new int[sizeOne];
        int[] secondArray = new int[sizeTwo];
        System.out.println("Введите индекс первого массива, куда хотите вписать второй массив");
        int k = scanner.nextInt();

        Random random = new Random();
        for (int i=0;i < firstArray.length;i++) {
            firstArray[i]=random.nextInt(10) + 1;
        }
        for (int i=0;i < secondArray.length;i++) {
            secondArray[i]=random.nextInt(10) + 1;
        }
        print(firstArray);
        print(secondArray);
        int [] result = concatenateArrays(firstArray, secondArray, k);
        print(result);
    }
}
