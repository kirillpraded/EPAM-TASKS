package com.company.port;

import java.util.Random;

public class Ship {
    Random random = new Random();
    public int capacity;
    public boolean bool = false;
    int pier;

    public int getPier() {
        return pier;
    }

    public void setPier(int pier) {
        this.pier = pier;
    }

    public Ship() {
        this.bool = random.nextBoolean();
        if (this.bool) {
            capacity = 5;
        } else {
            capacity = 0;
        }
    }
}
