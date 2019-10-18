package org.improving.HauntedHouse;

import org.springframework.stereotype.Component;

import java.util.*;
@Component
public class Question {

    Map<String,String> rQ = new TreeMap<String,String>();

    public  Question() {
        rQ.put("Is pumpkin a fruit or a vegetable?", "fruit");
        rQ.put("At Halloween parties, what do we traditionally Bob for?", "apples");
        rQ.put("On which month do we celebrate Halloween?", "October");
        rQ.put("Finish the Quote \"I see -- people\"", "dead");
        rQ.put("Guess which color I am thinking!", "green" );
        rQ.put("I am thinking of a number between 1 and 10, guess?", "8");
        rQ.put("Name the author responsible for creating Frankenstein", "Mary Shelly");
        rQ.put("Name the FIRST very important rule for when caring for a Gremlin", "Don't get them wet");
        rQ.put("In The Nightmare Before Christmas, Jack Skellington is the ___ of Halloween Town", "pumpkin king");
        rQ.put("Which mode of transportation is most preferred by witches?", "flying broom");
        rQ.put("What is Red Rum backwards?", "murder");
        rQ.put("In which state did the chainsaw massacre occur?", "Texas");
    }

    public String getQuestion() {
        Random random = new Random();
        int randomNum = random.nextInt(rQ.size());
        return (String)(rQ.keySet().toArray())[ randomNum ] ;
    }

    public boolean validateAnswer(String question, String answer) {
        String answerStored = rQ.get(question);
        if(answer.trim().equalsIgnoreCase(answerStored)) {
            return true;
        }
        return false;
    }

}
