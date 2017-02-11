package com.olegTarasov.practice.modul03.task03;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Олег on 11.02.2017.
 */
public class Solution {
    public static void main(String[] args) {
        Date startingDate = new Date();
        Course first = new Course(startingDate, "JavaCore");
        Course second = new Course("JavaSE", 240, "Vladimir");
        Course third = new Course("JavaME", 220, "Nikolay");
        Course fourth = new Course("JavaEE", 200, "Julia");
        Course fifth = new Course("JavaFX", 170, "Ashot");
        Course [] coursesTaken = {first,second,third,fourth,fifth};
        Student valeriy = new Student("Valera","Ivanchuk",4);
        Student arkadiy = new Student("Petrenko",coursesTaken);
        Student petr = new CollegeStudent("Petro","Borshch",7);
        Student evgeniy = new CollegeStudent("Lobanovskiy", coursesTaken);
        Student oleg = new CollegeStudent("Oleg", "Tarasov",4, coursesTaken,29,"Oxford",57, 7589673796L);
        Student igor = new SpecialStudent("Tkachuk", coursesTaken);
        Student olexandr = new SpecialStudent("Olexandr", "Chechuk", 5);
        Student maxim = new SpecialStudent("Maxim", "Skiba",1,coursesTaken,52,"GoIT",33,87436873456L,6542354L);
    }
}
