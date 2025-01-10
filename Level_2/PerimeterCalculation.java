import java.util.*;
public class PerimeterCalculation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Taking sides of the triangle.
        System.out.print("Enter side1: ");
        double side1 = input.nextDouble();
        
        System.out.print("Enter side2: ");
        double side2 = input.nextDouble();
        
        System.out.print("Enter side3: ");
        double side3 = input.nextDouble();
        
        // Calculate perimeter.
        double perimeter = side1 + side2 + side3;
        
        // Evaluating number of rounds.
        double rounds = 5000 / perimeter;
        
        // Display the result
        System.out.println("The total number of rounds the athlete will run is " + rounds);
        
        input.close();
    }
}
