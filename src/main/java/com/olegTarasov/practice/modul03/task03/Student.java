package com.olegTarasov.practice.modul03.task03;

/**
 * Created by Олег on 06.02.2017.
 */
public class Student {
    String firstName;
    String secondName;
    int groupe;
    Course[] coursesTaken;
    int age;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public int getGroupe() {
        return groupe;
    }

    public void setGroupe(int groupe) {
        this.groupe = groupe;
    }

    public Course[] getCoursesTaken() {
        return coursesTaken;
    }

    public void setCoursesTaken(Course[] coursesTaken) {
        this.coursesTaken = coursesTaken;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Student(String firstName, String secondName, int groupe) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.groupe = groupe;
    }

    public Student(String secondName, Course[] coursesTaken) {
        this.secondName = secondName;
        this.coursesTaken = coursesTaken;
    }

}
