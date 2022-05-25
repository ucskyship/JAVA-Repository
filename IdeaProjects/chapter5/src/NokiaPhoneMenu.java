/**              Pseudocode
 *
 * prompt user to press number 1 - 13
 * if user press 1 show menu
 * prompt user 1 - 10 on menu and so on...
 * if user press 2 show contact
 *
 *
 * additionally add a back function;
 * also a lock function
 *  if user input 0 callback to the previous prompt
 * from menu,
 *  if user press 0 exit
 *
 */

import java.util.InputMismatchException;
import java.util.Objects;
import java.util.Scanner;

public class NokiaPhoneMenu {
    public static void main(String... args){
        String prompt = """
                        
                        Please Enter 4 digit pin ****
                        
                               Unlock device -
                        """;
        System.out.println(prompt);

        try{
        Scanner keypadInput = new Scanner(System.in);
        String userResponse = keypadInput.next();
        if (Objects.equals(userResponse, "1234cdd")) {
            homePage();
        } else {
            System.out.print("Invalid pin try again\n");
            prompt = """
                                            
                    1. Try again
                    """;
            System.out.println(prompt);
            int userResponse2 = keypadInput.nextInt();
            if (userResponse2 == 1) {
                main();
            } else {
                main();
            }
        }
        }catch (InputMismatchException error) {
            System.out.println("Invalid input dude!");
            main();}
        }

    private static void homePage() {
        String prompt = """
                         1. Menu
                         2. Contact
                         ________________________________
                         | MTN|||               12:00am |
                         |                              |
                         |                              |
                         |      H O M E   P A G E       |
                         |                              |
                         |                              |
                         | Menu                 Contact |
                         |______________________________|
                         
                         69. Lock device
                         """;
        System.out.println(prompt);
        try{
        Scanner keypadInput = new Scanner(System.in);
        int userResponse = keypadInput.nextInt();
        switch (userResponse){
            case 1 -> mainMenuFunction();
            case 2 -> contactMenu(keypadInput);
            case 69 -> main();
        }
        mainMenuFunction();
        }catch (InputMismatchException error){
            System.out.println("Invalid input dude!");
            homePage();
        }
    }

    private static void contactMenu(Scanner keypadInput) {
        String prompt;
        int userResponse;
        System.out.println("Contact");
        prompt = """
                create new contact -
                ___________________
                
                1. +234 *** *** ****
                2. Acc Bal
                3. UCJ Mtn
                4. UCJ Airtel
                5. Sam Immanuel
                
                0. Back
                """;
        System.out.println(prompt);
        userResponse = keypadInput.nextInt();
        switch (userResponse) {
            case 1 -> {
                System.out.print("Unknown No. -\n");
                prompt = """
                                                  
                        +234 *** *** **** calling...
                                                  
                        1. Cancel
                        """;
                System.out.println(prompt);
                userResponse = keypadInput.nextInt();
                if (userResponse == 1) {
                    contactMenu(keypadInput);
                }
            }
            case 2 -> {
                System.out.println("Acc Bal -\n");
                prompt = """
                              Requesting...
                                                  
                                                  
                        1. Cancel
                        """;
                System.out.println(prompt);
                userResponse = keypadInput.nextInt();
                if (userResponse == 1) {
                    contactMenu(keypadInput);
                }
            }
            case 3 -> {
                System.out.println("UCJ Mtn -\n");
                prompt = """
                              calling...
                        UCJ Mtn
                                                  
                        1. Cancel
                        """;
                System.out.println(prompt);
                userResponse = keypadInput.nextInt();
                if (userResponse == 1) {
                    contactMenu(keypadInput);
                }
            }
            case 4 -> {
                System.out.println("UCJ Airtel -\n");
                prompt = """
                              calling...
                        UCJ Airtel
                                                  
                        1. Cancel
                        """;
                System.out.println(prompt);
                userResponse = keypadInput.nextInt();
                if (userResponse == 1) {
                    contactMenu(keypadInput);
                }
            }
            case 5 -> {
                System.out.println("Sam Immanuel -\n");
                prompt = """
                              calling...
                        Sam Immanuel\040
                                                  
                        1. Cancel
                        """;
                System.out.println(prompt);
                userResponse = keypadInput.nextInt();
                if (userResponse == 1) {
                    contactMenu(keypadInput);
                } else {
                    homePage();
                }
            }
            case 0 -> {homePage();}
            default ->
                homePage();
        }
    }

    private static void mainMenuFunction() {
        System.out.println("List of menu functions -");
        String prompt = """
                    1. Phone book
                    2. Messages
                    3. Chat
                    4. Call register
                    5. Tones
                    6. Settings
                    7. Call divert
                    8. Games
                    9. Calculator
                    10. Reminders
                    11. Clock
                    12. Profiles
                    13. SIM services
                    
                    99. Homepage
                    69. Lock device
                    """;
        System.out.println(prompt);

        try{
        Scanner keypadInput = new Scanner(System.in);
        int userResponse = keypadInput.nextInt();

        switch (userResponse){
            case 1 -> phoneBookMenu(keypadInput);

            case 2 -> messageMenu(keypadInput);

            case 3 -> {
                System.out.println("Chat -");
                prompt = """
                        0. Back
                        
                        99. Cancel
                        """;
                System.out.print(prompt);
                userResponse = keypadInput.nextInt();
                if (userResponse == 0) mainMenuFunction();
                if (userResponse == 99) homePage();
            }

            case 4 -> callRegisterMenu(keypadInput);

            case 5 -> tonesMenu(keypadInput);

            case 6 -> mainSettingsMenu(keypadInput);

            case 7 -> {
                System.out.println("Call divert -");
                prompt = """
                        0. Back
                        
                        99. Cancel
                        """;
                System.out.print(prompt);
                userResponse = keypadInput.nextInt();
                switch (userResponse){
                    case 1 -> mainMenuFunction();
                    case 99 -> homePage();
                }

            }

            case 8 -> {
                System.out.println("Games -");
                prompt = """
                        0. Back
                        
                        99. Cancel
                        """;
                System.out.print(prompt);
                userResponse = keypadInput.nextInt();
                switch (userResponse){
                    case 1 -> mainMenuFunction();
                    case 99 -> homePage();
                }
            }

            case 9 -> {
                System.out.println("Calculator -");
                prompt = """
                        0. Back
                        
                        99. Cancel
                        """;
                System.out.print(prompt);
                userResponse = keypadInput.nextInt();
                switch (userResponse){
                    case 1 -> mainMenuFunction();
                    case 99 -> homePage();
                }

            }

            case 10 -> {
                System.out.println("Reminders -");
                prompt = """
                        0. Back
                        
                        99. Cancel
                        """;
                System.out.println(prompt);
                userResponse = keypadInput.nextInt();
                switch (userResponse){
                    case 1 -> mainMenuFunction();
                    case 99 -> homePage();
                }

            }

            case 11 -> clockMenu(keypadInput);

            case 12 -> {
                System.out.println("Profiles -");
                prompt = """
                        0. Back
                        
                        99. Cancel
                        """;
                System.out.println(prompt);
                userResponse = keypadInput.nextInt();
                switch (userResponse){
                    case 1 -> mainMenuFunction();
                    case 99 -> homePage();
                }

            }

            case 13 -> {
                System.out.println("SIM service -");
                prompt = """
                        0. Back
                        
                        99. Cancel
                        """;
                System.out.println(prompt);
                userResponse = keypadInput.nextInt();
                switch (userResponse){
                    case 1 -> mainMenuFunction();
                    case 99 -> homePage();
                }

            }

            case 99 -> homePage();
            case 69 -> main();
            default -> {
                System.out.println("invalid");
                homePage();
            }
        }
        }catch (InputMismatchException error){
            System.out.println("Invalid input dude!");
            mainMenuFunction();}
    }

    private static void tonesMenu(Scanner keypadInput) {
        int userResponse;
        String prompt;
        System.out.println("Tones -");
        prompt = """
                 1. Ringing tone
                 2. Ringing volume
                 3. Incoming call alert
                 4. Composer
                 5. Message alert tones
                 6. Keypad tones
                 7. Warning and games tones
                 8. Vibrating alert
                 9. Screen saver
                 0. Back
                 
                 99. Cancel
                 """;
        System.out.println(prompt);
        userResponse = keypadInput.nextInt();
        switch (userResponse){
            case 1 -> {
                System.out.println("Ringing tone -");
                prompt = """
                        0. Back
                        """;
                System.out.println(prompt);
                userResponse = keypadInput.nextInt();
                if (userResponse == 0) tonesMenu(keypadInput);
            }
            case 2 -> {
                System.out.println("Ringing volume");
                prompt = """
                        0. Back
                        """;
                System.out.println(prompt);
                userResponse = keypadInput.nextInt();
                if (userResponse == 0) tonesMenu(keypadInput);
            }
            case 3 -> {
                System.out.println("Incoming call alert");
                prompt = """
                        0. Back
                        """;
                System.out.println(prompt);
                userResponse = keypadInput.nextInt();
                if (userResponse == 0) tonesMenu(keypadInput);
            }
            case 4 -> {
                System.out.println("Composer");
                prompt = """
                        0. Back
                        """;
                System.out.println(prompt);
                userResponse = keypadInput.nextInt();
                if (userResponse == 0) tonesMenu(keypadInput);
            }
            case 5 -> {
                System.out.println("Message alert tones");
                prompt = """
                        0. Back
                        """;
                System.out.println(prompt);
                userResponse = keypadInput.nextInt();
                if (userResponse == 0) tonesMenu(keypadInput);
            }
            case 6 -> {
                System.out.println("Keypad tones");
                prompt = """
                        0. Back
                        """;
                System.out.println(prompt);
                userResponse = keypadInput.nextInt();
                if (userResponse == 0) tonesMenu(keypadInput);
            }
            case 7 -> {
                System.out.println("Warning and games tones");
                prompt = """
                        0. Back
                        """;
                System.out.println(prompt);
                userResponse = keypadInput.nextInt();
                if (userResponse == 0) tonesMenu(keypadInput);
            }
            case 8 -> {
                System.out.println("Vibrating alert");
                prompt = """
                        0. Back
                        """;
                System.out.println(prompt);
                userResponse = keypadInput.nextInt();
                if (userResponse == 0) tonesMenu(keypadInput);
            }
            case 9 -> {
                System.out.println("Screen saver");
                prompt = """
                        0. Back
                        """;
                System.out.println(prompt);
                userResponse = keypadInput.nextInt();
                if (userResponse == 0) tonesMenu(keypadInput);
            }
            case 0 -> mainMenuFunction();
            case 99 -> homePage();
            default -> {homePage();}
        }
    }

    private static void clockMenu(Scanner keypadInput) {
        String prompt;
        int userResponse;
        System.out.println("Clock -");
        prompt = """
                1. Alarm clock
                2. Clock settings
                3. Date settings
                4. Stopwatch
                5. Countdown timer
                6. Auto update of date and time
                0. Back
                
                99. Cancel
                """;
        System.out.println(prompt);
        userResponse = keypadInput.nextInt();
        switch (userResponse){
            case 1 -> {
                System.out.println("Alarm clock -");
                prompt = """
                        0. Back
                        """;
                System.out.println(prompt);
                userResponse = keypadInput.nextInt();
                if (userResponse == 0) { clockMenu(keypadInput); }
            }
            case 2 -> {
                System.out.println("Clock settings -");
                prompt = """
                        0. Back
                        """;
                System.out.println(prompt);
                userResponse = keypadInput.nextInt();
                if (userResponse == 0) clockMenu(keypadInput);
            }
            case 3 -> {
                System.out.println("Date settings -");
                prompt = """
                        0. Back
                        """;
                System.out.println(prompt);
                userResponse = keypadInput.nextInt();
                if (userResponse == 0) clockMenu(keypadInput);
            }
            case 4 -> {
                System.out.println("Stopwatch -");
                prompt = """
                        0. Back
                        """;
                System.out.println(prompt);
                userResponse = keypadInput.nextInt();
                if (userResponse == 0) clockMenu(keypadInput);
            }
            case 5 -> {
                System.out.println("Countdown timer -");
                prompt = """
                        0. Back
                        """;
                System.out.println(prompt);
                userResponse = keypadInput.nextInt();
                if (userResponse == 0) clockMenu(keypadInput);
            }
            case 6 -> {
                System.out.println("Auto update of date and time -");
                prompt = """
                        0. Back
                        """;
                System.out.println(prompt);
                userResponse = keypadInput.nextInt();
                if (userResponse == 0) clockMenu(keypadInput);
            }
            case 0 -> mainMenuFunction();
            case 99 -> homePage();
            default -> {
                System.out.println("invalid");
                { homePage(); }
            }
        }
    }

    private static void callRegisterMenu(Scanner keypadInput) {
        int userResponse;
        String prompt;
        System.out.println("Call register -");
        prompt = """
                1. Missed calls
                2. Received calls
                3. Dialled numbers
                4. Erase recent call lists
                5. Show call duration
                6. Show call costs
                7. Calls cost settings
                8. Prepaid credit
                0. Back
                
                99. Cancel
                """;
        System.out.println(prompt);
        userResponse = keypadInput.nextInt();
        switch (userResponse){
                case 1 -> {
                    System.out.println("Missed calls -");
                    prompt = """
                        0. Back
                        """;
                    System.out.println(prompt);
                    userResponse = keypadInput.nextInt();
                    if (userResponse == 0) callRegisterMenu(keypadInput);
                }
                case 2 -> {
                    System.out.println("Received calls -");
                    prompt = """
                        0. Back
                        """;
                    System.out.println(prompt);
                    userResponse = keypadInput.nextInt();
                    if (userResponse == 0) callRegisterMenu(keypadInput);
                }
                case 3 -> {
                    System.out.println("Dialled numbers -");
                    prompt = """
                        0. Back
                        """;
                    System.out.println(prompt);
                    userResponse = keypadInput.nextInt();
                    if (userResponse == 0) callRegisterMenu(keypadInput);
                }
                case 4 -> {
                    System.out.println("Erase recent call lists -");
                    prompt = """
                        0. Back
                        """;
                    System.out.println(prompt);
                    userResponse = keypadInput.nextInt();
                    if (userResponse == 0) callRegisterMenu(keypadInput);
                }
                case 5 -> showCallDurationMenu(keypadInput);
                case 6 -> showCallCostMenu(keypadInput);
                case 7 -> callCostSettingsMenu(keypadInput);
                case 8 -> {
                    System.out.println("Prepaid credit -");
                    prompt = """
                            0. Back
                            """;
                    System.out.println(prompt);
                    userResponse = keypadInput.nextInt();
                    if (userResponse == 0) callRegisterMenu(keypadInput);
                }
                case 0 -> mainMenuFunction();
                case 99 -> homePage();
            default -> {
                System.out.println("invalid");
                { homePage(); }
            }
        }
    }

    private static void showCallDurationMenu(Scanner keypadInput) {
        int userResponse;
        String prompt;
        System.out.println("Show call duration -");
        prompt = """
                1. Last call duration
                2. All calls' duration
                3. Received calls' duration
                4. Dialled calls' duration
                5. Clear timers
                0. Back
                
                99. Cancel
                """;
        System.out.println(prompt);
        try{
        userResponse = keypadInput.nextInt();
        switch (userResponse){
            case 1 -> {
                System.out.println("Last call duration -");
                prompt = """
                        0. Back
                        """;
                System.out.println(prompt);
                userResponse = keypadInput.nextInt();
                if (userResponse == 0) showCallDurationMenu(keypadInput);
            }
            case 2 -> {
                System.out.println("All calls' duration -");
                prompt = """
                        0. Back
                        """;
                System.out.println(prompt);
                userResponse = keypadInput.nextInt();
                if (userResponse == 0) showCallDurationMenu(keypadInput);
            }
            case 3 -> {
                System.out.println("Received calls' duration -");
                prompt = """
                        0. Back
                        """;
                System.out.println(prompt);
                userResponse = keypadInput.nextInt();
                if (userResponse == 0) showCallDurationMenu(keypadInput);
            }
            case 4 -> {
                System.out.println("Dialled calls' duration -");
                prompt = """
                        0. Back
                        """;
                System.out.println(prompt);
                userResponse = keypadInput.nextInt();
                if (userResponse == 0) showCallDurationMenu(keypadInput);
            }
            case 5 -> {
                System.out.println("Clear timers -");
                prompt = """
                        0. Back
                        """;
                System.out.println(prompt);
                userResponse = keypadInput.nextInt();
                if (userResponse == 0) showCallDurationMenu(keypadInput);
            }
            case 0 -> callRegisterMenu(keypadInput);
            case 99 -> homePage();
            default -> {
                System.out.println("invalid");
                { homePage(); }
            }
        }
        }catch (InputMismatchException error) {
            System.out.println("Invalid input dude!");
            callRegisterMenu(keypadInput);
        }
    }

    private static void showCallCostMenu(Scanner keypadInput) {
        int userResponse;
        String prompt;
        System.out.println("Show call costs");
        prompt = """
                1. Last call cost
                2. All calls' cost
                3. Clear counters
                0. Back
                
                99. Cancel
                """;
        System.out.println(prompt);
        try{
        userResponse = keypadInput.nextInt();
        switch (userResponse) {
            case 1 -> {
                System.out.println("Last call cost -");
                prompt = """
                        0. Back
                        """;
                System.out.println(prompt);
                userResponse = keypadInput.nextInt();
                if (userResponse == 0) showCallCostMenu(keypadInput);
            }
            case 2 -> {
                System.out.println("All calls' cost -");
                prompt = """
                        0. Back
                        """;
                System.out.println(prompt);
                userResponse = keypadInput.nextInt();
                if (userResponse == 0) showCallCostMenu(keypadInput);
            }
            case 3 -> {
                System.out.println("Clear counters -");
                prompt = """
                        0. Back
                        """;
                System.out.println(prompt);
                userResponse = keypadInput.nextInt();
                if (userResponse == 0) showCallCostMenu(keypadInput);
            }
            case 0 -> showCallCostMenu(keypadInput);
            case 99 -> homePage();
            default -> {
                System.out.println("invalid");
                { homePage(); }
            }
        }
        }catch (InputMismatchException error) {
            System.out.println("Invalid input dude!");
            showCallDurationMenu(keypadInput);
        }
    }

    private static void callCostSettingsMenu(Scanner keypadInput) {
        int userResponse;
        String prompt;
        System.out.println("Calls cost settings -");
        prompt = """
                1. Call cost limit
                2. Show costs in
                0. Back
                
                99. Cancel
                """;
        System.out.println(prompt);
        try{
        userResponse = keypadInput.nextInt();
        switch (userResponse){
            case 1 -> {
                System.out.println("Call cost limit -");
                prompt = """
                        0. Back
                        """;
                System.out.println(prompt);
                userResponse = keypadInput.nextInt();
                if (userResponse == 0) callCostSettingsMenu(keypadInput);
            }
            case 2 -> {
                System.out.println("Show costs in -");
                prompt = """
                        0. Back
                        """;
                System.out.println(prompt);
                userResponse = keypadInput.nextInt();
                if (userResponse == 0) callCostSettingsMenu(keypadInput);
            }
            case 0 -> callRegisterMenu(keypadInput);
            case 99 -> homePage();
            default -> {
                System.out.println("invalid");
                { homePage(); }
            }
        }
        }catch (InputMismatchException error) {
            System.out.println("Invalid input dude!");
            callCostSettingsMenu(keypadInput);
        }
    }

    private static void messageMenu(Scanner keypadInput) {
        int userResponse;
        String prompt;
        System.out.println("Messages -");
        prompt = """
                1. Write messages
                2. Inbox
                3. Outbox
                4. Picture messages
                5. Templates
                6. Smileys
                7. Message settings
                8. Info service
                9. Voice mailbox number
                10.Service command editor
                0. Back
                
                99. Cancel
                    """;
        System.out.println(prompt);
        try{
        userResponse = keypadInput.nextInt();
        switch (userResponse){
            case 1 -> {
                System.out.println("Write messages -");
                prompt = """
                        0. Back
                        """;
                System.out.println(prompt);
                userResponse = keypadInput.nextInt();
                if (userResponse == 0){ messageMenu(keypadInput); }
            }
            case 2 -> {
                System.out.println("Inbox -");
                prompt = """
                        0. Back
                        """;
                System.out.println(prompt);
                userResponse = keypadInput.nextInt();
                if (userResponse == 0){ messageMenu(keypadInput); }
            }
            case 3 -> {
                System.out.println("Outbox -");
                prompt = """
                        0. Back
                        """;
                System.out.println(prompt);
                userResponse = keypadInput.nextInt();
                if (userResponse == 0){ messageMenu(keypadInput); }
            }
            case 4 -> {
                System.out.println("Picture messages -");
                prompt = """
                        0. Back
                        """;
                System.out.println(prompt);
                userResponse = keypadInput.nextInt();
                if (userResponse == 0){ messageMenu(keypadInput); }
            }
            case 5 -> {
                System.out.println("Templates -");
                prompt = """
                        0. Back
                        """;
                System.out.println(prompt);
                userResponse = keypadInput.nextInt();
                if (userResponse == 0){ messageMenu(keypadInput); }
            }
            case 6 -> {
                System.out.println("Smileys -");
                prompt = """
                        0. Back
                        """;
                System.out.println(prompt);
                userResponse = keypadInput.nextInt();
                if (userResponse == 0){ messageMenu(keypadInput); }
            }
            case 7 -> messageSettingsMenu(keypadInput);
            case 8 -> {
                System.out.println("Info service -");
                prompt = """
                        0. Back
                        """;
                System.out.println(prompt);
                userResponse = keypadInput.nextInt();
                if (userResponse == 0){ messageMenu(keypadInput); }
            }
            case 9 -> {
                System.out.println("Voice mailbox number -");
                prompt = """
                        0. Back
                        """;
                System.out.println(prompt);
                userResponse = keypadInput.nextInt();
                if (userResponse == 0){ messageMenu(keypadInput); }
            }
            case 10 -> {
                System.out.println("Service command editor");
                prompt = """
                        0. Back
                        """;
                System.out.println(prompt);
                userResponse = keypadInput.nextInt();
                if (userResponse == 0){ messageMenu(keypadInput); }
            }
            case 0 -> mainMenuFunction();
            case 99 -> homePage();
            default -> {
                System.out.println("invalid");
                { homePage(); }
            }

        }
        }catch (InputMismatchException error) {
            System.out.println("Invalid input dude!");
            messageMenu(keypadInput);
        }
    }

    private static void messageSettingsMenu(Scanner keypadInput) {
        String prompt;
        System.out.println("Message settings -");
        prompt = """
            1. Set 1
            2. Common
            0. Back
            
            99. Cancel
            """;
        System.out.println(prompt);
        try{
        int userResponse = keypadInput.nextInt();
        switch (userResponse){
            case 1 -> set1Menu(keypadInput);

            case 2 -> commonMenu(keypadInput);

            case 0 -> messageMenu(keypadInput);
            case 99 -> homePage();
            default -> {
                System.out.println("invalid");
                { homePage(); }
            }
        }
        }catch (InputMismatchException error) {
            System.out.println("Invalid input dude!");
            messageSettingsMenu(keypadInput);}
    }

    private static void commonMenu(Scanner keypadInput) {
        String prompt;
        System.out.println("Common -");
        prompt = """
            1. Delivery report
            2. Reply via some centre
            3. Character support
            0. Back
            
            99. Cancel
            """;
        System.out.println(prompt);
        try{
        int userResponse = keypadInput.nextInt();
        switch (userResponse) {
                case 1 -> {
                    System.out.println("Delivery report -");
                    prompt = """
                            0. Back
                            """;
                    System.out.println(prompt);
                    userResponse = keypadInput.nextInt();
                    if (userResponse == 0) {
                        commonMenu(keypadInput);
                    }

                }
            case 2 -> {
                System.out.println("Reply via some centre -");
                prompt = """
                        0. Back
                        """;
                System.out.println(prompt);
                userResponse = keypadInput.nextInt();
                if (userResponse == 0) {
                    commonMenu(keypadInput);
                }
            }
            case 3 -> {
                System.out.println("Character support -");
                prompt = """
                            0. Back
                            """;
                System.out.println(prompt);
                userResponse = keypadInput.nextInt();
                if (userResponse == 0) {
                    commonMenu(keypadInput);
                }
            }
            case 99 -> homePage();
            case 0 -> messageSettingsMenu(keypadInput);
            default -> {
                System.out.println("invalid");
                { homePage(); }
            }
        }

            if (userResponse == 0) messageSettingsMenu(keypadInput);
        }catch (InputMismatchException error) {
            System.out.println("Invalid input dude!");
            commonMenu(keypadInput);
        }
    }

    private static void set1Menu(Scanner keypadInput) {
        String prompt;
            System.out.println("Set 1 -");
                prompt = """
                    1. Message centre number
                    2. Message sent as
                    3. Message validity
                    0. Back
                    
                    99. Cancel
                    """;
                System.out.println(prompt);
        try{
        int userResponse = keypadInput.nextInt();
        switch (userResponse) {
            case 1 -> {
                System.out.println("Message centre number -");
                prompt = """
                            0. Back
                            """;
                System.out.println(prompt);
                userResponse = keypadInput.nextInt();
                if (userResponse == 0) {
                    set1Menu(keypadInput);
                }

            }
            case 2 -> {
                System.out.println("Message sent as -");
                prompt = """
                        0. Back
                        """;
                System.out.println(prompt);
                userResponse = keypadInput.nextInt();
                if (userResponse == 0) {
                    set1Menu(keypadInput);
                }
            }
            case 3 -> {
                System.out.println("Message validity -");
                prompt = """
                            0. Back
                            """;
                System.out.println(prompt);
                userResponse = keypadInput.nextInt();
                if (userResponse == 0) {
                    set1Menu(keypadInput);
                }
            }
            case 0 -> messageSettingsMenu(keypadInput);
            case 99 -> homePage();
            default -> {
                System.out.println("invalid");
                { homePage(); }
            }
        }

        if (userResponse == 0) messageSettingsMenu(keypadInput);
        }catch (InputMismatchException error) {
            System.out.println("Invalid input dude!");
            set1Menu(keypadInput);
        }

    }

    private static void phoneBookMenu(Scanner keypadInput) {
        System.out.println("Phone book");
        String phoneBookPrompt = """
                        1. Search
                        2. Service Nos.
                        3. Add name
                        4. Erase
                        5. Edit
                        6. Assign tone
                        7. Send b'card
                        8. Options
                        9. Speed dials
                        10.Voice tags
                        0. Back
                        
                        99. Cancel
                        """;
        System.out.println(phoneBookPrompt);
        try{
        int userResponse = keypadInput.nextInt();
        String prompt;
        switch (userResponse){
            case 1 -> {
                System.out.println("Search -");
                prompt = "0. Back\n";
                System.out.println(prompt);
                userResponse = keypadInput.nextInt();
                if (userResponse == 0) {
                    phoneBookMenu(keypadInput);
                }
            }
            case 2 -> {
                System.out.println("Service Nos. -");
                prompt = "0. Back\n";
                System.out.println(prompt);
                userResponse = keypadInput.nextInt();
                if (userResponse == 0) {
                    phoneBookMenu(keypadInput);
                }
            }
            case 3 -> {
                System.out.println("Add name -");
                prompt = "0. Back\n";
                System.out.println(prompt);
                userResponse = keypadInput.nextInt();
                if (userResponse == 0) {
                    phoneBookMenu(keypadInput);
                }
            }
            case 4 -> {
                System.out.println("Erase -");
                prompt = "0. Back\n";
                System.out.println(prompt);
                userResponse = keypadInput.nextInt();
                if (userResponse == 0) {
                    phoneBookMenu(keypadInput);
                }
            }
            case 5 -> {
                System.out.println("Edit -");
                prompt = "0. Back\n";
                System.out.println(prompt);
                userResponse = keypadInput.nextInt();
                if (userResponse == 0) {
                    phoneBookMenu(keypadInput);
                }
            }
            case 6 -> {
                System.out.println("Assign tone -");
                prompt = "0. Back\n";
                System.out.println(prompt);
                userResponse = keypadInput.nextInt();
                if (userResponse == 0) {
                    phoneBookMenu(keypadInput);
                }
            }
            case 7 -> {
                System.out.println("Send b'card -");
                prompt = "0. Back\n";
                System.out.println(prompt);
                userResponse = keypadInput.nextInt();
                if (userResponse == 0) {
                    phoneBookMenu(keypadInput);
                }
            }
            case 8 -> optionMenu(keypadInput);
            case 9 -> {
                System.out.println("Speed -");
                prompt = "0. Back\n";
                System.out.println(prompt);
                userResponse = keypadInput.nextInt();
                if (userResponse == 0) {
                    phoneBookMenu(keypadInput);
                }
            }
            case 10 -> {
                System.out.println("Voice tags -");
                prompt = "0. Back\n";
                System.out.println(prompt);
                userResponse = keypadInput.nextInt();
                if (userResponse == 0) {
                    phoneBookMenu(keypadInput);
                }
            }
            case 0 -> mainMenuFunction();
            case 99 -> homePage();
            default -> {
                System.out.println("invalid");
                { homePage(); }
            }
        }
        }catch (InputMismatchException error) {
            System.out.println("Invalid input dude!");
            phoneBookMenu(keypadInput);
        }
    }

    private static void optionMenu(Scanner keypadInput) {
        int userResponse;
        String prompt;
        System.out.println("Options -");
        prompt = """
                1. Type of view
                2. Memory status
                0. Back
                
                99. Cancel
                """;
        System.out.println(prompt);
        try{
        userResponse = keypadInput.nextInt();
        switch (userResponse) {
            case 1 -> {
                System.out.println("Type of view -");
                prompt = """
                        0. Back
                        """;
                System.out.println(prompt);
                userResponse = keypadInput.nextInt();
                if (userResponse == 0) {
                    optionMenu(keypadInput);
                }
            }
            case 2 -> {
                System.out.println("Memory status -");
                prompt = """
                        0. Back
                        """;
                System.out.println(prompt);
                userResponse = keypadInput.nextInt();
                if (userResponse == 0) {
                    optionMenu(keypadInput);
                }
            }
            case 0 -> phoneBookMenu(keypadInput);
            case 99 -> homePage();
            default -> {
                System.out.println("invalid");
                { homePage(); }
            }
        }
        }catch (InputMismatchException error) {
            System.out.println("Invalid input dude!");
            optionMenu(keypadInput);
        }
    }

    private static void mainSettingsMenu(Scanner keypadInput) {
        int userResponse;
        System.out.println("Settings -");
        String settingsPrompt = """
                1. Call settings
                2. Phone settings
                3. Security settings
                4. Restore factory settings
                0. Back
                
                99. Cancel
                """;
        System.out.println(settingsPrompt);

        userResponse = keypadInput.nextInt();
        settingsGroup(keypadInput, userResponse);
    }

    private static void settingsGroup(Scanner keypadInput, int userResponse) {
        String prompt;
        try{
        switch (userResponse){
            case 1 -> callSettingsMenu(keypadInput);
            case 2 -> phoneSettingMenu(keypadInput);
            case 3 -> securitySettingsMenu (keypadInput);
            case 4 -> {
                System.out.println("Restore factory settings -");
                prompt = """
                        0. Back
                        """;
                System.out.println(prompt);

                userResponse = keypadInput.nextInt();
                if (userResponse == 0) { mainSettingsMenu(keypadInput); }
            }
            case 0 -> mainMenuFunction();
            case 99 -> homePage();
            default -> {
                System.out.println("invalid");
                { homePage(); }
            }
        }
        }catch (InputMismatchException error) {
            System.out.println("Invalid input dude!");
            settingsGroup(keypadInput, userResponse);
        }
    }

    private static void callSettingsMenu(Scanner keypadInput) {
        int userResponse;
        String prompt;
        System.out.println("Call settings -");
        prompt = """
                1. Automatic redial
                2. Speed dialling
                3. Call waiting options
                4. Own number sending
                5. Phone line in use
                6. Automatic answer
                0. Back
                
                99. Cancel
                """;
        System.out.println(prompt);
        try{
        userResponse = keypadInput.nextInt();
        switch (userResponse){
            case 1 -> {
                System.out.println("Automatic redial -");
                prompt = """
                        0. Back
                        """;
                System.out.println(prompt);
                userResponse = keypadInput.nextInt();
                if (userResponse == 0){ callSettingsMenu(keypadInput); }
            }
            case 2 -> {
                System.out.println("Speed dialling -");
                prompt = """
                        0. Back
                        """;
                System.out.println(prompt);
                userResponse = keypadInput.nextInt();
                if (userResponse == 0){ callSettingsMenu(keypadInput); }
            }
            case 3 -> {
                System.out.println("Call waiting options -");
                prompt = """
                        0. Back
                        """;
                System.out.println(prompt);
                userResponse = keypadInput.nextInt();
                if (userResponse == 0){ callSettingsMenu(keypadInput); }
            }
            case 4 -> {
                System.out.println("Own number sending -");
                prompt = """
                        0. Back
                        """;
                System.out.println(prompt);
                userResponse = keypadInput.nextInt();
                if (userResponse == 0){ callSettingsMenu(keypadInput); }
            }
            case 5 -> {
                System.out.println("Phone line in use -");
                prompt = """
                        0. Back
                        """;
                System.out.println(prompt);
                userResponse = keypadInput.nextInt();
                if (userResponse == 0){ callSettingsMenu(keypadInput); }
            }
            case 6 -> {
                System.out.println("Automatic answer -");
                prompt = """
                        0. Back
                        """;
                System.out.println(prompt);
                userResponse = keypadInput.nextInt();
                if (userResponse == 0){ callSettingsMenu(keypadInput); }
            }
            case 0 -> mainSettingsMenu(keypadInput);
            case 99 -> homePage();
            default -> {
                System.out.println("invalid");
                { homePage(); }
            }
        }
        }catch (InputMismatchException error) {
            System.out.println("Invalid input dude!");
            callSettingsMenu(keypadInput);
        }
    }

    private static void phoneSettingMenu(Scanner keypadInput) {
        String prompt;
        int userResponse;
        System.out.println("Phone settings -");
        prompt = """
                1. Language
                2. Cell info display
                3. Welcome note
                4. Network selection
                5. Lights
                6. Confirm SIM service actions
                0. Back
                
                99. Cancel
                """;
        System.out.println(prompt);
        try{
        userResponse = keypadInput.nextInt();
        switch (userResponse){
            case 1 -> {
                System.out.println("Language -");
                prompt = """
                        0. Back
                        """;
                System.out.println(prompt);
                userResponse = keypadInput.nextInt();
                if (userResponse == 0){ phoneSettingMenu(keypadInput); }
            }
            case 2 -> {
                System.out.println("Cell info display -");
                prompt = """
                        0. Back
                        """;
                System.out.println(prompt);
                userResponse = keypadInput.nextInt();
                if (userResponse == 0){ phoneSettingMenu(keypadInput); }
            }
            case 3 -> {
                System.out.println("Welcome note -");
                prompt = """
                        0. Back
                        """;
                System.out.println(prompt);
                userResponse = keypadInput.nextInt();
                if (userResponse == 0){ phoneSettingMenu(keypadInput); }
            }
            case 4 -> {
                System.out.println("Network selection -");
                prompt = """
                        0. Back
                        """;
                System.out.println(prompt);
                userResponse = keypadInput.nextInt();
                if (userResponse == 0){ phoneSettingMenu(keypadInput); }
            }
            case 5 -> {
                System.out.println("Lights -");
                prompt = """
                        0. Back
                        """;
                System.out.println(prompt);
                userResponse = keypadInput.nextInt();
                if (userResponse == 0){ phoneSettingMenu(keypadInput); }
            }
            case 6 -> {
                System.out.println("Confirm SIM service actions -");
                prompt = """
                        0. Back
                        """;
                System.out.println(prompt);
                userResponse = keypadInput.nextInt();
                if (userResponse == 0){ phoneSettingMenu(keypadInput); }
            }
            case 0 -> mainSettingsMenu(keypadInput);
            case 99 -> homePage();
            default -> {
                System.out.println("invalid");
                { homePage(); }
            }
        }
        }catch (InputMismatchException error) {
            System.out.println("Invalid input dude!");
            phoneSettingMenu(keypadInput);}
    }

    private static void securitySettingsMenu(Scanner keypadInput) {
        String prompt;
        int userResponse;
        System.out.println("Security settings -");
        prompt = """
                1. PIN code request
                2. Call barring service
                3. Fixed dialling
                4. Closed user group
                5. Phone security
                6. Changed access codes
                0. Back
                
                99. Cancel
                """;
        System.out.println(prompt);
        try{
        userResponse = keypadInput.nextInt();
        switch (userResponse){
            case 1 -> {
                System.out.println("PIN code request -");
                prompt = """
                        0. Back
                        
                        99. Cancel
                        """;
                System.out.println(prompt);
                userResponse = keypadInput.nextInt();
                if (userResponse == 0) { securitySettingsMenu(keypadInput); }
                if (userResponse == 99) homePage();
            }
            case 2 -> {
                System.out.println("Call barring service -");
                prompt = """
                        0. Back
                        
                        99. Cancel
                        """;
                System.out.println(prompt);
                userResponse = keypadInput.nextInt();
                if (userResponse == 0) { securitySettingsMenu(keypadInput); }
                if (userResponse == 99) homePage();
            }
            case 3 -> {
                System.out.println("Fixed dialling -");
                prompt = """
                        0. Back
                        
                        99. Cancel
                        """;
                System.out.println(prompt);
                userResponse = keypadInput.nextInt();
                if (userResponse == 0) { securitySettingsMenu(keypadInput); }
                if (userResponse == 99) homePage();
            }
            case 4 -> {
                System.out.println("Closed user group -");
                prompt = """
                        0. Back
                        
                        99. Cancel
                        """;
                System.out.println(prompt);
                userResponse = keypadInput.nextInt();
                if (userResponse == 0) { securitySettingsMenu(keypadInput); }
                if (userResponse == 99) homePage();
            }
            case 5 -> {
                System.out.println("Phone security -");
                prompt = """
                        0. Back
                        
                        99. Cancel
                        """;
                System.out.println(prompt);
                userResponse = keypadInput.nextInt();
                if (userResponse == 0) { securitySettingsMenu(keypadInput); }
                if (userResponse == 99) homePage();
            }
            case 6 -> {
                System.out.println("Changed access codes -");
                prompt = """
                        0. Back
                        
                        99. Cancel
                        """;
                System.out.println(prompt);
                userResponse = keypadInput.nextInt();
                if (userResponse == 0) { securitySettingsMenu(keypadInput); }
                if (userResponse == 99) homePage();
            }
            case 0 -> mainSettingsMenu(keypadInput);
            case 99 -> homePage();
            default -> {
                System.out.println("invalid");
                { homePage(); }
            }
        }
        }catch (InputMismatchException error) {
            System.out.println("Invalid input dude!");
            securitySettingsMenu(keypadInput);}
    }
}
