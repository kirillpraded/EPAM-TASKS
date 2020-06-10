package com.company;
//8.Даны дроби
//p1/q1...pn/qn
//pi qi
//, - натуральные). Составить программу, которая приводит эти дроби к общему
//знаменателю и упорядочивает их в порядке возрастания.
public class Main {
    // берем самое большое число массива и число меньше. перемножаем их - получаем общий знаменатель - ошибка.

    // решать влоб, перемножая все знаменатели, составляя правильные дроби, и потом пробовать их делить

    static int[] numerators = {1, 2, 4, 6, 4, 3};
    static int[] denominators = {4, 8, 7, 12, 13, 5};

    //алгоритм очень ресурсозатратный??

    public static int findCommonDen(int[] array){
        int commonDen = 1;
        for(int x : array){
            commonDen*=x;
        }
        return commonDen;
    }
    public static boolean checkIfNumberReduceTwo(){
        for (int i = 0; i < numerators.length; i++){
            if (numerators[i] % 2 != 0 || denominators[i] % 2 !=0){
                return false;
            }
        }
        return true;
    }

    public static void reduce(){
        //можно также добавить деление на 3, после деления на два, дабы сократить дробь еще больше
        while (checkIfNumberReduceTwo()){
            for(int i = 0; i < denominators.length; i++){
                numerators[i] = numerators[i]/2;
                denominators[i] = denominators[i]/2;
            }
        }
    }
    public static void createNumbers(){
        int commonDen = findCommonDen(denominators);
        for (int i = 0; i < numerators.length; i++){
            numerators[i] = numerators[i] * (commonDen/denominators[i]);
            denominators[i] = commonDen;
        }
        reduce();
    }

    public static void print(int[] array){
        for (int x : array){
            System.out.print(x + "\t");
        }
    }

    public static void main(String[] args) {
        createNumbers();
        System.out.println("Приведенные к общему знаменателю дроби : ");
        print(numerators);
        System.out.println("\n____    ____    ____    ____    ____    ____   ");
        print(denominators);

    }
}
