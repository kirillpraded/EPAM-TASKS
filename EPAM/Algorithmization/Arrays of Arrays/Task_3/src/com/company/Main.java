package com.company;

import javafx.scene.transform.Scale;

import java.util.Random;
import java.util.Scanner;

//3. Дана матрица. Вывести k-ю строку и p-й столбец матрицы.
public class Main {

    public static void printRowAndColumn(int[][] matrix, int row, int column){
        System.out.println("Столбец : ");
        for (int i = 0; i < matrix.length; i++){
            System.out.println(matrix[i][column]);
        }
        System.out.println("Строка : ");
        for (int i = 0; i < matrix[0].length; i++){
            System.out.print(matrix[row][i] + ", ");
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
        for (int i=0;i < matrix.length;i++) {
            for (int j=0;j < matrix[i].length;j++) {
                matrix[i][j]=random.nextInt(10) + 1;
            }
        }

        System.out.println("Какой столбец хотите вывести?");
        int column = scanner.nextInt();
        System.out.println("Какую строку хотите вывести?");
        int row = scanner.nextInt();
        printRowAndColumn(matrix, row-1, column-1);
        scanner.close();
    }
}
