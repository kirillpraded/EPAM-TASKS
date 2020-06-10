package com.company;

import java.util.Scanner;

//2. Создать объект класса Автомобиль, используя классы Колесо, Двигатель. Методы: ехать, заправляться,
//менять колесо, вывести на консоль марку автомобиля.
public class Main {

    public static void main(String[] args) {
	    Wheel[] wheels = new Wheel[4];
	    wheels[0] = new Wheel(21, "low");
        wheels[1] = new Wheel(21, "low");
        wheels[2] = new Wheel(21, "low");
        wheels[3] = new Wheel(21, "low");
        Car CadillacEscalade = new Car("Cadillac Escalade", new Engine(6.2), wheels);
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("1)Проехаться\n" +
                    "2)Заправиться\n" +
                    "3)Сменить колесо\n" +
                    "4)Узнать информацию\n" +
                    "5)Выйти");
            int i = scanner.nextInt();
            if (i == 5){break;}
            switch (i){
                case 1:
                    CadillacEscalade.drive();
                    break;
                case 2:
                    CadillacEscalade.refill();
                    break;
                case 3:
                    System.out.println("Введите номер колеса");
                    int numOfWheel = scanner.nextInt();
                    CadillacEscalade.changeWheel(new Wheel(wheels[numOfWheel].getSize(), wheels[numOfWheel].getWheelProfile()), numOfWheel);
                    break;
                case 4:
                    System.out.println(CadillacEscalade.toString());
            }
        }
       scanner.close();
    }
}
