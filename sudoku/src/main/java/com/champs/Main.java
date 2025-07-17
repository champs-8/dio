package com.champs;

import com.champs.controller.SudokuGame;
import com.champs.service.SudokuGenerator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //generate a new Sudoku board
        SudokuGenerator generator = new SudokuGenerator();

        System.out.println("Whats the number of empty cells you want in the Sudoku board? (0-81)");
        int emptyCells = sc.nextInt();
        int board[][] = generator.generateSudokuBoard(emptyCells); //selecionar quantidade de celular vazias.

        // Initialize the Sudoku board with the initial values
        SudokuGame game = new SudokuGame(board);

        // Game loop
        System.out.println("===== Welcome to Sudoku! =====");


        while(!game.isComplete()){
            game.printBoard(); // Print the current state of the board
            System.out.println("Enter your move (row(1-9), column(1-9), number(1-9)) or 'exit' to quit:");
            int row = sc.nextInt();
            int col = sc.nextInt();
            int num = sc.nextInt();

            if(!game.playMove(row - 1, col - 1, num)) {
                System.out.println("Invalid move! Try again.");
            }
        }
        System.out.println("Congratulations! You've completed the Sudoku puzzle!");
        sc.close();
    }
}