package com.guessnumber.model;

public class Result {
    private final int value;

    public Result(int value) {
        this.value = value;
    }

    public int correctNumbers() {
        return value;
    }
}
