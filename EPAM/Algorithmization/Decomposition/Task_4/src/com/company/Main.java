package com.company;

import java.util.Scanner;

//На плоскости заданы своими координатами n точек. Написать метод(методы), определяющие, между какими
//из пар точек самое большое расстояние. Указание. Координаты точек занести в массив.
public class Main {

    public static void findDistance(double[][] matrix){
        double maxDistance = 0;
        int indexOfFirstPoint = 0;
        int indexOfSecondPoint = 0;
        for(int i = 0; i < matrix.length; i++){
            for (int j = 1; j < matrix.length; j++){
                double distance = Math.sqrt(Math.pow(matrix[i][0] - matrix[j][0], 2) + Math.pow(matrix[i][1] - matrix[j][1], 2));
                if(distance > maxDistance){
                    maxDistance = distance;
                    indexOfFirstPoint = i;
                    indexOfSecondPoint = j;
                }
            }
        }
        System.out.println("Наибольшее расстояние между точками (" + matrix[indexOfFirstPoint][0] + ", " + matrix[indexOfFirstPoint][1] + ") и ("
                +  matrix[indexOfSecondPoint][0] + ", " + matrix[indexOfSecondPoint][1] + ") = " + maxDistance);
    }

    public static void main(String[] args) {
        //double[][] matrix = {{1, 3},{0,-2},{3,5},{6,5},{-2,-3}};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размерность");
        int size = scanner.nextInt();
        double[][] matrix = new double[size][2];
        for (int i = 0; i < matrix.length; i++){
            System.out.println("Вводим точку номер" + (i+1));
            for(int j = 0; j < matrix[i].length; j++){
                System.out.println("Введите х/у");
                matrix[i][j] = scanner.nextDouble();
            }
        }
        findDistance(matrix);
        scanner.close();
    }
}
