package com.olegTarasov.practice.modul03.task02;

/**
 * Created by Олег on 30.01.2017.
 */
public class Adder extends Arithmetic {
    public static void main(String[] args) {
        Arithmetic arithmetic = new Arithmetic();
        Adder adder = new Adder();
        Integer first = 0;
        Integer second = 0;
        System.out.println(arithmetic.add(first, second));
        System.out.println(first + " " + second);
        System.out.println(adder.check(first, second));

    }

    public boolean check(Integer a, Integer b) {
        if (a < b) {
            return false;
        }
        return true;
    }
}
