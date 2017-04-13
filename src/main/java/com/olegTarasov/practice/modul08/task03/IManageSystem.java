package com.olegTarasov.practice.modul08.task03;

import java.util.List;
import java.util.Set;

/**
 * Created by Олег on 07.04.2017.
 */

/*
Создайте универсальный интерфейс IManageSystem(T) с такими методами:
T save(T obj, double price);
T save(T obj);
void delete(T obj) ;
void deleteById(int id);
T get(int id);
Double getPrice(T obj);
Set<T> getProducts();
List<Double> getPrices();
*/

public interface IManageSystem<T> {
    T save(T obj, double price);
    T save(T obj);
    void delete(T obj) ;
    void deleteById(long id);
    T get(int id);
    Double getPrice(T obj);
    Set<T> getProducts();
    List<Double> getPrices();

}
