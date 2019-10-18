package org.improving.HauntedHouse;

import java.util.*;

public class Question {

    Map<String,String> rQ = new TreeMap<String,String>();

    public  Question() {
        rQ.put("Is pumpkin a fruit or a vegetable?", "fruit");
        rQ.put("At Halloween parties, what do we traditionally Bob for?", "apples");
        rQ.put("On which month do we celebrate Halloween?", "Halloween");
        rQ.put("Finish the Quote \"I see -- people\"", "dead");
        rQ.put("Guess which color I am thinking!", "green" );
        rQ.put("I am thinking of a number between 1 and 10, guess?", "8");
        rQ.put("questionA", "answer");
        rQ.put("questionB", "answer1");
        rQ.put("questionC", "answer2");
        rQ.put("questionD", "answer3");
        rQ.put("questionE", "answer4");
        rQ.put("questionF", "answer5");
    }

    public String getQuestion() {
        Random random = new Random();
        int randomNum = random.nextInt(rQ.size());
        return (String)(rQ.keySet().toArray())[ randomNum ] ;
    }

    public boolean validateAnswer(String question, String answer) {
        String answerStored = rQ.get("question");
        if(answer.equals(answerStored)) {
            return true;
        }
        return false;
    }




}
