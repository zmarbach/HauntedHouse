package org.improving.HauntedHouse;

import org.improving.HauntedHouse.command.Command;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

@Component
public class Game {
    private Player player;
    private List<Room> roomList;
    private Room firstRoom;
    private Command[] allCommands;
    private Scanner scanner = new Scanner(System.in);
    private int roomCount=0;

    public Game(Command[] allCommands, HauntedHouseBuilder hauntedHouseBuilder) {
        this.allCommands = allCommands;
        roomList = hauntedHouseBuilder.buildHauntedHouse();
        firstRoom = roomList.get(3);
        this.player = new Player(firstRoom);
    }


    public void run() {
        System.out.println("You have entered the Haunted House. Good Luck. You will need it.");
        boolean loop = true;
        while (loop) {
            roomCount++;
            System.out.print(">");
            var input = scanner.nextLine();
            var validCommand = this.getValidCommand(input);
            if(null != validCommand) {
                validCommand.execute(input, this);
            }
            else {
                System.out.println("Huh? Try again with a valid command.");
            }
        }
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

        public Command getValidCommand (String input) {
           return Stream.of(allCommands).filter(c -> c.isValid(input,this)).findFirst().orElse(null);
        }

        public int getRoomCount() {
            return roomCount;
        }
    }
