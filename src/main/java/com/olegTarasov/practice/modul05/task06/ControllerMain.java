package com.olegTarasov.practice.modul05.task06;

import com.olegTarasov.practice.modul05.task01_02.Room;
import com.olegTarasov.practice.modul05.task04.GoogleAPI;
import com.olegTarasov.practice.modul05.task05.RoomDAOimpl;

import java.util.Arrays;
import java.util.Date;

/**
 * Created by Олег on 03.03.2017.
 */
public class ControllerMain {
    public static void main(String[] args) {
        Controller controller = new Controller();
        /*RoomDAOimpl roomDAOimpl = new RoomDAOimpl();

        for (int i = 0; i < 10; i++) {
            Room room = createRoom(i + 1, 100 * (i + 1), i + 1);
            roomDAOimpl.save(room);

        }

        roomDAOimpl.deleted(createRoom(2, 200, 2));
        roomDAOimpl.deleted(createRoom(5, 500, 5));

        for (int i = 0; i < 10; i++) {
            Room room = roomDAOimpl.findById(i + 1);
            if (room == null) {
                System.out.println("No room with such id");
            } else {
                System.out.println("Room from DB: " + room.getId());
            }
        }
*/
        //GoogleAPI googleAPI = new GoogleAPI();
        //System.out.println(Arrays.toString(googleAPI.findRooms(330, 3, "Misto", "L'viv")));
        //System.out.println(roomDAOimpl.toString());

        System.out.println(controller.requestRooms(280, 3, "Global", "Vizhnitsa"));


    }

    private static Room createRoom(int id, int price, int person) {
        Room room = new Room(id, price, person, new Date(), "Some", "Kiyiv");
        return room;
    }
}
