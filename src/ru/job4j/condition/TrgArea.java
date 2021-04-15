package ru.job4j.condition;

public class TrgArea {
    public static double area (double a, double b, double c){
        double p = (a + b + c) / 2;
        //return Math.sqrt(((a + b + c) / 2));
        return Math.sqrt(p*(p-a) * (p - b) * (p - c));

    }
    public static void main (String[] args){
        double rsl = TrgArea.area(2,2,2);
        System.out.println("area (2, 2, 2) = " + rsl);
    }
}
/*
package ru.job4j.condition.Greeting;

public class Greeting{
    public static void main(String[] args){
        String idea = "I like Java!";
        System.out.println(idea);
        System.out.println(idea + " But I am a newbie.");
        int year = 2021;
        idea = idea + year;
        System.out.println(idea);
    }
}
}
 */