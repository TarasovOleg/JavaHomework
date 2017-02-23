package com.olegTarasov.practice.modul04.task03;

import com.olegTarasov.practice.modul04.task01.Bank;
import com.olegTarasov.practice.modul04.task02.Currency;

/**
 * Created by Олег on 23.02.2017.
 */
public class ChinaBank extends Bank{
    public ChinaBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    public int getLimitOfWithdrawal() {
        return 0;
    }

    public int getLimitOfFunding() {
        return 0;
    }

    public int getMonthlyRate() {
        return 0;
    }

    public int getCommission(int summ) {
        return 0;
    }

    public double moneyPaidMonthlyForSalary() {
        return 0;
    }
}
