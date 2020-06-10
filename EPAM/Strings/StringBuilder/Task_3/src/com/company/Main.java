package com.company;
//3. Проверить, является ли заданное слово палиндромом.
public class Main {

    public static boolean reverse(String string){
        String reversed = "";
        for(int i = 0; i < string.length(); i++){
            reversed = string.charAt(i) + reversed;
        }
        return reversed.equals(string);
    }

    public static void main(String[] args) {
	    String string = "level";
        System.out.println("Слово является палиндромом: " + reverse(string));
    }
}
