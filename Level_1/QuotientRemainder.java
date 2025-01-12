import java.util.Scanner;
public class QuotientRemainder {
    
    // Method to find the quotient and remainder
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int quotient = number / divisor;  
        int remainder = number % divisor;
        return new int[] {quotient, remainder};
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.print("Enter the first number (dividend): ");
        int number = input.nextInt();
        
        System.out.print("Enter the second number (divisor): ");
        int divisor = input.nextInt();

        // Call the method to get quotient and remainder
        int[] result = findRemainderAndQuotient(number, divisor);

        System.out.println("Quotient: " + result[0]);
        System.out.println("Remainder: " + result[1]);
        
        input.close();
    }
}
