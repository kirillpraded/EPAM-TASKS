package com.company;

import java.util.Scanner;

//Для каждого натурального числа в промеждутке от m до n вывести все делители кроме самого числа и единицы
//Задание 7, циклы
public class Main {

    public static void dividers(int m, int n){
        for (int i = m; i <=n; i++){
            System.out.print("Делители числа " + i + ": ");
            for (int k = 2; k < i; k++){
                if(i % k == 0){
                    System.out.print(k + "; ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println("Программа выводит все делители числа. Числа задаются в промежутке от m до n");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите начальную позицию");
        int m = scanner.nextInt();

        System.out.println("Введите конечную позицию");
        int n = scanner.nextInt();
        if (n < m){
            System.out.println("Значение n не может быть больше m!");
            //завершаем работу программы
            System.exit(0);
        }


        dividers(m, n);

        scanner.close();
    }
}
