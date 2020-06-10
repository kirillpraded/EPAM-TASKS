package com.company;
//Book: id, название, автор(ы), издательство, год издания, количество страниц, цена, тип переплета.

public class Book {
    private static int idPattern = 0;
    private int id;
    private String name;
    private String author;
    private String publishingHouse;
    private int year;
    private int amountOfPages;
    private double price;
    private String typeOfBook;

    public Book(String name, String author, String publishingHouse, int year, int amountOfPages, double price, String typeOfBook) {
        this.id = idPattern++;
        this.name = name;
        this.author = author;
        this.publishingHouse = publishingHouse;
        this.year = year;
        this.amountOfPages = amountOfPages;
        this.price = price;
        this.typeOfBook = typeOfBook;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }

    public void setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getAmountOfPages() {
        return amountOfPages;
    }

    public void setAmountOfPages(int amountOfPages) {
        this.amountOfPages = amountOfPages;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getTypeOfBook() {
        return typeOfBook;
    }

    public void setTypeOfBook(String typeOfBook) {
        this.typeOfBook = typeOfBook;
    }

    @Override
    public String toString() {
        return "Book {" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", publishingHouse='" + publishingHouse + '\'' +
                ", year=" + year +
                ", amountOfPages=" + amountOfPages +
                ", price=" + price +
                ", typeOfBook='" + typeOfBook + '\'' +
                '}';
    }
}
