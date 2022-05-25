import java.util.Scanner;

public class FirstChapter2Exercise {
    public static void main(String... args) {

//(a) assign variables of type int and equate all to 0
        int c = 0;
        int thisISAVariable = 0;
        int q76354 = 0;
        int value = 0;

//(b) Prompt user to enter an integer
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");

//(c) Input an integer and assign the result to int variable value .
        value = input.nextInt();

//(d) Print "This is a Java program" on one line in the command window. Use method System.out.println
        System.out.println("This is a Java program");

//(e) Print "This is a Java program" on two lines in the command window. The first line should end with Java . Use method System.out.printf and two %s format specifiers.
        System.out.printf("%s\n%s%n", "This is a Java", "program");

//If the variable number is not equal to 7 , display "The variable number is not equal to 7" .
        Scanner another = new Scanner(System.in);
        System.out.print("Enter a variable number: ");
        int variable = another.nextInt();
        if (value != 7) {
            System.out.print("The variable number is not equal to 7");
        }
    }
}
