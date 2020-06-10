package com.company;

import java.util.Scanner;

//10. Строка X состоит из нескольких предложений, каждое из которых кончается точкой, восклицательным или вопросительным
//знаком. Определить количество предложений в строке X.
public class Main {
    public static int amountOfSent(String str){
        int amount = 0;
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == '.' || str.charAt(i) == '!' || str.charAt(i) == '?'){
                amount++;
            }
        }
        return amount;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку");
        String str = scanner.nextLine();
        System.out.println("Количество предложений в строке = " + amountOfSent(str));
        scanner.close();
    }
}
