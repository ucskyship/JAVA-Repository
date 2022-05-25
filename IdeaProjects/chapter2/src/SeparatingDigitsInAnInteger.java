import java.util.Scanner;
/**
 * this program prompts user to input 5 integers in a block
 * stores the numbers in a variable and output the numbers with 3 spaces each between
 * */

public class SeparatingDigitsInAnInteger {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 digits without a space character: ");
        int userInput = sc.nextInt();

        int digit1 = userInput/10000%10;
        int digit2 = userInput/1000%10;
        int digit3 = userInput/100%10;
        int digit4 = userInput/10%10;
        int digit5 = userInput%10;

        System.out.println(digit1+"   "+digit2+"   "+digit3+"   "+digit4+"   "+digit5+"   ");
    }
}
