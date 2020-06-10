package com.company;

import java.util.Scanner;
//6. Написать метод(методы), проверяющий, являются ли данные три числа взаимно простыми.
public class Main {

    public static int min(int a, int b){
        if (a > b){
            return b;
        }
        return a;
    }

    public static int findNOD(int a, int b, int c){
        int numToStart = min(min(a, b), c);
        while (true) {
            if (numToStart == 1){return 1;}
            if(a % numToStart == 0 && b % numToStart == 0 &&  c % numToStart == 0){
                return numToStart;
            }
            numToStart--;
        }
    }

    public static boolean checkIfSimple(int a, int b, int c){
        if(findNOD(a,b,c) == 1){
            return true;
        } else return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число");
        int a = scanner.nextInt();
        System.out.println("Введите второе число");
        int b = scanner.nextInt();
        System.out.println("Введите третье число");
        int c = scanner.nextInt();
        System.out.println("Введенные числа являются взаимно простыми : " + checkIfSimple(a,b,c) );
        scanner.close();
    }
}
