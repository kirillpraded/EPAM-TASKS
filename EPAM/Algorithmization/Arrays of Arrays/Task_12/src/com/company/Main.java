package com.company;

import java.util.Random;
import java.util.Scanner;
//12. Отсортировать строки матрицы по возрастанию и убыванию значений элементов.

public class Main {
    public static int[] bubbleSort(int[] arr, boolean toLess){
        if(toLess) {
            for (int i = arr.length - 1; i > 0; i--) {
                for (int j = 0; j < i; j++) {
                    if (arr[j] > arr[j + 1]) {
                        int tmp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = tmp;
                    }
                }
            }
            return arr;
        }
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] < arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
        return arr;

    }
    public static int[][] sort(int[][] matrix, boolean typeSort){
        for (int i = 0; i < matrix.length; i++){
            matrix[i] = bubbleSort(matrix[i], typeSort);
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
