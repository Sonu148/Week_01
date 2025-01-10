import java.util.*;
public class SwapNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Taking two numbers.
        System.out.print("Enter number1: ");
        int number1 = input.nextInt();
        
        System.out.print("Enter number2: ");
        int number2 = input.nextInt();
        
        // Swapping numbers.
        int temp = number1;
        number1 = number2;
        number2 = temp;
        
        // Display the result.
        System.out.println("The swapped numbers are "
		+ number1 + " and " + number2);
        
        input.close();
    }
}
