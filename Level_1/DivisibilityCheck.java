import java.util.Scanner;
public class DivisibilityCheck {
    public static void main(String[] args) {
	
	    // Creating the scanner object.
        Scanner sc = new Scanner(System.in);
		
		// Taking the input from user.
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
		
		// Checking the divisiblility.
        if (number % 5 == 0) {
            System.out.println("Is the number " + number + " divisible by 5? Yes");
        } else {
            System.out.println("Is the number " + number + " divisible by 5? No");
        }
		sc.close();
    }
}
