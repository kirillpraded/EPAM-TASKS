package com.company.user;

import com.company.library.AdminLibrary;
import com.company.library.Book;
import com.company.library.Library;

import java.io.*;

public class User {
    private String email;
    private String password;
    private Library library = new Library();

    public User(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Library getLibrary() {
        return library;
    }

    public void setLibrary(Library library) {
        this.library = library;
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
            try {
                FileWriter writer = new FileWriter("src/com/company/resouces/bookToAdd.txt", true);
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

    @Override
    public String toString() {
        return "User{" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
