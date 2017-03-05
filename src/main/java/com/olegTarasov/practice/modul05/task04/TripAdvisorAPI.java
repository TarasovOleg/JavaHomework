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
        rooms[0] = new Room(7655, 220, 2, dateAvailableFrom, "Druzhba", "Kiyv");
        rooms[1] = new Room(9823, 230, 2, dateAvailableFrom, "Evropa", "Kharkov");
        rooms[2] = new Room(4511, 300, 3, dateAvailableFrom, "Druzhba", "Kiyv");
        rooms[3] = new Room(4785, 280, 3, dateAvailableFrom, "Ukraina", "Gorlovka");
        rooms[4] = new Room(2235, 320, 3, dateAvailableFrom, "Evropa", "Kharkov");
    }

    public Room[] findRooms(int price, int persons, String city, String hotel) {
        int identyfier = 0;
        if ((rooms.equals(persons)) || (rooms.equals(price)) || (rooms.equals(city)) || (rooms.equals(hotel))) {
            identyfier = rooms.hashCode();
        }
        return new Room[identyfier];
    }
}
