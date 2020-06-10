package com.company;

import java.util.ArrayList;
//a) список книг заданного автора;
//b) список книг, выпущенных заданным издательством;
//c) список книг, выпущенных после заданного года.
public class Library {
    private String bookStoreName;
    private ArrayList<Book> bookList;

    public Library(String bookStoreName) {
        this.bookStoreName = bookStoreName;
        this.bookList = new ArrayList<Book>();
    }

    public void addBook(String name, String author, String publishingHouse, int year, int amountOfPages, double price, String typeOfBook) {
        this.bookList.add(new Book(name, author, publishingHouse, year, amountOfPages, price, typeOfBook));
    }

    public ArrayList<Book> authorsBooks(String author) {
        ArrayList<Book> authorList = new ArrayList<>();
        for (Book book : this.bookList) {
            if (book.getAuthor().equalsIgnoreCase(author)) {
                authorList.add(book);
            }
        }
        return authorList;
    }

    public ArrayList<Book> publishersBook(String publisher) {
        ArrayList<Book> publisherList = new ArrayList<>();
        for (Book book : this.bookList) {
            if (book.getPublishingHouse().equalsIgnoreCase(publisher)) {
                publisherList.add(book);
            }
        }
        return publisherList;
    }

    public ArrayList<Book> releasedAfter(int year) {
        ArrayList<Book> releasedAfterList = new ArrayList<>();
        for (Book book : this.bookList) {
            if (book.getYear() >= year) {
                releasedAfterList.add(book);
            }
        }
        return releasedAfterList;
    }

    public String getBookStoreName() {
        return bookStoreName;
    }

    public void setBookStoreName(String bookStoreName) {
        this.bookStoreName = bookStoreName;
    }

    public ArrayList<Book> getBookList() {
        return bookList;
    }

    public void setBookList(ArrayList<Book> bookList) {
        this.bookList = bookList;
    }
}
