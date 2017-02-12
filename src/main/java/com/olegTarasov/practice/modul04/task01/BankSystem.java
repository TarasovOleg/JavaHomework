package com.olegTarasov.practice.modul04.task01;

/**
 * Created by Олег on 12.02.2017.
 */
public interface BankSystem {
    void withdrawOfUser(User user, int amount);
    void fundUser(User user, int amount);
    void transferMoney(User fromUser, User toUser, int amount);
    void paySalary(User user);
}
