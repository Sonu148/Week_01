import java.util.Scanner;
public class LargestNumber {
    public static void main(String[] args) {
	
	    // Creating the scanner object.
        Scanner sc = new Scanner(System.in);
		
		// Taking the user input as first and second and third number.
        System.out.print("Enter the first number: ");
        int number1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        int number2 = sc.nextInt();
        System.out.print("Enter the third number: ");
        int number3 = sc.nextInt();
        
		// Display the result. 
        System.out.println("Is the first number the largest? " + (number1 > number2 && number1 > number3 ? "Yes" : "No"));
        System.out.println("Is the second number the largest? " + (number2 > number1 && number2 > number3 ? "Yes" : "No"));
        System.out.println("Is the third number the largest? " + (number3 > number1 && number3 > number2 ? "Yes" : "No"));
       sc.close();
	}
	
}
