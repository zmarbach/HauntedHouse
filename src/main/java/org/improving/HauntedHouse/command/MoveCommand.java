package org.improving.HauntedHouse.command;

import org.improving.HauntedHouse.Game;
import org.improving.HauntedHouse.Question;
import org.improving.HauntedHouse.exception.LoseGameException;
import org.improving.HauntedHouse.exception.WinGameException;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class MoveCommand implements Command {
    private Question question;

    public MoveCommand(Question question) {
        this.question = question;
    }


    @Override
    public boolean isValid(String input, Game game) {
        return input.trim().equalsIgnoreCase("move");
    }

    @Override
    public void execute(String input, Game game) throws LoseGameException , WinGameException {
              if( game.getPlayer().getRoom().getMonster() !=null) {
                  int count = 0;
                  int totalCountchances = 3;
                  boolean playSuccessStatus =false;
                  do {
                      System.out.println("You cannot proceed to the next room until you have answered the question.");
                      System.out.println("You have " + totalCountchances + " chances to get the right answer.");
                      System.out.println("If you answer incorrectly all " + totalCountchances + " times, you will be defeated");

                      Question question = new Question();
                      String newQuestion = question.getQuestion();
                      System.out.println("\n " + newQuestion);

                      Scanner scanner = new Scanner(System.in);

                      var inputAnswer = scanner.nextLine();

                      boolean answerResult = question.validateAnswer(newQuestion, inputAnswer);
                      if (answerResult) {
                          System.out.println("You answered correctly .. Please proceed to next room ");
                          count = 4;
                          game.getPlayer().getRoom().setMonster(null);
                          playSuccessStatus=true;
                      } else {
                          System.out.println("You answered Wrong ....");
                          totalCountchances--;
                      }
                      count++;
                  } while (count < 3);

                  if(!playSuccessStatus) {
                      System.out.println("You failed in the game ....");
                      throw new LoseGameException();
                  }
              }

        game.getPlayer().setRoom(game.getRoomList().get(game.getRoomCount()));

    }
}



