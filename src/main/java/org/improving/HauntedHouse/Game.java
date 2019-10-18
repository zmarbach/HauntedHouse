package org.improving.HauntedHouse;

import org.improving.HauntedHouse.command.Command;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Game {
    private Player player;
    private List<Room> roomList;
    private Room firstRoom;
    private Command[] commands;

    public Game(Command[] commands, HauntedHouseBuilder hauntedHouseBuilder) {
        this.commands = commands;
        firstRoom = hauntedHouseBuilder.buildHauntedHouse();
        this.player = new Player(firstRoom);
    }


    public void run() {
        System.out.println("Game is running");
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public List<Room> getRoomList() {
        return roomList;
    }

    public void setRoomList(List<Room> roomList) {
        this.roomList = roomList;
    }

    public Room getFirstRoom() {
        return firstRoom;
    }

    public void setFirstRoom(Room firstRoom) {
        this.firstRoom = firstRoom;
    }

    public Command[] getCommands() {
        return commands;
    }

    public void setCommands(Command[] commands) {
        this.commands = commands;
    }
}
