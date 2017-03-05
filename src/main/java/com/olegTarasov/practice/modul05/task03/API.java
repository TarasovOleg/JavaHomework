package com.olegTarasov.practice.modul05.task03;

import com.olegTarasov.practice.modul05.task01_02.Room;

/**
 * Created by Олег on 25.02.2017.
 */
public interface API {
    public Room[] findRooms (int price, int persons, String city, String hotel);

}
