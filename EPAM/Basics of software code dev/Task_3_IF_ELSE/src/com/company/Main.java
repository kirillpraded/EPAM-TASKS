package com.company;

import java.util.Scanner;

//Ветвление, 3 задание
public class Main {

    public static boolean checkIfOnOneLine(int x1, int y1, int x2, int y2, int x3, int y3){
        try {
            if ((x3 - x1) / (x2 - x1) == (y3 - y1) / (y2 - y1)) {
                return true;
            }
        } catch (ArithmeticException e) {
            return false;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println("Программа проверяет, лежать ли три точки графика на одной прямой.");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Вводим первую точку: ");
        System.out.println("Введите х1: ");
        int x1 = scanner.nextInt();
        System.out.println("Введите у1:");
        int y1 = scanner.nextInt();

        System.out.println("Вводим вторую точку: ");
        System.out.println("Введите х2: ");
        int x2 = scanner.nextInt();
        System.out.println("Введите у2:");
        int y2 = scanner.nextInt();

        System.out.println("Вводим третью точку: ");
        System.out.println("Введите х3: ");
        int x3 = scanner.nextInt();
        System.out.println("Введите у3:");
        int y3 = scanner.nextInt();

        System.out.println("Точки ("+x1+", "+ y1 + "), (" +x2+", "+ y2 +
                            "), ("+x3+", "+ y3 + ") лежат на одной прямой : "
                            + checkIfOnOneLine(x1,y1,x2,y2,x3,y3));
        scanner.close();
    }
}
