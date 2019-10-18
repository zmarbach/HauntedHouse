package org.improving.HauntedHouse;

import org.improving.HauntedHouse.command.Command;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Scanner;

@Component
public class Game {
    private Player player;
    private List<Room> roomList;
    private Room firstRoom;
    private Command[] allCommands;
    private Scanner scanner = new Scanner(System.in);

    public Game(Command[] allCommands, HauntedHouseBuilder hauntedHouseBuilder) {
        this.allCommands = allCommands;
        firstRoom = hauntedHouseBuilder.buildHauntedHouse();
        this.player = new Player(firstRoom);
    }

    public Player getPlayer () {
        return player;
    }

    public void setPlayer (Player player){
        this.player = player;
    }

    public List<Room> getRoomList () {
        return roomList;
    }

    public void setRoomList (List < Room > roomList) {
        this.roomList = roomList;
    }

    public Room getFirstRoom () {
        return firstRoom;
    }

    public void setFirstRoom (Room firstRoom){
        this.firstRoom = firstRoom;
    }

    public Command[] getAllCommands () {
        return allCommands;
    }

    public void setAllCommands (Command[]allCommands){
        this.allCommands = allCommands;
    }


    public void run() {

        boolean loop = true;
        while (loop) {
            System.out.println("You have entered the Haunted House. Good Luck. You will need it.");
            System.out.println(">");
            var input = scanner.nextLine();

//        for(var command: allCommands)
//        if(command.isValid(input, this);

        }
    }


    }
