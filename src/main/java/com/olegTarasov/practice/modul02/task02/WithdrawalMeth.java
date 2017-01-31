package com.olegTarasov.practice.modul02.task02;

import java.util.Scanner;

/**
 * Created by Олег on 29.01.2017.
 */
public class WithdrawalMeth {
    public static void main(String[] args) {
        WithdrawalMeth withdrawalMethod = new WithdrawalMeth();
        double balance = 7000;
        System.out.println("Your current balance is " + balance + "$. \nEnter size of withdrawal:");
        Scanner scan = new Scanner(System.in);
        double output = scan.nextDouble();
        withdrawalMethod.withdrawalWithCommission(balance, output);

    }

    public void withdrawalWithCommission(double a, double b) {
        double commission = (b / 100) * 5;
        double resultOfCalculation = a - b - commission;
        if (a < 0) {
            System.out.println("Not enough money!");
        }
        if (a >= 0) {
            System.out.println("OK! Withdrawal: " + b + "; comission: " + commission + " Your current balance is " + resultOfCalculation + "$");
        }
    }
}
