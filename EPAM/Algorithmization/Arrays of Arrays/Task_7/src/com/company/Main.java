package com.company;

import java.util.Scanner;
//Сформировать квадратную матрицу порядка N по правилу:
//matrix[i][k] = Math.sin((Math.pow(i, 2) - Math.pow(k, 2))/n);
public class Main {



    public static double[][] createMatrix(int n){
        double[][] matrix = new double[n][n];
        for (int i = 0; i < matrix.length; i++){
            for (int k = 0; k < matrix[i].length ; k++) {
                matrix[i][k] = Math.sin((Math.pow(i, 2) - Math.pow(k, 2))/n);
            }
        }
        return matrix;
    }

    public static void calculatePlusElements(double[][] matrix){
        int plusElements = 0;
        int minusElements = 0;
        int zeroElements = 0;
        for (int i = 0; i < matrix.length; i++){
            for (int k = 0; k < matrix[i].length ; k++) {
                if(matrix[i][k] > 0){
                    plusElements++;
                } else if(matrix[i][k] == 0){
                    zeroElements++;
                } else {
                    minusElements++;
                }
            }
        }
        System.out.println("\nКоличество положительных элементов = " + plusElements +
                "\nКоличество отрицательных элементов = " + minusElements +
                "\nКоличество нулевых элементов = " + zeroElements  );
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размерность матрицы");
        int n = scanner.nextInt();

        double[][] matrix = createMatrix(n);

        System.out.println("Сформированная матрица : \n");
        for (int i = 0; i < matrix.length; i++){
            for (int k = 0; k < matrix[i].length; k++) {
                System.out.print(matrix[i][k] + "\t");
            }
            System.out.println();
        }
        calculatePlusElements(matrix);
        scanner.close();
    }
}
