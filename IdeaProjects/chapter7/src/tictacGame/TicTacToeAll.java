package tictacGame; /**
 *  A simple program to demonstrate
 *  Tic-Tac-Toe Game.
 * */

import java.util.*;

public class TicTacToeAll {

    static String[] arrayBoard;
    static String turn;
// CheckWinner method will
// decide the combination
// of three box given below.
    static String checkWinner()
    {
        for (int i = 0; i < 8; i++) {
            String line = switch (i) {
                case 0 -> arrayBoard[0] + arrayBoard[1] + arrayBoard[2];
                case 1 -> arrayBoard[3] + arrayBoard[4] + arrayBoard[5];
                case 2 -> arrayBoard[6] + arrayBoard[7] + arrayBoard[8];
                case 3 -> arrayBoard[0] + arrayBoard[3] + arrayBoard[6];
                case 4 -> arrayBoard[1] + arrayBoard[4] + arrayBoard[7];
                case 5 -> arrayBoard[2] + arrayBoard[5] + arrayBoard[8];
                case 6 -> arrayBoard[0] + arrayBoard[4] + arrayBoard[8];
                case 7 -> arrayBoard[2] + arrayBoard[4] + arrayBoard[6];
                default -> null;
            };

            //For player X winner
            if (line.equals("XXX")) {
                return "X";
            }

            // For player O winner
            else if (line.equals("OOO")) {
                return "O";
            }
        }

        for (int i = 0; i < 9; i++) {
            if (Arrays.asList(arrayBoard).contains(String.valueOf(i + 1))) {
                break;
            }
            else if (i == 8) {
                return "draw";
            }
        }

        // To enter the X Or O at the exact place on arrayBoard.
        System.out.println(
                turn + "'s turn; enter i" +
                         "slot number to place "
                        + turn + " in:");
        return null;
    }

    // To print out the arrayBoard.
	/* |---|---|---|
	| 1 | 2 | 3 |
	|-----------|
	| 4 | 5 | 6 |
	|-----------|
	| 7 | 8 | 9 |
	|---|---|---|*/

    static void printBoard()
    {
        System.out.println("|---|---|---|");
        System.out.println("| " + arrayBoard[0] + " | "
                + arrayBoard[1] + " | " + arrayBoard[2]
                + " |");
        System.out.println("|-----------|");
        System.out.println("| " + arrayBoard[3] + " | "
                + arrayBoard[4] + " | " + arrayBoard[5]
                + " |");
        System.out.println("|-----------|");
        System.out.println("| " + arrayBoard[6] + " | "
                + arrayBoard[7] + " | " + arrayBoard[8]
                + " |");
        System.out.println("|---|---|---|");
    }

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        arrayBoard = new String[9];
        turn = "X";
        String winner = null;

        for (int i = 0; i < 9; i++) {
            arrayBoard[i] = String.valueOf(i + 1);
        }

        System.out.println("Welcome to 3x3 Tic Tac Toe.");
        printBoard();

        System.out.println(
                "X will play first. Enter i" +
                         "slot number to place X in:");

        while (winner == null) {
            int numInput;

            // Exception handling.
            // number Input will take input from user like from 1 to 9.
            // If it is not in range from 1 to 9.
            // then it will show you an error "Invalid input."
            try {
                numInput = in.nextInt();
                if (!(numInput > 0 && numInput <= 9)) {
                    System.out.println(
                            "Invalid input; re-enter slot number:");
                    continue;
                }
            }
            catch (InputMismatchException e) {
                System.out.println(
                        "Invalid input; re-enter slot number:");
                continue;
            }

            // This game has two player x and O.
            // Here is the logic to decide the turn.
            if (arrayBoard[numInput - 1].equals(
                    String.valueOf(numInput))) {
                arrayBoard[numInput - 1] = turn;

                if (turn.equals("X")) {
                    turn = "O";
                }
                else {
                    turn = "X";
                }

                printBoard();
                winner = checkWinner();
            }
            else {
                System.out.println(
                        "Slot already taken; re-enter slot number:");
            }
        }

        // If no one win or lose from both player x and O.
        // then here is the logic to print "draw".
        if (winner.equalsIgnoreCase("draw")) {
            System.out.println(
                    "It's i" +
                             "draw! Thanks for playing.");
        }

        // For winner -to display Congratulations! message.
        else {
            System.out.println(
                    "Congratulations! " + winner
                            + "'s have won! Thanks for playing.");
        }
    }
}
