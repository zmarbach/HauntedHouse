package org.improving.HauntedHouse;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext spring = new AnnotationConfigApplicationContext(SpringConfig.class);
        Game g = spring.getBean(Game.class);

        Scanner scanner = new Scanner(System.in);
        System.out.println("\n");
        System.out.println("Welcome to the Spooky Haunted House! Your objective is to get out of the Haunted House alive.");
        System.out.println("You must pass through a series of rooms to win the game. There may or may not be monsters inside the house. (There definitely are.)");
        System.out.println("\n");
        System.out.println("Available commands are as follows: ");
        System.out.println("Look - Open your eyes you fool. Might be helpful.");
        System.out.println("Move - Get the hell out of your current room");
        System.out.println("Attack - I hope you are smart enough to know what this is for.");
        System.out.println("\n");
        System.out.println("Type 'start' to open the door and begin the game. OR type 'wait' if you need a minute to gather yourself. (Fair warning - you will be made fun of if you choose to wait.)");


        int count = 0;

        boolean loop = true;
        while (loop) {
            var input = scanner.nextLine();
            if (input.equalsIgnoreCase("start")) {
                g.run();
            }
            else if (input.equalsIgnoreCase("wait")) {
                count++;
                if (count == 1) {
                    System.out.println("I don't blame you. I wouldn't want to play either.");
                }
                else if (count == 2) {
                    System.out.println("C'mon scaredy-cat, get in there.");
                }
                else if (count == 3) {
                    System.out.println("Alright, this is getting ridiculous. Now you are just embarrassing your self.");
                }
                else if (count == 4) {
                    System.out.println("Alright we are pushing you in.");
                    g.run();
                }
            } else {
                System.out.println("Invalid input. Seriously, just follow directions.");
            }
        }
    }
}

