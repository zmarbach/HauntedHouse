package org.improving.HauntedHouse.command;

import org.improving.HauntedHouse.Game;

public interface Command {
    public boolean isValid(String input, Game game);

    public void execute(String input, Game game);
}
