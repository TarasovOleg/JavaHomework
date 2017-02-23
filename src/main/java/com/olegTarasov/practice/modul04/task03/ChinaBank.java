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

/*
    ChinaBank: лимит снятия = 100, если валюта - USD и 150, если EUR
    лимит пополнения - 5000, если EUR и 10000, если USD
    месячная ставка - 1% на USD и 0% на EUR
    комиссия 3%, если USD и до 1000, 5%, если USD и больше 1000
            10%, если EUR и до 1000 и 11%, если EUR и больше 1000*/

    public int getLimitOfWithdrawal() {
        int limitOfWithdrawal;
        if (getCurrency() == Currency.USD) {
            limitOfWithdrawal = 100;
        } else {
            limitOfWithdrawal = 150;
        }
        return limitOfWithdrawal;
    }

    public int getLimitOfFunding() {
        int limitOfFunding;
        if (getCurrency() == Currency.EUR) {
            limitOfFunding = 5000;
        } else {
            limitOfFunding = 10000;
        }
        return limitOfFunding;
    }

    public int getMonthlyRate() {
        int monthlyRate = 0;
        switch (getCurrency()) {
            case EUR:
                monthlyRate = 0;
            case USD:
                monthlyRate = 1;
        }
        return monthlyRate;
    }

    public int getCommission(int summ) {
        int commision;
        if ((getCurrency() == Currency.USD) && (summ <= 1000)) {
            commision = 3;
        } else if ((getCurrency() == Currency.USD) && (summ > 1000)) {
            commision = 5;
        } else if ((getCurrency() == Currency.EUR) && (summ <= 1000)) {
            commision = 10;
        } else {
            commision = 11;
        }
        return commision;
    }

    public double moneyPaidMonthlyForSalary() {
        return getNumberOfEmployees()*getAvrSalaryOfEmployee();
    }
}
