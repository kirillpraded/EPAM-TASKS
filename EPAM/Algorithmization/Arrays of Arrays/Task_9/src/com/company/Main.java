package com.company;

import java.util.Random;
import java.util.Scanner;

//9. Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце. Определить, какой
//столбец содержит максимальную сумму.
public class Main {
    public static int maximumElements(int[][] matrix){
        int index = 0;
        int maxColumn = 0;
        for(int i = 0; i < matrix[0].length; i++){
            int countColumn=0;
            for(int k = 0; k < matrix.length; k++){
                countColumn += matrix[k][i];
            }
            if(countColumn > maxColumn){
                maxColumn = countColumn;
                index = i;
            }
        }
        return index+1;
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
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("Номер столбца, сумма элементов которого наибольшая = " + maximumElements(matrix));
        scanner.close();
    }
}
