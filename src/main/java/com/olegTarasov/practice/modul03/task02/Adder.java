package com.olegTarasov.practice.modul03.task02;

/**
 * Created by Олег on 30.01.2017.
 */
public class Adder extends Arithmetic {
    public static void main(String[] args) {
        Arithmetic arithmetic = new Arithmetic();
        Adder adder = new Adder();
        Integer first = arithmetic.getFirst();
        Integer second = arithmetic.getSecond();
        System.out.println(arithmetic.add(first, second));
        System.out.println(arithmetic.getFirst() + " " + arithmetic.getSecond());
        System.out.println(adder.check(first, second));

    }

    public boolean check(Integer a, Integer b) {
        Arithmetic arithmetic = new Arithmetic();
        if (arithmetic.getFirst() < arithmetic.getSecond()) {
            return false;
        }
        return true;
    }
}
