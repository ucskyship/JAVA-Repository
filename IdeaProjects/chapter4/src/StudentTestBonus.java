import java.util.Scanner;

public class StudentTestBonus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int passes = 0;
        int failures = 0;
        int studentCounter = 0;

        while (studentCounter <= 10){
            System.out.println("Enter next exam score: ");
            int score = scanner.nextInt();

            if(score == 1){
                passes++;
            } else failures++;
            studentCounter++;
        }
        System.out.println("The number of passes is: " + passes);
        System.out.println("The number of failures is: " + failures);
        if (passes >= 8){
            System.out.println("Bonus to the instructor!!!");
        }
    }
}
