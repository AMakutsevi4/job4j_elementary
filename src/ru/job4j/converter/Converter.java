package ru.job4j.converter;

public class Converter {

    public static int rubleTOeuro(int value) {
       return value / 70;
    }

    public static int rubleToDollar(int value) {
        return value / 60;
    }

    public static void main(String[] args) {

        int in = 400;
        int extectedEeuro = 5;
        int extectedDollar = 6;
        int outEuro = Converter.rubleTOeuro(in);
        int outDollar = Converter.rubleToDollar(in);
        int euro = rubleTOeuro(400);
        int dollar = rubleToDollar(400);
        boolean passedEuro = extectedEeuro == outEuro;
        boolean passedDollar = extectedDollar == outDollar;
        System.out.println("400 rubles are " + euro + " euro. Test result : " + passedEuro);
        System.out.println("400 rubles are " + dollar + " dollars. Test result : " + passedDollar);

    }
}
