package com.twschool.practice;

public class GameResult {
    private int sameWordsCount = 0;
    private int samePositionsCount = 0;

    public int getSameWordsCount() {
        return sameWordsCount;
    }

    public int getSamePositionsCount() {
        return samePositionsCount;
    }

    public void setSameWordsCount(int sameWordsCount) {
        this.sameWordsCount = sameWordsCount;
    }

    public void setSamePositionsCount(int samePositionsCount) {
        this.samePositionsCount = samePositionsCount;
    }
}
