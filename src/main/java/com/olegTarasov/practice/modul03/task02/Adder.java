package com.olegTarasov.practice.modul03.task02;

/**
 * Created by Олег on 30.01.2017.
 */
public class Adder extends Arithmetic {
    public static void main(String[] args) {
        Arithmetic arithmetic = new Arithmetic();
        Adder adder = new Adder();
        Integer a = 0;
        Integer b = 0;
        System.out.println(arithmetic.add(a, b));
        System.out.println(a + " " + b);
        System.out.println(adder.check(a, b));

    }

    public boolean check(Integer a, Integer b) {
        if (a >= b) {
            return true;
        }
        return false;
    }
}
