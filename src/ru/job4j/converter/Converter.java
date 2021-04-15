package ru.job4j.converter;

public class Converter {

    public static int rubleTOeuro(int value) {
       return value / 70;
    }

    public static int rubleToDollar(int value) {
        return value / 60;
    }

    public static void main(String[] args) {

        int euro = rubleTOeuro(400);
        int dollar = rubleToDollar(400);
        System.out.println("400 rubles are " + euro + " euro.");
        System.out.println("400 rubles are " + dollar + " dollars.");

    }
}
