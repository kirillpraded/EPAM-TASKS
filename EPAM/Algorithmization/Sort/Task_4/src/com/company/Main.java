package com.company;
//4. Сортировка обменами. Дана последовательность чисел
//a1 <= a2 ...<= an
//.Требуется переставить числа в
//порядке возрастания
public class Main {
    public static int[] bubbleSort(int[] array){
        int counter = 0;
        for(int i = array.length-1 ; i > 0 ; i--){
            for(int j = 0 ; j < i ; j++){
                if( array[j] < array[j+1] ){
                    int tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                    counter++;
                }
            }
        }
        System.out.println("Перестановка была выполнена " + counter + " раз.");
        return array;
    }

    public static void print(int[] array){
        System.out.println();
        for (int num : array){
            System.out.print(num + " ");
        }
    }

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,8,9};
        System.out.println("Начальный массив : ");
        print(array);
        System.out.println("\nОтсортированный массив : ");
        print(bubbleSort(array));
    }
}
