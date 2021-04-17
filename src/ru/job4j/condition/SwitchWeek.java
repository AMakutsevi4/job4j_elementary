package ru.job4j.condition;

public class SwitchWeek {
    public static String nameOfDay(int day) {
        String score;
        switch (day) {
            case 1:
                score = "Понедельник";
                break;
            case 2:
                score = "Вторник";
                break;
            case 3:
                score = "Среда";
                break;
            case 4:
                score = "Четверг";
                break;
            case 5:
                score = "Пятница";
                break;
            case 6:
                score = "Суббота";
                break;
            case 7:
                score = "Воскресенье";
                break;
            default:
                score = "Ошибка";

        }
        return score;
    }
}
