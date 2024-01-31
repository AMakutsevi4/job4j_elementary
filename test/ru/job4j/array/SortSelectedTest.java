package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class SortSelectedTest {
    @Test
    public void whenSort() {
        int[] data = new int[]{3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[]{1, 2, 3, 4, 5};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSortthen() {
        int[] data = new int[]{3, 6, 9, 1, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[]{1, 3, 5, 6, 9};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSortthenrepublok() {
        int[] data = new int[]{13, 12, 4, 9, 99};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[]{4, 9, 12, 13, 99};
        Assert.assertArrayEquals(expected, result);
    }
}