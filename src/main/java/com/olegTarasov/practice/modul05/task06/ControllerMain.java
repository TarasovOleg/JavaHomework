package com.olegTarasov.practice.modul05.task06;

import com.olegTarasov.practice.modul05.task01_02.Room;
import com.olegTarasov.practice.modul05.task04.BookingComAPI;
import com.olegTarasov.practice.modul05.task04.GoogleAPI;
import com.olegTarasov.practice.modul05.task04.TripAdvisorAPI;
import com.olegTarasov.practice.modul05.task05.RoomDAOimpl;

import java.util.Arrays;
import java.util.Date;

/**
 * Created by Олег on 03.03.2017.
 */
public class ControllerMain {

    public static void main(String[] args) {
        final int DEFAULTAPILENGTH = 5;
        Controller controller = new Controller();
        GoogleAPI googleAPI = new GoogleAPI();
        TripAdvisorAPI tripAdvisorAPI = new TripAdvisorAPI();
        BookingComAPI bookingComAPI = new BookingComAPI();
        RoomDAOimpl roomDAOimpl = new RoomDAOimpl();


        for (int i = 0; i < DEFAULTAPILENGTH; i++) {
            roomDAOimpl.save(bookingComAPI.getRooms()[i]);
        }

        System.out.println(roomDAOimpl.deleted(createRoom(9933, 300, 2)));
        //System.out.println(roomDAOimpl.toString());
        System.out.println(roomDAOimpl.update(createRoom(9933, 300, 2)).toString());
        System.out.println(roomDAOimpl.findById(8001).toString());

        /*roomDAOimpl.deleted(createRoom(2, 200, 2));
        roomDAOimpl.deleted(createRoom(5, 500, 5));*/

       /* for (int i = 0; i < 10; i++) {
            Room room = roomDAOimpl.findById(9933);
            if (room == null) {
                System.out.println("No room with such id");
            } else {
                System.out.println("Room from DB: " + room.getId());
            }
        }*/


        //System.out.println(Arrays.toString(controller.requestRooms(280, 3, "GGGG", "VVVV")));
        //System.out.println(Arrays.toString(controller.check(googleAPI,tripAdvisorAPI)));


    }

    private static Room createRoom(int id, int price, int person) {
        Room room = new Room(id, price, person, new Date(), "Some", "Kiyiv");
        return room;
    }
}
