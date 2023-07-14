package com.javamasterclass.collections.arrays;

import java.util.Arrays;

public class TwoDArray {
    public static void main(String[] args) {
        char[][] board = new char[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }

        board[0][0] = '0';
        board[1][1] = '0';
        board[2][2] = '0';

        System.out.println(Arrays.deepToString(board));
    }
}
