import java.util.Scanner;

public class Ivr {
    public static void main(String[] args) {

       String prompt = """
               1 for English
               2 for Igbo
               3 for French
               4 for Yoruba
               """;
       System.out.println(prompt);

       Scanner keyboardInput = new Scanner(System.in);
        int userResponse = keyboardInput.nextInt();

        switch (userResponse) {
            case 1 -> {
                prompt = """
                        1 for data
                        2 for transfer
                        """;
                System.out.println(prompt);
                userResponse = keyboardInput.nextInt();
                switch (userResponse) {
                    case 1 -> System.out.println("data");
                    case 2 -> System.out.println("transfer");
                    default -> System.out.println("You no get sense, try again");
                }
            }
            case 2 -> {
                prompt = """
                        1 for sharing
                        2 caring
                        """;
                System.out.println(prompt);
                userResponse = keyboardInput.nextInt();
                switch (userResponse) {
                    case 1 -> System.out.println("sharing");
                    case 2 -> System.out.println("caring");
                    default -> System.out.println("useless fellow");
                }
            }
            case 3 -> {
                prompt = """
                        1 for Egg
                        2 Champagne
                        """;
                System.out.println(prompt);
                userResponse = keyboardInput.nextInt();
                switch (userResponse) {
                    case 1 -> System.out.println("Egg");
                    case 2 -> System.out.println("Champagne");
                    default -> System.out.println("some people wan mad for my class");
                }
            }
            case 4 -> {
                prompt = """
                        1 for Ewa
                        2 Agoyi
                        """;
                System.out.println(prompt);
                userResponse = keyboardInput.nextInt();
                switch (userResponse) {
                    case 1 -> System.out.println("Ewa");
                    case 2 -> System.out.println("Agoyi");
                    default -> System.out.println("mad people everywhere");
                }
            }
        }
    }
}
