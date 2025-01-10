import java.util.Scanner;
public class NumberCheck {
    public static void main(String[] args) {
	    // Craeting the scanner object.
        Scanner sc = new Scanner(System.in);
		
		// Taking the user input as number. 
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
		
		// checking the number .
        if (number > 0) {
            System.out.println("The number is positive.");
        } else if (number < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }
		sc.close();
    }
}
