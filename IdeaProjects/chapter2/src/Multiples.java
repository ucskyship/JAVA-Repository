import java.util.Scanner;

/**
 * this program prompts user to input two integers and store them to a variable
 * compares if the triple of the first number is equal to the triple of the second number
 * output result of the compared multiples
 * */

public class Multiples {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int firstNumber = sc.nextInt();

        System.out.println("Enter second number: ");
        int secondNumber = sc.nextInt();

        if ((int) Math.pow(firstNumber, 3) %(int) Math.pow(secondNumber, 2) == 0){
            System.out.printf("The triple of the first number which is: %.2f is a multiple of " +
                    "the second number doubled which is: %.2f\n", Math.pow(firstNumber, 3), Math.pow(secondNumber, 2));
        }else{
            System.out.printf("The triple of the first number which is: %.2f is not a multiple of " +
                    "second number doubled which is: %.2f\n", Math.pow(firstNumber, 3), Math.pow(secondNumber, 2));
        }
    }
}
