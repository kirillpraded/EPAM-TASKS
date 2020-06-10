package com.company;

import com.company.dragonmodel.Dragon;

import java.util.Scanner;

//Задача 4.
//Создать консольное приложение, удовлетворяющее следующим требованиям:
//• Приложение должно быть объектно-, а не процедурно-ориентированным.
//• Каждый класс должен иметь отражающее смысл название и информативный состав.
//• Наследование должно применяться только тогда, когда это имеет смысл.
//• При кодировании должны быть использованы соглашения об оформлении кода java code convention.
//• Классы должны быть грамотно разложены по пакетам.
//• Консольное меню должно быть минимальным.
//• Для хранения данных можно использовать файлы.
//Дракон и его сокровища. Создать программу, позволяющую обрабатывать сведения о 100 сокровищах в пещере
//дракона. Реализовать возможность просмотра сокровищ, выбора самого дорогого по стоимости сокровища и
//выбора сокровищ на заданную сумму.
//сделал 50 сокровищ чтобы не прописывать целую сотню вручную
public class Starter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
	    Dragon dragon = new Dragon("Норберт");
        while (true){
            System.out.println("1)Просмотреть список всех предметов\n" +
                    "2)Самый дорогой предмет\n" +
                    "3)Выбор предметов из диапазона\n");
            int i = scanner.nextInt();
            if (i == 0){break;}
            switch (i){
                case 1:
                    System.out.println("Список всех предметов в пещере: ");
                    dragon.getCave().printAllTreasures();
                    break;
                case 2:
                    System.out.println("Самый дорогой предмет: ");
                    dragon.getCave().getMostExpensive();
                    break;
                case 3:
                    System.out.println("Минимум: ");
                    double min = scanner.nextDouble();
                    System.out.println("Максимум: ");
                    double max = scanner.nextDouble();
                    dragon.getCave().getForRange(min, max);
                    break;
            }
        }
    }
}
