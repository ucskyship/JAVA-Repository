import java.util.Scanner;

public class GradeSentinel {
    public static void main(String[] args) {

        int total = 0;
        int gradeCounter = 0;
        int average;
        int grade;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter grade or 0 to quit: ");
        grade = scanner.nextInt();

        while(grade != 0){
            total += grade;
            gradeCounter++;

            System.out.println("Enter next grade or 0 to quit: ");
            grade = scanner.nextInt();
        }

        if (gradeCounter != 0){
            average = total/gradeCounter;

            System.out.println("The total of the" + " " + gradeCounter + " " + "grade score is: " + total);
            System.out.println("The average score is: " +average);
        } else {
            System.out.println("No grade was entered, please try again!");
            }

    }
}
