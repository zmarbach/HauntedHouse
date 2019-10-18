package org.improving.HauntedHouse.command;

import org.improving.HauntedHouse.Game;
import org.improving.HauntedHouse.exception.LoseGameException;
import org.improving.HauntedHouse.exception.WinGameException;

public interface Command {
    public boolean isValid(String input, Game game);

    public void execute(String input, Game game) throws LoseGameException, WinGameException;
}
