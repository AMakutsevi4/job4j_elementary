package ru.job4j.math;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {

    public static double amountTwoMethod(double first, double second) {
        return difference(first, second) + share(first, second);
    }

    public static double amountFourMethod(double first, double second) {
        return sum(first, second) + difference(first, second) +
                share(first, second) + multiply(first, second);
    }

    public static void main(String[] args) {
        System.out.println(amountTwoMethod(10, 5));
        System.out.println(amountFourMethod(96, 15));
    }

}
