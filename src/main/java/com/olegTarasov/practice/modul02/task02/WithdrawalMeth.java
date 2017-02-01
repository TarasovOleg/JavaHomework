package com.olegTarasov.practice.modul02.task02;

import java.util.Scanner;

/**
 * Created by Олег on 29.01.2017.
 */
public class WithdrawalMeth {
    public static void main(String[] args) {
        WithdrawalMeth withdrawalMethod = new WithdrawalMeth();
        double balance = 7000;
        String mainMassage = String.format("Your current balance is %.2f. Enter size of withdrawal:", balance);
        System.out.println(mainMassage);
        Scanner scan = new Scanner(System.in);
        double output = scan.nextDouble();
        withdrawalMethod.withdrawalWithCommission(balance, output);

    }

    public void withdrawalWithCommission(double a, double b) {
        double commission = (b / 100) * 5;
        double resultOfCalculation = a - b - commission;
        if (resultOfCalculation < 0) {
            String warning = String.format("Not enough money!");
            System.out.println(warning);
        }
        if (resultOfCalculation >= 0) {
            String finalMessage = String.format("OK! Withdrawal: %.2f; comission: %.2f Your current balance is %.2f$", b, commission, resultOfCalculation);
            System.out.printf(finalMessage);
        }
    }
}
