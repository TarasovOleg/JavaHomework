package com.olegTarasov.practice.modul03.task01;

/**
 * Created by Олег on 30.01.2017.
 */
public class Bird {

    public static final String SONG = String.format(" I am walking%n I am flying%n I am singing%n I am Bird!");



    public static void main(String[] args) {
        Bird bird = new Bird();
        String song = "Kukareku";
        bird.Sing(song);

    }

    public void Sing(String song) {
        System.out.println(SONG);
    }

}
