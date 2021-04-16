package ru.job4j.condition;
//4.3.1. Оператор && [#487630]

public class Ccinema {
    public static void permission(boolean allowByParent, boolean hasMoney) {
        if (allowByParent && hasMoney) {
            System.out.println("I can go to the cinema.");
        } else {
            System.out.println("I can't.");
        }
    }

    public static void main(String[] args) {
        permission(true, true);
        permission(true, false);
        permission(false, true);
        permission(false, false);
    }
}

