package com.olegTarasov.practice.modul05.task05;

import com.olegTarasov.practice.modul05.task01_02.Room;

/**
 * Created by Олег on 01.03.2017.
 */
public interface RoomDAO {

    public Room save(Room room);
    public boolean deleted (Room room);
    public Room update (Room room);
    public Room findById(long id);

}
