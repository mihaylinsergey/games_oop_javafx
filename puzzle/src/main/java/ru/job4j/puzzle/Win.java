package ru.job4j.puzzle;

public class Win {
    public static boolean check(int[][] board) {
        boolean rsl = false;
        for (int i = 0; i < board.length; i++) {
            if (board[i][i] == 1 && (MatrixCheck.monoHorizontal(board, i) || MatrixCheck.monoVertical(board, i))) {
                rsl = true;
                break;
            }
        }
        return rsl;
    }
}
