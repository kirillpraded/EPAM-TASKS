package com.company;
// Сортировка Шелла. Дан массив n действительных чисел. Требуется упорядочить его по возрастанию.

public class Main {
    //реальная сортировка шелла
    public static int[] shellSort(int[] array) {
        int inner, outer;
        int temp;
        int h = 1;
        while (h <= array.length / 3) {
            h = h * 3 + 1;
        }
        while (h > 0) {
            for (outer = h; outer < array.length; outer++) {
                temp = array[outer];
                inner = outer;
                while (inner > h - 1 && array[inner - h] >= temp) {
                    array[inner] = array[inner - h];
                    inner -= h;
                }
                array[inner] = temp;
            }
            h = (h - 1) / 3;
        }
        return array;
        //Алгоритм, указанный в задании мне не понятен и схож с bubble sort, реальный же алгоритм сортировки
        // шелла реализуется путём нахождения h-значения сортировки, затем сверяются элементы ,
        // находящиемя на i+h позиции, и так до тех пор, пока h не станет <=0
    }

    public static void print(int[] array){
        System.out.println();
        for (int num : array){
            System.out.print(num + " ");
        }
    }

    public static void main(String[] args) {
	    int[] array = {7,5,3,8,54,6,8,3,7,2,1};
        System.out.println("Отсортированный массив сортировкой Шелла : ");
        print(shellSort(array));
    }
}
