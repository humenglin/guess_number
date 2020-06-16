package com.twschool.practice;

import com.twschool.practice.enumeration.GuessNumberOutputEnum;

public class GuessNumber {
    private Game game;

    public GuessNumber() {
        this.game = new Game();
    }

    public GuessNumber(Game game) {
        this.game = game;
    }

    public Game getGame() {
        return this.game;
    }

    public String answer(String userAnswer) {
        GameResult gameResult = game.answer(userAnswer);
        return gameResult.getSamePositionsCount() + GuessNumberOutputEnum.same_word_and_same_position.getValue()
                + gameResult.getSameWordsCount() + GuessNumberOutputEnum.same_word_but_different_position.getValue();
    }


    public boolean check(String userAnswer) {
        return userAnswer.replace(" ", "").matches("(?!\\d*(\\d)\\d*\\1\\d*)\\d{4}");
    }
}
