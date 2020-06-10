package com.company;

import java.util.Scanner;

public class Main {

    public static String makeReadable(int sec) {
        //используем форматирование строк
        return String.format("%d:%02d:%02d", sec / 3600, sec % 3600 / 60, sec % 60);
    }

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите секунды: ");
        int sec = scanner.nextInt();
            
        if ( sec <= 0 ) {
            throw new Exception("Секунд должно быть больше, чем 0");
        }

        System.out.println("Перевод в часы: " + makeReadable(sec));
        scanner.close();
    }
}
