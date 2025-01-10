import java.util.*;

public class QuotientAndRemainder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Taking two numbers.
        System.out.print("Enter number1: ");
        int number1 = input.nextInt();
        
        System.out.print("Enter number2: ");
        int number2 = input.nextInt();
        
        // Calculate quotient and remainder
        int quotient = number1 / number2;
        int remainder = number1 % number2;
        
        // Display the result
        System.out.println("The Quotient is " 
		+ quotient + " and Reminder is " 
		+ remainder + " of two numbers " 
		+ number1 + " and " + number2);
        
        input.close();
    }
}
