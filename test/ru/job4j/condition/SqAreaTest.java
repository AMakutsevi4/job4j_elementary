package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;


public class SqAreaTest {

    @Test
    public void whenP9K3Square3() {
        double expected = 3.79;
        int p = 9;
        double k = 3;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP12K8Square3() {
        double expected = 3.55;
        int p = 12;
        double k = 8;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }
    @Test
    public void whenP19K2Square20() {
        double expected = 20.05;
        int p = 19;
        double k = 2;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }
}
