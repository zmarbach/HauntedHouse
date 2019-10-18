package org.improving.HauntedHouse.command;

import org.improving.HauntedHouse.Game;

public class LookCommand implements Command {
    @Override
    public boolean isValid(String input, Game game) {
        return input.trim().equalsIgnoreCase("look");
    }

    @Override
    public void execute(String input, Game game) {
        var currentRoom = game.getPlayer().getRoom().getName();

        System.out.println("You are currently in " + currentRoom);

    }
}
