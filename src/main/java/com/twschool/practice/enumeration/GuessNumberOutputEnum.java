package com.twschool.practice.enumeration;

public enum GuessNumberOutputEnum {
    same_word_and_same_position("A"),
    same_word_but_different_position("B");

    private String value;

    GuessNumberOutputEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
