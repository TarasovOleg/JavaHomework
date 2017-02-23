package com.olegTarasov.practice.modul03.task04;

import java.util.Scanner;

/**
 * Created by Олег on 07.02.2017.
 */
public class User {
    private String name;
    private int balance;
    private int monthsOfEmloyment;
    private String companyName;
    private int salary;
    private String currency;
    private static final int BELOWTHOUSAND = 5;
    private static final int OWERTHOUSAND = 10;


    public User(String name, int balance, int monthsOfEmloyment, String companyName, int salary, String currency) {
        this.name = name;
        this.balance = balance;
        this.monthsOfEmloyment = monthsOfEmloyment;
        this.companyName = companyName;
        this.salary = salary;
        this.currency = currency;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getMonthsOfEmloyment() {
        return monthsOfEmloyment;
    }

    public void setMonthsOfEmloyment(int monthsOfEmloyment) {
        this.monthsOfEmloyment = monthsOfEmloyment;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }


    void paySalary() {
        this.balance += salary;
        System.out.println("Users salary is " + this.salary);
    }

    void withdrawal(int summ) {
        int commission = 0;
        int result = 0;
        if (summ < 1000 && summ > 0) {
            commission = (summ / 100) * BELOWTHOUSAND;
            result = balance - commission - summ;
        } else if (summ > 1000) {
            commission = (summ / 100) * OWERTHOUSAND;
            result = balance - commission - summ;
        }
        if (result <= 0) {
            System.out.println("Not enough money!");
        } else {
            balance = result;
            System.out.println("You have withdraw " + summ + currency + ". Commission is " + commission + currency + ". Your current balance is " + balance + currency);
        }

    }

    void companyNameLength() {
        System.out.println("Name of the company you are working in contains " + companyName.length() + " chars");
    }

    void monthIncreaser(int addMonth) {
        monthsOfEmloyment += addMonth;
        System.out.println("You are working in the " + companyName + " " + monthsOfEmloyment + " month's");

    }
}
