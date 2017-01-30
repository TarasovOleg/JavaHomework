package com.olegTarasov.practice.modul02.task01;

import java.util.Arrays;

/**
 * Created by Олег on 29.01.2017.
 */
public class ArraysOfIntAndDouble {
    public static void main(String[] args) {
        ArraysOfIntAndDouble arraysOfIntAndDouble = new ArraysOfIntAndDouble();
        int[] arrayInt = {5, 9, 10, 16, 10, 12, 21, 17, 12, 7};
        double[] arrayDouble = {5, 9, 10, 16, 10, 12, 21, 17, 12, 7};
        System.out.println();
        arraysOfIntAndDouble.sum(arrayInt);
        arraysOfIntAndDouble.max(arrayInt);
        arraysOfIntAndDouble.min(arrayInt);
        arraysOfIntAndDouble.maxPosit(arrayInt);
        arraysOfIntAndDouble.modul(arrayInt);
        arraysOfIntAndDouble.mult(arrayInt);
        arraysOfIntAndDouble.secLarge(arrayInt);
        System.out.println(" ");
        arraysOfIntAndDouble.sum(arrayDouble);
        arraysOfIntAndDouble.max(arrayDouble);
        arraysOfIntAndDouble.min(arrayDouble);
        arraysOfIntAndDouble.maxPosit(arrayDouble);
        arraysOfIntAndDouble.modul(arrayDouble);
        arraysOfIntAndDouble.mult(arrayDouble);
        arraysOfIntAndDouble.secLarge(arrayDouble);
    }

    public void sum(int[] arr) {
        int sumOfArrayElements = 0;
        for (int i = 0; i < arr.length; i++) {
            sumOfArrayElements = sumOfArrayElements + arr[i];
        }
        System.out.println("Sum of all int elements is " + sumOfArrayElements);
    }

    public void min(int arr[]) {
        Arrays.sort(arr);
        System.out.println("Minimal value is " + arr[0]);
    }

    public void max(int arr[]) {
        Arrays.sort(arr);
        System.out.println("Maximal value is " + arr[arr.length - 1]);
    }

    public void maxPosit(int arr[]) {
        Arrays.sort(arr);
        int a = arr[arr.length - 1];
        if (a >= 0) {
            System.out.println("Maximal positive value is " + a);
        } else {
            System.out.println("All elements is below zero.");
        }
    }

    public void mult(int arr[]) {
        int multOfArrayElements = 1;
        for (int i = 0; i < arr.length - 1; i++) {
            multOfArrayElements = multOfArrayElements * arr[i];
        }
        System.out.println("Multiplication of all values equals " + multOfArrayElements);
    }

    public void modul(int arr[]) {
        Arrays.sort(arr);
        System.out.println("Modulus of first element is " + Math.abs(arr[0]) + "\nModulus of last element is " + Math.abs(arr[arr.length - 1]));
    }

    public void secLarge(int arr[]) {
        Arrays.sort(arr);
        int a = (arr[arr.length - 2]);
        System.out.println("Second largest element is " + a);
    }

    public void sum(double[] arr) {
        double sumOfArrayElements = 0;
        for (int i = 0; i < arr.length; i++) {
            sumOfArrayElements = sumOfArrayElements + arr[i];
        }
        System.out.println("Sum of all double elements is " + sumOfArrayElements);
    }

    public void min(double[] arr) {
        Arrays.sort(arr);
        System.out.println("Minimal double value is " + arr[0]);
    }

    public void max(double[] arr) {
        Arrays.sort(arr);
        System.out.println("Maximal double value is " + arr[arr.length - 1]);
    }

    public void maxPosit(double[] arr) {
        Arrays.sort(arr);
        double a = arr[arr.length - 1];
        if (a >= 0) {
            System.out.println("Maximal positive value of double array is " + a);
        } else {
            System.out.println("All elements is below zero.");
        }
    }

    public void mult(double[] arr) {
        double multOfArrayElements = 1;
        for (int i = 0; i < arr.length - 1; i++) {
            multOfArrayElements = multOfArrayElements * arr[i];
        }
        System.out.println("Multiplication of all double values equals " + multOfArrayElements);
    }

    public void modul(double[] arr) {
        Arrays.sort(arr);
        System.out.println("Modulus of first element is " + Math.abs(arr[0]) + "\nModulus of last element is " + Math.abs(arr[arr.length - 1]));
    }

    public void secLarge(double[] arr) {
        Arrays.sort(arr);
        double a = (arr[arr.length - 2]);
        System.out.println("Second largest element of double array is " + a);
    }
}
