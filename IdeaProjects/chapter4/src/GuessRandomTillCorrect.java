import java.util.Random;
import java.util.Scanner;

/**
 *              Pseudocode
 *
 * prompt user to guess the number you think of
 * store the number into a variable
 * using the if statement, check guessed number and;
 *  if guessed number is equal to secrete number, Yes!! Good job;
 *  if guessed number is greater, output sorry guessed number too high
 *  if guessed number is lesser, output sorry guessed number too low
 * this prompt iterates till user guess right number
 *
 *
 * */

public class GuessRandomTillCorrect {
    public static void main(String... args){

        Scanner input = new Scanner(System.in);
        Random numGen = new Random();
        int RanNum = numGen.nextInt(20);

        System.out.print("Guessed the number am thinking of: ");
        int num = input.nextInt();
        if (num == RanNum)
            System.out.println("Correct");
        else if (num == RanNum)
            System.out.println("Sorry that number is too high");
        else if (num < RanNum);
            System.out.println("Sorry that number is too low");
    }
}
