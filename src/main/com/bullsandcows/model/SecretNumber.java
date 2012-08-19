package com.bullsandcows.model;

import com.bullsandcows.exceptions.DuplicateNumberException;

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

    public Match guess(int... guess) {
        int bulls = 0;
        int cows = 0;

        for (Integer number : numbers) {
            int i = numbers.indexOf(number);
            if(guess[i] == number) {
                bulls ++;
            } else if (numbers.contains(guess[i])) {
                cows ++;
            }
        }

        return new Match(bulls, cows);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SecretNumber that = (SecretNumber) o;

        if (!numbers.containsAll(that.numbers)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return numbers.hashCode();
    }
}
