package com.company;

import java.util.Scanner;

//13. Два простых числа называются «близнецами», если они отличаются друг от друга на 2 (например, 41 и 43).
//Найти и напечатать все пары «близнецов» из отрезка [n,2n], где n - заданное натуральное число больше 2. Для
//решения задачи использовать декомпозицию.
public class Main {
    private static int [][] findTwins(int n) {
        int [][] twins = new int[n - 1][2];
        for (int i = 0; i < twins.length; i++) {
            twins[i][0] = n + i;
            twins[i][1] = twins[i][0] + 2;
        }
        return twins;
    }

    private static void print (int [][] matix) {  //вывод матрицы
        for (int[] array : matix) {
            for (int i : array) {
                System.out.print(i + "\t");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите N");
        int n = scanner.nextInt();
        print(findTwins(n));
    }
}
