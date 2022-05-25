import java.util.Scanner;

/**              Pseudocode
*      using the while loop method:
* prompt user to input 4 numbers example; 1234
* add sum operator in between the userNumbers
* sum the userNumbers and output result
* */

public class Add3Numbers {
    public static void main(String... args){

        int userNumber,digit,sum = 0;

        Scanner input = new Scanner(System.in);
        String prompt = """
                        Please enter four digit numbers without a space character:
                        """;
        System.out.print(prompt);
        userNumber = input.nextInt();

        while(userNumber>0){
            digit = userNumber%10;

        sum = sum + digit;

        userNumber = userNumber/10;
        }

        System.out.println("Sum of Digits: "+sum);
    }
}
