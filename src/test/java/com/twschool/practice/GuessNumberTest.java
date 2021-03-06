package com.twschool.practice;

import org.junit.Test;

import static org.junit.Assert.*;

public class GuessNumberTest {

    @Test
    public void should_return_4A0B_when_answer_given_user_answer_is_same_with_game_answer() {
        String userAnswer = "1 2 3 4";
        GuessNumber guessNumber = new GuessNumber(new Game("1 2 3 4"));

        String gameResult = guessNumber.answer(userAnswer);

        assertEquals("4A0B", gameResult);
    }

    @Test
    public void should_return_2A2B_when_answer_given_user_answer_and_game_answer_has_four_same_words_but_partly_same_positions() {
        String userAnswer = "3 2 1 4";
        GuessNumber guessNumber = new GuessNumber(new Game("1 2 3 4"));

        String gameResult = guessNumber.answer(userAnswer);

        assertEquals("2A2B", gameResult);
    }

    @Test
    public void should_return_1A2B_when_answer_given_user_answer_and_game_answer_has_partly_same_words_and_partly_same_positions() {
        String userAnswer = "3 2 1 5";
        GuessNumber guessNumber = new GuessNumber(new Game("1 2 3 4"));

        String gameResult = guessNumber.answer(userAnswer);

        assertEquals("1A2B", gameResult);
    }

    @Test
    public void should_return_0A4B_when_answer_given_user_answer_and_game_answer_has_four_same_words_but_different_positions() {
        String userAnswer = "3 4 1 2";
        GuessNumber guessNumber = new GuessNumber(new Game("1 2 3 4"));

        String gameResult = guessNumber.answer(userAnswer);

        assertEquals("0A4B", gameResult);
    }

    @Test
    public void should_return_0A3B_when_answer_given_user_answer_and_game_answer_has_partly_same_words_and_partly_same_positions() {
        String userAnswer = "3 4 5 2";
        GuessNumber guessNumber = new GuessNumber(new Game("1 2 3 4"));

        String gameResult = guessNumber.answer(userAnswer);

        assertEquals("0A3B", gameResult);
    }

    @Test
    public void should_return_0A0B_when_answer_given_user_answer_and_game_answer_has_different_words_and_different_positions() {
        String userAnswer = "7 5 0 9";
        GuessNumber guessNumber = new GuessNumber(new Game("1 2 3 4"));

        String gameResult = guessNumber.answer(userAnswer);

        assertEquals("0A0B", gameResult);
    }

    @Test
    public void should_return_game_answer_when_init_guess_number() {
        GuessNumber guessNumber = new GuessNumber();
        String gameAnswer = guessNumber.getGame().getGameAnswer();

        assertEquals(true, gameAnswer.replace(" ", "").matches("(?!\\d*(\\d)\\d*\\1\\d*)\\d{4}"));
    }

    @Test
    public void should_return_true_when_check_userAnswer_given_a_correct_userAnswer() {
        String userAnswer = "7 5 0 9";
        GuessNumber guessNumber = new GuessNumber();

        boolean checkFlag = guessNumber.check(userAnswer);

        assertTrue(checkFlag);
    }

    @Test
    public void should_return_false_when_check_userAnswer_given_a_userAnswer_has_no_enough_words() {
        String userAnswer = "7 5 0";
        GuessNumber guessNumber = new GuessNumber();

        boolean checkFlag = guessNumber.check(userAnswer);

        assertFalse(checkFlag);
    }

    @Test
    public void should_return_false_when_check_userAnswer_given_a_userAnswer_has_word_more_than_9() {
        String userAnswer = "7 5 0 10";
        GuessNumber guessNumber = new GuessNumber();

        boolean checkFlag = guessNumber.check(userAnswer);

        assertFalse(checkFlag);
    }

    @Test
    public void should_return_false_when_check_userAnswer_given_a_userAnswer_has_word_less_than_0() {
        String userAnswer = "-1 5 0 1";
        GuessNumber guessNumber = new GuessNumber();

        boolean checkFlag = guessNumber.check(userAnswer);

        assertFalse(checkFlag);
    }

    @Test
    public void should_return_false_when_check_userAnswer_given_a_userAnswer_contains_same_word() {
        String userAnswer = "1 5 0 1";
        GuessNumber guessNumber = new GuessNumber();

        boolean checkFlag = guessNumber.check(userAnswer);

        assertFalse(checkFlag);
    }
}
