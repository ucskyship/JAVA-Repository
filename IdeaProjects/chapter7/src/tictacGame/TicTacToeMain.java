package tictacGame;

import tictacGame.TicTacToe;

import java.util.Objects;
import java.util.Scanner;

public class TicTacToeMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        TicTacToe game = new TicTacToe();

        System.out.println("""
                
                
                        W E L C O M E
                        
                                                
               1. For next
                """);
        int userInput = input.nextInt();
        if(userInput == 1){
            game.display();
        }

        String result;
        int full;
        do{
            System.out.println("Player 1 lets Go --> ");
            game.player1(input.nextInt());
            result =game.result1();
            if(Objects.equals(result, " ")){
                System.out.println("Player 2 lets Go --> ");
                game.player2(input.nextInt());
                result = game.result2();
            }
            full = game.draw();


        }while (Objects.equals(result, " ")&& full !=9);
        if(full==9){
            System.out.println("No winner..");
        }
        if(!Objects.equals(result, " ")){
            System.out.println(result);
        }


    }
}