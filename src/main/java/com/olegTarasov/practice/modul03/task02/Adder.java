package com.olegTarasov.practice.modul03.task02;

import java.util.Scanner;

/**
 * Created by Олег on 30.01.2017.
 */
public class Adder extends Arithmetic {
    public static void main(String[] args) {
        Arithmetic arithmetic = new Arithmetic();
        Adder adder = new Adder();
        Scanner scanner = new Scanner(System.in);
        Integer first = scanner.nextInt();
        Integer second = scanner.nextInt();
        System.out.println(arithmetic.add(first, second));
        System.out.println(adder.check(first, second));

    }

    public boolean check(Integer a, Integer b) {

        return a < b;
    }
}
