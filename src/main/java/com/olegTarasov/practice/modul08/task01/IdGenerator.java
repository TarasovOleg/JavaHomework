package com.olegTarasov.practice.modul08.task01;

import com.olegTarasov.practice.modul08.task02.Food;

import java.util.ArrayList;

/**
 * Created by Олег on 28.03.2017.
 */
public final class IdGenerator {

    public static long idNumber(String name, Country country, long expiration) {
        return (expiration + country.hashCode() + name.hashCode())/100;
    }

}
