package com.company;
//4. В строке найти количество чисел.
public class Main {
    public static int findNums(String strings) {
        int counter = 0;
        for (int i = 0; i < strings.length(); i++) {
            if (isDigit(strings.charAt(i))) {
                if (!isDigit(strings.charAt(i + 1)) || i == strings.length() - 1) {
                    counter++;
                }
            }
        }
        return counter;
    }

    public static boolean isDigit(char ch) {
        boolean isDigit = false;
        char [] digits = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        for (int i = 0; i < digits.length; i++) {
            if (ch == digits[i]) {
                isDigit = true;
                break;
            }
        }
        return isDigit;
    }


    public static void main(String[] args) {
	    String string = "Find 232 all 433 numbers 432.";
        System.out.println("Количество чисел в строке = " + findNums(string));
    }
}
