package com.olegTarasov.practice.modul09.task01;

import com.olegTarasov.practice.modul07.task01.Order;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by Олег on 19.04.2017.
 */
public class Java8 {

/*
-отсортируйте список за ценой заказа по убыванию
-отсортируйте список за ценой заказа по возрастанию и за городом пользователя
-отсортируйте список за наименованием товара, идентификатором заказа, и городом пользователя

-удалите дублированные данные со списка
-удалите объекты, где цена меньше 1500
-разделите список на 2 списка - заказы в долларах и в гривнах
-разделите список на столько списков, сколько уникальных городов в User

-проверьте, содержит ли сет заказ, где фамилия пользователя - “Petrov”
-удалите заказы в USD
*/

    public void sortByPrice(List<Order> orderList) {
        Collections.sort(orderList, (o1, o2) -> o2.getPrice() - o1.getPrice());
    }

    public void sortByPriceAndCityName(List<Order> orderList) {
        Collections.sort(orderList, (o1, o2) -> {
            if (o1.getPrice() != o2.getPrice()) {
                return o1.getPrice() - o2.getPrice();
            }
            return o1.getUser().getCity().compareTo(o2.getUser().getCity());
        });
    }

    public void sortByProductnameIdAndCityname(List<Order> orderList) {
        Collections.sort(orderList, (o1, o2) -> {
            if (!o1.getItemName().equals(o2.getItemName())) {
                return o1.getItemName().compareTo(o2.getItemName());
            }
            if (o1.getId() != o2.getId()) {
                return (int) (o1.getId() - o2.getId());
            }
            return o1.getUser().getCity().compareTo(o2.getUser().getCity());
        });
    }

    public void orderDuplicatesRemover(ArrayList<Order> arrayList) {
        HashSet<Order> clearSet = new HashSet<>(arrayList);
        arrayList.clear();
        arrayList.addAll(clearSet);
    }

    public ArrayList<ArrayList<Order>> currencyDividerMethod(ArrayList<Order> arrayList) {
        ArrayList<ArrayList<Order>> result = new ArrayList<ArrayList<Order>>();
        List<Order> USDlist = arrayList.stream().filter(order -> order.getCurrency() == Order.Currency.USD).collect(Collectors.toList());
        List<Order> GRNlist = arrayList.parallelStream().filter(order -> order.getCurrency() == Order.Currency.GRN).collect(Collectors.toList());
        result.add((ArrayList<Order>) USDlist);
        result.add((ArrayList<Order>) GRNlist);
        return result;
    }


    public void seocndName (ArrayList<Order>arrayList){
        arrayList.stream().filter(order -> order.getUser().getLastName().equalsIgnoreCase("Petrov"));
    }

    @Override
    public String toString() {
        return "Java8{}";
    }
}





























