package com.olegTarasov.practice.modul02.task04;


import com.olegTarasov.practice.modul02.task03.WithdrawalFromArrays;

import java.util.Scanner;

/**
 * Created by Олег on 29.01.2017.
 */
public class FundTheBalance extends WithdrawalFromArrays {
    public static void main(String[] args) {
        FundTheBalance fundTheBalance = new FundTheBalance();
        double[] balances = {0, 1200, 250, 2000, 500, 3200};
        String[] ownerNames = {" ", "Jane", "Ann", "Jack", "Oww", "Lane"};
        System.out.println("Please, enter your ID number(1-5)");
        Scanner scanId = new Scanner(System.in);
        int numId = scanId.nextInt();
        fundTheBalance.selOwner(numId, balances, ownerNames);
    }


    public void selOwner(int numId, double[] balances, String[] ownerNames) {
        WithdrawalFromArrays withdrawalFromArrays = new WithdrawalFromArrays();
        if ((numId == 0) || (numId >= 6)) {
            System.out.println("You entered wrong ID number");
        } else {
            String ownerName = ownerNames[numId];
            double ownerBalance = balances[numId];
            System.out.println("ID #" + numId + ". " + ownerName + ", your balance is: " + ownerBalance + ".\n" +
                    "Enter 1 for WITHDRAWAL, 2 for FUND or 3 for END.");
            Scanner yesOrNo = new Scanner(System.in);
            int check = yesOrNo.nextInt();
            switch (check) {
                case 1:
                    System.out.println("Please, enter size of withdrawal");
                    Scanner cashWthd = new Scanner(System.in);
                    double wthdValue = cashWthd.nextDouble();
                    withdrawalFromArrays.withdrawal(numId, balances, ownerNames, wthdValue);
                    break;
                case 2:
                    System.out.println("Please, enter size of fund");
                    Scanner cashFnd = new Scanner(System.in);
                    double fndValue = cashFnd.nextDouble();
                    fund(numId, balances, ownerNames, fndValue);
                    break;
                case 3:
                    System.out.println("Good bye!");
                    break;
                default:
                    System.out.println("Wrong command");
            }
        }
    }

    public void fund(int numId, double[] balances, String[] ownerNames, double sizeOfFund) {
        balances[numId] = balances[numId] + sizeOfFund;
        System.out.println(ownerNames[numId] + ". You funding " + sizeOfFund + "$. Now your balance is: " + balances[numId]);
    }
}
