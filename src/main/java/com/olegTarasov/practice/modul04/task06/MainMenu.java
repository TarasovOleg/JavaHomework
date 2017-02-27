package com.olegTarasov.practice.modul04.task06;

import com.olegTarasov.practice.modul03.task04.User;
import com.olegTarasov.practice.modul04.task01.Bank;
import com.olegTarasov.practice.modul04.task02.Currency;
import com.olegTarasov.practice.modul04.task03.ChinaBank;
import com.olegTarasov.practice.modul04.task03.EUBank;
import com.olegTarasov.practice.modul04.task03.USBank;
import com.olegTarasov.practice.modul04.task04.BankUser;
import com.olegTarasov.practice.modul04.task05.BankSystemImpl;

/**
 * Created by Олег on 24.02.2017.
 */
public class MainMenu {
    public static void main(String[] args) {
        BankSystemImpl bankSystem = new BankSystemImpl();
        Bank bankEU = new EUBank(87245, "Germany", Currency.EUR, 688, 4800, 12, 76565876);
        Bank bankUS = new USBank(43561, "USA", Currency.USD, 557, 6000, 8, 85326532);
        Bank bankAsia = new ChinaBank(32456, "CPR", Currency.USD, 120, 2000, 35, 76765765423L);
        BankUser bankEUUser01 = new BankUser(00001, "Oleg", 50000, 12, "Company01", 5000, bankEU);
        BankUser bankEUUser02 = new BankUser(00002, "Ivan", 60000, 23, "Company02", 3000, bankEU);
        BankUser bankUSUser01 = new BankUser(00001, "Andrey", 40000, 22, "Company03", 3200, bankUS);
        BankUser bankUSUser02 = new BankUser(00002, "Igor", 320000, 40, "Company04", 4700, bankUS);
        BankUser bankChinaUser01 = new BankUser(000001, "Ahmed", 40000, 38, "Company05", 1200, bankAsia);
        BankUser bankChinaUser02 = new BankUser(000002, "Huan", 2000, 10, "Company06", 800, bankAsia);

        System.out.println(bankUSUser01.getBalance());
        System.out.println(bankChinaUser01.getBalance());
        bankSystem.transferMoney(bankUSUser01,bankChinaUser01,800);
        System.out.println(bankUSUser01.getBalance());
        System.out.println(bankChinaUser01.getBalance());

    }
}
