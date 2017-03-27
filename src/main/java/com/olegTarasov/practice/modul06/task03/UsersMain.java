package com.olegTarasov.practice.modul06.task03;

import com.olegTarasov.practice.modul06.task02.User;

import java.util.Arrays;

/**
 * Created by Олег on 07.03.2017.
 */
public class UsersMain {
    public static void main(String[] args) {
        User [] usersArray = new User[6];
        UserUtils userUtils = new UserUtils();
        usersArray[0] = new User(1111, "First", "One", 1000, 5000);
        usersArray[1] = new User(2222, "Second", "Two", 1100, 5500);
        usersArray[2] = new User(3333, "Third", "Three", 1200, 6000);
        //usersArray[3] = new User(4444, "Fourth", "Four", 1300, 6500);
        usersArray[4] = new User(3333, "Third", "Three", 1200, 6000);
        usersArray[5] = new User(1111, "First", "One", 1000, 5000);
        //System.out.println(Arrays.toString(UserUtils.uniqueUsers(usersArray)));
        //System.out.println(Arrays.toString(UserUtils.getUsersId(usersArray)));
        System.out.println(Arrays.toString(UserUtils.usersWithContitionalBalance(usersArray, 5500)));
        System.out.println(Arrays.toString(usersArray));
        System.out.println(Arrays.toString(UserUtils.deleteEmptyUsers(usersArray)));
        System.out.println(Arrays.toString(usersArray));
    }
}
