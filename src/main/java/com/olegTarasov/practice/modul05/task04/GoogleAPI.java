package com.olegTarasov.practice.modul05.task04;

import com.olegTarasov.practice.modul05.task01_02.Room;
import com.olegTarasov.practice.modul05.task03.API;

import java.util.Date;


/**
 * Created by Олег on 01.03.2017.
 */
public class GoogleAPI implements API {
    Room[] rooms = new Room[5];


    public GoogleAPI() {
        Date dateAvailableFrom = new Date();
        rooms[0] = new Room(6744, 280, 3, dateAvailableFrom, "Global", "Vizhnitsa");
        rooms[1] = new Room(1134, 240, 2, dateAvailableFrom, "Misto", "L'viv");
        rooms[2] = new Room(2333, 190, 2, dateAvailableFrom, "Global", "Vizhnitsa");
        rooms[3] = new Room(8823, 330, 3, dateAvailableFrom, "Misto", "L'viv");
        rooms[4] = new Room(6006, 280, 2, dateAvailableFrom, "Terminal", "Brovary");
    }

    public Room[] findRooms(int price, int persons, String city, String hotel) {
        Room testRoom = new Room(0, price, persons, null, city, hotel);
        int counter = 0;
        for (int i = 0; i < rooms.length; i++) {
            if (testRoom.equals(rooms[i])) {
                counter++;
            }
        }
        Room[] bingoRooms = new Room[counter];
        for (int i = 0; i < rooms.length; i++) {
            for (int j = 0; j < bingoRooms.length; j++) {
                if (testRoom.equals(rooms[i])) {
                    bingoRooms[j] = rooms[i];
                }
            }
        }
        return bingoRooms;
    }

    public Room[] getRooms() {

        return rooms;
    }
}
