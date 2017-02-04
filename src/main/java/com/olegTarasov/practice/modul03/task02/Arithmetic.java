package com.olegTarasov.practice.modul03.task02;

import java.util.Scanner;

/**
 * Created by Олег on 30.01.2017.
 */
class Arithmetic {

    private Integer first = 0;
    private Integer second = 0;

    public Integer getFirst() {
        return first;
    }

    public void setFirst(Integer first) {
        this.first = first;
    }

    public Integer getSecond() {
        return second;
    }

    public void setSecond(Integer second) {
        this.second = second;
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

    public static void main(String[] args) {
        Arithmetic arithmetic = new Arithmetic();

        //System.out.println(arithmetic.add(a, b));
        //System.out.println(a + " " + b);

    }
}
