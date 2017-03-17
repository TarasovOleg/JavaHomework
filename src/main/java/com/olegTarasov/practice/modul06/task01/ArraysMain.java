package com.olegTarasov.practice.modul06.task01;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by Олег on 06.03.2017.
 */
public class ArraysMain {
    public static void main(String[] args) {
        ArraysUtils arraysUtils;

        int[] arrayOfInt = new int[10];
        for (int i = 0; i < arrayOfInt.length - 1; i++) {
            //arrayOfInt[i] = 3 * (int) Math.floor(Math.random() * 11) + 1;
        }
        System.out.println(Arrays.toString(arrayOfInt));
        System.out.println(ArraysUtils.max(arrayOfInt));
        System.out.println(ArraysUtils.maxPosit(arrayOfInt));
        System.out.println(ArraysUtils.min(arrayOfInt));
        System.out.println(Arrays.toString(ArraysUtils.modul(arrayOfInt)));
        System.out.println(ArraysUtils.mult(arrayOfInt));
        System.out.println(ArraysUtils.sum(arrayOfInt));
        System.out.println(ArraysUtils.secLarge(arrayOfInt));
        System.out.println(Arrays.toString(ArraysUtils.reverse(arrayOfInt)));
        System.out.println(Arrays.toString(ArraysUtils.findEvenElements(arrayOfInt)));
        System.out.println();
        System.out.println(Arrays.toString(arrayOfInt));
    }

}
