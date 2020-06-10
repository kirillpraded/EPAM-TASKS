package com.company;

public class Test1 {
    int a;
    int b;

    public Test1(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public Test1() {

    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int max(){
        if(a > b){ return  a;}
        return b;
    }

    public int getSum(){
        return a+b;
    }
}
