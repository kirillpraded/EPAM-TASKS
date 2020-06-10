package com.company;

import java.util.Scanner;

//10. Дано натуральное число N. Написать метод(методы) для формирования массива, элементами которого
//являются цифры числа N.
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

    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        System.out.println("Введите число, из которого будет составлен массив");
        int x  = scanner.nextInt();
        print(createArray(x));
        scanner.close();
    }
}
