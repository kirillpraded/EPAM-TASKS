package com.company;

//используем BigInteger тк значение больше чем 9223372036854775807
import java.math.BigInteger;

//Задание 4, циклы
public class Main {

    public static BigInteger loopOver(){
        BigInteger result = BigInteger.ONE;
        
        for(int i = 1; i <= 200; i++){
            BigInteger bigInteger=BigInteger.valueOf(i);
            result = result.multiply(bigInteger).multiply(bigInteger);
        }

        return result;

    }

    public static void main(String[] args) {
        System.out.println("Программа находит произведение квадратов первых двухсот чисел : "+
                loopOver());
    }
}
