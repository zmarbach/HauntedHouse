package org.improving.HauntedHouse.command;

import org.improving.HauntedHouse.Game;
import org.springframework.stereotype.Component;

@Component
public class LookCommand implements Command {
    private String commandName = "look";

    @Override
    public boolean isValid(String input, Game game) {
        return input.trim().equalsIgnoreCase("look");
    }

    @Override
    public void execute(String input, Game game) {
        var currentRoom = game.getPlayer().getRoom().getName();
        System.out.println("You are currently in " + currentRoom);

    }
    @Override
    public String getNameOfCommand() {
        return commandName;
    }
}
