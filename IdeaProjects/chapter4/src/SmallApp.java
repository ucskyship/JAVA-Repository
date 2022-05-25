import java.util.Scanner;

public class SmallApp {
    public static void main(String[] args) {

        Scanner Input = new Scanner(System.in);
        System.out.print("Enter Digit 1 or 0: ");
        int Digit = Input.nextInt();

        if (Digit == 0){
            System.out.print("The output is 1");
        }

        if (Digit == 1){
            System.out.print("The output is 0");
        }

    }
}