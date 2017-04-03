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
    public static final int DEFAULTAPILENGTH = 5;
    private API[] apis = new API[3];

    public Controller() {
        apis[0] = new GoogleAPI();
        apis[1] = new TripAdvisorAPI();
        apis[2] = new BookingComAPI();
    }

    public  Room[] requestRooms(int price, int persons, String city, String hotel) {
        int matchedRoomsLength = 0;
        for (API api : apis) {
            matchedRoomsLength += api.findRooms(price, persons, city, hotel).length;
        }
        Room[] matchedRooms = new Room[matchedRoomsLength];
        Room[] requestRooms_1 = apis[0].findRooms(price, persons, city, hotel);
        Room[] requestRooms_2 = apis[1].findRooms(price, persons, city, hotel);
        Room[] requestRooms_3 = apis[2].findRooms(price, persons, city, hotel);
        int counter = 0;
        for (Room aRequestRooms_1 : requestRooms_1) {
            matchedRooms[counter++] = aRequestRooms_1;
        }
        for (Room aRequestRooms_2 : requestRooms_2) {
            matchedRooms[counter++] = aRequestRooms_2;
        }
        for (Room aRequestRooms_3 : requestRooms_3) {
            matchedRooms[counter++] = aRequestRooms_3;
        }
        return matchedRooms;
    }


    public Room[] check(API api1, API api2) {
        int counter = 0;
        for (int i = 0; i < DEFAULTAPILENGTH; i++) {
            for (int j = 0; j < DEFAULTAPILENGTH; j++) {
                if (api1.getRooms()[i].equals(api2.getRooms()[j])) {
                    counter += 2;
                }
            }
        }
        Room[] resultArray = new Room[counter];
        int resultCounter = 0;
        for (int i = 0; i < DEFAULTAPILENGTH; i++) {
            for (int j = 0; j < DEFAULTAPILENGTH; j++) {
                if (api1.getRooms()[i].equals(api2.getRooms()[j])) {
                    resultArray[resultCounter++] = api1.getRooms()[i];
                    resultArray[resultCounter++] = api2.getRooms()[j];
                }
            }
        }
        return resultArray;
    }

    @Override
    public String toString() {
        return "Controller{" +
                "apis=" + Arrays.toString(apis) + '\n' +
                '}';
    }
}
