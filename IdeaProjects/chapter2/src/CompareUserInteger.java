import java.util.Scanner;
/**
 * this program prompts user to enter an integer number
 * stores the number provided to a variable
 * compare whether the number is greater than 100, lesser than 100, greater than 100 equal to 100, or not equal to 100
 * output result and secondly;
 * compare whether the square of the number is greater than 100, lesser than 100, greater than 100 equal to 100, or not equal to 100
 * */

public class CompareUserInteger {
    public static void main(String... args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();
            if (number > 100){
                System.out.printf("number which is: %d is greater than 100\n", number);
            }
            if (number == 100){
                System.out.printf("number which is: %d is equal to 100\n", number);
            }
            if (number != 100){
                System.out.printf("number which is: %d is not equal to 100\n", number);
            }
            if (number < 100){
                System.out.printf("number which is: %d is lesser than 100\n", number);
            }


        int square = (int) Math.pow(number, 2);
            if (square > 100){
                System.out.printf("number squared which is: %d is greater than 100\n", square);
            }
            if (square == 100){
                System.out.printf("number squared which is: %d is equal to 100\n", square);
            }
            if (square != 100){
                System.out.printf("number squared which is: %d is not equal to 100\n", square);
            }
            if (square < 100){
                System.out.printf("number squared which is: %d  is lesser than 100\n", square);
            }

    }
}
