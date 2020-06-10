package com.company;

import java.util.Random;
import java.util.Scanner;
//Матрицу 10x20 заполнить случайными числами от 0 до 15. Вывести на экран саму матрицу и номера строк, в
//которых число 5 встречается три и более раз.
public class Main {
    public static void tripleFive(int[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            int countFives = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                if(matrix[i][j] == 5){
                    countFives++;
                }
            }
            if (countFives >= 3){
                System.out.println("В строке " + i + " пятёрки встречаются " + countFives+ " раз");
            }
        }
    }

    public static void main(String[] args) {

        int[][] matrix = new int[10][20];

        Random random = new Random();
        System.out.println("Матрица: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(16);
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("Номера строк, в которых цифра 5 встречается более 3ех раз : ");
        tripleFive(matrix);
    }
}

