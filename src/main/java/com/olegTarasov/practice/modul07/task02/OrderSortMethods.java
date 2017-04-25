package com.olegTarasov.practice.modul07.task02;

import com.olegTarasov.practice.modul07.task01.Order;
import com.olegTarasov.practice.modul07.task01.User;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Олег on 26.03.2017.
 */
public class OrderSortMethods {
   /*   -удалите дублированные данные со списка
        -удалите объекты, где цена меньше 1500
        -разделите список на 2 списка - заказы в долларах и в гривнах
        -разделите список на столько списков, сколько уникальных городов в User*/


    public void currencyDividerMethod(List<Order> orderList) {
        List<Order> grnList = new ArrayList<Order>();
        List<Order> usdList = new ArrayList<Order>();
        for (int i = 0; i < orderList.size(); i++) {

            String checker = orderList.get(i).getCurrency().toString();
            if (checker == "GRN") {
                grnList.add(orderList.get(i));
            } else if (checker == "USD") {
                usdList.add(orderList.get(i));
            }
        }
        for (Order order : grnList) {
            System.out.println(order);
        }
        System.out.println(" ");
        for (Order order : usdList) {
            System.out.println(order);
        }
    }

    public void orderDuplicatesRemover(List<Order> orderList) {
        int counter = 0;
        for (int i = 0; i < orderList.size(); i++) {
            int checker = orderList.get(counter++).compareTo(orderList.get(i));
            if (checker == 0) {
                orderList.remove(i);
            }
        }
        for (Order anOrderList : orderList) {
            System.out.println(anOrderList);
        }
    }

    public void priceLessThen150Remover(List<Order> orderList) {
        for (int i = 0; i < orderList.size(); i++) {
            if (orderList.get(i).getPrice() < 150) {
                orderList.remove(i);
            }
        }
        for (Order anOrderList : orderList) {
            System.out.println(anOrderList);
        }
    }

    public void cityNameDividerMethod(List<Order> orderList) {
        int newListCounter = 0;
        int uniqueNameChecker = 0;
        for (int i = 0; i < orderList.size(); i++) {
           // int checkUniqueCity = orderList.get(uniqueNameChecker++).getUser().getCity().compareTo(orderList.get(i).getUser().getCity());
            System.out.println("test sout");
            if (!orderList.get(uniqueNameChecker++).getUser().getCity().equals(orderList.get(i).getUser().getCity())) {
                newListCounter++;
            }
        }
        List<List<Order>> listsOfLists = listCreator(newListCounter);
        for (int i = 0; i < orderList.size(); i++) {
           // int checkUniqueCity = orderList.get(i).getUser().getCity().compareTo(orderList.get(i).getUser().getCity());
            if (!orderList.get(uniqueNameChecker++).getUser().getCity().equals(orderList.get(i).getUser().getCity())) {
                listsOfLists.get(i).add(orderList.get(i));
            }
        }
        int lookOverCounter = 0;
        for (int i = 0; i < orderList.size(); i++) {
            System.out.println(listsOfLists.get(lookOverCounter++).get(i).toString());
        }
    }

    private List<List<Order>> listCreator(int alfa) {
        List<List<Order>> listOfLists = new ArrayList<List<Order>>();
        for (int i = 0; i < alfa; i++) {
            listOfLists.add(new ArrayList<Order>());
        }
        return listOfLists;
    }
}
