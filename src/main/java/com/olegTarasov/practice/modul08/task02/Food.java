package com.olegTarasov.practice.modul08.task02;

import com.olegTarasov.practice.modul08.task01.Country;
import com.olegTarasov.practice.modul08.task01.IdGenerator;

/**
 * Created by Олег on 01.04.2017.
 */
public class Food {
    private long id;
    private String name;
    private Country country;
    private long expiration;

    public Food(String name, Country country, long expiration) {
        this.id = IdGenerator.idNumber(name, country, expiration);
        this.name = name;
        this.country = country;
        this.expiration = expiration;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public long getExpiration() {
        return expiration;
    }

    public void setExpiration(long expiration) {
        this.expiration = expiration;
    }

    public long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Food{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", country=" + country +
                ", expiration=" + expiration +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Food food = (Food) o;

        if (expiration != food.expiration) return false;
        if (name != null ? !name.equals(food.name) : food.name != null) return false;
        return country == food.country;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (country != null ? country.hashCode() : 0);
        result = 31 * result + (int) (expiration ^ (expiration >>> 32));
        return result;
    }
}
