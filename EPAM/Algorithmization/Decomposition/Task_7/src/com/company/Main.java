package com.company;
//7. Написать метод(методы) для вычисления суммы факториалов всех нечетных чисел от 1 до 9.
public class Main {

    public static int fact(int num){
        int result = 1;
        for(int i = 1; i <=num; i++){
            result*=i;
        }
        return result;
    }

    public static int findFactNine(){
        int sumOfFact = 0;
        for (int i = 1;i <=9;i+=2){
            sumOfFact+=fact(i);
        }
        return sumOfFact;
    }

    public static void main(String[] args) {
        System.out.println("Факториал всех нечетных чисел от 1 до 9 равен = " + findFactNine());
    }
}
