package com.olegTarasov.practice.modul02.task03;

import java.util.Scanner;

/**
 * Created by Олег on 29.01.2017.
 */
public class WithdrawalFromArrays {
    public static void main(String[] args) {
        WithdrawalFromArrays withdrawalFromArrays = new WithdrawalFromArrays();
        double[] balances = {0, 1200, 250, 2000, 500, 3200};
        String[] ownerNames = {" ", "Jane", "Ann", "Jack", "Oww", "Lane"};
        System.out.println("Please, enter your ID number(1-5)");
        Scanner scanId = new Scanner(System.in);
        int numId = scanId.nextInt();
        withdrawalFromArrays.selOwner(numId, balances, ownerNames);
    }

    public void selOwner(int a, double[] b, String[] c) {
        if ((a == 0) || (a >= 6)) {
            System.out.println("You entered wrong number");
        } else {
            String ownerName = c[a];
            double ownerBalance = b[a];
            System.out.println("ID #" + a + ". " + ownerName + ", your balance is: " + ownerBalance + ".\n" +
                    "Enter 1 for WITHDRAWAL, 2 for END.");
            Scanner yesOrNo = new Scanner(System.in);
            int check = yesOrNo.nextInt();

            if (check == 1) {
                System.out.println("Please, enter size of withdrawal");
                Scanner cash = new Scanner(System.in);
                double cashValue = cash.nextDouble();
                withdrawal(a, b, c, cashValue);
            } else if (check == 2) {
                System.out.println("Good bye!");
            }

        }
    }

    public void withdrawal(int a, double[] b, String[] c, double d) {
        double comission = (d / 100) * 5;
        double balance = b[a] - d - comission;
        if (balance <= 0) {
            System.out.println("Sorry, " + c[a] + ", ther is not enough money.");
        } else {
            b[a] = balance;
            System.out.println("OK, " + c[a] + " " + d + " " + b[a]);
        }
    }
}
