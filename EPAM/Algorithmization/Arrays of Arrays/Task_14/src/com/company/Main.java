package com.company;

import java.util.Scanner;

//14. Сформировать случайную матрицу m x n, состоящую из нулей и единиц, причем в каждом столбце число
//единиц равно номеру столбца.
public class Main {
    public static void print(int[][] matrix){
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
    public static void createMatrix(int[][] matrix){
        for (int j = 0; j < matrix[0].length; j++){
            int am = j+1;
            for(int i = 0; i < matrix.length; i++){
                if(am != 0) {
                    matrix[i][j] = 1;
                    am--;
                }
            }
        }
        print(matrix);
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество строк");
        int indexI = scanner.nextInt();
        System.out.println("Введите количество столбцов");
        int indexJ = scanner.nextInt();
        int[][] matrix = new int[indexI][indexJ];
        createMatrix(matrix);

        scanner.close();
    }
}
