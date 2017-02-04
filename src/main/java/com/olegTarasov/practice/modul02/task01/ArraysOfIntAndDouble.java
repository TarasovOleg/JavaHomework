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
        System.out.println(" ");

        arraysOfIntAndDouble.sum(arrayInt);
        arraysOfIntAndDouble.max(arrayInt);
        arraysOfIntAndDouble.min(arrayInt);
        arraysOfIntAndDouble.maxPosit(arrayInt);
        Arrays.toString(arrayInt);
        System.out.println(arraysOfIntAndDouble.mult(arrayInt));
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


    public int sum(int[] arr) {
        int sumOfArrayElements = 0;
        if (arr == null || arr.length == 0) {
            System.out.println("Your array is empty!");
        } else {

            for (int i = 0; i < arr.length; i++) {
                sumOfArrayElements = sumOfArrayElements + arr[i];
            }
            //System.out.println("Sum of all int elements is " + sumOfArrayElements);
        }
        return sumOfArrayElements;
    }

    public int min(int[] arr) {
        int result = 0;
        if (arr == null || arr.length == 0) {
            System.out.println("Your array is empty!");
        } else {
            Arrays.sort(arr);
            //System.out.println("Minimal value is " + arr[0]);
            result = arr[0];

        }
        return result;
    }

    public int max(int arr[]) {
        int result = 0;
        if (arr == null || arr.length == 0) {
            System.out.println("Your array is empty!");
        } else {
            Arrays.sort(arr);
            //System.out.println("Maximal value is " + arr[arr.length - 1]);
            result = arr[arr.length - 1];

        }
        return result;
    }

    public int maxPosit(int arr[]) {
        int result = 0;
        if (arr == null || arr.length == 0) {
            System.out.println("Your array is empty!");
        } else {
            Arrays.sort(arr);
            int positive = arr[arr.length - 1];
            if (positive >= 0) {
                //System.out.println("Maximal positive value is " + positive);
                result = positive;
            } else {
                System.out.println("All elements is below zero.");
            }

        }
        return result;

    }

    public int mult(int arr[]) {
        int multOfArrayElements = 1;
        if (arr == null || arr.length == 0) {
            System.out.println("Your array is empty!");
        } else {

            for (int j = 0; j < arr.length - 1; j++) {
                multOfArrayElements = multOfArrayElements * arr[j];
            }
            //System.out.println("Multiplication of all values equals " + multOfArrayElements);

        }
        return multOfArrayElements;
    }

    public int[] modul(int arr[]) {
        int[] result = new int[2];
        if (arr == null || arr.length == 0) {
            System.out.println("Your array is empty!");
        } else {
            Arrays.sort(arr);
            //System.out.println("Modulus of first element is " + Math.abs(arr[0]) + "\nModulus of last element is " + Math.abs(arr[arr.length - 1]));
            result[0] = Math.abs(arr[0]);
            result[1] = Math.abs(arr[arr.length - 1]);
        }
        return result;
    }

    public int secLarge(int arr[]) {
        int second = 0;
        if (arr == null || arr.length == 0) {
            System.out.println("Your array is empty!");
        } else {
            Arrays.sort(arr);
            second = (arr[arr.length - 2]);
            //System.out.println("Second largest element is " + second);
        }
        return second;
    }


    public double sum(double[] arr) {
        double sumOfArrayElements = 0;
        if (arr == null || arr.length == 0) {
            System.out.println("Your array is empty!");
        } else {

            for (int j = 0; j < arr.length; j++) {
                sumOfArrayElements = sumOfArrayElements + arr[j];
            }
            //System.out.println("Sum of all double elements is " + sumOfArrayElements);

        }
        return sumOfArrayElements;

    }

    public double min(double[] arr) {
        double result = 0;
        if (arr == null || arr.length == 0) {
            System.out.println("Your array is empty!");
        } else {
            Arrays.sort(arr);
            //System.out.println("Minimal double value is " + arr[0]);
            result = arr[0];

        }
        return result;

    }

    public double max(double[] arr) {
        double result = 0;
        if (arr == null || arr.length == 0) {
            System.out.println("Your array is empty!");
        } else {
            Arrays.sort(arr);
            //System.out.println("Maximal double value is " + arr[arr.length - 1]);
            result = arr[arr.length - 1];

        }
        return result;
    }

    public double maxPosit(double[] arr) {
        double result = 0;
        if (arr == null || arr.length == 0) {
            System.out.println("Your array is empty!");
        } else {
            Arrays.sort(arr);
            double positive = arr[arr.length - 1];
            if (positive >= 0) {
                //System.out.println("Maximal positive value of double array is " + positive);
                result = positive;
            } else {
                System.out.println("All elements is below zero.");
            }

        }
        return result;
    }

    public double mult(double[] arr) {
        double multOfArrayElements = 1;
        if (arr == null || arr.length == 0) {
            System.out.println("Your array is empty!");
        } else {
            for (int j = 0; j < arr.length - 1; j++) {
                multOfArrayElements = multOfArrayElements * arr[j];
            }
            //System.out.println("Multiplication of all double values equals " + multOfArrayElements);

        }
        return multOfArrayElements;
    }

    public double[] modul(double[] arr) {
        double[] result = new double[2];
        if (arr == null || arr.length == 0) {
            System.out.println("Your array is empty!");

        } else {
            Arrays.sort(arr);
            //System.out.println("Modulus of first element is " + Math.abs(arr[0]) + "\nModulus of last element is " + Math.abs(arr[arr.length - 1]));
            result[0] = Math.abs(arr[0]);
            result[1] = Math.abs(arr[arr.length - 1]);

        }
        return result;
    }

    public double secLarge(double[] arr) {
        double second = 0;
        if (arr == null || arr.length == 0) {
            System.out.println("Your array is empty!");
        } else {
            Arrays.sort(arr);
            second = (arr[arr.length - 2]);
            //System.out.println("Second largest element of double array is " + second);

        }
        return second;

    }
}
