package com.olegTarasov.practice.modul06.task01;

import java.util.Arrays;

/**
 * Created by Олег on 06.03.2017.
 */
public final class ArraysUtils {
    private ArraysUtils() {
    }

    public static int sum(int[] arr) {
        int[] newArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        int sumOfArrayElements = 0;
        if (newArr == null || newArr.length == 0) {
            System.out.println("Your array is empty!");
        } else {

            for (int i = 0; i < newArr.length; i++) {
                sumOfArrayElements = sumOfArrayElements + newArr[i];
            }
        }
        return sumOfArrayElements;
    }

    public static int min(int[] arr) {
        int[] newArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        int result = 0;
        if (newArr == null || newArr.length == 0) {
            System.out.println("Your array is empty!");
        } else {
            Arrays.sort(newArr);
            result = newArr[0];
        }
        return result;
    }

    public static int max(int arr[]) {
        int[] newArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        int result = 0;
        if (newArr == null || newArr.length == 0) {
            System.out.println("Your array is empty!");
        } else {
            Arrays.sort(newArr);
            result = newArr[newArr.length - 1];
        }
        return result;
    }

    public static int maxPosit(int arr[]) {
        int[] newArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        int result = 0;
        if (newArr == null || newArr.length == 0) {
            System.out.println("Your array is empty!");
        } else {
            Arrays.sort(newArr);
            int positive = newArr[newArr.length - 1];
            if (positive >= 0) {
                result = positive;
            } else {
                System.out.println("All elements is below zero.");
            }
        }
        return result;

    }

    public static int mult(int arr[]) {
        int[] newArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        int multOfArrayElements = 1;
        if (newArr == null || newArr.length == 0) {
            System.out.println("Your array is empty!");
        } else {

            for (int j = 0; j < newArr.length - 1; j++) {
                multOfArrayElements = multOfArrayElements * arr[j];
            }
        }
        return multOfArrayElements;
    }

    public static int[] modul(int arr[]) {
        int[] newArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        int[] result = new int[2];
        if (newArr == null || newArr.length == 0) {
            System.out.println("Your array is empty!");
        } else {
            Arrays.sort(newArr);
            result[0] = Math.abs(newArr[0]);
            result[1] = Math.abs(newArr[newArr.length - 1]);
        }
        return result;
    }

    public static int secLarge(int arr[]) {
        int[] newArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        int second = 0;
        if (newArr == null || newArr.length == 0) {
            System.out.println("Your array is empty!");
        } else {
            Arrays.sort(newArr);
            second = (newArr[newArr.length - 2]);
        }
        return second;
    }

    public static int[] reverse(int[] array) {
        int[] reverseArr = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            reverseArr[i] = array[i];
        }
        for (int i = 0; i < reverseArr.length / 2; i++) {
            int tmp = reverseArr[i];
            reverseArr[i] = reverseArr[reverseArr.length - i - 1];
            reverseArr[reverseArr.length - i - 1] = tmp;
        }
        return reverseArr;
    }

    public static int[] findEvenElements(int[] array) {
        int counter = 1;
        for (int i = 0; i < array.length - 1; i++) {
            if (((array[i] % 2) == 0) && (array[i] != 0)) {
                counter++;
            }
        }
        int[] evenArray = new int[counter];
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (((array[i] % 2) == 0) && (array[i] != 0)) {
                evenArray[j++] = array[i];
            }
        }
        return evenArray;
    }
}
