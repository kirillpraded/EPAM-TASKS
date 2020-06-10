package com.company;

import java.util.ArrayList;

//9. Создать класс Book, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и
//метод toString(). Создать второй класс, агрегирующий массив типа Book, с подходящими конструкторами и
//методами. Задать критерии выбора данных и вывести эти данные на консоль.
//Book: id, название, автор(ы), издательство, год издания, количество страниц, цена, тип переплета.
//Найти и вывести:
//a) список книг заданного автора;
//b) список книг, выпущенных заданным издательством;
//c) список книг, выпущенных после заданного года.
public class Main {
    public static void print(ArrayList<Book> arrayList){
        for(Book book : arrayList){
            System.out.println(book.toString());
        }
    }

    public static void main(String[] args) {
        Library library = new Library("MyHomeLibrary");
        library.addBook("Эффективная Java", "Джошуа Блох", "Sun", 2017, 362, 22.5, "Твердый");
        library.addBook("Java. Библиотека профессионала", "Кей С. Хорстманн", "Prentince", 2016, 750, 39.9, "Твердый");
        library.addBook("Head First. Паттерны проектирования", "Эрик Фримен", "Питер", 2015, 520, 24.5, "Твердый");
        ArrayList<Book> authors = library.authorsBooks("Кей С. Хорстманн");
        ArrayList<Book> publishingHouse = library.publishersBook("Питер");
        ArrayList<Book> publishedAfter = library.releasedAfter(2016);
        print(publishedAfter);
    }
}
