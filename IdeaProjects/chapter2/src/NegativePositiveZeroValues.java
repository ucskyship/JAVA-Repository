import java.util.Scanner;


/**
 *  this program prompts user to input number
 *  stores the number into a variable
 *  output:
 *      positive numbers
 *      zero number
 *      negative number
 * */

public class NegativePositiveZeroValues {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int userResponse = sc.nextInt();

        System.out.println("Enter a number: ");
        int userResponse2 = sc.nextInt();

        System.out.println("Enter a number: ");
        int userResponse3 = sc.nextInt();

        System.out.println("Enter a number: ");
        int userResponse4 = sc.nextInt();

        System.out.println("Enter a number: ");
        int userResponse5 = sc.nextInt();

        if(userResponse == 0){
            System.out.println("The ZERO number is: " +userResponse);
        }
        if(userResponse < 0){
            System.out.println("The NEGATIVE number is: " +userResponse);
        }
        if(userResponse > 0){
            System.out.println("The POSITIVE number is: " +userResponse);
        }

        if(userResponse2 == 0){
            System.out.println("The ZERO number is: " +userResponse);
        }
        if(userResponse2 < 0){
            System.out.println("The NEGATIVE number is: " +userResponse);
        }
        if(userResponse2 > 0){
            System.out.println("The POSITIVE number is: " +userResponse);
        }

        if(userResponse3 == 0){
            System.out.println("The ZERO number is: " +userResponse);
        }
        if(userResponse3 < 0){
            System.out.println("The NEGATIVE number is: " +userResponse);
        }
        if(userResponse3 > 0){
            System.out.println("The POSITIVE number is: " +userResponse);
        }

        if(userResponse4 == 0){
            System.out.println("The ZERO number is: " +userResponse);
        }
        if(userResponse4 < 0){
            System.out.println("The NEGATIVE number is: " +userResponse);
        }
        if(userResponse4 > 0){
            System.out.println("The POSITIVE number is: " +userResponse);
        }

        if(userResponse5 == 0){
            System.out.println("The ZERO number is: " +userResponse);
        }
        if(userResponse5 < 0){
            System.out.println("The NEGATIVE number is: " +userResponse);
        }
        if(userResponse5 > 0){
            System.out.println("The POSITIVE number is: " +userResponse);
        }
    }
}
