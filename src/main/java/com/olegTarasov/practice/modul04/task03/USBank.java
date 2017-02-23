package com.olegTarasov.practice.modul04.task03;

import com.olegTarasov.practice.modul04.task01.Bank;
import com.olegTarasov.practice.modul04.task02.Currency;

/**
 * Created by Олег on 23.02.2017.
 */
public class USBank extends Bank {
    public USBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

/*
    USBank: лимит снятия = 1000, если валюта - USD и 1200, если валюта - EUR
    лимит пополнения - 10000, если EUR, и нет лимита, если USD
    месячная ставка - 1% на USD и 2% на EUR
    комиссия 5%, если USD и до 1000, 7%, если USD и больше 1000
            6%, если EUR и до 1000 и 8%, если EUR и больше 1000*/

    public int getLimitOfWithdrawal() {
        int limitOfWithdrawal;
        if (getCurrency() == Currency.USD) {
            limitOfWithdrawal = 1000;
        } else {
            limitOfWithdrawal = 1200;
        }
        return limitOfWithdrawal;
    }

    public int getLimitOfFunding() {
        int limitOfFunding;
        if (getCurrency() == Currency.EUR) {
            limitOfFunding = 10000;
        } else {
            limitOfFunding = Integer.MAX_VALUE;
        }
        return limitOfFunding;
    }

    public int getMonthlyRate() {
        int monthlyRate = 0;
        switch (getCurrency()) {
            case EUR:
                monthlyRate = 2;
            case USD:
                monthlyRate = 1;
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
            commision = 6;
        } else {
            commision = 8;
        }
        return commision;
    }

    public double moneyPaidMonthlyForSalary() {
        return getNumberOfEmployees()*getAvrSalaryOfEmployee();
    }


}
