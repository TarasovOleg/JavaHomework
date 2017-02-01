package com.olegTarasov.practice.modul03.task01;

/**
 * Created by Олег on 30.01.2017.
 */
public class Bird {
    public static void main(String[] args) {
        Bird bird = new Bird();
        String sing = "Kukareku";
        bird.Sing(sing);

    }

    public void Sing(String sing) {
        String s = " I am walking\n" +
                " I am flying\n" +
                " I am singing\n" +
                " I am Bird";
        System.out.println(s);
    }

}
