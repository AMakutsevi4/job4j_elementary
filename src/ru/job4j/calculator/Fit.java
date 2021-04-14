package ru.job4j.calculator;

public class Fit {
    public static double manWeight(double height){
        return (height - 100) * 1.15;

    }
    public static double womanWeight(double height){
        return  (height - 110) * 1.15;

    }
    public static void main (String[] agrs){
        double man = Fit.manWeight(182);
        double woman = Fit.womanWeight(162);
        System.out.println("Man 182 is " + man);
        System.out.println("Woman 162 is " + woman);
    }
}
