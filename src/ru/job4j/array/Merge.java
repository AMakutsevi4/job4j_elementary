package ru.job4j.array;

public class Merge {
    public static int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int i = 0, j = 0;
        for (int q = 0; q < rsl.length; q++) {

            if (i > left.length - 1) {
                int a = right[j];
                rsl[q] = a;
                j++;
            } else if (j > right.length - 1) {
                int a = left[i];
                rsl[q] = a;
                i++;
            } else if (left[i] < right[j]) {
                int a = left[i];
                rsl[q] = a;
                i++;
            } else {
                int b = right[j];
                rsl[q] = b;
                j++;
            }
        }
        return rsl;
    }
}


