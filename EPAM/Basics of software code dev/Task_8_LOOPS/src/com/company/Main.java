package com.company;


import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

//Даны два числа. Определить цифры, входящие в запись как первого так и второго числа.
//Задание 8, циклы
public class Main {
    //Используем сет, чтобы наши цифры не повторялись
    public static Set findRepeatUniqueNums(int first, int second){
        Set<Character> set = new HashSet<>();
        String firstNumToStr = Integer.toString(first);
        String secondNumToStr = Integer.toString(second);
        //проходимся двойным циклом, сверить каждую цифру первого числа со вторым
        for (int i = 0; i < firstNumToStr.length();i++){
            for (int k = 0; k < secondNumToStr.length();k++){
                if(firstNumToStr.charAt(i) == secondNumToStr.charAt(k)){
                    set.add(secondNumToStr.charAt(k));
                }
            }
        }
        return set;
    }

    public static void main(String[] args) {
        System.out.println("Программа проверяет, есть ли общие цифры в двух числах");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое число: ");
        int firstNum = scanner.nextInt();

        System.out.println("Введите второе число: ");
        int secondNum = scanner.nextInt();



        Set<Character> set =  findRepeatUniqueNums(firstNum, secondNum);
        System.out.println("Повторяющиеся цифры в числах: " +  set.toString());
        scanner.close();
    }
}
