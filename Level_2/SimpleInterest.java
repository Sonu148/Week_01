import java.util.*;
public class SimpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Taking input as principal, rate, and time.
        System.out.print("Enter principal amount: ");
        double principal = input.nextDouble();
        
        System.out.print("Enter rate of interest: ");
        double rate = input.nextDouble();
        
        System.out.print("Enter time period: ");
        double time = input.nextDouble();
        
        // Calculate Simple Interest.
        double simpleInterest = (principal * rate * time) / 100;
        
        // Display the result
        System.out.println("The Simple Interest is " + simpleInterest +
		" for Principal " + principal + ", Rate of Interest " + rate +
		" and Time " + time);
        
        input.close();
    }
}
