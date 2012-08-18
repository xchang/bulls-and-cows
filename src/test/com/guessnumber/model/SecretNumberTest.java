package com.guessnumber.model;

import com.guessnumber.exceptions.DuplicateNumberException;
import org.junit.Assert;
import org.junit.Test;

public class SecretNumberTest {

    @Test
    public void should_be_able_to_tell_if_one_number_is_correct() {
        SecretNumber secretNumber = new SecretNumber(1, 2, 3, 4);
        Result result = secretNumber.judge(1, 5, 6, 7);

        Assert.assertEquals(1, result.correctNumbers());
    }

    @Test
    public void should_be_able_to_tell_if_four_number_is_correct() {
        SecretNumber secretNumber = new SecretNumber(1, 2, 3, 4);
        Result result = secretNumber.judge(4, 2, 3, 1);

        Assert.assertEquals(4, result.correctNumbers());
    }

    @Test(expected = DuplicateNumberException.class)
    public void should_not_have_duplicate_number() {
        new SecretNumber(1, 1, 3, 4);
    }
}
