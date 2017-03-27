package com.olegTarasov.practice.modul07.task01;

import java.util.Comparator;

/**
 * Created by Олег on 22.03.2017.
 */
public class Order implements Comparable<Order> {
    private long id;
    private int price;
    private Currency currency;
    private String itemName;
    private String shopIdentificator;
    private User user;

    public Order(long id, int price, Currency currency, String itemName, String shopIdentificator, User user) {
        this.id = id;
        this.price = price;
        this.currency = currency;
        this.itemName = itemName;
        this.shopIdentificator = shopIdentificator;
        this.user = user;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getShopIdentificator() {
        return shopIdentificator;
    }

    public void setShopIdentificator(String shopIdentificator) {
        this.shopIdentificator = shopIdentificator;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Order order = (Order) o;

        if (id != order.id) return false;
        if (price != order.price) return false;
        if (currency != order.currency) return false;
        if (itemName != null ? !itemName.equals(order.itemName) : order.itemName != null) return false;
        if (shopIdentificator != null ? !shopIdentificator.equals(order.shopIdentificator) : order.shopIdentificator != null)
            return false;
        return user != null ? user.equals(order.user) : order.user == null;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + price;
        result = 31 * result + (currency != null ? currency.hashCode() : 0);
        result = 31 * result + (itemName != null ? itemName.hashCode() : 0);
        result = 31 * result + (shopIdentificator != null ? shopIdentificator.hashCode() : 0);
        result = 31 * result + (user != null ? user.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id: " + id +
                ", price: " + price +
                ", currency: " + currency +
                ", itemName: '" + itemName + '\'' +
                ", shopIdentificator: '" + shopIdentificator + '\'' +
                ", user: " + user +
                '}';
    }

    public int compareTo(Order o) {
        return price - o.getPrice();
    }

    public static class SortByIncrasePriceAndCity implements Comparator<Order> {
        public int compare(Order o1, Order o2) {
            int result = o2.getPrice() - o1.getPrice();
            if(result == 0){
                return o1.getUser().getCity().compareTo(o2.getUser().getCity());
            }
            return result;
        }
    }

    public static class SortByItemnameShopAndSity implements Comparator<Order> {
        public int compare(Order o1, Order o2) {
            int result = o1.getItemName().compareTo(o2.getItemName());
            if (result == 0){
                int innerResult = o1.getShopIdentificator().compareTo(o2.getShopIdentificator());
                if (innerResult == 0){
                    return o1.getUser().getCity().compareTo(o2.getUser().getCity());
                }
                return innerResult;
            }
            return result;
        }
    }



    public enum Currency {
        GRN,
        USD;
    }
}
