package com.olegTarasov.practice.modul08.task01;

import java.util.ArrayList;

/**
 * Created by Олег on 28.03.2017.
 */
public class IdGenerator {
    public static void main(String[] args) {
        ArrayList<Long> id = new ArrayList<Long>();
        for (int i = 0; i < 50; i++) {
            id.add(i, uniqueIdNumber(id));
        }
        System.out.println(id);
        // System.out.println(idNumber());
        //System.out.println(id.add(uniqueTest(id)));
        //System.out.println(id);

    }

    public static long uniqueIdNumber(ArrayList<Long> id) {
        long uniqueId = (long) Math.abs(Math.random() * 100);
        for (int i = 0; i < id.size(); i++) {
            if ((uniqueId - id.get(i)) == 0 || id.get(i) == null) {
                id.add(uniqueId);
            } else {
                System.out.println("Try Again");
            }
        }
        return uniqueId;
    }

    /*public static long idNumber() {
        long idNumber = (long) Math.abs(Math.random() * 100);
        return idNumber;
    }

    public static long uniqueTest(ArrayList<Long> id) {
        long uniqueId = idNumber();
        for (int i = 0; i < id.size(); i++) {
            if ((id.get(i) - uniqueId) == 0) {
                System.out.println("Try again!");
            } else {
                return uniqueId;
            }
        }
        return uniqueTest(id);
    }*/
}
