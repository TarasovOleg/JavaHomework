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

        System.out.println("ADDING");
        System.out.println("Integer ArrayList adding 10000 elements " + listFiiler(integerArrayList, 10000));
        System.out.println("Integer ArrayList adding 100000 elements " + listFiiler(integerArrayList, 100000));
        System.out.println("Integer LinkedList adding 10000 elements " + listFiiler(integerLinkedList, 10000));
        System.out.println("Integer LinkedList adding 100000 elements " + listFiiler(integerLinkedList, 100000));
        System.out.println('\n');
        System.out.println("String ArrayList adding 10000 elements " + listFiiler(stringArrayList, 10000));
        System.out.println("String ArrayList adding 100000 elements " + listFiiler(stringArrayList, 100000));
        System.out.println("String LinkedList adding 10000 elements " + listFiiler(stringLinkedList, 10000));
        System.out.println("String LinkedList adding 100000 elements " + listFiiler(stringLinkedList, 100000));
        System.out.println('\n'+"SETTING");
        System.out.println("Integer ArrayList setting 10000 elements " + listSetter(integerArrayList, 10000));
        System.out.println("Integer ArrayList setting 100000 elements " + listSetter(integerArrayList, 100000));
        System.out.println("Integer LinkedList setting 10000 elements " + listSetter(integerLinkedList, 10000));
        System.out.println("Integer LinkedList setting 100000 elements " + listSetter(integerLinkedList, 100000));
        System.out.println('\n');
        System.out.println("String ArrayList setting 10000 elements " + listSetter(stringArrayList, 10000));
        System.out.println("String ArrayList setting 100000 elements " + listSetter(stringArrayList, 100000));
        System.out.println("String LinkedList setting 10000 elements " + listSetter(stringLinkedList, 10000));
        System.out.println("String LinkedList setting 100000 elements " + listSetter(stringLinkedList, 100000));
        System.out.println('\n'+"GETTING");
        System.out.println("Integer ArrayList getting 10000 elements " + listGetter(integerArrayList, 10000));
        System.out.println("Integer ArrayList getting 100000 elements " + listGetter(integerArrayList, 100000));
        System.out.println("Integer LinkedList getting 10000 elements " + listGetter(integerLinkedList, 10000));
        System.out.println("Integer LinkedList getting 100000 elements " + listGetter(integerLinkedList, 100000));
        System.out.println('\n');
        System.out.println("String ArrayList getting 10000 elements " + listGetter(stringArrayList, 10000));
        System.out.println("String ArrayList getting 100000 elements " + listGetter(stringArrayList, 100000));
        System.out.println("String LinkedList getting 10000 elements " + listGetter(stringLinkedList, 10000));
        System.out.println("String LinkedList getting 100000 elements " + listGetter(stringLinkedList, 100000));
        System.out.println('\n'+"REMOVING");
        System.out.println("Integer ArrayList removing 10000 elements " + listRemover(integerArrayList, 10000));
        System.out.println("Integer ArrayList removing 100000 elements " + listRemover(integerArrayList, 100000));
        System.out.println("Integer LinkedList removing 10000 elements " + listRemover(integerLinkedList, 10000));
        System.out.println("Integer LinkedList removing 100000 elements " + listRemover(integerLinkedList, 100000));
        System.out.println('\n');
        System.out.println("String ArrayList removing 10000 elements " + listRemover(stringArrayList, 10000));
        System.out.println("String ArrayList removing 100000 elements " + listRemover(stringArrayList, 100000));
        System.out.println("String LinkedList removing 10000 elements " + listRemover(stringLinkedList, 10000));
        System.out.println("String LinkedList removing 100000 elements " + listRemover(stringLinkedList, 100000));

    }

    private static long listFiiler(List list, int amount){
        long start = System.nanoTime();
        for (int i = 0; i < amount; i++) {
            list.add(i, new Random());
        }
        long finish = System.nanoTime();
        return finish - start;
    }

    private static long listSetter (List list, int amount){
        long start = System.nanoTime();
        for (int i = 0; i < amount; i++) {
            list.set(i, new Random());
        }
        long finish = System.nanoTime();
        return finish - start;
    }

    private static long listGetter (List list, int amount){
        long start = System.nanoTime();
        for (int i = 0; i < amount; i++) {
            list.get(i);
        }
        long finish = System.nanoTime();
        return finish - start;
    }

    private static long listRemover (List list, int amount){
        long start = System.nanoTime();
        for (int i = amount; i == 0; i--) {
            list.remove(i);
        }
        long finish = System.nanoTime();
        return finish - start;
    }

}
