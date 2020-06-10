package com.company;
//5. Подсчитать, сколько раз среди символов заданной строки встречается буква “а”.
public class Main {

    public static int countA(String string){
        int count=0;
        for(int i = 0; i < string.length(); i++){
            Character character = string.charAt(i);
            if(Character.toLowerCase(character) == 'a'){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
	    String string = "aaA, afvvfaaa, aa.";
        System.out.println("Количество букв 'a' = " + countA(string));
    }
}
