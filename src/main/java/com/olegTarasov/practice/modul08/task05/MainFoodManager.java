package com.olegTarasov.practice.modul08.task05;

import com.olegTarasov.practice.modul08.task01.Country;
import com.olegTarasov.practice.modul08.task02.Food;
import com.olegTarasov.practice.modul08.task04.ManageSystem;

/**
 * Created by Олег on 11.04.2017.
 */
public class MainFoodManager {
    public static void main(String[] args) {
        ManageSystem system = new ManageSystem();
        Food apple01 = new Food("Granny Smith", Country.GREESE, 2017);
        Food apple02 = new Food("Granny Smith", Country.CHINA, 2017);
        Food apple03 = new Food("Red", Country.GREESE, 2017);
        Food apple04 = new Food("Red", Country.CHINA, 2017);
        Food apple05 = new Food("Red", Country.HOLLAND, 2017);
        Food apple06 = new Food("Golden", Country.HOLLAND, 2017);
        Food apple07 = new Food("Golden", Country.POLAND, 2017);
        Food apple08 = new Food("Antonovka", Country.UKRAINE, 2017);
        Food apple09 = new Food("Antonovka", Country.POLAND, 2017);
        system.save(apple01);
        system.save(apple02);
        system.save(apple03);
        system.save(apple04);
        system.save(apple05);
        system.save(apple06, 70);
        system.save(apple07, 80);
        system.save(apple08,90);
        system.save(apple09);
        system.delete(apple01);
        //system.deleteById(21601850);
        System.out.println(system.get(21601850).toString());
        System.out.println(system.getPrice(apple07).toString());
        //System.out.println(system.getPrices().toString());
        System.out.println(system.toString());
    }
}
