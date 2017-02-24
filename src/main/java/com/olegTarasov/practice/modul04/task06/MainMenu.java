package com.olegTarasov.practice.modul04.task06;

import com.olegTarasov.practice.modul03.task04.User;
import com.olegTarasov.practice.modul04.task01.Bank;
import com.olegTarasov.practice.modul04.task02.Currency;
import com.olegTarasov.practice.modul04.task03.ChinaBank;
import com.olegTarasov.practice.modul04.task03.EUBank;
import com.olegTarasov.practice.modul04.task03.USBank;

/**
 * Created by Олег on 24.02.2017.
 */
public class MainMenu {
    public static void main(String[] args) {
        Bank bankEU = new EUBank(87245, "Germany", Currency.EUR, 688, 4800, 12, 76565876);
        Bank bankUS = new USBank(43561, "USA", Currency.USD, 557, 6000, 8, 85326532);
        Bank bankAsia = new ChinaBank(32456, "CPR", Currency.USD, 120, 2000, 35, 76765765423L);
        User userEU_1 = new User("Oleg",50000, 12, "Company01",5000,"EUR");
        User userEU_2 = new User("Ivan", 60000, 23, "Company02", 3000, "USD");
        User userUS_1 = new User("Andrey", 40000, 22, "Company03", 3200, "USD");
        User userUS_2 = new User("Igor", 320000, 40, "Company04", 4700, "USD");
        User userCH_1 = new User("Ahmed", 40000, 38, "Company05", 1200, "USD");
        User userCH_2 = new User("Huan", 2000, 10,"Company06", 800, "USD");
    }
}
