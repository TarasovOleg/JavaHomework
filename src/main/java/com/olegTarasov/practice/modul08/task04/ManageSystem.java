package com.olegTarasov.practice.modul08.task04;

import com.olegTarasov.practice.modul08.task02.Food;
import com.olegTarasov.practice.modul08.task03.IManageSystem;

import java.util.*;

/**
 * Created by Олег on 11.04.2017.
 */
/* Реализуйте интерфейс IManageSystem для работы с базой данных товаров. Класс должен содержать поле:
        Map<Food, Double> database

        Поле эмулирует базу данных, содержит в себе данные о продуктах и их цене. Поле должно быть доступно только внутри данного класса. */


public class ManageSystem implements IManageSystem<Food> {

    private Map<Food, Double> database = new HashMap<Food, Double>();


    public Food save(Food obj, double price) {
        this.database.put(obj, price);
        return obj;
    }

    public Food save(Food obj) {
        database.put(obj, null);
        return obj;
    }

    public void delete(Food obj) {
        database.remove(obj);
    }

    public void deleteById(long id) {
        for (Map.Entry<Food, Double> temp : this.database.entrySet()) {
            if (temp.getKey().getId() == id) {
                this.database.remove(temp.getKey());
                return;
            }
        }
    }


    public Food get(int id) {
        Food food = null;//new Food(null,null ,0);
        for (Map.Entry<Food, Double> temp : this.database.entrySet()) {
            if (temp.getKey().getId() == id) {
                food = temp.getKey();
            }
        }
        return food;
    }

    public Double getPrice(Food obj) { //
        return database.get(obj);
    }

    public Set<Food> getProducts() {
        return this.database.keySet();
    }

    public List<Double> getPrices() {
        ArrayList<Double> prices = new ArrayList<Double>();
        for (Map.Entry<Food, Double> temp : this.database.entrySet()) {
            prices.add(temp.getValue());
        }
        return prices;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ManageSystem that = (ManageSystem) o;

        return database != null ? database.equals(that.database) : that.database == null;
    }

    @Override
    public int hashCode() {
        return database != null ? database.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "ManageSystem{" +
                "database=" + database +
                '}';
    }
}
