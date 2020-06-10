package com.company;

import java.util.Scanner;

//11. Написать метод(методы), определяющий, в каком из данных двух чисел больше цифр.
public class Main {

    public static int[] createArray(int num){
        int count = 0;
        int temp = num;
        while(temp > 0)//этот цикл для определения размера массива
        {
            count++;
            temp /= 10;
        }
        int[] array = new int[count];
        int j = count - 1;
        while(num > 0)
        {
            array[j--] = num %10;

            num/= 10;
        }
        return array;
    }

    public static void print(int[] array){
        System.out.println();
        for (int num : array){
            System.out.print(num + " ");
        }
    }

    public static void findMaxLengthNum(int x, int y){
        if(createArray(x).length > createArray(y).length){
            System.out.println("Массив из числа " + x + " наибольший");
            print(createArray(x));
        } else {
            System.out.println("Массив из числа " + y + " наибольший");
            print(createArray(y));
        }
    }

    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        System.out.println("Введите число, из которого будет составлен массив");
        int x  = scanner.nextInt();
        System.out.println("Введите второе число");
        int y = scanner.nextInt();
        findMaxLengthNum(x, y);
    }
}
