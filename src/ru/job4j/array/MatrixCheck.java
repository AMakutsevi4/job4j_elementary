package ru.job4j.array;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        char symbol = 'X';
        boolean result = true;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                int well = board[row][j];
                if (well != symbol) {
                    result = false;
                    break;
                }
            }
        }
        return result;
    }
}
