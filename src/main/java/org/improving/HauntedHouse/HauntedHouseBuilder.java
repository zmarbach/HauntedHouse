package org.improving.HauntedHouse;

import org.improving.HauntedHouse.database.RoomRepository;
import org.springframework.stereotype.Component;

@Component
public class HauntedHouseBuilder {
    private RoomRepository roomRepository;
    //private Room room;

    public HauntedHouseBuilder(RoomRepository roomRepository) {
        this.roomRepository = roomRepository;
    }

    // List<Room> getRoomList() { return roomList }

    // public Room buildHauntedHouse() {
    // try {
    // List<Room> rooms = roomRepository.findByName("The Foyer");
    // roomList = rooms;
    // return roomList.get(0);
    // } catch (Exception e) {
    // e.printStackTrace();
    // }
    // return null;
}
