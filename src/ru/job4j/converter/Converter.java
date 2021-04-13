package ru.job4j.converter;

public class Converter {

    public static int rubleTOeuro (int value){

        int rsl = value / 70;
        return rsl;
          }
    public static int rubleToDollar(int value){

        int rsl = value / 60;
        return rsl;
    }
    public static void main(String[] args){
        int euro = rubleTOeuro(400);
               int dollar = rubleToDollar(400);
        System.out.println("400 rubles are " + euro + " euro.");
        System.out.println("400 rubles are " + dollar + " dollars.");

    }
}
