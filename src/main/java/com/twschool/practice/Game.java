package com.twschool.practice;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Game {
    private String gameAnswer;
    private GameResult gameResult = new GameResult();

    public Game() {
        this.gameAnswer = generate();
    }

    public Game(String gameAnswer) {
        this.gameAnswer = gameAnswer;
    }

    public String getGameAnswer() {
        return this.gameAnswer;
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

    public GameResult answer(String userAnswer) {
        String[] gameAnswers = gameAnswer.split(" ");
        String[] userAnswers = userAnswer.split(" ");

        for (int i = 0; i < gameAnswers.length; i++) {
            for (int j = 0; j < userAnswers.length; j++) {
                if (gameAnswers[i].equals(userAnswers[j])) {
                    if (i == j) {
                        this.gameResult.setSamePositionsCount(this.gameResult.getSamePositionsCount() + 1);
                    } else {
                        this.gameResult.setSameWordsCount(this.gameResult.getSameWordsCount() + 1);
                    }
                }
            }
        }
        return this.gameResult;
    }
}
