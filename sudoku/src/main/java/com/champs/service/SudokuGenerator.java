package com.champs.service;

import java.util.Random;

public class SudokuGenerator {
    private static final int size = 9;
    private static final Random rand = new Random();

    // Generates a random Sudoku board
    public static int[][] generateSudokuBoard(int emptyCells) {
        int[][] board = new int[size][size];
        fillDiagonal(board);
        fillRemaining(board, 0, 0);
        removeNumbers(board, emptyCells); // Remove numbers to create a puzzle
        return board;
    }

    public static void fillDiagonal(int[][] board) {
        for (int i = 0; i < size; i += 3) {
            fillBox(board, i, i);
        }
    }
    public static void fillBox(int[][] board, int row, int col) {
        int num;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                do {
                    num = rand.nextInt(9) + 1;
                } while (!isSafe(board, row + i, col + j, num));
                board[row + i][col + j] = num;
            }
        }
    }
    public static boolean fillRemaining(int[][] board, int row, int col) {
        if (row == size - 1 && col == size) {
            return true; // Reached the end of the board
        }
        if (col == size) {
            row++;
            col = 0;
        }
        if (board[row][col] != 0) {
            return fillRemaining(board, row, col + 1);
        }
        for (int num = 1; num <= size; num++) {
            if (isSafe(board, row, col, num)) {
                board[row][col] = num;
                if (fillRemaining(board, row, col + 1)) {
                    return true;
                }
                board[row][col] = 0; // Backtrack
            }
        }
        return false;
    }
    public static boolean isSafe(int[][] board, int row, int col, int num) {
        // Check if the number is not in the current row and column
        for (int x = 0; x < size; x++) {
            if (board[row][x] == num || board[x][col] == num) {
                return false;
            }
        }
        // Check if the number is not in the current 3x3 box
        int startRow = row - row % 3;
        int startCol = col - col % 3;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i + startRow][j + startCol] == num) {
                    return false;
                }
            }
        }
        return true;
    }
    public static void removeNumbers(int[][] board, int count) {
        while (count > 0) {
            int i = rand.nextInt(size);
            int j = rand.nextInt(size);
            if (board[i][j] != 0) {
                board[i][j] = 0; // Remove the number
                count--;
            }
        }
    }
}
