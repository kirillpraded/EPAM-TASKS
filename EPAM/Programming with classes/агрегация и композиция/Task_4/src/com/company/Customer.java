package com.company;

import java.util.ArrayList;
import java.util.Comparator;

public class Customer {
    private String name;
    private String passportID;
    private ArrayList<Account> accounts;

    public Customer(String name, String passportID) {
        this.name = name;
        this.passportID = passportID;
        accounts = new ArrayList<>();
    }

    private double getAllCardsBalance(){
        double balance = 0;
        for(Account account : accounts){
            balance +=account.getBalance();
        }
        return balance;
    }
    public double getPositiveBalance() {
        double balance = 0;
        for (Account account : accounts) {
            if (account.getBalance() > 0) {
                balance += account.getBalance();
            }
        }
        return balance;
    }
    public double getNegativeBalance() {
        double balance = 0;
        for (Account account : accounts) {
            if (account.getBalance() < 0) {
                balance += account.getBalance();
            }
        }
        return balance;
    }




    public void sortByBalance() {
        accounts.sort(Comparator.comparing(Account::getBalance));
    }

    public Account getAccount (int id) {
        for (Account account : accounts) {
            if (account.getId() == id) {
                return account;
            }
        }
        return null;
    }

    public void addAccount (Account account) {
        accounts.add(account);
    }

    public void blockAccount (int id) {
        for (Account account : accounts) {
            if(account.getId() == id) {
                account.blockAccount();
            }
        }
    }

    public void unlockAccount (int id) {
        for (Account account : accounts) {
            if(account.getId() == id) {
                account.unlockAccount();
            }
        }
    }

    public String getInformation () {
        String information = "";
        for (Account account : accounts) {
            information += ("id: "+ account.getId()+ " Баланс: " + account.getBalance()+ " Статус: "+ account.getStatus());
        }
        return String.format("Пользователь %s Имеет следующие аккаунты:\n%s", toString(), information);
    }

    public String getPassportID() {
        return passportID;
    }

    public void setPassportID(String passportID) {
        this.passportID = passportID;
    }


    @Override
    public String toString() {
        return String.format("Имя: " + name + " id: " + passportID);
    }
}
