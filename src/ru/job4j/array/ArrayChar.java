package ru.job4j.array;

public class ArrayChar {

    public static boolean startsWith(char[] word, char[] pref) {
        boolean result = true;
        for (int i = 0; i < pref.length; i++) {
            if (pref[i + 1] == word[i + 1]) {
                return result;
            } else {
                return false;
            }

        }
        return result;
    }
}
