package com.champs.model;

public class SudokuBoard {

    public SudokuCell[][] board;

    // Constructor to initialize the Sudoku board with a 2D array
    public SudokuBoard(int[][] initialBoard) {
        board = new SudokuCell[9][9];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                // Assuming initialBoard[i][j] is the value, and false indicates it's not fixed
                board[i][j] = new SudokuCell(initialBoard[i][j], initialBoard[i][j] != 0);
            }
        }
    }

    // Method to get the value of a cell at a specific position
    public int getCellValue(int row, int col) {
        if (row < 0 || row >= 9 || col < 0 || col >= 9) {
            throw new IndexOutOfBoundsException("Row and column must be between 0 and 8.");
        }
        return board[row][col].getValue();
    }

    // Method to set the value of a cell at a specific position
    public void setCellValue(int row, int col, int value) {
        if (row < 0 || row >= 9 || col < 0 || col >= 9) {
            throw new IndexOutOfBoundsException("Row and column must be between 0 and 8.");
        }
        board[row][col].setValue(value);
    }

    // Method to check values of cells
    public int[][] getBoardValues() {
        int[][] values = new int[9][9];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                values[i][j] = board[i][j].getValue();
            }
        }
        return values;
    }
}

