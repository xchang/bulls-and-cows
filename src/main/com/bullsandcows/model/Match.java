package com.bullsandcows.model;

public class Match {
    private int bulls;
    private final int cows;


    public Match(int bulls, int cows) {
        this.bulls = bulls;
        this.cows = cows;
    }

    public int cows() {
        return cows;
    }

    public int bulls() {
        return bulls;
    }
}
