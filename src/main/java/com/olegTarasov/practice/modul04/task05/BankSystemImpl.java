package com.olegTarasov.practice.modul04.task05;

import com.olegTarasov.practice.modul04.task04.BankUser;

/**
 * Created by Олег on 24.02.2017.
 */
public class BankSystemImpl implements BankSystem {
    public void withdrawOfUser(BankUser user, int amount) {
        if (user.getBank().getLimitOfWithdrawal() > amount) {
            user.setBalance(user.getBalance() - amount - user.getBank().getCommission(amount));
        } else {
            System.out.println("Out of limits!!");
        }
    }

    public void fundUser(BankUser user, int amount) {
        if (user.getBank().getLimitOfFunding() > amount) {
            user.setBalance(user.getBalance() + amount);
        } else {
            System.out.println("Out of limits!!");
        }
    }

    public void transferMoney(BankUser fromUser, BankUser toUser, int amount) {
        if ((fromUser.getBank().getLimitOfWithdrawal() > amount) && (amount < toUser.getBank().getLimitOfFunding())) {
            fromUser.setBalance(fromUser.getBalance() - amount - fromUser.getBank().getCommission(amount));
            toUser.setBalance(toUser.getBalance() + amount);
        } else {
            System.out.println("Out of limits!!");
        }
    }

    public void paySalary(BankUser user) {
        user.setBalance(user.getBalance() + user.getSalary());
    }

}
