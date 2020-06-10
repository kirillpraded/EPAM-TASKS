package com.company;

import java.util.Scanner;
//массивы массивов
//6. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
//1	1	1	1	1	1	1	1
//0	1	1	1	1	1	1	0
//0	0	1	1	1	1	0	0
//0	0	0	1	1	0	0	0
//0	0	0	1	1	0	0	0
//0	0	1	1	1	1	0	0
//0	1	1	1	1	1	1	0
//1	1	1	1	1	1	1	1
public class Main {

    public static int[][] createMatrix(int n){
        int[][] matrix = new int[n][n];
        //воспользуемся вспомогательной переменной, указывайщей на середину массива
        int indexOfCenter = n/2;
        for (int i = 0; i < matrix.length; i++){
            for (int k = i; k < matrix[i].length - i; k++) {
                matrix[i][k] = 1;
            }
            if(i >= n/2){
                for(int j = indexOfCenter-1; j <= i ; j++){
                    matrix[i][j] = 1;
                }
                indexOfCenter--;
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
