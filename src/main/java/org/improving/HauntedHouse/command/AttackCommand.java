package org.improving.HauntedHouse.command;

import org.improving.HauntedHouse.Game;
import org.improving.HauntedHouse.exception.LoseGameException;
import org.improving.HauntedHouse.exception.WinGameException;
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
//        var monsterId = game.getPlayer().getRoom().getMonster().getId();

        //if having problems with single bar, try double bar
        while(monster.getName().equals("Monster1") || monster.getName().equals("Monster2") || monster.getName().equals("Monster3")) {
            System.out.println("Attack what?");
            return;
        }

        if (monster.getName().equals("Monster4")) {
            int x = random.nextInt(100) +1;
            int y = random.nextInt(100) +1;
            var playerStats = game.getPlayer();

            //monster attacking you
            if (x <= 50) {
                System.out.println("Huzzah! You have attacked " + monster.getName());
                monster.setDamageTaken(monster.getHitPoints() + 10);
                monster.setHitPoints(monster.getHitPoints() - monster.getDamageTaken());
                System.out.println("[Remaining HitPoints for " + monster.getName() + ": " + monster.getHitPoints() + "]");
                System.out.println("\n");
            } else {
                System.out.println("You tried to attack! But you missed... try again!");
                System.out.println("\n");
            }

            //you attacking the monster
            if (y <= 50) {
                System.out.println("Oh no! " + monster.getName() + " just attacked you!");
                playerStats.setDamageTaken(playerStats.getDamageTaken() + 10);
                playerStats.setHitPoints(playerStats.getHitPoints() - playerStats.getDamageTaken());
                System.out.println("[Your remaining HitPoints: " + playerStats.getHitPoints() + "]");
                System.out.println("\n");
            } else {
                System.out.println(monster.getName() + " tried to attack you! But he missed!");
                System.out.println("\n");
            }

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
}
