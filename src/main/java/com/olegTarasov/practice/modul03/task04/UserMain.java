package com.olegTarasov.practice.modul03.task04;

import java.util.Scanner;

/**
 * Created by Олег on 11.02.2017.
 */
public class UserMain {
    public static void main(String[] args) {
        User user = new User("Ivan", 5000, 3, "Dira", 2200, "GRN");
        Scanner scanner = new Scanner(System.in);
        user.paySalary();
        System.out.print("Enter withdrawal: ");
        int summ = scanner.nextInt();
        user.withdrawal(summ);
        user.companyNameLength();
        System.out.print("How long are you working here? ");
        int addMonth = scanner.nextInt();
        user.monthIncreaser(addMonth);
    }
}
