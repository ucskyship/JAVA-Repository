import java.util.Scanner;
/**
 * this program prompts user to enter two integers; first number and second number
 * stores the integers provided by te user to a variable; firstNumber & secondNumber
 * outputs the square of each of the variables
 * sum the squares and output the sum of each of the squared variables
 * find the difference of the both square(firstNumber square minus secondNumber square) and output
 * */

public class SquareSumDifference {
    public static void main(String... args){

        Scanner input = new Scanner(System.in);
            System.out.print("Enter first number: ");
            int firstNumber = input.nextInt();

            System.out.print("Enter second number: ");
            int secondNumber = input.nextInt();

        int square1 = (int) Math.pow(firstNumber, 2);
            System.out.printf("firstNumber square is %d\n", square1);
        int square2 = (int) Math.pow(secondNumber, 2);
            System.out.printf("secondNumber square is %d\n", square2);

        int sumSquare = square1 + square2;
            System.out.printf("sum of their square is %d\n", sumSquare);

        int differenceOfSquare = square1 - square2;
            System.out.printf("difference of their square is %d\n", differenceOfSquare);
    }
}
