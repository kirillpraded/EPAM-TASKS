package com.company;
//Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета.
public class Customer {
    private static int idpattern = 0;
    private int id;
    private String surname;
    private String name;
    private String middleName;
    private int creditCardNumber;
    private int bankAccount;

    public Customer(String surname, String name, String middleName, int creditCardNumber, int bankAccount) {
        this.id = idpattern;
        idpattern++;
        this.surname = surname;
        this.name = name;
        this.middleName = middleName;
        this.creditCardNumber = creditCardNumber;
        this.bankAccount = bankAccount;
    }

    public static void sortByName(Customer[] customers){
        Customer temp;
        for (int i = 0; i < customers.length; i++) {
            for (int j = customers.length - 1; j > i; j--) {
                int compare = customers[i].surname.compareTo(customers[j].surname);
                if (compare > 0) {
                    temp = customers[i];
                    customers[i] = customers[j];
                    customers[j] = temp;
                }


            }
        }
        for (Customer customer : customers){
            System.out.println(customer.toString());
        }
    }
    public static void findByCreditNumber(Customer[] customers, int start, int stop){
        for (Customer customer : customers){
            if(customer.creditCardNumber >= start && customer.creditCardNumber <=stop) {
                System.out.println(customer.toString());
            }
        }
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", middleName='" + middleName + '\'' +
                ", creditCardNumber=" + creditCardNumber +
                ", bankAccount=" + bankAccount +
                '}';
    }
}
