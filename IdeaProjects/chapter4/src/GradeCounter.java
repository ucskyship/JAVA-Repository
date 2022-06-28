import java.util.Scanner;

public class GradeCounter {
    public static void main(String[] args) {

        int total = 0;
        int counter = 1;
        int grade;

        Scanner scanner = new Scanner(System.in);
        while (counter <= 10){
            System.out.println("Enter next grade");
            grade = scanner.nextInt();

            total += grade;
            counter++;

        }

        int average = total/10;

        System.out.println("The total score is: " +total);
        System.out.println("The total average score is: " + average);
    }
}
