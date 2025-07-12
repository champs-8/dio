package com.champs.service;

public class SudokuValidator {
    public boolean isValidMove(int[][] board, int row, int col, int num) {
        // Check if the number is already in the row and column
        for (int i = 0; i < 9; i++) {
            if (board[row][i] == num || board[i][col] == num) {
                return false;
            }
        }

        // Check if the number is already in the column
        for (int i = 0; i < 9; i++) {
            if (board[i][col] == num) {
                return false;
            }
        }

        // Check if the number is already in the 3x3 subgrid
        int startRow = row - row % 3;
        int startCol = col - col % 3;

        for (int i = startRow; i < startRow + 3; i++) {
            for (int j = startCol; j < startCol + 3; j++) {
                if (board[i][j] == num) {
                    return false;
                }
            }
        }
        return true;
    }
    public boolean isComplete(int[][] board) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] == 0) {
                    return false; // Found an empty cell
                }
            }
        }
        return true; // No empty cells found, the board is complete
    }
}
