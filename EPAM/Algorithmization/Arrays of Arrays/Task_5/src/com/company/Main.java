package com.company;

import java.util.Scanner;
//5. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
//Массивы массивов, 5 задание
public class Main {
    public static int[][] createMatrix(int n){
        int[][] matrix = new int[n][n];
        for (int i = 0; i < matrix.length; i++){
            for (int k = 0; k < matrix[i].length - i; k++) {
                //так как изначально все элементы матрицы равны нулю,то можно
                // реализовать алгоритм одной строчкой кода
                matrix[i][k] = i+1;
            }
        }
        return matrix;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размерность матрицы(чётное число)");
        int n = scanner.nextInt();

        if (n % 2 != 0) {
            System.out.println("Введено неверное значение");
            System.exit(0);
        }
        int[][] matrix = createMatrix(n);

        System.out.println("Сформированная матрица : \n");
        for (int i = 0; i < matrix.length; i++){
            for (int k = 0; k < matrix[i].length; k++) {
                System.out.print(matrix[i][k] + "\t");
            }
            System.out.println();
        }
        scanner.close();
    }
}
