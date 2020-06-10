package com.company;
//3. В строке найти количество цифр.
public class Main {
    public static void findNums(String string){
        char[] array = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        int counter = 0;
        for (int i = 0; i < string.length(); i++) {
            for (int j = 0; j < array.length; j++) {
                if (string.charAt(i) == array[j]) {
                    counter++;
                }
            }
        }
        System.out.print("Количество цифр в строке " + counter);
    }

    public static void main(String[] args) {
	    String str = "f1nd 4ll num6ers";
        findNums(str);
    }
}
