package com.olegTarasov.practice.modul07.task04;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/**
 * Created by Олег on 28.03.2017.
 */
public class IntegerStringLists {
    public static void main(String[] args) {

        List<Integer> integerArrayList = new ArrayList<Integer>();
        List<Integer> integerLinkedList = new LinkedList<Integer>();
        List<String> stringArrayList = new ArrayList<String>();
        List<String> stringLinkedList = new LinkedList<String>();

        System.out.println("Integer ArrayList with 10000 elements " + listFiiler(integerArrayList, 10000));
        System.out.println("Integer ArrayList with 100000 elements " + listFiiler(integerArrayList, 100000));
        System.out.println("Integer LinkedList with 10000 elements " + listFiiler(integerLinkedList, 10000));
        System.out.println("Integer LinkedList with 100000 elements " + listFiiler(integerLinkedList, 100000));
        System.out.println('\n');
        System.out.println("String ArrayList with 10000 elements " + listFiiler(stringArrayList, 10000));
        System.out.println("String ArrayList with 100000 elements " + listFiiler(stringArrayList, 100000));
        System.out.println("String LinkedList with 10000 elements " + listFiiler(stringLinkedList, 10000));
        System.out.println("String LinkedList with 100000 elements " + listFiiler(stringLinkedList, 100000));

    }

    public static long listFiiler(List list, int amount){
        long start = System.nanoTime();
        for (int i = 0; i < amount; i++) {
            list.add(i, new Random());
        }
        long finish = System.nanoTime();
        return finish - start;
    }

    @Override
    public String toString() {
        return "IntegerStringLists{}";
    }
}
