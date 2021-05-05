package ru.job4j.array;

public class Merge {
    public static int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int q = 0;
        for (int i = 0; i < left.length; i++) {
            rsl[i] = left[i];
            q++;
        }
        for (int j = 0; j < right.length; j++) {
            rsl[q++] = right[j];
        }
        return rsl;
    }
}
