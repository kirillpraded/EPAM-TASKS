package com.company;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Customer> customers;

    public Bank(String name) {
        this.name = name;
        this.customers = new ArrayList<>();
    }

    public Customer getClient (String passportID) {
        for (Customer customer : customers) {
            if (customer.getPassportID().equals(passportID)) {
                return customer;
            }
        }
        return null;
    }

    public void addNewClient(Customer customer) {
        customers.add(customer);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("В банке %s  %d клиентов", name, customers.size());
    }
}
