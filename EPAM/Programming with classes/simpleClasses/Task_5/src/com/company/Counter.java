package com.company;

public class Counter {
    private int start;
    private int max;
    private int amount;

    public Counter(int start, int max) {
        // по умолчанию инициализирует значение равное минимальному значению диапазона
        this.start = start;
        this.max = max;
        this.amount = start;
    }

    public Counter(int start, int max, int amount) {
        // иницализирует значенние с помощью переданного параметра
        this.start = start;
        this.max = max;
        this.amount = amount;
    }

    public String increaseByOne(){
        if (amount < max) {
            this.amount = amount + 1;
        }
        return "Значение счётчика = " + amount;
    }
    public String decreaseByOne(){
        if (amount > start) {
            this.amount = amount - 1;
        }
        return "Значение счётчика = " + amount;
    }

    public String getAmount() {
        return "Текущее состояние счётчика = " + amount;
    }


}
