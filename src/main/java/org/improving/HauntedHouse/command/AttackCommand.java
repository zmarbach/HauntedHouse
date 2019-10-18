package org.improving.HauntedHouse.command;

import org.improving.HauntedHouse.Game;
import org.improving.HauntedHouse.exception.LoseGameException;
import org.improving.HauntedHouse.exception.WinGameException;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class AttackCommand implements Command {
    Random random = new Random();
    private String commandName = "attack";

    @Override
    public boolean isValid(String input, Game game) {
        return input.equalsIgnoreCase("attack");
    }

    @Override
    public void execute(String input, Game game) {
        var monster = game.getPlayer().getRoom().getMonster();

        while(monster.getName().equalsIgnoreCase("Annabelle's Ghost") || monster.getName().equalsIgnoreCase("The Night King") || monster.getName().equalsIgnoreCase("The Nun")) {
            System.out.println("Attack what?");
            return;
        }

        if (monster.getName().equalsIgnoreCase("La Llorona")) {
            int x = random.nextInt(100) +1;
            int y = random.nextInt(100) +1;
            var playerStats = game.getPlayer();

            //monster attacking you
            if (x <= 50) {
                System.out.println("Huzzah! You have attacked " + monster.getName());
                monster.setHitPoints(monster.getHitPoints() - monster.getDamageTaken());
                System.out.println("[Remaining HitPoints for " + monster.getName() + ": " + monster.getHitPoints() + "]");
                System.out.println("");
            } else {
                System.out.println("You tried to attack! But you missed... try again!");
                System.out.println("");
            }

            //you attacking the monster
            if (y <= 75) {
                System.out.println("Oh no! " + monster.getName() + " just attacked you!");
                playerStats.setHitPoints(playerStats.getHitPoints() - playerStats.getDamageTaken());
                System.out.println("[Your remaining HitPoints: " + playerStats.getHitPoints() + "]");
            } else {
                System.out.println(monster.getName() + " tried to attack you! But she missed!");
            }

            //what will happen when HP reaches 0
            var playerHP = playerStats.getHitPoints();
            var monsterHP = monster.getHitPoints();

            if (monsterHP <= 0) {
                System.out.println("Congrats! You have just killed " + monster.getName());
                System.out.println("You may live... for now..");
                game.getPlayer().getRoom().setMonster(null);
                throw new WinGameException();
            } else if (playerHP <= 0) {
                System.out.println("Dang... " + monster.getName() + " just killed you.. it was nice watching you.. ");
                throw new LoseGameException();
            }
        }

    }

    @Override
    public String getNameOfCommand() {
        return commandName;
    }
}
