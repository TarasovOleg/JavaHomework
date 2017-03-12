package com.olegTarasov.practice.modul06.task01;

import java.util.Arrays;

/**
 * Created by Олег on 06.03.2017.
 */
public final class ArraysUtils {
    private ArraysUtils() {
    }

    public static int sum(int[] arr) {
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

    public static int min(int[] arr) {
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

    public static int max(int arr[]) {
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

    public static int maxPosit(int arr[]) {
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

    public static int mult(int arr[]) {
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

    public static int[] modul(int arr[]) {
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

    public static int secLarge(int arr[]) {
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

    public static int[] reverse(int[] array) {
        int[] reversArray = new int[array.length];
        for (int i = reversArray.length - 1; i >= 0; i--) {
            reversArray[array.length - i - 1] = array[i];
        }
        return reversArray;
    }

    public static int[] findEvenElements(int[] array) {
        int[] evenArray = new int[array.length];
        for (int i = 0; i < array.length - 1; i++) {
            if ((array[i] % 2) == 0) {
                evenArray[i] = array[i];
            }
        }
        return evenArray;
    }
}
