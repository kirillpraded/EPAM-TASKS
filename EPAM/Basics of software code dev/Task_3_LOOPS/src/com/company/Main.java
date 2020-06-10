package com.company;
//Третье задание, циклы
public class Main {

    public static int loopNumbers(){
        int result = 0;
        for (int i = 1; i <= 100; i ++){
            result += Math.pow(i, 2);
        }
        return result;
    }
    
    public static void main(String[] args) {
        System.out.println("Программа находит сумму квадратов первых ста чисел : "+
                loopNumbers());

    }
}
