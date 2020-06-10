package com.company;
//2. Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.
//Массивы массивов, второе задание
public class Main {

    public static void printD(int[][] matix){
        System.out.println("Элементы главной диагонали: ");
        for (int i = 0; i < matix.length; i++){
            System.out.print(matix[i][i] + ", ");
        }
        System.out.println("\nЭлементы побочной диагонали: ");
        int k = matix[0].length - 1;
        for(int i = 0; i < matix.length; i++){
            System.out.print(matix[i][k] + ", ");
            k--;

        }

    }

    public static void main(String[] args) {
	    int[][] matrix = {{1,2,3},
                          {4,5,6},
                          {7,8,9}};
	    //передаем матрицу в функцию, которая выводит элементы
        printD(matrix);
    }
}
