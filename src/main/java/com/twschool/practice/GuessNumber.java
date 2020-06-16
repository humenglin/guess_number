package com.twschool.practice;

import com.twschool.practice.enumeration.GuessNumberOutputEnum;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class GuessNumber {
    private String gameAnswer;

    public GuessNumber() {}

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
        return samePositionsCount + GuessNumberOutputEnum.same_word_and_same_position.getValue()
                + sameWordsCount + GuessNumberOutputEnum.same_word_but_different_position.getValue();
    }

    public String generate() {
        String gameAnswer = "";
        Set<Integer> set = new HashSet<Integer>();
        while (gameAnswer.length() < 4) {
            int temp = new Random().nextInt(10);
            if(!set.contains(temp)) {
                set.add(temp);
                gameAnswer += temp;
            }
        }
        return gameAnswer.replaceAll("(.{1})", "$1 ").trim();
    }
}
