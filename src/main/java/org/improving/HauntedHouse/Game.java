package org.improving.HauntedHouse;

import org.improving.HauntedHouse.command.Command;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Game {
    private Player player;
    private List<Room> room;
    private Room firstRoom;
    private Command[] commands;


    public void run() {
        System.out.println("Game is running");
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public List<Room> getRoom() {
        return room;
    }

    public void setRoom(List<Room> room) {
        this.room = room;
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
