package com.company;
//4. С помощью функции копирования и операции конкатенации составить из частей слова “информатика” слово “торт”.

public class Main {

    public static String createCake(String string) {
        String str = String.valueOf(string.charAt(string.indexOf('т')));
        str += String.valueOf(string.charAt(string.indexOf('о')));
        str += String.valueOf(string.charAt(string.indexOf('р')));
        str += String.valueOf(string.charAt(string.indexOf('т')));
        return str;
    }

    public static void main(String[] args) {
        String string = "информатика";
        System.out.println(createCake(string));
    }
}
