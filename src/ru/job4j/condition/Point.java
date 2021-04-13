package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2){

        double rsl = (x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1);
        return Math.pow(rsl, 2);
    }
    public static void main (String[] agrs){
        double rsl = Point.distance(1,2,3,4);
        System.out.println("result (1, 2) to (3, 4) " + rsl);
    }
}
