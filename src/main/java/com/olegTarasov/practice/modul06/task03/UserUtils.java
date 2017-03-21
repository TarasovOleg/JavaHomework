package com.olegTarasov.practice.modul06.task03;

import com.olegTarasov.practice.modul06.task02.User;

/**
 * Created by Олег on 07.03.2017.
 */
public class UserUtils {
    public static User[] uniqueUsers(User[] users) {
        User testUser = new User(User.getId(), User.getFirstName(), User.getLastName(), User.getSalary(), User.getBalance());
        int counter = 1;
        for (int i = 0; i < users.length - 1; i++) {
            if (testUser.equals(new User(users[i].getId(), users[i].getFirstName(), users[i].getLastName(), users[i].getSalary(), users[i].getBalance()))) {
                counter++;
            }
        }
        User[] arrayOfUniqueUsers = new User[counter];
        int j = 0;
        for (int i = 0; i < users.length - 1; i++) {
            if (testUser.equals(new User(users[i].getId(), users[i].getFirstName(), users[i].getLastName(), users[i].getSalary(), users[i].getBalance()))) {
                arrayOfUniqueUsers[j++] = users[i];
            }
        }
        return arrayOfUniqueUsers;
    }

    public static User[] usersWithContitionalBalance(User[] users, int balance) {
        int counter = 0;
        for (int i = 0; i < users.length; i++) {
            if (users[i].getBalance() == balance) {
                counter++;
            }
        }
        User[] conditionalUsers = new User[counter];
        int j = 0;
        for (int i = 0; i < users.length; i++) {
            if (users[i].getBalance() == balance) {
                conditionalUsers[j++] = users[i];
            }
        }
        return conditionalUsers;
    }

    public static User[] paySalaryToUsers(User[] users) {
        return new User[0];
    }

    public static long[] getUsersId(User[] users) {
        int counter = 0;
        for (int i = 0; i < users.length ; i++) {
            if (users[i].getId() < 0){
                counter++;
            }
        }
        long[] idArray = new long[counter];
        int j = 0;
        for (int i = 0; i < users.length; i++) {
            if (users[i].getId() < 0) {
                idArray[j++] = users[i].getId();
            }
        }
        return idArray;
    }

    public static User[] deleteEmptyUsers(User[] users) {
        int counter = 0;
        for (int i = 0; i < users.length; i++) {
            if (users[i] != null) {
                counter++;
            }
        }
        User[] notEmptyUsers = new User[counter];
        int j = 0;
        for (int i = 0; i < users.length; i++) {
            if (users[i] != null) {
                notEmptyUsers[j++] = users[i];
            }
        }
        return notEmptyUsers;
    }
}
