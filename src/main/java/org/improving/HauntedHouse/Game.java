package org.improving.HauntedHouse;

import org.improving.HauntedHouse.command.Command;
import org.improving.HauntedHouse.exception.GameExitException;
import org.improving.HauntedHouse.exception.LoseGameException;
import org.improving.HauntedHouse.exception.WinGameException;
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
            System.out.print(">");
            var input = scanner.nextLine();
            var validCommand = this.getValidCommand(input);
            try {
                if (null != validCommand) {
                    validCommand.execute(input, this);
                } else {
                    System.out.println("Huh? Try again with a valid command.");
                }
            }
            catch (WinGameException winEx) {
                    System.out.println("Impressive - you have triumphed! Happy Halloween!");
                    loop = false;
                }
            catch (LoseGameException winEx) {
                    System.out.println("You lost the game. Nice try...not. In the interest of TALKING STRAIGHT, you really sucked that game. Better luck next time.");
                    loop = false;
            }
            catch (GameExitException exitEx) {
                System.out.println("Ah, well, it has been fun. At least you CONFRONTED REALITY.");
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
    }
