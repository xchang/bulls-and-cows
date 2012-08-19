package com.bullsandcows.model;

import com.bullsandcows.exceptions.DuplicateNumberException;
import org.junit.Assert;
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
}
