package com.company;
//Задача 2.
//Создать класс Payment с внутренним классом, с помощью объектов которого можно сформировать покупку из
//нескольких товаров.
public class Main {

    public static void main(String[] args) {

        Product p1 = new Product("hair dryer",30.6);
        Product p2 = new Product("vacuum cleaner",105.99);
        Product p3 = new Product("microwave",121.11);
        Product p4 = new Product("oven",499.90);
        Product p5 = new Product("refrigerator",599.9);
        Payment payment = new Payment(p1, p2, p3, p4, p5);
    }
}
