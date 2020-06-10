package com.company;
//8. Создать класс Customer, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы
//и метод toString(). Создать второй класс, агрегирующий массив типа Customer, с подходящими конструкторами
//и методами. Задать критерии выбора данных и вывести эти данные на консоль.
//Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета.
//Найти и вывести:
//a) список покупателей в алфавитном порядке;
//b) список покупателей, у которых номер кредитной карточки находится в заданном интервале
public class Main {
//public Customer(String surname, String name, String middleName, int creditCardNumber, int bankAccount) {
    public static void main(String[] args) {
	    Customer[] customers  = new Customer[5];
        customers[0] = new Customer("Кулик", "Алексей", "Евгеньевич", 225, 543242);
        customers[1] = new Customer("Степанов", "Сергей", "Николаевич", 642, 502759);
        customers[2] = new Customer("Савчук", "Иван", "Алексеевич", 478, 870932);
        customers[3] = new Customer("Козел", "Дмитрий", "Витальевич", 122, 217540);
        customers[4] = new Customer("Романовский", "Александр", "Евгеньевич", 793, 490354);
        //сортируем по фамилии в алфавитном порядке
        Customer.sortByName(customers);
        System.out.println();
        //ищем в диапазоне по номеру крединой карты
        Customer.findByCreditNumber(customers, 250 , 500);
    }
}
