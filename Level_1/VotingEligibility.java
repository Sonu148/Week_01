import java.util.Scanner;
public class VotingEligibility {

    public static void main(String[] args) {
	
	   // Creating the scanner object. 
        Scanner sc = new Scanner(System.in);
		
		// Taking the user input.
        System.out.print("Enter the person's age: ");
        int age = sc.nextInt();
		
		// Checking the a person can vote or not.
        if (age >= 18) {
            System.out.println("The person's age is " + age + " and can vote.");
        } else {
            System.out.println("The person's age is " + age + " and cannot vote.");
        }
		sc.close();
    }
}
