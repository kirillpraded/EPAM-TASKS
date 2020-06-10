package com.company;
//Задача 1.
//Создать объект класса Текстовый файл, используя классы Файл, Директория. Методы: создать, переименовать,
//вывести на консоль содержимое, дополнить, удалить.
public class Main {

    public static void main(String[] args) {
        Directory directory = new Directory();
        //Реализуем метод "создать файл"
        directory.createFile("First File");
        //Реализуем метод "переименовать"
        directory.getFile().changeName("NewFileName");
        //Реализуем метод "дополнить"
        directory.getFile().addContext("Новая строка.");
        //Реализуем метод "вывести на консоль содержимое"
        directory.getFile().printContext();
        //Реализуем метод "удалить"
        directory.getFile().deleteContext();
    }
}
