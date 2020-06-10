package com.company.user;

import com.company.library.AdminLibrary;

public class Admin extends User {
    private AdminLibrary library;


    public Admin(String email, String password) {
        super(email, password);
        library = new AdminLibrary();
    }

    public AdminLibrary getLibrary() {
        return library;
    }

    @Override
    public String toString() {
        return "User{" +
                "email='" + getEmail() + '\'' +
                ", password='" + getPassword() + '\'' +
                '}';
    }
}
