package com.olegTarasov.practice.modul07.task02;

import com.olegTarasov.practice.modul07.task01.Order;
import com.olegTarasov.practice.modul07.task01.User;

import java.util.*;

/**
 * Created by Олег on 22.03.2017.
 */
public class MainMethod {
    public static void main(String[] args) {
        OrderSortMethods orderSortMethods = new OrderSortMethods();
        List<User> userList = new ArrayList<User>();
        userList.add(0, new User(1010, "user10", "user10A", "kiev", 500));
        userList.add(1, new User(1111, "user1", "user1A", "kiev", 500));
        userList.add(2, new User(2222, "user2", "user2A", "kiev", 500));
        userList.add(3, new User(3333, "user3", "user3A", "l'viv", 500));
        userList.add(4, new User(4444, "user4", "user4A", "kiev", 500));
        userList.add(5, new User(5555, "user5", "user5A", "l'viv", 500));
        userList.add(6, new User(6666, "user6", "user6A", "l'viv", 500));
        userList.add(7, new User(7777, "user7", "user7A", "kiev", 500));
        userList.add(8, new User(8888, "user8", "user8A", "l'viv", 500));
        userList.add(9, new User(9999, "user9", "user9A", "kiev", 500));
        List<Order> orderList = new ArrayList<Order>();
        orderList.add(0, new Order(1010, 190, Order.Currency.GRN, "pppp", "shop666", userList.get(0)));
        orderList.add(1, new Order(111, 100, Order.Currency.USD, "iiii", "shop666", userList.get(1)));
        orderList.add(2, new Order(555, 140, Order.Currency.USD, "tttt", "shop555", userList.get(5)));
        orderList.add(3, new Order(333, 170, Order.Currency.GRN, "eeee", "shop333", userList.get(3)));
        orderList.add(4, new Order(444, 170, Order.Currency.GRN, "iiii", "shop444", userList.get(4)));
        orderList.add(5, new Order(555, 140, Order.Currency.USD, "tttt", "shop555", userList.get(5)));
        orderList.add(6, new Order(666, 170, Order.Currency.GRN, "iiii", "shop666", userList.get(6)));
        orderList.add(7, new Order(777, 160, Order.Currency.USD, "uuuu", "shop777", userList.get(7)));
        orderList.add(8, new Order(888, 170, Order.Currency.USD, "iiii", "shop666", userList.get(8)));
        orderList.add(9, new Order(444, 120, Order.Currency.GRN, "oooo", "shop666", userList.get(9)));


        /*
        Collections.sort(orderList);
        Collections.sort(orderList,new Order.SortByIncrasePriceAndCity());
        Collections.sort(orderList, new Order.SortByItemnameShopAndSity());
        */


        /*System.out.println(" ");
        for (Order anOrderList : orderList) {
            System.out.println(anOrderList);
        }
        */

        //orderSortMethods.currencyDividerMethod(orderList);
        //orderSortMethods.orderDuplicatesRemover(orderList);
        //orderSortMethods.priceLessThen150Remover(orderList);
        orderSortMethods.cityNameDividerMethod(orderList);


        /*for (Order anOrderList : orderList) {
            System.out.println(anOrderList);
        }*/



    }


}
