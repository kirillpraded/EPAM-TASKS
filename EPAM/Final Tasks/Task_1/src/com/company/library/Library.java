package com.company.library;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();

    public Library() {
        FileReader fileReader = null;
        try {
            fileReader = new FileReader("src/com/company/resouces/booklist.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Scanner scanner = new Scanner(fileReader);
        while (scanner.hasNextLine()) {
            String [] bookLine = scanner.nextLine().split(":");
            System.out.println(bookLine[0]+"  "+bookLine[1]+"  "+bookLine[2] );
            String bookTitle = bookLine[0];
            String bookAuthor = bookLine[1];
            String bookType = bookLine[2];
            Book book = new Book(bookTitle, bookAuthor, bookType);
            System.out.println(book);
            books.add(book);
        }
    }

    public ArrayList<Book> getBooks() {
        return books;
    }


    public void printBooks(){
        for(Book book : books){
            System.out.println(book);
        }
    }


}
