package ru.job4j.calculator;

public class ArgMethod {

    public static void hello(String name) {
        System.out.println("Hello, " + name);
    }
    public static void yourAge(int age) {
        System.out.println("Your age, " + age);
    }

    public static void main(String[] args) {
        String name = "Alexander Makutsevich";
        int age = 29;

        ArgMethod.hello(name);

        ArgMethod.yourAge(age);

    }
}
