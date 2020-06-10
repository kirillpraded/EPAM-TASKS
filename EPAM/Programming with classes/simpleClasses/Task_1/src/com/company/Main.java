package com.company;
//1. Создайте класс Test1 двумя переменными. Добавьте метод вывода на экран и методы изменения этих
//переменных. Добавьте метод, который находит сумму значений этих переменных, и метод, который находит
//наибольшее значение из этих двух переменных.
public class Main {

    public static void main(String[] args) {
        Test1 test1 = new Test1(5, 7);
        System.out.println( "a = " + test1.getA()+
                            " b = " + test1.getB() +
                            " sum = "+test1.getSum()+
                            " max = "+test1.max()
        );
        Test1 test2 = new Test1();
        test2.setA(123);
        test2.setB(12);
        System.out.println( "a = " + test2.getA()+
                " b = " + test2.getB() +
                " sum = "+test2.getSum()+
                " max = "+test2.max()
        );
    }
}
