package org.improving.HauntedHouse;

import org.improving.HauntedHouse.exception.LoseGameException;

import java.util.Random;

public class GrimReaper {

    public void kill() {
        Random r = new Random();
        var num = r.nextInt(100) + 1;
        if (num <= 30) {
            System.out.println("Surprise! The Grim Reaper has slain you.");
            System.out.println("He is known to betray others.. one would say that he does not SHOW LOYALTY." );
            System.out.print("\n");
            throw new LoseGameException();
        }
    }
}
