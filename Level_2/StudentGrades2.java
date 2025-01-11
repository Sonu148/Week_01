import java.util.*;

class StudentGrades2 {
    public static void main(String[] args) {
        // Creating Scanner object
        Scanner sc = new Scanner(System.in);

        // Take input for the number of students
        System.out.print("Enter the number of students: ");
        int numberOfStudents = sc.nextInt();

        // Create a 2D array to store marks for Physics, Chemistry, and Maths
        int[][] marks = new int[numberOfStudents][3];
        double[] percentages = new double[numberOfStudents];
        char[] grades = new char[numberOfStudents];

        // Input marks for each student
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("Enter marks for student " + (i + 1) + ":");

            // Physics marks input with validation
            do {
                System.out.print("Physics (out of 100): ");
                marks[i][0] = sc.nextInt();
                if (marks[i][0] < 0 || marks[i][0] > 100) {
                    System.out.println("Invalid marks. Please enter marks between 0 and 100.");
                }
            } while (marks[i][0] < 0 || marks[i][0] > 100);

            // Chemistry marks input with validation
            do {
                System.out.print("Chemistry (out of 100): ");
                marks[i][1] = sc.nextInt();
                if (marks[i][1] < 0 || marks[i][1] > 100) {
                    System.out.println("Invalid marks. Please enter marks between 0 and 100.");
                }
            } while (marks[i][1] < 0 || marks[i][1] > 100);

            // Maths marks input with validation
            do {
                System.out.print("Maths (out of 100): ");
                marks[i][2] = sc.nextInt();
                if (marks[i][2] < 0 || marks[i][2] > 100) {
                    System.out.println("Invalid marks. Please enter marks between 0 and 100.");
                }
            } while (marks[i][2] < 0 || marks[i][2] > 100);
        }

        // Calculate percentage and grade for each student
        for (int i = 0; i < numberOfStudents; i++) {
            // Calculate total marks for the student
            int totalMarks = marks[i][0] + marks[i][1] + marks[i][2];
            percentages[i] = totalMarks / 3.0;

            // Determine grade based on percentage
            if (percentages[i] >= 90) {
                grades[i] = 'A';
            } else if (percentages[i] >= 75) {
                grades[i] = 'B';
            } else if (percentages[i] >= 50) {
                grades[i] = 'C';
            } else {
                grades[i] = 'D';
            }
        }

        // Display the marks, percentages, and grades for each student
        System.out.println("\n--- Student Report ---");
        System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s\n", "Student", "Physics", "Chemistry", "Maths", "Percent", "Grade");
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.printf("%-10d %-10d %-10d %-10d %-10.2f %-10c\n",
                    i + 1, marks[i][0], marks[i][1], marks[i][2], percentages[i], grades[i]);
        }

        sc.close(); // Close the scanner
    }
}
