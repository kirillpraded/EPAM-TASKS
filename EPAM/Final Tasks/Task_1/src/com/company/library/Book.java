package com.company.library;

public class Book {
    private String title;
    private String author;
    private String type;

    public Book(String title,String author, String type) {
        this.title = title;
        this.author = author;
        this.type = type;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Книга(" +
                "Название='" + title + '\'' +
                ", Автор='" + author + '\'' +
                ", Тип='" + type + '\'' +
                ')';
    }
}
