package com.company;

import java.util.Random;
import java.util.Scanner;

//15. Найдите наибольший элемент матрицы и заменить все нечетные элементы на него
public class Main {
    public static void print(int[][] matrix){
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
    public static void changeElemets(int[][] matrix){
        int maxElement = findMaxElement(matrix);
        for (int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++) {
                if(matrix[i][j] % 2 == 1){
                    matrix[i][j] = maxElement;
                }
            }
        }
        System.out.println("Матрица после замены элементов : ");
        print(matrix);
    }

    public static int findMaxElement(int[][] matrix){
        int maxElement = matrix[0][0];
        for (int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                if(matrix[i][j] > maxElement){
                    maxElement = matrix[i][j];
                }
            }
        }
        return maxElement;
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
            }
        }
        print(matrix);
        changeElemets(matrix);

        scanner.close();
    }
}
