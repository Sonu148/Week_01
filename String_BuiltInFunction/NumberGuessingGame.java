import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {

    // Method to generate a random guess within the range
    public static int generateGuess(int lowerBound, int upperBound) {
        Random random = new Random();
        return lowerBound + random.nextInt(upperBound - lowerBound + 1);
    }

    // Method to get feedback from the user
    public static String getFeedback(Scanner scanner) {
        System.out.println("Is the guess too high (H), too low (L), or correct (C)?");
        return scanner.nextLine().trim().toUpperCase();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Think of a number between 1 and 100, and I will try to guess it!");
        System.out.println("Provide feedback: 'H' for High, 'L' for Low, 'C' for Correct.");

        int lowerBound = 1;
        int upperBound = 100;
        boolean guessedCorrectly = false;

        while (!guessedCorrectly) {
            // Generate a guess
            int guess = generateGuess(lowerBound, upperBound);
            System.out.println("My guess is: " + guess);

            // Get feedback from the user
            String feedback = getFeedback(scanner);

            // Update bounds or determine correctness
            switch (feedback) {
                case "H":
                    upperBound = guess - 1;
                    break;
                case "L":
                    lowerBound = guess + 1;
                    break;
                case "C":
                    System.out.println("Yay! I guessed your number: " + guess);
                    guessedCorrectly = true;
                    break;
                default:
                    System.out.println("Invalid input. Please enter 'H', 'L', or 'C'.");
            }

            // Check for invalid range (shouldn't happen with correct feedback)
            if (lowerBound > upperBound) {
                System.out.println("The feedback provided has created an impossible range. Let's restart!");
                break;
            }
        }

        scanner.close();
    }
}