import java.util.*;
class HandshakeCalculation {
    public static void main(String[] args) {
        
        // Creating the variable for the number of students.
        int numberOfStudents;
        
        // Creating the Scanner class object.
        Scanner input = new Scanner(System.in);
        
        // Taking input for number of students.
        System.out.print("Enter the number of students: ");
        numberOfStudents = input.nextInt();
        
        // Calculating the number of handshakes.
        int Handshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;
        
        // Display the result.
        System.out.println("The number of possible handshakes "
		+ Handshakes);
        
        // Closing the scanner object.
        input.close();
    }
}
