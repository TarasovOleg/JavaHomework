package com.olegTarasov.practice.modul04.task03;

import com.olegTarasov.practice.modul04.task01.Bank;
import com.olegTarasov.practice.modul04.task02.Currency;

/**
 * Created by Олег on 23.02.2017.
 */
public class EUBank extends Bank {
    protected final int FIRSTLIMITOFWITHDRAWAL = 2000;
    protected final int SECONDLIMITOFWITHDRAWAL = 2200;
    protected final int FIRSTLIMITOFFUND = 20000;
    protected final int SECONDLIMITOFFUND = 10000;
    protected final int FIRSTMONTHLYRATE = 1;
    protected final int SECONDMOTHLYRATE = 0;
    protected final int FIRSTCOMISSION = 5;
    protected final int SECONDCOMISSION = 7;
    protected final int THIRDCOMISSION = 2;
    protected final int FOURTHCOMISSION = 4;

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
