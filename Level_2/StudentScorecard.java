import java.util.Random;

public class StudentScorecard {

    // Method to generate random scores for Physics, Chemistry, and Math for students
    public static int[][] generateScores(int numberOfStudents) {
        Random rand = new Random();
        int[][] scores = new int[numberOfStudents][3];

        for (int i = 0; i < numberOfStudents; i++) {
            scores[i][0] = rand.nextInt(101); // Physics score
            scores[i][1] = rand.nextInt(101); // Chemistry score
            scores[i][2] = rand.nextInt(101); // Math score
        }

        return scores;
    }

    // Method to calculate total, average, percentage for each student
    public static double[][] calculateTotalAndPercentage(int[][] scores) {
        double[][] results = new double[scores.length][4];

        for (int i = 0; i < scores.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;

            // Round off the results to two decimal places
            results[i][0] = total;
            results[i][1] = average;
            results[i][2] = percentage;
        }

        return results;
    }

    // Method to calculate the grade based on percentage
    public static String[][] calculateGrade(double[][] percentages) {
        String[][] grades = new String[percentages.length][2];

        for (int i = 0; i < percentages.length; i++) {
            double percentage = percentages[i][2];
            if (percentage >= 80) {
                grades[i][0] = "A";
                grades[i][1] = "Level 4, above agency-normalized standards";
            } else if (percentage >= 70) {
                grades[i][0] = "B";
                grades[i][1] = "Level 3, at agency-normalized standards";
            } else if (percentage >= 60) {
                grades[i][0] = "C";
                grades[i][1] = "Level 2, below, but approaching agency-normalized standards";
            } else if (percentage >= 50) {
                grades[i][0] = "D";
                grades[i][1] = "Level 1, well below agency-normalized standards";
            } else if (percentage >= 40) {
                grades[i][0] = "E";
                grades[i][1] = "Level 1-, too below agency-normalized standards";
            } else {
                grades[i][0] = "R";
                grades[i][1] = "Remedial standards";
            }
        }

        return grades;
    }

    // Method to display the scorecard in a tabular format
    public static void displayScorecard(int[][] scores, double[][] results, String[][] grades) {
        System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s %-40s\n", "Student", "Physics", "Chemistry", "Math", "Total", "Percentage", "Grade");

        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%-10d %-10d %-10d %-10d %-10.2f %-10.2f %-40s\n", i + 1, scores[i][0], scores[i][1], scores[i][2], results[i][0], results[i][2], grades[i][0] + ": " + grades[i][1]);
        }
    }

    public static void main(String[] args) {
        int numberOfStudents = 5; // You can change this number to the desired number of students

        // Generate random scores
        int[][] scores = generateScores(numberOfStudents);

        // Calculate total, average, percentage
        double[][] results = calculateTotalAndPercentage(scores);

        // Calculate grade
        String[][] grades = calculateGrade(results);

        // Display the scorecard
        displayScorecard(scores, results, grades);
    }
}
