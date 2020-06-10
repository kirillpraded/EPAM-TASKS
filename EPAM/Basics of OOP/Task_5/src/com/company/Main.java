package com.company;

import com.company.wrap.Color;
import com.company.wrap.Wrap;

import java.io.*;
import java.util.Scanner;

//Задача 5.
//Создать консольное приложение, удовлетворяющее следующим требованиям:
//• Корректно спроектируйте и реализуйте предметную область задачи.
//• Для создания объектов из иерархии классов продумайте возможность использования порождающих шаблонов
//проектирования.
//• Реализуйте проверку данных, вводимых пользователем, но не на стороне клиента.
//• для проверки корректности переданных данных можно применить регулярные выражения.
//• Меню выбора действия пользователем можно не реализовывать, используйте заглушку.
//• Особое условие: переопределите, где необходимо, методы toString(), equals() и hashCode().
//Вариант A. Цветочная композиция. Реализовать приложение, позволяющее создавать цветочные композиции
//(объект, представляющий собой цветочную композицию). Составляющими цветочной композиции являются цветы
//и упаковка.
public class Main {

    public static void main(String[] args) {
	    Composition composition = new Composition(new Wrap(Color.SUPERRED, "simpleWrap"));
        BufferedReader bufferdReader = new BufferedReader(new InputStreamReader(System.in));
	    while (true){
            System.out.println("1)Изменить обёртку\n2)Добавить цветок\n3)Узнать всю информацию о композиции\n4)Сохранить объект\n5)Проверить композицию из файла");
            int i = 0;
            try {
                i = Integer.parseInt(bufferdReader.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            }
            switch (i){
                case 1:
                    composition.setWrap();
                    break;
                case 2:
                    composition.addFlower();
                    break;
                case 3:
                    System.out.println(composition.toString());
                    break;
                case 4:
                    try {
                        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("composition.dat"));
                        oos.writeObject(composition);
                        System.out.println("Объект успешно сериализован");
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
                case 5:
                    ObjectInputStream ois = null;
                    try {
                    ois = new ObjectInputStream(new FileInputStream("composition.dat"));
                    composition = (Composition)ois.readObject();
                    } catch (IOException e) {
                    e.printStackTrace();
                    } catch (ClassNotFoundException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Успешно загружено");
                    break;
                default:
                    continue;
            }
        }
    }
}
