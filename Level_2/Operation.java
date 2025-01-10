import java.util.*;
public class Operation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Taking input values for a, b, and c
        System.out.print("Enter value of a: ");
        int a = input.nextInt();
        
        System.out.print("Enter value of b: ");
        int b = input.nextInt();
        
        System.out.print("Enter value of c: ");
        int c = input.nextInt();
        
        // Evaluate the operations with operator precedence
        int result1 = a + b * c;
        int result2 = a * b + c;
        int result3 = c + a / b;
        int result4 = a % b + c;
        
		//Display the result.
        System.out.println("The results of Int Operations are: " 
		+ result1 + ", " + result2 + ", " + result3 + ", " 
		+ result4);
        
		// Closing the sacnner class object.
        input.close();
    }
}
