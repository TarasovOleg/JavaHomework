package com.olegTarasov.practice.modul04.task05;

import com.olegTarasov.practice.modul04.task04.BankUser;

/**
 * Created by Олег on 12.02.2017.
 */
public interface BankSystem {
    void withdrawOfUser(BankUser user, int amount);
    void fundUser(BankUser user, int amount);
    void transferMoney(BankUser fromUser, BankUser toUser, int amount);
    void paySalary(BankUser user);
}
