package com.company.client;

import java.io.*;
import java.net.Socket;
import java.util.*;

public class Client {

    private static void write(BufferedWriter writer, String request){
        try {
            writer.write(request);
            writer.newLine();
            writer.flush();
        } catch (IOException e){
            throw new RuntimeException(e);
        }
    }

    public static void menu(BufferedReader reader, BufferedWriter writer){
        Scanner scanner = new Scanner(System.in);
        String request;

        System.out.println("Введите логин и пароль: ");
        request = 1 + ";" + scanner.next() + ";" + scanner.next();
        write(writer, request);

        try {
            int choice = 1;
            while (choice != 0) {

                do {
                    System.out.println(reader.readLine());
                }while (reader.ready());

                System.out.println("1)Логин" +
                        "\n2)Показать архив" +
                        "\n3)искать по факультету" +
                        "\n4)искать по курсу" +
                        "\n5)Искать по году поступления" +
                        "\n6)Добавить" +
                        "\n7)Изменить курс" +
                        "\n8)Увеличить курс" +
                        "\n9)Выбрать" +
                        "\n10)Сортировать" +
                        "\n11)Изменить факультет" );
                choice = scanner.nextInt();
                switch (choice) {
                    case 1: {
                        System.out.println("Введите логин и пароль для авторизации: ");
                        request = 1 + ";" + scanner.next() + ";" + scanner.next();
                        write(writer, request);
                        break;
                    }

                    case 2: {
                        request = 2 + ";";
                        write(writer, request);
                        break;
                    }

                    case 3: {
                        System.out.println("Enter the name of the faculty ");
                        request = 3 + ";" + scanner.next();
                        write(writer, request);
                        break;
                    }

                    case 4: {
                        System.out.println("Enter a course to search ");
                        request = 4 + ";" + scanner.nextInt();
                        write(writer, request);
                        break;
                    }

                    case 5: {
                        System.out.println("Enter the year of receipt ");
                        request = 5 + ";" + scanner.nextInt();
                        write(writer, request);
                        break;
                    }

                    case 6: {
                        System.out.println("Enter student name, faculty, course and year of enrollment ");
                        request = 6 + ";" + scanner.next() + ";" + scanner.next() + ";" + scanner.nextInt() + ";" + scanner.nextInt();
                        write(writer, request);
                        break;
                    }

                    case 7: {
                        System.out.println("Введите номер курса");
                        request = 13 + ";" + scanner.nextInt();
                        write(writer, request);
                        break;
                    }

                    case 8: {
                        request = 12 + ";";
                        write(writer, request);
                        break;
                    }

                    case 9: {
                        System.out.println("Enter case number to select ");
                        request = 8 + ";" + scanner.nextInt();
                        write(writer, request);
                        break;
                    }

                    case 10: {
                        request = 10 + ";";
                        write(writer, request);
                        break;
                    }

                    case 11: {
                        System.out.println("Введите название факультета ");
                        request = 11 + ";" + scanner.next();
                        write(writer, request);
                        break;
                    }



                }
            }
        }catch (InputMismatchException e){
            throw new RuntimeException(e);
        }
        catch (IOException e){
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        try(
                Socket socket=new Socket("127.0.0.1",8080);
                BufferedWriter writer=
                        new BufferedWriter(
                                new OutputStreamWriter(
                                        socket.getOutputStream()));
                BufferedReader reader=
                        new BufferedReader(
                                new InputStreamReader(
                                        socket.getInputStream()));
        ){
            while(socket.isConnected()) {
                menu(reader, writer);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
