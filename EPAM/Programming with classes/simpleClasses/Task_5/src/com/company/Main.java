package com.company;

import java.util.Scanner;

//5. Опишите класс, реализующий десятичный счетчик, который может увеличивать или уменьшать свое значение
//на единицу в заданном диапазоне. Предусмотрите инициализацию счетчика значениями по умолчанию и
//произвольными значениями. Счетчик имеет методы увеличения и уменьшения состояния, и метод
//позволяющее получить его текущее состояние. Написать код, демонстрирующий все возможности класса.
public class Main {

    public static void main(String[] args) {
        Counter counter = new Counter(0, 15);
        Scanner scanner = new Scanner(System.in);
	    while (true){
	        System.out.println("\n1)Увеличить счётчик на 1" +
                    "\n2)Уменьшить счётчик на 1" +
                    "\n3)Получить значение счётчика" +
                    "\n0)Завершить программу");
	        int i = scanner.nextInt();

	        if (i == 1){
                System.out.println(counter.increaseByOne());
            }
	        if(i == 2) {
                System.out.println(counter.decreaseByOne());
            }
	        if(i == 3){
                System.out.println(counter.getAmount());
            }
	        if(i == 0){
                System.out.println("Завершение работы.");
	            break;
            }
        }
	    scanner.close();
    }
}
