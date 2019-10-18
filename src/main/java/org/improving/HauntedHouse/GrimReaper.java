package org.improving.HauntedHouse;

import org.improving.HauntedHouse.exception.LoseGameException;

import java.util.Random;

public class GrimReaper {

    private void kill() {
        Random r = new Random();
        var num = r.nextInt(100) + 1;
        if (num <= 50) {
            System.out.println("Surprise! The Grim Reaper killed you. He is always lurking.");
            throw new LoseGameException();
        }
    }
}
