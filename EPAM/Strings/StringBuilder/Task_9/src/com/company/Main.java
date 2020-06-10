package com.company;

import java.util.Scanner;

//9. Посчитать количество строчных (маленьких) и прописных (больших) букв в введенной строке. Учитывать только английские
//буквы.
public class Main {
    public static String countLetterCases(String string){
        int amountUpper = 0;
        int amountLower = 0;
        for(int i = 0; i < string.length(); i++){
            if(Character.isUpperCase(string.charAt(i))){
                amountUpper++;
            }else {
                amountLower++;
            }
        }
        return "Количество букв в нижнем регистре = " + amountLower + " Количество " +
                "букв в верхнем регистре = " + amountUpper;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку ");
        String string = scanner.nextLine();
        System.out.println(countLetterCases(string));
        scanner.close();
    }
}
