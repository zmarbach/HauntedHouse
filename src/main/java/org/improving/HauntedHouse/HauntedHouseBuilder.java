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


    //method
    public List<Room> buildHauntedHouse() {
        try {
            return roomList = roomRepository.findAll();
//            for(Room room : rooms) {
//                System.out.println(room.getName());
//                System.out.println(room.getMonster().getName());
//                if (room.getExit()!= null) {
//                    System.out.println(room.getExit().getName());
//                }
//            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    //getter
    List<Room> getRoomList() {
        return roomList;
    }
}
