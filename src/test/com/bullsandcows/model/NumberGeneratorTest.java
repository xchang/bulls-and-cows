package com.bullsandcows.model;

import junit.framework.Assert;
import org.junit.Test;

public class NumberGeneratorTest {
    @Test
    public void should_be_able_to_generate_secret_number() {
        NumberGenerator generator = new NumberGenerator();
        SecretNumber secretNumber = generator.generate();

        Assert.assertNotNull(secretNumber);
    }

    @Test
    public void should_be_able_to_generate_different_secret_number() {
        NumberGenerator generator = new NumberGenerator();
        SecretNumber firstNumber = generator.generate();
        SecretNumber secondNumber = generator.generate();

        Assert.assertNotSame(firstNumber, secondNumber);
    }
}
