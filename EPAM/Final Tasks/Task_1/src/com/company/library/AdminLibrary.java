package com.company.library;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class AdminLibrary extends Library {


    public AdminLibrary() {
        super();

    }

    public void addBook(){
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите название");
        try {
            String bookTitle = bufferedReader.readLine();
            System.out.println("Введите автора");
            String bookAuthor = bufferedReader.readLine();
            System.out.println("Введите тип(электронная/обычная)");
            String bookType = bufferedReader.readLine();
            this.getBooks().add(new Book(bookTitle, bookAuthor, bookType));
            System.out.println("Успешно добавлено");
            try {
                FileWriter writer = new FileWriter("src/com/company/resouces/booklist.txt", true);
                BufferedWriter bufferWriter = new BufferedWriter(writer);
                bufferWriter.write("\n" +bookTitle+":"+bookAuthor+":"+bookType);
                bufferWriter.close();
            }
            catch (IOException e) {
                System.out.println(e);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        //        bufferedReader.close();

    }


}
