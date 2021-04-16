package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class MaxTest {

    @Test
    public void WhenL1R2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void WhenL9R8Then9() {
        int left = 9;
        int right = 8;
        int result = Max.max(left, right);
        int expected = 9;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void WhenL724R724ThenAny() {
        int left = 724;
        int right = 724;
        int result = Max.max(left, right);
        int expected = 724;
        Assert.assertEquals(result, expected);
    }
}
