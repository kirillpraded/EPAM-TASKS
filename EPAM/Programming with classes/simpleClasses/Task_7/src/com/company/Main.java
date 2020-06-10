package com.company;
//7. Описать класс, представляющий треугольник. Предусмотреть методы для создания объектов, вычисления
//площади, периметра и точки пересечения медиан.
public class Main {

    public static void main(String[] args) {
        Point p1 = new Point(0, 0);
        Point p2 = new Point(0, 5);
        Point p3 = new Point(5, 0);
        Triangle triangle = new Triangle(p1,p2,p3);
        //площадь
        System.out.println(triangle.getArea());
        //периметр
        System.out.println(triangle.getPerim());
        //медиана
        System.out.println(triangle.getMedian());
    }
}
