package com.twschool.practice;

public class GuessNumber {
    private String gameAnswer;

    public GuessNumber(String gameAnswer) {
        this.gameAnswer = gameAnswer;
    }

    public String answer(String userAnswer) {
        String[] gameAnswers = gameAnswer.split(" ");
        String[] userAnswers = userAnswer.split(" ");

        int sameWordsCount = 0;
        int samePositionsCount = 0;

        for (int i = 0; i < gameAnswers.length; i++) {
            for (int j = 0; j < userAnswers.length; j++) {
                if (gameAnswers[i].equals(userAnswers[j])) {
                    if (i == j) {
                        samePositionsCount++;
                    } else {
                        sameWordsCount++;
                    }
                }
            }
        }
        return samePositionsCount + "A" + sameWordsCount + "B";
    }
}
