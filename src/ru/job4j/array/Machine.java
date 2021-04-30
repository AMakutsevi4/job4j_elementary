package ru.job4j.array;

import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] rsl = new int[100];
        int size = 0;
        int surrender = money - price;

        for (int number : coins) {
            while (surrender >= number) {
                rsl[size] = number;
                size++;
                surrender = surrender - number;
            }
        }
        return Arrays.copyOf(rsl, size);
    }
}
