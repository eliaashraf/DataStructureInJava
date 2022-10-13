package com.javadatastructures;

import java.util.Arrays;

public class WorkingWith2DArrays {
    public static void main(String[] args) {
        char[][] board = new char[3][3];
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                board[i][j] = '-';
            }
        }

        //Another way to implement 2D arrays
        char[][] boardTwo =  new char[][]{
                new char[] {'-', '-', '-'},
                new char[] {'-', '-', '-'},
                new char[] {'-', '-', '-'}
        };

        board[0][0] = '0';
        board[1][0] = '0';
        board[2][0] = '0';
        System.out.println(Arrays.deepToString(board));
        System.out.println(Arrays.deepToString(boardTwo));
        /*to view arrays "Arrays.toString" command is used, but to view
        contents of 2D arrays "Arrays.deepToString(board)" is used.*/
    }
}
