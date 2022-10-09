package operators;

import java.util.Scanner;

public class numberGame {
	
	// Function that implements the
    // number guessing game
    public static void
    guessingNumberGame()
    {
        // Scanner Class
        Scanner sc = new Scanner(System.in);
 
        // Generate the numbers
        int number = 1 + (int)(100* Math.random());
 
        // Given K trials
        int A = 5;
 
        int i, guess;
 
        System.out.println("A number is chosen"+ " between 1 to 100."+ "Guess the number"+ " within 5 trials.");
 
        // Iterate over A Trials
        for (i = 0; i < A; i++) {
 
            System.out.println("Guess the number:");
 
            // Take input for guessing
            guess = sc.nextInt();
 
            // If the number is guessed
            if (number == guess) {
                System.out.println("Congratulations!" + " You guessed the number.");
                break;
            }
            else if (number > guess
                     && i != A - 1) {
                System.out.println("The number is " + "greater than " + guess);
            }
            else if (number < guess
                     && i != A - 1) {
                System.out.println("The number is" + " less than " + guess);
            }
        }
 
        if (i == A) {
            System.out.println("You have exhausted" + " A trials.");
 
            System.out.println("The number was " + number);
        }
    }
 
    // Driver Code
    public static void
    main(String arg[])
    {
 
        // Function Call
        guessingNumberGame();
    }
}


