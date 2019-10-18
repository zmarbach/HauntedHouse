package org.improving.HauntedHouse;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext spring = new AnnotationConfigApplicationContext(SpringConfig.class);
        Game g = spring.getBean(Game.class);

        Scanner scanner = new Scanner(System.in);
        System.out.println("\n");
        System.out.println("WELCOME TO THE SPOOKY HAUNTED HOUSE!");
        System.out.println("Your objective is to get out of the Haunted House - ALIVE!");
        System.out.println("All you must simply do is pass through a series of rooms, correctly complete tasks, and exit the house.");
        System.out.println("There may or may not be monsters inside the house. (There definitely are.)");
        System.out.println("\n");
        System.out.println("Available commands are as follows: ");
        System.out.println("Look - 'Open your eyes you fool. Might be helpful..'");
        System.out.println("Move - 'Get the hell out of your current room.'");
        System.out.println("Attack - 'I hope you are smart enough to know what this is for.'");
        System.out.println("Exit - 'Guess you don't have the courage to stay in the house'");
        System.out.println("\n");
        System.out.println("Type 'start' to open the door and enter the house.");
        System.out.println("OR type 'wait' if you need a minute to gather yourself.");
        System.out.println("(Fair warning - you will be made fun of if you choose to wait.)");

        int count = 0;

        boolean loop = true;
        while (loop) {
            System.out.print("> ");
            var input = scanner.nextLine();
            if (input.equalsIgnoreCase("start")) {
                g.run();
                loop = false;
            }
            else if (input.equalsIgnoreCase("wait")) {
                count++;
                if (count == 1) {
                    System.out.println("I don't blame you.. I wouldn't want to enter either.");
                }
                else if (count == 2) {
                    System.out.println("C'mon scaredy-cat, get in there!");
                }
                else if (count == 3) {
                    System.out.println("Seriously.. this is getting ridiculous.. Now you are just embarrassing yourself.");
                }
                else if (count == 4) {
                    System.out.println("Alright - now we're going to push you in.");
                    g.run();
                }
            } else {
                System.out.println("Invalid input");
                System.out.println("Seriously.. just follow directions.");
            }
        }
    }
}

