package com.twschool.practice;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuessNumberTest {
    private GuessNumber guessNumber;

    @Before
    public void setUp() {
        guessNumber = new GuessNumber("1 2 3 4");
    }

    @Test
    public void should_return_4A0B_when_answer_given_user_answer_is_same_with_game_answer() {
        String userAnswer = "1 2 3 4";

        String gameResult = guessNumber.answer(userAnswer);

        assertEquals("4A0B", gameResult);
    }

    @Test
    public void should_return_2A2B_when_answer_given_user_answer_and_game_answer_has_four_same_words_but_partly_same_positions() {
        String userAnswer = "3 2 1 4";

        String gameResult = guessNumber.answer(userAnswer);

        assertEquals("2A2B", gameResult);
    }

    @Test
    public void should_return_1A2B_when_answer_given_user_answer_and_game_answer_has_partly_same_words_and_partly_same_positions() {
        String userAnswer = "3 2 1 5";

        String gameResult = guessNumber.answer(userAnswer);

        assertEquals("1A2B", gameResult);
    }

    @Test
    public void should_return_0A4B_when_answer_given_user_answer_and_game_answer_has_four_same_words_but_different_positions() {
        String userAnswer = "3 4 1 2";

        String gameResult = guessNumber.answer(userAnswer);

        assertEquals("0A4B", gameResult);
    }

    @Test
    public void should_return_0A3B_when_answer_given_user_answer_and_game_answer_has_partly_same_words_and_partly_same_positions() {

    }

    @Test
    public void should_return_0A0B_when_answer_given_user_answer_and_game_answer_has_different_words_and_different_positions() {

    }
}
