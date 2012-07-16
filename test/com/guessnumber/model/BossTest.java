package com.guessnumber.model;

import org.junit.Assert;
import org.junit.Test;

public class BossTest {

    @Test
    public void should_be_able_to_tell_if_one_number_is_correct() {
        Boss boss = new Boss(1, 2, 3, 4);
        Result result = boss.judge(1, 5, 6, 7);

        Assert.assertEquals(1, result.correctNumbers());
    }

    @Test
    public void should_be_able_to_tell_if_four_number_is_correct() {
        Boss boss = new Boss(1, 2, 3, 4);
        Result result = boss.judge(4, 2, 3, 1);

        Assert.assertEquals(4, result.correctNumbers());
    }
}
