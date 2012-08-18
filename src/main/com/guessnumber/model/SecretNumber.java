package com.guessnumber.model;

import com.guessnumber.exceptions.DuplicateNumberException;

import java.util.ArrayList;
import java.util.List;

public class SecretNumber {
    private List<Integer> numbers = new ArrayList<Integer>();

    public SecretNumber(int... numbers) throws DuplicateNumberException {
        for (int number : numbers) {
            if(this.numbers.contains(number)) {
                this.numbers.clear();
                throw new DuplicateNumberException();
            }

            this.numbers.add(number);
        }
    }

    public Result judge(int... guess) {
        int value = 0;
        for (int number : guess) {
            for (int answer : this.numbers) {
                if (answer == number) {
                    value ++;
                }
            }
        }
        return new Result(value);
    }
}
