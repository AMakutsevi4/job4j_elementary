package ru.job4j.calculator;

public class ArgMethod {
    public static void hello(String name) {
        System.out.println("Hello, " + name);
    }

    public static void main(String[] args) {
        String name = "Alexander Makutsevich";
        int age = 29;

        //  ArgMethod.hello();

        ArgMethod.hello(name);

        //   ArgMethod.hello(age);

        //   ArgMethod.hello(name, name, name);
    }
}
