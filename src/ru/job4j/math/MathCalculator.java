package ru.job4j.math;

public class MathCalculator {

    public static double amountTwoMethod(double first, double second) {
        return MathFunction.difference(first, second) + MathFunction.share(first, second);
    }

    public static double amountFourMethod(double first, double second) {
        return MathFunction.sum(first, second) + MathFunction.difference(first, second) + MathFunction.share(first, second) + MathFunction.multiply(first, second);
    }

    public static void main(String[] args) {
        System.out.println(amountTwoMethod(10, 5));
        System.out.println(amountFourMethod(96, 15));
    }

}
