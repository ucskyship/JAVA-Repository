import java.util.Scanner;

/**
 * this program prompts user to input two integers and store them to a variable
 * compares if the triple of the first number is equal to the double of the second number
 * output result of the compared multiples
 * */

public class MultiplesNoDouble {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int firstNumber = sc.nextInt();

        System.out.println("Enter second number: ");
        int secondNumber = sc.nextInt();

        int firstNumberTriple = (int) Math.pow(firstNumber, 3);
        int secondNumberDoubled = (int) Math.pow(secondNumber, 2);

        if(firstNumberTriple % secondNumberDoubled !=0){
            System.out.printf("The triple of the first number which is: %d is not a multiple of " +
                    "second number doubled which is: %d\n", firstNumberTriple, secondNumberDoubled);
        }else {
            System.out.printf("The triple of the first number which is: %d is a multiple of " +
                    "second number doubled which is: %d\n", firstNumberTriple, secondNumberDoubled);
        }
    }
}
