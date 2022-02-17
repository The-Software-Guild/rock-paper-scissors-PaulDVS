package com.sg.foundations.assessment.javabasicsassessment;

import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author Paul van Sittert
 */
public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner inputReader = new Scanner(System.in);
        Random randomizer = new Random();
        int rounds = 0;
        int continueGame = 0;
        
        do{
            System.out.println("Hello. How many rounds do you want to play? ");
            rounds = Integer.parseInt(inputReader.nextLine());
            
            //Checks if rounds are within range 1-10, if they are not it will quit the program
            if (!(rounds > 0 && rounds <11)){ //Returns true as long as rounds are not within the acceptable range.
                System.out.println("Error, number of rounds outside of range 1-10. Quiting program. ");
                break;
            }
            
            for (int i = 0; i < rounds; i++){
                
            }
            
            System.out.println("Do you want to play again? Enter '1' to play again");
            continueGame = Integer.parseInt(inputReader.nextLine());
            
        } while(continueGame == 1);
        System.out.println("Thank you for playing!");
    }
}
