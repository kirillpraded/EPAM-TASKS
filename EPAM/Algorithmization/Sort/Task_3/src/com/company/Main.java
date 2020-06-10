package com.company;
//3. Сортировка выбором. Дана последовательность чисел
//a1 <= a2 ...<= an
//.Требуется переставить элементы так,
//чтобы они были расположены по убыванию. Для этого в массиве, начиная с первого, выбирается наибольший
//элемент и ставится на первое место, а первый - на место наибольшего. Затем, начиная со второго, эта процедура
//повторяется. Написать алгоритм сортировки выбором.
public class Main {
    public static int[] selectionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int max = array[i];
            int max_i = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] > max) {
                    max = array[j];
                    max_i = j;
                }
            }
            if (i != max_i) {
                int temp = array[i];
                array[i] = array[max_i];
                array[max_i] = temp;
            }
        }
        return array;
    }

    public static void print(int[] array){
        System.out.println();
        for (int num : array){
            System.out.print(num + " ");
        }
    }

    public static void main(String[] args) {
        //задаем последовательность
        int[] array = {1,2,3,4,5,6,6,8,9};
        System.out.println("Начальная последовательность : ");
        print(array);
        System.out.println("Отсортированная последовательность : ");
        print(selectionSort(array));
    }
}
