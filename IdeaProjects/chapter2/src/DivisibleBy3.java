import java.util.Scanner;

/**
 * this program prompts user to input a number and stores the number to a variable
 * outputs if the number is divisible by 3 or not
 * */

public class DivisibleBy3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Input a number: ");
        int userInput = sc.nextInt();

        if(userInput %3 != 0){
            System.out.println("This number is not divisible by 3");
        }else {
            System.out.println("This number is divisible by 3");
        }
    }
}
