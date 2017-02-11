package com.olegTarasov.practice.modul03.task03;

/**
 * Created by Олег on 06.02.2017.
 */
public class SpecialStudent extends CollegeStudent {

    long secretKey;
    String email;

    public long getSecretKey() {
        return secretKey;
    }

    public void setSecretKey(long secretKey) {
        this.secretKey = secretKey;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public SpecialStudent(String secondName, Course[] coursesTaken) {
        super(secondName, coursesTaken);
    }

    public SpecialStudent(String firstName, String secondName, int groupe) {
        super(firstName, secondName, groupe);
    }

    public SpecialStudent(String firstName, String secondName, int groupe, Course[] coursesTaken, int age, String collegeName, int rating, long id, long secretKey) {
        super(firstName, secondName, groupe, coursesTaken, age, collegeName, rating, id);
        this.secretKey = secretKey;
    }
}
