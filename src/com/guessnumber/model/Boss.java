package com.guessnumber.model;

public class Boss {
    private int[] answers;

    public Boss(int... answers) {
        this.answers = answers;
    }

    public Result judge(int... numbers) {
        int value = 0;
        for (int number : numbers) {
            for (int answer : answers) {
                if (answer == number) {
                    value ++;
                }
            }
        }
        return new Result(value);
    }
}
