package com.company;

public class Account {

    private static int idPattern = 0;
    private int id;
    private double balance;
    private boolean isActive = true;

    public Account(double balance) {
        this.balance = balance;
        this.id = idPattern++;
    }

    public long getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public boolean isActive() {
        return isActive;
    }

    public String getStatus() {
        String status = isActive ? "Активен" : "Заблокирован";
        return "Счёт: " + id + "; Статус: " + status + ";";
    }

    public void blockAccount(){
        isActive = false;
    }

    public void unlockAccount() {
        isActive = true;
    }




}
