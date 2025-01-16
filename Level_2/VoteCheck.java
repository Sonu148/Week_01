import java.util.Random;
import java.util.Scanner;

public class VoteCheck {

    // Method to generate random ages for a given number of students
    public static int[] generateAges(int numberOfStudents) {
        Random rand = new Random();
        int[] ages = new int[numberOfStudents];

        for (int i = 0; i < numberOfStudents; i++) {
            ages[i] = rand.nextInt(90) + 10; // Generates a random age between 10 and 99
        }
        return ages;
    }

    // Method to check whether a student can vote based on their age
    public static String[][] checkVotingEligibility(int[] ages) {
        String[][] result = new String[ages.length][2];

        for (int i = 0; i < ages.length; i++) {
            if (ages[i] < 0) {
                result[i][0] = String.valueOf(ages[i]);
                result[i][1] = "Invalid age";
            } else {
                result[i][0] = String.valueOf(ages[i]);
                result[i][1] = (ages[i] >= 18) ? "Can Vote" : "Cannot Vote";
            }
        }
        return result;
    }

    // Method to display the 2D array in a tabular format
    public static void displayVotingResults(String[][] results) {
        System.out.printf("%-10s %-20s\n", "Age", "Voting Eligibility");
        for (String[] result : results) {
            System.out.printf("%-10s %-20s\n", result[0], result[1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input for the number of students
        System.out.print("Enter the number of students: ");
        int numberOfStudents = sc.nextInt();

        // Generate ages for the students
        int[] ages = generateAges(numberOfStudents);

        // Check voting eligibility
        String[][] votingResults = checkVotingEligibility(ages);

        // Display the results in tabular format
        displayVotingResults(votingResults);

        sc.close();
    }
}
