package com.olegTarasov.practice.modul05.task04;

import com.olegTarasov.practice.modul05.task01_02.Room;
import com.olegTarasov.practice.modul05.task03.API;

import java.util.Date;

/**
 * Created by Олег on 01.03.2017.
 */
public class BookingComAPI implements API {
    public Room[] rooms = new Room[5];
    Date dateAvailableFrom = new Date();

    public BookingComAPI() {
        rooms[0] = new Room(5345, 420, 4, dateAvailableFrom, "Privat", "Odessa");
        rooms[1] = new Room(9933, 300, 2, dateAvailableFrom, "Privat", "Odessa");
        rooms[2] = new Room(3434, 330, 3, dateAvailableFrom, "Lukomorye", "Odessa");
        rooms[3] = new Room(6655, 250, 2, dateAvailableFrom, "Lukomorye", "Odessa");
        rooms[4] = new Room(8001, 400, 4, dateAvailableFrom, "Lukomorye", "Odessa");
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
