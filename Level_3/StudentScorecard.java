import java.util.Scanner;
import java.util.Random;

public class StudentScorecard {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number of students
        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();

        // Generate random PCM scores for students
        int[][] scores = generateScores(numStudents);

        // Calculate total, average, and percentage
        double[][] result = calculateResults(scores);

        // Display the scorecard
        displayScorecard(scores, result);
    }

    // Method to generate random 2-digit scores for PCM
    public static int[][] generateScores(int numStudents) {
        Random random = new Random();
        int[][] scores = new int[numStudents][3];

        for (int i = 0; i < numStudents; i++) {
            scores[i][0] = random.nextInt(41) + 60; // Physics score (60 to 100)
            scores[i][1] = random.nextInt(41) + 60; // Chemistry score (60 to 100)
            scores[i][2] = random.nextInt(41) + 60; // Math score (60 to 100)
        }
        return scores;
    }

    // Method to calculate total, average, and percentage
    public static double[][] calculateResults(int[][] scores) {
        double[][] results = new double[scores.length][3];

        for (int i = 0; i < scores.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;

            results[i][0] = total;
            results[i][1] = Math.round(average * 100.0) / 100.0;
            results[i][2] = Math.round(percentage * 100.0) / 100.0;
        }
        return results;
    }

    // Method to display the scorecard in tabular format
    public static void displayScorecard(int[][] scores, double[][] results) {
        System.out.println("Roll No.\tPhysics\tChemistry\tMaths\tTotal\tAverage\tPercentage");

        for (int i = 0; i < scores.length; i++) {
            System.out.print((i + 1) + "\t\t");
            System.out.print(scores[i][0] + "\t");
            System.out.print(scores[i][1] + "\t\t");
            System.out.print(scores[i][2] + "\t");
            System.out.print((int) results[i][0] + "\t");
            System.out.print(results[i][1] + "\t");
            System.out.println(results[i][2] + "%");
        }
    }
}
