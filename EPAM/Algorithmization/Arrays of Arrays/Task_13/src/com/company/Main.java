package com.company;

import java.util.Random;
import java.util.Scanner;
//13. Отсотрировать стобцы матрицы по возрастанию и убыванию значений эементов.
public class Main {
//Bubble sort
    public static int[][] sort(int[][] matrix, boolean typeSort){
        if(typeSort) {
            for (int i = 0; i < matrix[0].length; i++) {
                for (int k = matrix.length - 1; k > 0; k--) {
                    for (int j = 0; j < k; j++) {
                        if (matrix[j][i] > matrix[j + 1][i]) {
                            int tmp = matrix[j][i];
                            matrix[j][i] = matrix[j + 1][i];
                            matrix[j + 1][i] = tmp;
                        }
                    }
                }
            }
            return matrix;
        }
        for (int i = 0; i < matrix[0].length; i++) {
            for (int k = matrix.length - 1; k > 0; k--) {
                for (int j = 0; j < k; j++) {
                    if (matrix[j][i] < matrix[j + 1][i]) {
                        int tmp = matrix[j][i];
                        matrix[j][i] = matrix[j + 1][i];
                        matrix[j + 1][i] = tmp;
                    }
                }
            }
        }
        return matrix;
    }
    public static void printMatrix(int[][] matrix){
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество строк");
        int indexI = scanner.nextInt();
        System.out.println("Введите количество столбцов");
        int indexJ = scanner.nextInt();
        int[][] matrix = new int[indexI][indexJ];

        Random random = new Random();
        System.out.println("Сгенерированная матрица : ");
        for (int i=0;i < matrix.length;i++) {
            for (int j=0;j < matrix[i].length;j++) {
                matrix[i][j]=random.nextInt(10) + 1;
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
        //переменная bool введена для выбора между сортировкой от меньшего к большему и от большего к меньшему
        int[][] sortedMatrixMinToMax = sort(matrix, true);
        System.out.println("Отсортированная матрица от меньшего к большему : ");
        //чтобы не хардкодить, сделам функцию printMatrix и будем передавать в нее матрицу
        printMatrix(sortedMatrixMinToMax);
        int[][] sortedMatrixMaxToMin = sort(matrix, false);
        System.out.println("Отсортированная матрица от большего к меньшему : ");
        printMatrix(sortedMatrixMaxToMin);
        scanner.close();
    }
}
