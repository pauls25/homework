package io.codelex.arrays.practice;

import org.apache.commons.lang3.math.NumberUtils;

import java.util.Arrays;
import java.util.Scanner;

public class TicTacToe {
    private static char turn = 'X';
    private static final char[][] board = new char[3][3];

    public static char winner = '-';

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        initBoard();
        displayBoard();

        int turnCount = 0;
        while (Character.toString(getWinner()).equals("-")) {
            doTurn(keyboard);
            displayBoard();
            determineWinner();
            turnCount++;

            if (getWinner() == '-' && turnCount == 9) {
                System.out.println("Game is a tie");
                break;
            } else if (getWinner() == 'X' || getWinner() == 'O') {
                System.out.printf("Player %c has won the game!", getWinner());
            }
        }
    }

    public static char getTurn() {
        return turn;
    }

    public static char[][] getBoard() {
        return board;
    }

    public static void setWinner(char winner) {
        TicTacToe.winner = winner;
    }

    public static char getWinner() {
        return winner;
    }

    public static void setTurn(char newTurn) {
        turn = newTurn;
    }

    public static void doTurn(Scanner keyboard) {
        System.out.printf("'%c', choose your location (row, column): ", getTurn());

        String[] input = keyboard.nextLine().split(" ");

        int row = NumberUtils.createInteger(input[0]);
        int column = NumberUtils.createInteger(input[0]);
//        System.out.println("\n");

        if (getBoard()[row][column] == ' ') {
            getBoard()[row][column] = getTurn();

            if (getTurn() == 'X') {
                setTurn('O');
            } else if (getTurn() == 'O') {
                setTurn('X');
            }
        } else {
            System.out.println("Cell already contains value! Game over");
            System.exit(0);
        }
    }

    public static void determineWinner() {
        checkRows(getBoard());
        checkColumns(getBoard());
        checkDiagonals(getBoard());
    }

    public static void initBoard() {
        // fills up the board with blanks
        for (int r = 0; r < 3; r++)
            for (int c = 0; c < 3; c++)
                board[r][c] = ' ';
    }

    public static void checkRows(char[][] board) {
        for (char[] row : board) {
            if (row[0] == row[1] && row[0] == row[2] && row[0] != ' ') {
                setWinner((row[0]));
            }
        }
    }

    public static void checkColumns(char[][] board) {
        for (int i = 0; i < 3; i++) {
            if (board[0][i] == board[1][i] && board[0][i] == board[2][i] && board[0][i] != ' ') {
                setWinner(board[0][i]);
            }
        }
    }

    public static void checkDiagonals(char[][] board) {
        if (board[0][0] == board[1][1] && board[0][0] == board[2][2] && board[0][0] != ' ') {
            setWinner(board[0][0]);
        }
        if (board[0][2] == board[1][1] && board[0][2] == board[2][0] && board[0][2] != ' ') {
            setWinner(board[0][2]);
        }
    }

    public static void displayBoard() {
        System.out.println("  0  " + board[0][0] + "|" + board[0][1] + "|" + board[0][2]);
        System.out.println("    --+-+--");
        System.out.println("  1  " + board[1][0] + "|" + board[1][1] + "|" + board[1][2]);
        System.out.println("    --+-+--");
        System.out.println("  2  " + board[2][0] + "|" + board[2][1] + "|" + board[2][2]);
        System.out.println("     0 1 2 ");
    }
}