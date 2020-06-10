package com.company.controller;

import com.company.library.Book;
import com.company.user.Admin;
import com.company.user.User;

import java.io.*;
import java.util.Scanner;

public class Controller {

    public void work(){
        User user = login();
        if (user == null){System.exit(0);}
        Scanner scanner = new Scanner(System.in);
        if(user instanceof Admin){
            user = (Admin) user;
            while (true){
                System.out.println("1)Список всех книг\n2)Добавить книгу\n3)Просмотреть предложения пользователей\n4)Выход");
                int i = scanner.nextInt();
                if(i == 4){break;}
                switch (i){
                    case 1:
                        ((Admin) user).getLibrary().printBooks();
                        break;
                    case 2:
                        ((Admin) user).getLibrary().addBook();
                        break;
                    case 3:
                        FileReader fileReader = null;
                        try {
                            fileReader = new FileReader("src/com/company/resouces/bookToAdd.txt");
                        } catch (FileNotFoundException e) {
                            e.printStackTrace();
                        }
                        Scanner scannerReader = new Scanner(fileReader);
                        while (scannerReader.hasNextLine()) {
                            String [] bookLine = scannerReader.nextLine().split(":");
                            String bookTitle = bookLine[0];
                            String bookAuthor = bookLine[1];
                            String bookType = bookLine[2];
                            Book book = new Book(bookTitle, bookAuthor, bookType);
                            System.out.println(bookTitle + ":" + bookAuthor + ":" + bookType);
                        }
                        break;
                }
            }
        }
        else {
            while (true){
                System.out.println("1)Выбрать книгу для прочтения\n2)Предложить добавить книгу\n3)Выход");
                int i = scanner.nextInt();
                if(i == 3){break;}
                switch (i){
                    case 1:
                        user.getLibrary().printBooks();
                        break;
                    case 2:
                        user.addBook();
                        break;
                }
            }
        }

    }
    public User login(){
        User user = null;
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Введите логин");
            String login = bufferedReader.readLine();
            System.out.println("Введите пароль");
            String password = bufferedReader.readLine();
            FileReader fileReader = null;
            fileReader = new FileReader("src/com/company/resouces/userslist.txt");
            Scanner scanner = new Scanner(fileReader);
            while (scanner.hasNextLine()) {
                String [] userLine = scanner.nextLine().split(":");
                if(userLine[0].equals(login) && userLine[1].equals(password)){
                    if (userLine[2].equals("admin")){
                        user = new Admin(login, password);
                        return  user;

                    } else {
                        user = new User(login, password);
                        return  user;
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return  user;
    }
}
/*kirillpraded@bk.ru
QwewqE*/
/*user@mail.ru
userpassword*/