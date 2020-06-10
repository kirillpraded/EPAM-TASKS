package com.company;

import java.util.Random;
import java.util.Scanner;
//8. В числовой матрице поменять местами два столбца любых столбца, т. е. все элементы одного столбца поставить
//на соответствующие им позиции другого, а его элементы второго переместить в первый. Номера столбцов вводит
//пользователь с клавиатуры.
public class Main {
    public static int[][] mas(int[][] matrix, int first, int second){
        for (int i = 0; i < matrix.length; i++) {
                int c = 0;
                c = matrix[i][first];
                matrix[i][first] = matrix[i][second];
                matrix[i][second] = c;
        }
        return matrix;
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

        System.out.println("Какой столбец хотите поменять?");
        int columnFirst = scanner.nextInt();
        System.out.println("с каким столбцом хотите его поменять?");
        int columnSecond = scanner.nextInt();
        int[][] resultMatrix = mas(matrix, columnFirst-1, columnSecond-1);
        System.out.println("Результат замены столбцов");
        for (int i = 0; i < resultMatrix.length; i++){
            for(int j = 0; j < resultMatrix[i].length; j++){
                System.out.print(resultMatrix[i][j] + "\t");
            }
            System.out.println();
        }
        scanner.close();
    }
}
