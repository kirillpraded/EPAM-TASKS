package com.company;
//1. Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего.
//Массивы массивов, 1 задание
public class Main {
    public static void printСolumn(int[][] matrix){
        for (int i = 0; i < matrix.length; i ++) {
            for (int j = 0; j < matrix[i].length; j += 2) {
                if (matrix[0][j] > matrix[matrix.length - 1][j]) {
                    System.out.print(matrix[i][j] + "\t");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println("Программа выводит столбцы, у которых первый элемент больше последнего");
	    int[][] matrix = {{ 1,  2, 6,  4, 2, 6},
                          {12,  7,43,  7, 4,14},
                          { 1,  2, 3,  4, 5, 6},
                          { 6,  5, 4,  3, 2, 1},
                          { 4,  3, 6,  7, 2, 8},
                          {55, 23, 1, 89, 3, 5}};
	    printСolumn(matrix);
    }
}
