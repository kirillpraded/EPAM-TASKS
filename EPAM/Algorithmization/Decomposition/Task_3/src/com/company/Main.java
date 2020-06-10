package com.company;

import java.util.Scanner;

//3. Вычислить площадь правильного шестиугольника со стороной а, используя метод вычисления площади
//        треугольника.
public class Main {

    public static double findSquare(double radius){
        return triangleSquare(radius) * 6;
    }

    private static double triangleSquare(double radius) {
        //формула площади треугольника
        return (Math.pow(radius, 2) * Math.sqrt(3) )/4;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сторону шестиугольника (если это нецелое число - через запятую): ");
        double radius = scanner.nextDouble();
        System.out.println("Площадь шестиугольника со стороной " + radius + " равна " + findSquare(radius));
        scanner.close();
    }
}
