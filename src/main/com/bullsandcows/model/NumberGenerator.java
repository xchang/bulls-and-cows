package com.bullsandcows.model;

import java.util.Arrays;
import java.util.Random;

public class NumberGenerator {
    public SecretNumber generate() {
        Random random = new Random();

        int[] numbers = new int[4];
        int i = 0;
        while(i <= 3) {
            int seed = random.nextInt(10);
            if (!hasSameNumber(numbers, seed)) {
                numbers[i] = seed;
                i++;
            }
        }

        return new SecretNumber(numbers);
    }

    private boolean hasSameNumber(int[] numbers, int seed) {
        int[] temp = numbers.clone();
        Arrays.sort(temp);
        int index = Arrays.binarySearch(temp, seed);

        return index >= 0;
    }

}
