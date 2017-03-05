package com.olegTarasov.practice.modul05.task05;

import com.olegTarasov.practice.modul05.task01_02.Room;

import java.util.Arrays;

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

        for (int i = 0; i < roomDB.length - 1; i++) {//поставил длинну -1 в отличие от вебинара
            Room roomInDB = roomDB[i];
            if (room.equals(roomInDB)) {
                System.arraycopy(roomDB, i + 1, roomDB, i, roomDB.length - i - 1);
                roomDB[roomDB.length - 1] = null;
            }
        }
        return false;
    }

    public Room update(Room room) {
        return null;
    }

    public Room findById(long id) {
        for (Room room: roomDB) {
            if (room.getId() == id){
                return room;
            }

        }

        return null;
    }

    @Override
    public String toString() {
        return "RoomDAOimpl{" +
                "roomDB=" + Arrays.toString(roomDB) +
                '}';
    }
}
