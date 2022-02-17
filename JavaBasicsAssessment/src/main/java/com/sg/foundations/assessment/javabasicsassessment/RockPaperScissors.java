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
        int rounds;
        int playerChoice;
        int aiChoice;
        int gamesWon;
        int gamesLost;
        int gamesDrawn;       
        int continueGame = 0;
        
        do{;
            //reset variables for new game
            rounds = 0;
            gamesWon = 0;
            gamesLost = 0;
            gamesDrawn = 0;
            continueGame = 0;
            
            //Checks how many rounds the player and ai will battle
            System.out.println("Hello. How many rounds do you want to play? (1-10)");
            rounds = Integer.parseInt(inputReader.nextLine());
            
            //Checks if rounds are within range 1-10, if they are not it will quit the program
            if (!(rounds > 0 && rounds <11)){ //Returns true as long as rounds are not within the acceptable range.
                System.out.println("Error, number of rounds outside of range 1-10. Quiting program. ");
                break;
            }
            
            //The main loop of the game
            for (int i = 0; i < rounds; i++){
                //Asks user to throw out their hand
                System.out.println("");
                System.out.println("Welcome to round "+(i+1)+" of ROCK PAPER SCISSORS ");
                System.out.println("What will you throw? ");
                System.out.println("Rock: 1. Paper: 2. Scissors: 3. ");
                playerChoice = Integer.parseInt(inputReader.nextLine());
                
                //Displays player's hand
                if(playerChoice == 1){
                    System.out.println("You have thrown Rock");
                } else if(playerChoice == 2){
                    System.out.println("You have thrown Paper");
                } else if(playerChoice == 3){
                    System.out.println("You have thrown Scissors");
                }
                
                
                //Ai makes their choice using randomizer
                aiChoice = randomizer.nextInt(3)+1;
                
                //Displays AI's choice
                if(aiChoice == 1){
                    System.out.println("The AI has thrown Rock");
                } else if(aiChoice == 2){
                    System.out.println("The AI has thrown Paper");
                } else if(aiChoice == 3){
                    System.out.println("The AI has thrown Scissors");
                }
                
                //Works out the results
                if(playerChoice == aiChoice){ //Draw
                    System.out.println("Draw!");
                    gamesDrawn++;
                    
                } else if(((playerChoice == 1)&&(aiChoice == 3)) || ((playerChoice == 2)&&(aiChoice == 1))|| ((playerChoice == 3)&&(aiChoice == 2))){ //Player wins
                    System.out.println("Player Wins!");
                    gamesWon++;
                    
                } else if(((aiChoice == 1)&&(playerChoice == 3)) || ((aiChoice == 2)&&(playerChoice == 1))|| ((aiChoice == 3)&&(playerChoice == 2))){ //AI wins
                    System.out.println("AI Wins!");
                    gamesLost++;
                    
                } else { //Error handle
                    System.out.println("Error, something went wrong!");
                }
                
            }
            
            //Results of the rounds
            System.out.println("");
            System.out.println("Competition over!");
            System.out.println("The Player has won: " +gamesWon+ " times");
            System.out.println("The AI has won: " +gamesLost+ " times");
            System.out.println("There was a draw: " +gamesDrawn+ " times");
            
            if(gamesWon>gamesLost){
                System.out.println("Congratulations, Player has won");
            } else if(gamesWon<gamesLost){
                System.out.println("Congratulations, AI has won");
            } else if(gamesWon==gamesLost){
                System.out.println("Congratulations, it was a DRAW!");
            }
            
            
            //Checks if the user wants to continue playing, otherwise exits the game.
            System.out.println("Do you want to play again? Enter '1' to play again");
            continueGame = Integer.parseInt(inputReader.nextLine());
            
        } while(continueGame == 1);
        System.out.println("Thanks for playing!");
    }
}
