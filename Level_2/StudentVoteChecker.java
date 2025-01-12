import java.util.Scanner;

public class StudentVoteChecker {
    
    // Method to check if the student can vote based on age
    public boolean canStudentVote(int age) {
        // Validate if the age is negative
        if (age < 0) {
            return false;
        }
        // Check if the student is 18 or older
        return age >= 18;
    }

    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner sc = new Scanner(System.in);
        
        // Create an instance of StudentVoteChecker to access the method
        StudentVoteChecker checker = new StudentVoteChecker();
        
        // Define an array of 10 integers for student ages
        int[] ages = new int[10];
        
        // Loop to take age input for each student
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            ages[i] = sc.nextInt();
            
            // Check if the student can vote using the canStudentVote() method
            if (checker.canStudentVote(ages[i])) {
                System.out.println("Student " + (i + 1) + " can vote.");
            } else {
                System.out.println("Student " + (i + 1) + " cannot vote.");
            }
        }

        // Close the scanner to prevent resource leak
        sc.close();
    }
}
