package org.improving.HauntedHouse.command;

import org.improving.HauntedHouse.Game;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class AttackCommand implements Command {
    Random random = new Random();

    @Override
    public boolean isValid(String input, Game game) {
        return input.equalsIgnoreCase("attack");
    }

    @Override
    public void execute(String input, Game game) {
        var monster = game.getPlayer().getRoom().getMonster();
        var monsterId = game.getPlayer().getRoom().getMonster().getId();

        //if having problems with single bar, try double bar
        while(monsterId.equals(1 | 2 | 3)) {
            System.out.println("Attack what?");
            return;
        }

        if (monsterId.equals(4)) {
            int x = random.nextInt(100) +1;
            int y = random.nextInt(100) +1;
            var stats = game.getPlayer();

            if (x <= 50) {
                System.out.println("Huzzah! You have ");
            }
        }

    }
}
