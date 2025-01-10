import java.util.*;
public class PoundsToKilograms {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Taking weight in pounds
        System.out.print("Enter weight in pounds: ");
        double weight = input.nextDouble();
        
        // Converting pounds to kilograms
        double kilograms = weight * 2.2;
        
        // Display the result.
        System.out.println("The weight of the person in pounds is "
		+ weight + " and in kilograms is " + kilograms);
        
        input.close();
    }
}
