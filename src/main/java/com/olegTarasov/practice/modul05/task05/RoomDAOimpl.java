package com.olegTarasov.practice.modul05.task05;

import com.olegTarasov.practice.modul05.task01_02.Room;

import java.util.Arrays;
import java.util.Date;

/**
 * Created by Олег on 01.03.2017.
 */
public class RoomDAOimpl implements RoomDAO {
    Room[] roomDB = new Room[10];

    public Room save(Room room) {
        int count = getRoomsCount(roomDB);
        roomDB[count] = room;
        return room;
    }

    private int getRoomsCount(Room[] roomDB) {
        int count = 0;
        for (Room room : roomDB) {
            if (room != null) {
                count++;
            }
        }
        return count;
    }

    public boolean deleted(Room room) {
        for (int i = 0; i < roomDB.length; i++) {
            Room roomInDB = roomDB[i];
            if (room.equals(roomInDB)) {
                System.arraycopy(roomDB, i + 1, roomDB, i, roomDB.length - i - 1);
                roomDB[roomDB.length - 1] = null;
            }
        }
        return true;
    }

    public Room update(Room room) {
        Room updatedRoom = new Room();
        if (room != null) {
           updatedRoom = new Room(room.getId(),room.getPrice(),room.getPersons(),new Date(),room.getHotelName(),room.getCityName());
        } else
        {
            System.out.println("No room availeble");
        }
        return updatedRoom;
    }

    public Room findById(long id) {
        Room resultRoom = new Room();
        for (Room room : roomDB) {
            if (room != null && room.getId() == id) {
                resultRoom = room;
            }
        }
        return resultRoom;
    }

    @Override
    public String toString() {
        return "RoomDAOimpl{" +
                "roomDB=" + Arrays.toString(roomDB) +
                '}';
    }
}
