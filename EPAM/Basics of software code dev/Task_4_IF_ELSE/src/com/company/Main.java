package com.company;

import java.util.Scanner;
//Ветвления, 4 задание
public class Main {

    public static boolean checkBrick(int heigthHole, int widthHole, int widthBrick, int lengthBrick, int heightBrick){
        //есть ли смысл проверять по длинне?
        if (((heigthHole >= widthBrick && widthHole >= heightBrick)
                || (widthHole >= widthBrick && heigthHole >= heightBrick))
                || ((heigthHole >= widthBrick && widthHole >= lengthBrick)
                || (heigthHole >= lengthBrick && widthHole >= widthBrick))
                || ((heigthHole >= lengthBrick && widthHole >= heightBrick)
                || (heigthHole >= heightBrick && widthHole > lengthBrick)))
        {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println("Программа определяет пролезет ли кирпич с заданными параметрами в отверстие");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Вводим параметры дырки: \nВысота:");
        int heigthHole = scanner.nextInt();
        System.out.println("Ширина:");
        int widthHole = scanner.nextInt();

        System.out.println("Вводим параметры кирпича: \nВысота: ");
        int heigthBrick = scanner.nextInt();
        System.out.println("Ширина: ");
        int widthBrick = scanner.nextInt();
        System.out.println("Длина: ");
        int lengthBrick = scanner.nextInt();

        System.out.println("Кирпич с параметрами ("+widthBrick+", "+heigthBrick + ", " + lengthBrick + ")"
                +" Пролезет в дырку с параметрами (" + widthHole + ", " + heigthHole +") : "
                + checkBrick(heigthHole, widthHole, widthBrick, lengthBrick, heigthBrick));
        scanner.close();
    }
}
