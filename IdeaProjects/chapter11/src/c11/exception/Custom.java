package c11.exception;

import java.util.Scanner;

public class Custom {
    private static final Scanner scanner = new Scanner(System.in);
    public static void collectInput() throws CohortElevenException{
        System.out.println("Enter a positive number: ");
        int userInput = scanner.nextInt();

        if(userInput < 0){
            throw new CohortElevenException("Can not take negative integer!!");
        }
    }

    public static void main(String[] args) {
        try{
            collectInput();
        } catch (CohortElevenException cE){
            System.out.println(cE.getMessage());
        }
    }
}
