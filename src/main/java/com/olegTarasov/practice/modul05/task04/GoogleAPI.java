package com.olegTarasov.practice.modul05.task04;

import com.olegTarasov.practice.modul05.task01_02.Room;
import com.olegTarasov.practice.modul05.task03.API;

import java.util.Date;


/**
 * Created by Олег on 01.03.2017.
 */
public class GoogleAPI implements API {
    public Room[] rooms = new Room[5];
    Date dateAvailableFrom = new Date();

    public GoogleAPI() {
        rooms[0] = new Room(6744, 280, 3, dateAvailableFrom, "Global", "Vizhnitsa");
        rooms[1] = new Room(1134, 240, 2, dateAvailableFrom, "Misto", "L'viv");
        rooms[2] = new Room(2333, 190, 2, dateAvailableFrom, "Global", "Vizhnitsa");
        rooms[3] = new Room(8823, 330, 3, dateAvailableFrom, "Misto", "L'viv");
        rooms[4] = new Room(6006, 280, 2, dateAvailableFrom, "Terminal", "Brovary");
    }

    public Room[] findRooms(int price, int persons, String city, String hotel) {
        int identyfier = 0;
        if ((rooms.equals(price)) && (rooms.equals(persons)) && (rooms.equals(city)) && (rooms.equals(hotel))) {
            identyfier = rooms.hashCode();
        }
        return new Room[identyfier];
    }
}
