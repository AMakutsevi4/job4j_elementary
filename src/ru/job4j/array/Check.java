package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean result = true;
        for (int index = 0; index < data.length; index++) {
            if (data[index] == data[index + 1]) {
                return result;
            } else {
                return false;
            }
        }
        return result;
    }
}
