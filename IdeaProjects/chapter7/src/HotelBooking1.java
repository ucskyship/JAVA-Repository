import java.util.InputMismatchException;
import java.util.Scanner;

/**             Pseudocode
 *  this program should create an array for rooms in hotel
 *  prompt user to enter 1 to book a room
 *  prompt user to enter 2 to leave a room
 *  prompt user to enter 3 to check room details if booked or empty
 *  prompt user to enter -1 to exit
 *      if room is empty prompt user to enter name to book and output booking successful
 *      if room is not empty output this room is booked
 *      enter 0 to go back and try again
 * */

public class HotelBooking1 {
    private static String[] stringArray = new String[10];

    public static void main(String... args){


        String prompt = """
                        
                            W E L C O M E
                                
                        Enter 1 to book a room
                        Enter 2 to leave a room
                        Enter 3 to check room details
                        Enter 0 Exit to quit
                        
                                Input:
                        """;
        System.out.print(prompt);
        try{
        Scanner keypadInput = new Scanner(System.in);

        int userResponse = keypadInput.nextInt();

        switch (userResponse) {
            case 1 -> {
                System.out.println("Showing available rooms -");
                for (int i = 0; i < stringArray.length; i++) {
                    if (stringArray[i] == null)
                        System.out.printf("Room %d is empty\n", i + 1);
                    else System.out.println(" - This room is booked");
                }
                System.out.println("\nChoose a room number:");

                userResponse = keypadInput.nextInt();
                switch (userResponse) {
                    case 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 -> {
                        System.out.println("Enter name -");

                        String input = keypadInput.next();
                        for (int i = 0; i < stringArray.length; i++) {
                            if (userResponse - 1 == i) stringArray[i] = input;
                        }
                        System.out.println("Booking successful");
                        prompt = """
                                                            
                                0. Exit to main menu
                                """;
                        System.out.println(prompt);

                        userResponse = keypadInput.nextInt();
                        if (userResponse == 0) {
                            main();
                        }

                    }
                }
            }
            case 2 -> {
                System.out.println("Leave a room -\n");
                System.out.println("Enter room number to checkout: ");
                userResponse = keypadInput.nextInt();
                for (int i = 0; i < stringArray.length; i++) {
                    if (userResponse - 1 == i) stringArray[i] = null;
                    System.out.println("Check-out successful");

                    prompt = """
                                                        
                            0. Exit to main menu
                            """;
                    System.out.println(prompt);

                    userResponse = keypadInput.nextInt();
                    if (userResponse == 0) {
                        main();
                    }
                }
            }
            case 3 -> System.out.println("Check room details -");
//                case 0 ->
        }
    }catch (InputMismatchException e){
            System.out.println("Invalid dear goat!!!");
            main();
        }
    }
}
