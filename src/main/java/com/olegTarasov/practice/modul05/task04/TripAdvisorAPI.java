package com.olegTarasov.practice.modul05.task04;

import com.olegTarasov.practice.modul05.task01_02.Room;
import com.olegTarasov.practice.modul05.task03.API;

import java.util.Date;

/**
 * Created by Олег on 01.03.2017.
 */
public class TripAdvisorAPI implements API {
    public Room[] rooms = new Room[5];
    Date dateAvailableFrom = new Date();

    public TripAdvisorAPI() {
        rooms[0] = new Room(7655, 220, 2, dateAvailableFrom, "GGGG", "VVVV");
        rooms[1] = new Room(9823, 230, 2, dateAvailableFrom, "GGGG", "VVVV");
        rooms[2] = new Room(8823, 330, 3, dateAvailableFrom, "MMMM", "LLLL");
        rooms[3] = new Room(4785, 280, 3, dateAvailableFrom, "GGGG", "VVVV");
        rooms[4] = new Room(1134, 240, 2, dateAvailableFrom, "MMMM", "LLLL");
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
