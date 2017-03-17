package com.olegTarasov.practice.modul06.task03;

import com.olegTarasov.practice.modul06.task02.User;

/**
 * Created by Олег on 07.03.2017.
 */
public class UserUtils {
    public static User[] uniqueUsers(User[] users) {
        User testUser = new User(User.getId(), User.getFirstName(),User.getLastName(),User.getSalary(),User.getBalance());
        int counter = 1;
        for (int i = 0; i < users.length-1; i++) {
            if (testUser.equals(new User(User.getId(),User.getFirstName(), User.getLastName(), User.getSalary(), User.getBalance()))){
                counter++;
            }
        }
        User[] arrayOfUniqueUsers = new User[counter];
        int j = 0;
        for (int i = 0; i < users.length - 1; i++) {
            if (testUser.equals(new User(User.getId(),User.getFirstName(), User.getLastName(), User.getSalary(), User.getBalance()))) {
                arrayOfUniqueUsers[j++] = users[i];
            }
        }
        return arrayOfUniqueUsers;
    }

    public static User[] usersWithContitionalBalance(User[] users, int balance) {
        return new User[0];
    }

    public static User[] paySalaryToUsers(User[] users) {
        return new User[0];
    }

    public static long[] getUsersId(User[] users) {
        long[] idArray = new long[users.length];
        for (int i = 0; i < users.length - 1; i++) {
            //if ()

        }
        return new long[0];
    }

    public static User[] deleteEmptyUsers(User[] users) {
        return new User[0];
    }
}
