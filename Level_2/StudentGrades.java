import java.util.*;

class StudentGrades {
    public static void main(String[] args) {
        // Creating Scanner object
        Scanner sc = new Scanner(System.in);

        // Take input for the number of students
        System.out.print("Enter the number of students: ");
        int numberOfStudents = sc.nextInt();

        // Create arrays to store marks, percentages, and grades
        int[] physics = new int[numberOfStudents];
        int[] chemistry = new int[numberOfStudents];
        int[] maths = new int[numberOfStudents];
        double[] percentages = new double[numberOfStudents];
        char[] grades = new char[numberOfStudents];

        // Input marks for each student
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("Enter marks for student " + (i + 1) + ":");

            do {
                System.out.print("Physics (out of 100): ");
                physics[i] = sc.nextInt();
                if (physics[i] < 0 || physics[i] > 100) {
                    System.out.println("Invalid marks. Please enter marks between 0 and 100.");
                }
            } while (physics[i] < 0 || physics[i] > 100);

            do {
                System.out.print("Chemistry (out of 100): ");
                chemistry[i] = sc.nextInt();
                if (chemistry[i] < 0 || chemistry[i] > 100) {
                    System.out.println("Invalid marks. Please enter marks between 0 and 100.");
                }
            } while (chemistry[i] < 0 || chemistry[i] > 100);

            do {
                System.out.print("Maths (out of 100): ");
                maths[i] = sc.nextInt();
                if (maths[i] < 0 || maths[i] > 100) {
                    System.out.println("Invalid marks. Please enter marks between 0 and 100.");
                }
            } while (maths[i] < 0 || maths[i] > 100);
        }

        // Calculate percentage and grade
        for (int i = 0; i < numberOfStudents; i++) {
            int totalMarks = physics[i] + chemistry[i] + maths[i];
            percentages[i] = totalMarks / 3.0;

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

        // Display marks, percentages, and grades
        System.out.println("\n--- Student Report ---");
        System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s\n", "Student", "Physics", "Chemistry", "Maths", "Percent", "Grade");
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.printf("%-10d %-10d %-10d %-10d %-10.2f %-10c\n",
                    i + 1, physics[i], chemistry[i], maths[i], percentages[i], grades[i]);
        }

        sc.close(); // Close the scanner
    }
}
