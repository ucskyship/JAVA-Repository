import java.util.Scanner;

public class LetterGrade {
    public static void main(String[] args) {

        int totalGrade = 0;
        int counter = 0;
        int aCount = 0;
        int bCount = 0;
        int cCount = 0;
        int dCount = 0;
        int fCount = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter grade between the range of 0 - 100,\n " +
                "type ctrl + z on WINDOWS and ctrl + d on LINUX, MacOS to end: ");

        while (scanner.hasNext()) {
            int grade = scanner.nextInt();
            totalGrade += grade;
            counter++;

            switch (grade / 10) {
                case 9:
                case 10:
                    aCount++;
                    break;
                case 8:
                    bCount++;
                    break;
                case 7:
                    cCount++;
                    break;
                case 6:
                    dCount++;
                    break;
                default:
                    fCount++;
                    break;
            }
        }
        System.out.print("\nGrade Report:\n");
        if (counter != 0){
            double average = (double) totalGrade / counter;
            System.out.printf("Total of the %d grade entered is %d\n", counter, totalGrade);
            System.out.printf("Class average is %.2f\n", average);
            System.out.printf("\n%s\n%s%d\n%s%d\n%s%d\n%s%d\n%s%d\n", "Number of students who received each grade: ",
                    "A: ", aCount,
                    "B: ", bCount,
                    "C: ", cCount,
                    "D: ", dCount,
                    "F: ", fCount);
        }
        else {
            System.out.println("No grade was entered");
        }
    }
}
