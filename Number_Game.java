import java.util.Random;
import java.util.Scanner;

public class Number_Game {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	     Random rn = new Random();
		int minRange = 1;
		int maxRange = 100;
		int maxAttempts = 5;
		int totalAttempts = 0;
		int roundPlayed = 0;
		boolean play_Again = true;
		System.out.println("Welcome to the Number Game!");
		 while (play_Again) {
	            int tarNo = rn.nextInt(maxRange - minRange + 1) + minRange;
	            int attempts = 0;
	            boolean guess = false;
                System.out.println("Round " + (roundPlayed + 1));
	            System.out.println("I have selected a random number between " + minRange + " and " + maxRange + ". Try to guess it!");
	            while (attempts < maxAttempts) {
	                System.out.print("Enter your guess: ");
	                int userGuess = sc.nextInt();
	                attempts++;
	                if (userGuess == tarNo) {
	                    System.out.println("Congratulations! You guessed the correct number in " + attempts + " attempts.");
	                    guess = true;
	                    break;
	                } else if (userGuess < tarNo) {
	                    System.out.println("Too low! Guess again.");
	                } else {
	                    System.out.println("Too high! Guess again.");
	                }
	            }
	            if (!guess) {
	                System.out.println("Sorry, you've run out of attempts. The correct number was " + tarNo + ".");
	            }
	            totalAttempts += attempts;
	            roundPlayed++;
	            System.out.print("Do you want to play again? (yes/no): ");
	            String playAgain = sc.next().toLowerCase();
	            if (!playAgain.equals("yes")) {
	                play_Again = false;
	            }
	        }

	        System.out.println("Thanks for playing!");
	        System.out.println("You played " + roundPlayed + " round(s) and took an average of " + (double) totalAttempts / roundPlayed + " attempts per round.");
	    }
	
	}


