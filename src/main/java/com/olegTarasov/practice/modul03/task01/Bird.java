package com.olegTarasov.practice.modul03.task01;

/**
 * Created by Олег on 30.01.2017.
 */
public class Bird {


    public static void main(String[] args) {
        Bird bird = new Bird();
        String song = "Kukareku";
        bird.Sing(song);

    }

    public void Sing(String sing) {
        String song = String.format(" I am walking%n I am flying%n I am singing%n I am Bird!");
        System.out.println(song);
    }

}
