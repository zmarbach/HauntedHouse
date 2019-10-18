package org.improving.HauntedHouse;

import org.improving.HauntedHouse.database.RoomRepository;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class HauntedHouseBuilder {
    private RoomRepository roomRepository;
    private List<Room> roomList = new ArrayList<>();

    //constructor
    public HauntedHouseBuilder(RoomRepository roomRepository) {
        this.roomRepository = roomRepository;
    }

    //getter
    List<Room> getRoomList() {
        return roomList;
    }

    //method
    public Room buildHauntedHouse() {
        try {
            List<Room> rooms = roomRepository.findByName("Room1");
            roomList = rooms;
            return roomList.get(0);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
