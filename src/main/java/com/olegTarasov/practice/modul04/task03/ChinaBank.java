package com.olegTarasov.practice.modul04.task03;

import com.olegTarasov.practice.modul04.task01.Bank;
import com.olegTarasov.practice.modul04.task02.Currency;

/**
 * Created by Олег on 23.02.2017.
 */
public class ChinaBank extends Bank {
    protected final int FIRSTLIMITOFWITHDRAWAL = 100;
    protected final int SECONDLIMITOFWITHDRAWAL = 150;
    protected final int FIRSTLIMITOFFUND = 5000;
    protected final int SECONDLIMITOFFUND = 10000;
    protected final int FIRSTMONTHLYRATE = 0;
    protected final int SECONDMOTHLYRATE = 1;
    protected final int FIRSTCOMISSION = 3;
    protected final int SECONDCOMISSION = 5;
    protected final int THIRDCOMISSION = 10;
    protected final int FOURTHCOMISSION = 11;

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
            limitOfWithdrawal = FIRSTLIMITOFWITHDRAWAL;
        } else {
            limitOfWithdrawal = SECONDLIMITOFWITHDRAWAL;
        }
        return limitOfWithdrawal;
    }

    public int getLimitOfFunding() {
        int limitOfFunding;
        if (getCurrency() == Currency.EUR) {
            limitOfFunding = FIRSTLIMITOFFUND;
        } else {
            limitOfFunding = SECONDLIMITOFFUND;
        }
        return limitOfFunding;
    }

    public int getMonthlyRate() {
        int monthlyRate = 0;
        switch (getCurrency()) {
            case EUR:
                monthlyRate = FIRSTMONTHLYRATE;
            case USD:
                monthlyRate = SECONDMOTHLYRATE;
        }
        return monthlyRate;
    }

    public int getCommission(int summ) {
        int commision;
        if ((getCurrency() == Currency.USD) && (summ <= 1000)) {
            commision = FIRSTCOMISSION;
        } else if ((getCurrency() == Currency.USD) && (summ > 1000)) {
            commision = SECONDCOMISSION;
        } else if ((getCurrency() == Currency.EUR) && (summ <= 1000)) {
            commision = THIRDCOMISSION;
        } else {
            commision = FOURTHCOMISSION;
        }
        return commision;
    }

    public double moneyPaidMonthlyForSalary() {
        return getNumberOfEmployees() * getAvrSalaryOfEmployee();
    }
}
