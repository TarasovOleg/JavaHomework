package com.olegTarasov.practice.modul03.task02;

import java.util.Scanner;

/**
 * Created by Олег on 30.01.2017.
 */
public class Arithmetic {
    public static void main(String[] args) {
        Arithmetic arithmetic = new Arithmetic();
        Integer a = 0;
        Integer b = 0;
        System.out.println(arithmetic.add(a, b));

    }

    public int add(Integer a, Integer b) {
        System.out.println("Enter two numbers: ");
        Scanner scan1 = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);
        a = scan1.nextInt();
        b = scan2.nextInt();
        Integer c = a + b;
        return c;
    }
}
