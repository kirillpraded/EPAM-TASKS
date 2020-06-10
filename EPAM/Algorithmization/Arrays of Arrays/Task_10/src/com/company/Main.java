package com.company;

import java.util.Scanner;
//10. Найти положительные элементы главной диагонали квадратной матрицы.
public class Main {

    public static void printMinusElements(int[][] matrix){
        System.out.println("Положительные элементы : ");
        for (int i=0;i < matrix.length;i++) {
            if(matrix[i][i] > 0){
                System.out.print(matrix[i][i] + ", ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размерность матрицы");
        int index = scanner.nextInt();

        int[][] matrix = new int[index][index];

        System.out.println("Матрица : ");
        for (int i=0;i < matrix.length;i++) {
            for (int j=0;j < matrix[i].length;j++) {
                //генерируем случайные числа от -100 до 100
                double a = Math.random()*200 - 100;
                matrix[i][j]=(int)a;
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
        printMinusElements(matrix);
    }
}
