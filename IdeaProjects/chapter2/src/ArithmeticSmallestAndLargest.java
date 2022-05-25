import java.util.Scanner;
/**
 * this program prompts user to enter 3 integer numbers
 * stores te numbers to a variable and perform the following task:
 *      sum the three numbers and output the sum
 *      find the average of the numbers and output
 *      find the product of numbers and output
 * */

public class ArithmeticSmallestAndLargest {
    public static void main(String... args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");//first prompt
        int firstNumber = input.nextInt();

        System.out.print("Enter second number: ");//second prompt
        int secondNumber = input.nextInt();

        System.out.print("Enter third number: ");//third prompt
        int thirdNumber = input.nextInt();

            //sum of the numbers
        int Sum = firstNumber + secondNumber + thirdNumber;
            System.out.printf("the Sum of the numbers is %d\n", Sum);
            //average of the numbers
        int Average = (firstNumber + secondNumber + thirdNumber) / 3;
            System.out.printf("the Average of the numbers is %d\n", Average);
            //product of the numbers
        int Product = firstNumber * secondNumber * thirdNumber;
            System.out.printf("the Product of the numbers is %d\n", Product);

            //smallest and largest number
        if (firstNumber < secondNumber && firstNumber < thirdNumber){
            System.out.printf("smallest number is %d\n", firstNumber);
        }
        if (firstNumber > secondNumber && firstNumber > thirdNumber){
            System.out.printf("largest number is %d\n", firstNumber);
        }
        if (secondNumber < firstNumber && secondNumber < thirdNumber){
            System.out.printf("smallest number is %d\n", secondNumber);
        }
        if (secondNumber > firstNumber && secondNumber > thirdNumber) {
            System.out.printf("largest number is %d\n", secondNumber);
        }
        if (thirdNumber < secondNumber && thirdNumber < firstNumber){
            System.out.printf("smallest number is %d\n", thirdNumber);
        }
        if (thirdNumber > secondNumber && thirdNumber > firstNumber) {
            System.out.printf("largest number is %d\n", thirdNumber);
        }
    }
}
