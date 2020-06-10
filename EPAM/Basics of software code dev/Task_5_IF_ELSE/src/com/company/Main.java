package com.company;
//задание 5, ветвления

import java.util.Scanner;

public class Main {

    public static double function(int x){
        double result;

        if (x<=3){
            result = Math.pow(x, 2) - 3*x + 9;
        } else {
            result = 1/(Math.pow(x, 3) + 6);
        }
        return result;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите Х: ");
        int x = scanner.nextInt();

        System.out.println("Результат вычисления функции при х = " + x +" : " +  function(x));
        scanner.close();
    }
}
