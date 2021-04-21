package ru.job4j.loop;

public class Mortgage {
    public static int year(double amount, double salary, double percent) {
        int year = 0;
        double dolg = amount + (amount * (percent / 100));

        while (dolg > 0) {
            dolg = dolg - salary;
            dolg = dolg + (dolg * (percent / 100));
            year++;
        }
        return year;
    }
}