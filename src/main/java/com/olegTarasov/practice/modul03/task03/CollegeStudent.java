package com.olegTarasov.practice.modul03.task03;

/**
 * Created by Олег on 06.02.2017.
 */
public class CollegeStudent extends Student {
    String collegeName;
    int rating;
    long id;

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public CollegeStudent(String firstName, String secondName, int groupe) {
        super(firstName, secondName, groupe);
    }

    public CollegeStudent(String secondName, Course[] coursesTaken) {
        super(secondName, coursesTaken);
    }

    public CollegeStudent(String firstName, String secondName, int groupe, Course[] coursesTaken, int age, String collegeName, int rating, long id) {
        super(firstName, secondName, groupe);
        this.collegeName = collegeName;
        this.rating = rating;
        this.id = id;
        this.firstName = firstName;
        this.secondName = secondName;
        this.groupe = groupe;
        this.coursesTaken = coursesTaken;
        this.age = age;
    }
}
