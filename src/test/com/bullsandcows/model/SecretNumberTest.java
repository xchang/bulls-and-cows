package com.bullsandcows.model;

import com.bullsandcows.exceptions.DuplicateNumberException;
import junit.framework.Assert;
import org.junit.Test;


public class SecretNumberTest {
    @Test
    public void should_be_able_to_tell_how_many_bulls() {
        SecretNumber secretNumber = new SecretNumber(1, 2, 3, 4);
        Match match = secretNumber.guess(1, 5, 6, 7);

        Assert.assertEquals(1, match.bulls());
        Assert.assertEquals(0, match.cows());
    }

    @Test
    public void should_be_able_to_tell_how_many_cows() {
        SecretNumber secretNumber = new SecretNumber(1, 2, 3, 4);
        Match match = secretNumber.guess(4, 3, 2, 1);

        Assert.assertEquals(0, match.bulls());
        Assert.assertEquals(4, match.cows());
    }

    @Test(expected = DuplicateNumberException.class)
    public void should_not_have_duplicate_number() {
        new SecretNumber(1, 1, 3, 4);
    }

    @Test
    public void should_be_able_to_tell_bulls_and_cows() {
        SecretNumber secretNumber = new SecretNumber(1, 2, 3, 4);
        Match match = secretNumber.guess(6, 2, 7, 8);

        Assert.assertEquals(1, match.bulls());
        Assert.assertEquals(0, match.cows());
    }

    @Test
    public void should_be_equal_for_two_same_secret_numbers() {
        SecretNumber firstNumber = new SecretNumber(1, 2, 3, 4);
        SecretNumber secondNumber = new SecretNumber(1, 2, 3, 4);

        Assert.assertEquals(firstNumber, secondNumber);
    }

    @Test
    public void should_not_be_equal_for_two_different_secret_numbers() {
        SecretNumber firstNumber = new SecretNumber(1, 2, 3, 4);
        SecretNumber secondNumber = new SecretNumber(5, 6, 7, 8);

        Assert.assertFalse(firstNumber.equals(secondNumber));
    }

    @Test
    public void should_not_be_equal_for_two_secret_numbers_with_different_orders() {
        SecretNumber firstNumber = new SecretNumber(1, 2, 3, 4);
        SecretNumber secondNumber = new SecretNumber(4, 3, 2, 1);

        Assert.assertFalse(firstNumber.equals(secondNumber));
    }
}
