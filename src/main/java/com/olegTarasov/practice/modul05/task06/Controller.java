package com.olegTarasov.practice.modul05.task06;

import com.olegTarasov.practice.modul05.task01_02.Room;
import com.olegTarasov.practice.modul05.task03.API;
import com.olegTarasov.practice.modul05.task04.BookingComAPI;
import com.olegTarasov.practice.modul05.task04.GoogleAPI;
import com.olegTarasov.practice.modul05.task04.TripAdvisorAPI;

import java.util.Arrays;

/**
 * Created by Олег on 01.03.2017.
 */
public class Controller {
    public API[] apis = new API[3];

    public Controller() {
        apis[0] = new GoogleAPI();
        apis[1] = new TripAdvisorAPI();
        apis[2] = new BookingComAPI();
    }

    public Room[] requestRooms(int price, int persons, String city, String hotel) {
        int bingoRoomsLength = 0;
        Room[] bingoRooms = new Room[bingoRoomsLength];
        for (int i = 0; i < apis.length - 1; i++) {
            if (apis[i].findRooms(price, persons, city, hotel) == requestRooms(price, persons, city, hotel)) {
                bingoRoomsLength++;
                System.arraycopy(apis, i, bingoRooms, i, apis.length);
            }
        }

        return  bingoRooms;
    }


    //private Room[] check(API api1, API api2)


}
