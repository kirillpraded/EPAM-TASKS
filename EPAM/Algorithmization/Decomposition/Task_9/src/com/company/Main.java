package com.company;
//Даны числа X, Y, Z, Т — длины сторон четырехугольника. Написать метод(методы) вычисления его площади,
//если угол между сторонами длиной X и Y— прямой.

import java.util.Scanner;


public class Main {

    public static double calculateSquare(double x, double y, double z, double t){
        double squareXY = x*y/2;
        double hypotenuse = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
        double halfPerim = (z + t + hypotenuse)/2;
        double triangleSquare = Math.sqrt(halfPerim*(halfPerim - z)*(halfPerim - t)*(halfPerim - hypotenuse));
        return (squareXY + triangleSquare);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сторону X");
        double x = scanner.nextDouble();
        System.out.println("Введите сторону Y");
        double y = scanner.nextDouble();
        System.out.println("Введите сторону Z");
        double z = scanner.nextDouble();
        System.out.println("Введите сторону T");
        double t = scanner.nextDouble();
        System.out.println( "Площадь четырехугольника = " + calculateSquare(x,y,z,t));
        scanner.close();
    }
}
