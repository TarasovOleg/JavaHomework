package com.olegTarasov.practice.modul03.task04;

import java.util.Scanner;

/**
 * Created by Олег on 11.02.2017.
 */
public class UserMain {
    public static void main(String[] args) {
        User user = new User();
        Scanner scanner = new Scanner(System.in);
        user.paySalary(scanner);
        user.withdrawal(scanner);
        user.companyNameLength(scanner);
        user.monthIncreaser(scanner);
    }
}
