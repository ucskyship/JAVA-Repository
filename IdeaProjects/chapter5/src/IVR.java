//              psuedocode

//  this code prompts user to enter a response and outputs result
//  prompt user to press a number response which include;
//      1 for English
//      2 for Igbo
//      3 for French
//      4 for Yoruba;
//          if user enters 1 for English
//              prompt 1 for data
//              prompt 2 for transfer
//          if user enters 2 for Igbo
//              prompt 1 for sharing
//              prompt 2 for caring
//          if user enters 3 for French
//              prompt 1 for Egg
//              prompt 2 for Champaign
//          if user enters 4 for Yoruba
//              prompt 1 for Ewa
//              prompt 2 for Agoyi

import java.util.InputMismatchException;
import java.util.Scanner;

public class IVR {
    public static void main(String... args) {

            mainMethod();

        }

        private static void mainMethod () {
            try {
                Scanner input = new Scanner(System.in);
                System.out.print("please press:\n1. for English \n2. for Igbo\n3. for French\n4. for Yoruba\n");
                int response = input.nextInt();

                switch (response) {
                    case 1 -> {
                        System.out.print("please enter:\n1. for data \n2. for transfer\n");
                        response = input.nextInt();
                        switch (response) {
                            case 1 -> System.out.println("Data");
                            case 2 -> System.out.println("Transfer");
                        }
                    }
                    case 2 -> {
                        System.out.print("please enter:\n 1. for sharing\n 2. for caring\n");
                        response = input.nextInt();
                        switch (response) {
                            case 1 -> System.out.println("Sharing");
                            case 2 -> System.out.println("Caring");
                        }
                    }
                    case 3 -> {
                        System.out.print("please enter:\n 1. for Egg\n 2. for Champaign\n");
                        response = input.nextInt();
                        switch (response) {
                            case 1 -> System.out.println("Egg");
                            case 2 -> System.out.println("Champaign");
                        }
                    }
                    case 4 -> {
                        System.out.print("please enter:\n 1. for Ewa\n 2. for Agoyi\n");
                        response = input.nextInt();
                        switch (response) {
                            case 1 -> System.out.println("Ewa");
                            case 2 -> System.out.println("Agoyi");
                        }
                    }
                    default -> System.out.println("Invalid response, please try again");
                }
//    }

            } catch (InputMismatchException e) {
                System.out.println("Invalid Response dude!!!");
                mainMethod();

            }
        }
}