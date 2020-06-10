package com.company;
//6. Из заданной строки получить новую, повторив каждый символ дважды.
public class Main {

    public static String multiplyString(String string){
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = 0; i < string.length(); i++){
            stringBuilder.append(string.charAt(i));
            stringBuilder.append(string.charAt(i));
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
	    String string = "Multiply string to two";
        System.out.println(multiplyString(string));
    }
}
