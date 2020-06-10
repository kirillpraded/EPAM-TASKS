package com.company;

import java.util.Scanner;
//ветвления, задание номер 1

public class Main {


    public static String checkForAngles(int firstAngle, int secondAngle){
        if(firstAngle + secondAngle >= 180){
            return "Такого треугольника не существует";
        }else if((firstAngle == 90) || (secondAngle == 90)
                || (180 - firstAngle - secondAngle)  == 90){
            return "Треугольник существует. Он будет прямоугольным.";
        } else {
            return "Треугольник существует. Он не будет прямоугольным.";
        }


    }

    public static void main(String[] args) {
        //проверяем, существует ли треугольник, и если да, может ли он быть прямоугольным
        System.out.println("Программа проверяет введенные углы на возможность построения из них треугольника");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первый угол(в градусах): ");
        int firstAngle = scanner.nextInt();

        System.out.println("Введите второй угол(в градусах): ");
        int secondAngle = scanner.nextInt();

        System.out.println("Результат проверки углов: \n" + checkForAngles(firstAngle, secondAngle));
        scanner.close();
    }
}
