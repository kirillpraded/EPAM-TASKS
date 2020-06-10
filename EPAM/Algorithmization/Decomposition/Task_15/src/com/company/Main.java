package com.company;

import java.util.Scanner;
//15. Найти все натуральные n-значные числа, цифры в которых образуют строго возрастающую
//последовательность (например, 1234, 5789). Для решения задачи использовать декомпозицию.
public class Main {

    public static void findNums(int start, int stop){
        for(int i = start; i <= stop; i++){
            int n = i;
            int temp=10;
            int count;
            boolean flag = true;
            while (n >= 1) {
                count = (n % 10);
                n /= 10;
                if(count > temp){ flag = false;}
                temp = count;
            }
            if (flag){
                System.out.println(i + " Является строго возрастающим числом");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите старт");
        int start = scanner.nextInt();
        System.out.println("Введите стоп");
        int stop = scanner.nextInt();
        findNums(start, stop);
        scanner.close();
    }
}
