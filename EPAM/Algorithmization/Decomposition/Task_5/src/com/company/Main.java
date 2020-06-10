package com.company;
//5.Составить программу, которая в массиве A[N] находит второе по величине число (вывести на печать число,
//которое меньше максимального элемента массива, но больше всех других элементов).
public class Main {
//самый простой вариант = отсортировать массив по возрастанию и взять элемент array.length-2
    //
    public static int findSecondElement(int[] array){
        //но мы просто введем дополнительную переменную, чтобы хранить в ней предыдущее максимальное значение

        int max = 0;
        int secondMax = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                secondMax = max;
                max = array[i];
            } else if (array[i] > secondMax)
                secondMax = array[i];
        }
        return secondMax;
    }

    public static void main(String[] args) {
        int[] array = {2,6,4,2,7,9,4,2,45};
        System.out.println("Второе максимальное значение в массиве = " + findSecondElement(array));
    }
}
