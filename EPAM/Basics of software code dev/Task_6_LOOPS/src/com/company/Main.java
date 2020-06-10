package com.company;
//Вывести на экран соответствия между символами и их численными обозначениями в памяти компьютера
//Задание 6, Циклы
public class Main {

    public static void loopOverSymbols(){
        for (int i = 0; i <=128; i++) {
            System.out.println(Character.toString((char)i) + "---" + i);
        }
    }

    public static void main(String[] args) {
        System.out.println("Программа выводит символы  и их номера в памяти комьютера");
        loopOverSymbols();
    }
}
