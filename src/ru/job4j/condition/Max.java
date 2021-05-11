package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        return left >= right ? left : right;
    }

    public static void main(String[] args) {

        System.out.println(max(16, 19));
    }

    public static double add(double first, double second) {
        return Math.max(first, second);
    }

    public static double add(double first, double second, double third, double fourth) {
        double tmp = add(first, third);
        double out = add(second, fourth);
        return add(out, tmp);
    }
}