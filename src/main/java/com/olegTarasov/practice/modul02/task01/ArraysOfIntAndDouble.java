package com.olegTarasov.practice.modul02.task01;

import java.util.Arrays;

/**
 * Created by Олег on 29.01.2017.
 */
public class ArraysOfIntAndDouble {
    public static void main(String[] args) {
        ArraysOfIntAndDouble arraysOfIntAndDouble = new ArraysOfIntAndDouble();
        int [] arrayInt = {5,9,10,16,10,12,21,17,12,7};
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
    public void sum (int []arr){
        int a = 0;
        for (int i = 0; i < arr.length; i++) {
            a = a + arr[i];
        }
        System.out.println("Sum of all int elements is " + a);
    }
    public void min (int arr[]){
        Arrays.sort(arr);
        System.out.println("Minimal value is " + arr[0]);
    }
    public void max (int arr[]){
        Arrays.sort(arr);
        System.out.println("Maximal value is " + arr[arr.length-1]);
    }
    public void maxPosit (int arr []){
        Arrays.sort(arr);
        int a = arr[arr.length-1];
        if (a>0){
            System.out.println("Maximal positiv value is " + a);
        }
    }
    public void mult (int arr []){
        int a = 1;
        for (int i = 0; i <arr.length-1 ; i++) {
            a = a * arr[i];
        }
        System.out.println("Multiplication of all values equals " + a);
    }
    public void modul (int arr []){
        Arrays.sort(arr);
        System.out.println("Modulus of first and last element equals " + arr[arr.length-1]%arr[0]);
    }
    public void secLarge( int arr []){
        Arrays.sort(arr);
        int a = (arr[arr.length-2]);
        if (a == arr[arr.length-1]){
            int b = 0;
            for (int i = arr.length-3; i >= 0; i--) {
                b = arr[i];
                if (arr[i] != a)break;
            }
            System.out.println("Second largest element is " + b);
        }
        else {
            System.out.println("Second largest element is " + a);
        }

    }
    public void sum (double[]arr){
        double a = 0;
        for (int i = 0; i < arr.length; i++) {
            a = a + arr[i];
        }
        System.out.println("Sum of all double elements is " + a);
    }
    public void min (double[] arr){
        Arrays.sort(arr);
        System.out.println("Minimal double value is " + arr[0]);
    }
    public void max (double []arr){
        Arrays.sort(arr);
        System.out.println("Maximal double value is " + arr[arr.length-1]);
    }
    public void maxPosit (double []arr){
        Arrays.sort(arr);
        double a = arr[arr.length-1];
        if (a>0){
            System.out.println("Maximal positive value of double array is " + a);
        }
    }
    public void mult (double [] arr){
        double a = 1;
        for (int i = 0; i <arr.length-1 ; i++) {
            a = a * arr[i];
        }
        System.out.println("Multiplication of all double values equals " + a);
    }
    public void modul (double [] arr){
        Arrays.sort(arr);
        System.out.println("Modulus of first and last element of double array equals " + arr[arr.length-1]%arr[0]);
    }
    public void secLarge(double [] arr){
        Arrays.sort(arr);
        double a = (arr[arr.length-2]);
        if (a == arr[arr.length-1]){
            double b = 0;
            for (int i = arr.length-3; i >= 0; i--) {
                b = arr[i];
                if (arr[i] != a)break;
            }
            System.out.println("Second largest element of double array is " + b);
        }
        else {
            System.out.println("Second largest element of double array is " + a);
        }

    }
}
