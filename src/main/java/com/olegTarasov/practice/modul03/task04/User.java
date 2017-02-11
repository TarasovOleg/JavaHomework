package com.olegTarasov.practice.modul03.task04;

import java.util.Scanner;

/**
 * Created by Олег on 07.02.2017.
 */
public class User {
    private static String name = "Oleg";
    private static int balance = 0;
    private static int monthsOfEmloyment = 0;
    private static String companyName;
    private static int salary = 0;
    private static String currency = "$";


    public User() {
    }

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



    void paySalary(Scanner scanner) {
        User user = new User();
        System.out.println("Enter User's salary: ");
        int salary = scanner.nextInt();
        user.setSalary(salary);
        user.setBalance(getBalance() + getSalary());
        System.out.println("Users salary is " + user.getSalary());
    }

    void withdrawal(Scanner scanner) {
        User user = new User();
        System.out.println("Enter withdrawal: ");
        int withdraw = scanner.nextInt();
        int commission = 0;
        int result = 0;
        if (withdraw < 1000 && withdraw > 0) {
            commission = (withdraw / 100) * 5;
            result = user.getBalance() - commission - withdraw;
        } else if (withdraw > 1000) {
            commission = (withdraw / 100) * 10;
            result = user.getBalance() - commission - withdraw;
        }
        if (result <= 0) {
            System.out.println("Not enough money!");
        } else {
            user.setBalance(result);
            System.out.println("You have withdraw " + withdraw + user.getCurrency() + ". Commission is " + commission + user.getCurrency()+ ". Your current balance is " + balance + user.getCurrency());
        }

    }

    void companyNameLength(Scanner scanner) {
        User user = new User();
        System.out.println("Please enter name of the company you are working in: ");
        user.setCompanyName(scanner.next());
        int lengthOfName = 0;
        for (int i = 0; i < user.getCompanyName().toCharArray().length; i++) {
            lengthOfName++;
        }
        System.out.println(lengthOfName);
    }

    void monthIncreaser(Scanner scanner) {
        User user = new User();
        if (companyName != null) {
            System.out.println("How long are you working in the " + companyName + "?");
            int startOfWorking = user.getMonthsOfEmloyment();
            int workingTime = scanner.nextInt();
            user.setMonthsOfEmloyment(startOfWorking+workingTime);
            System.out.println(user.getMonthsOfEmloyment() + " month's");
        }
        else {
            user.companyNameLength(scanner);
            user.monthIncreaser(scanner);
        }
    }
}
