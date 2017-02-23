package com.olegTarasov.practice.modul04.task03;

import com.olegTarasov.practice.modul04.task01.Bank;
import com.olegTarasov.practice.modul04.task02.Currency;

/**
 * Created by Олег on 23.02.2017.
 */
public class EUBank extends Bank {
    public EUBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }


    /*EUBank: лимит снятия = 2000, если валюта - USD и 2200, если EUR
    лимит пополнения - 20000, если EUR и 10000, если USD
    месячная ставка - 0% на USD и 1% на EUR
    комиссия 5%, если USD и до 1000, 7%, если USD и больше 1000
            2%, если EUR и до 1000 и 4%, если EUR и больше 1000*/

    public int getLimitOfWithdrawal() {
        int limitOfWithdrawal;
        if (getCurrency() == Currency.USD) {
            limitOfWithdrawal = 2000;
        } else {
            limitOfWithdrawal = 2200;
        }
        return limitOfWithdrawal;
    }

    public int getLimitOfFunding() {
        int limitOfFunding;
        if (getCurrency() == Currency.EUR) {
            limitOfFunding = 20000;
        } else {
            limitOfFunding = 10000;
        }
        return limitOfFunding;
    }

    public int getMonthlyRate() {
        int monthlyRate = 0;
        switch (getCurrency()) {
            case EUR:
                monthlyRate = 1;
            case USD:
                monthlyRate = 0;
        }
        return monthlyRate;
    }

    public int getCommission(int summ) {
        int commision;
        if ((getCurrency() == Currency.USD) && (summ <= 1000)) {
            commision = 5;
        } else if ((getCurrency() == Currency.USD) && (summ > 1000)) {
            commision = 7;
        } else if ((getCurrency() == Currency.EUR) && (summ <= 1000)) {
            commision = 2;
        } else {
            commision = 4;
        }
        return commision;
    }

    public double moneyPaidMonthlyForSalary() {
        return getNumberOfEmployees()*getAvrSalaryOfEmployee();
    }
}
