package com.olegTarasov.practice.modul03.task02;

import java.util.Scanner;

/**
 * Created by Олег on 30.01.2017.
 */
class Arithmetic {

    private static Integer first = 0;
    private static Integer second = 0;

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

    public int add(Integer alfa, Integer beta) {
        Arithmetic arithmetic = new Arithmetic();
        System.out.println("Enter two numbers: ");
        Scanner scan1 = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);
        alfa = scan1.nextInt();
        arithmetic.setFirst(alfa);
        beta = scan2.nextInt();
        arithmetic.setSecond(beta);

        int c = alfa + beta;
        return c;
    }

    public static void main(String[] args) {
        Arithmetic arithmetic = new Arithmetic();
        System.out.println(arithmetic.add(first, second));
        System.out.println(first + " " + second);

    }
}
