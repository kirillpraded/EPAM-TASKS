package com.company;

import java.util.Scanner;

//8. Задан массив D. Определить следующие суммы: D[l] + D[2] + D[3]; D[3] + D[4] + D[5]; D[4] +D[5] +D[6].
//Пояснение. Составить метод(методы) для вычисления суммы трех последовательно расположенных элементов
//массива с номерами от k до m.
public class Main {
    //зачем переменная м, если используя ее, мы можем получить сумму любого количества элементов?
    // если нам нужно непосредственно три элемента, то мы можем просто в цикле ограничить к+3 элементами

    public static int sumOfThreeElements(int[] array, int k){
        int sum = 0;
        for(int i = k; i < k+3; i++){
            sum+=array[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        //             0 1 2 3  4 5 6  7  8 9 10 11 12 13 14 15
        int[] array = {3,4,6,8,43,7,2,76,89,3, 2, 7,85, 3, 6,85};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите индекс элемента, с которого хотите начать суммировать три элемента : ");
        int k = scanner.nextInt();
        if (k > array.length - 3){
            System.out.println("Ошибочный номер");
            System.exit(0);
        }
        System.out.println("Cумма элементов = " + sumOfThreeElements(array, k));
        scanner.close();
    }
}
