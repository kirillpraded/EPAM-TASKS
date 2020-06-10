package com.company;
//1. Дан текст (строка). Найдите наибольшее количество подряд идущих пробелов в нем
public class Main {
    public static int findMaxAmountOfSpaces(String string){
        int maxAmount = 0;
        int spacesAmount = 0;
        for(int i = 0; i < string.length(); i++){
            if(string.charAt(i) == ' '){
                spacesAmount++;
                if(spacesAmount > maxAmount){
                    maxAmount = spacesAmount;
                }
            } else{
                spacesAmount = 0;
            }
        }
        return maxAmount;
    }

    public static void main(String[] args) {
	    String string = "Find      max  amount of SPaCeS.";
        System.out.println("Максимальное количество пробелов подряд "+findMaxAmountOfSpaces(string));
    }
}
