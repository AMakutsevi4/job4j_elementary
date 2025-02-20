package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class MaxTest {

    @Test
    public void whenL1R2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenL9R8Then9() {
        int left = 9;
        int right = 8;
        int result = Max.max(left, right);
        int expected = 9;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenL724R724ThenAny() {
        int left = 724;
        int right = 724;
        int result = Max.max(left, right);
        int expected = 724;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenF10S9T7F6Then10() {
        double first = 10;
        double second = 9;
        double third = 6;
        double fourth = 0;
        double out = Max.max(first, second, third, fourth);
        double expected = 10;
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenF1S998T75F641Then998() {
        double first = 1;
        double second = 998;
        double third = 75;
        double fourth = 641;
        double out = Max.max(first, second, third, fourth);
        double expected = 998;
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenF25S321T998Then998() {
        double first = 25;
        double second = 321;
        double third = 998;
        double out = Max.max(first, second, third);
        double expected = 998;
        Assert.assertEquals(expected, out, 0.01);
    }
}
