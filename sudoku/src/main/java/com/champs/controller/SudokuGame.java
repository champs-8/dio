package com.champs.controller;

import com.champs.model.SudokuBoard;
import com.champs.service.SudokuValidator;

/**
 * The SudokuGame class represents a Sudoku game instance.
 * It contains a Sudoku board and a validator to check the validity of moves.
 *
 * @author Fabio Santos
 * @version 1.0
 */

public class SudokuGame {
    private final SudokuBoard board;
    private final SudokuValidator validator;

    // Constructor to initialize the Sudoku game with a given board
    public SudokuGame(int[][] initialValues) {
        this.board = new SudokuBoard(initialValues);
        this.validator = new SudokuValidator();
    }

    // Method to make a move on the Sudoku board
    public boolean playMove(int row, int col, int num) {
        int[][] current = board.getBoardValues();

        // Check if the move is valid using the validator
        if (validator.isValidMove(current, row, col, num)) {
            board.setCellValue(row, col, num);
            return true; // Move was successful
        }
        return false; // Move was invalid
    }

    // Method to check if the Sudoku board is complete
    public boolean isComplete() {
        return validator.isComplete(board.getBoardValues());
    }

    // Method into to show the current state of the board
    public void printBoard() {
        int[][] values = board.getBoardValues();
        for (int i = 0; i < 9; i++) {
            if (i % 3 == 0 && i != 0) System.out.println("---------+-----------+---------");
            for (int j = 0; j < 9; j++) {
                if (j % 3 == 0 && j != 0) System.out.print("|  ");
                System.out.print(values[i][j] == 0 ? ".  " : values[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
