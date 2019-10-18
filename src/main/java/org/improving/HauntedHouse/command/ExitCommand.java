package org.improving.HauntedHouse.command;

import org.improving.HauntedHouse.Game;
import org.improving.HauntedHouse.exception.GameExitException;
import org.springframework.stereotype.Component;

@Component
public class ExitCommand implements Command {

    @Override
    public boolean isValid(String input, Game game) {
        return input.equalsIgnoreCase("exit");
    }

    @Override
    public void execute(String input, Game game) throws GameExitException {
        System.out.println("Ah, well, it has been fun.");
        throw new GameExitException();
    }
}
