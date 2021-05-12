package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        return left >= right ? left : right;
    }

    public static void main(String[] args) {

        System.out.println(max(16, 19));
    }

    public static double max(double first, double second) {

        return first >= second ? first : second;
    }

    public static double max(double first, double second, double third) {
        return max(first, max(second, third));
    }

    public static double max(double first, double second, double third, double fourth) {
        return max(max(first, second), max(third, fourth));
    }
}