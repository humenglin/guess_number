package com.twschool.practice;

public class GuessNumber {
    private String gameAnswer;

    public GuessNumber(String gameAnswer) {
        this.gameAnswer = gameAnswer;
    }

    public String answer(String userAnswer) {
        if (gameAnswer.equals(userAnswer)) {
            return "4A0B";
        }
        return "2A2B";
    }
}
