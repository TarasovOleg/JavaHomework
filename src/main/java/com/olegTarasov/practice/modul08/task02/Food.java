package com.olegTarasov.practice.modul08.task02;

import com.olegTarasov.practice.modul08.task01.Country;

/**
 * Created by Олег on 01.04.2017.
 */
public class Food {
    private long id;
    private String name;
    private Country country;
    private long expiration;

    public Food(long id, String name, Country country, long expiration) {
        this.id = id;
        this.name = name;
        this.country = country;
        this.expiration = expiration;
    }
}
