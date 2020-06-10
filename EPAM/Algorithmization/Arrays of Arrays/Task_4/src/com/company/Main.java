package com.company;

import java.util.Scanner;

public class Main {
    public static int[][] createMatrix(int n){
        int[][] matrix = new int[n][n];
        for (int i = 0; i < matrix.length; i++){
            for (int k = 0; k < matrix[i].length; k++) {
                if (i % 2 == 0){
                    matrix[i][k] = k+1;
                }else {
                    matrix[i][k] = matrix.length-k;
                }
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
            for (int k = 0; k < matrix.length; k++) {
                System.out.print(matrix[i][k] + "\t");
            }
            System.out.println();
        }
        scanner.close();
    }
}
