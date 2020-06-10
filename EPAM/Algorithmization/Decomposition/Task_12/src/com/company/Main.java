package com.company;

import java.util.Scanner;

// 12. Даны натуральные числа К и N. Написать метод(методы) формирования массива А, элементами которого
//являются числа, сумма цифр которых равна К и которые не большее N.
public class Main {



    private static int [] createArray (int k, int n) {
        int [] array = new int[k];
        int[] tester = new int[5];
        int start = 10;
        for (int i = 0; i < array.length ; i++) {
           for(int j  = start; j <= n; j++){
               int num = j;
               int count = 0;
               while(num != 0){

                   count += (num % 10);
                   num/=10;
               }
               if(count == k){
                   array[i] = j;
                   start = j+1;
                   break;
               }
           }
        }
        return array;
    }

    public static void print(int[] array){
        System.out.println();
        for (int num : array){
            if (num != 0) {
                System.out.print(num + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            System.out.println("Введите К: ");
            int k = scanner.nextInt();
            System.out.println("Введите N: ");
            int n = scanner.nextInt();
            System.out.println("Результат : ");
            print( createArray(k, n));


    }
}
