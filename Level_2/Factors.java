import java.util.*;

class Factors {
    
    public static void main(String[] args) {
        // Create Scanner object to get user input
        Scanner sc = new Scanner(System.in);
        
        // Get the number for which we need to find factors
        System.out.print("Enter the number: ");
        int number = sc.nextInt();
        
        // Find the factors using the method
        int[] factors = findFactors(number);
        
        // Display all the factors
        System.out.print("Factors of " + number + ": ");
        for (int factor : factors) {
            if (factor != 0) { // Skip zero values in the array
                System.out.print(factor + " ");
            }
        }
        System.out.println();
        
        // Calculate and display the sum of factors
        int sum = sumOfFactors(factors);
        System.out.println("Sum of factors: " + sum);
        
        // Calculate and display the product of factors
        int product = productOfFactors(factors);
        System.out.println("Product of factors: " + product);
        
        // Calculate and display the sum of squares of factors
        double sumOfSquares = sumOfSquaresOfFactors(factors);
        System.out.println("Sum of squares of factors: " + sumOfSquares);
        
        // Close the scanner to prevent resource leak
        sc.close();
    }
    
    // Method to find factors of a number and return them in an array
    public static int[] findFactors(int number) {
        int[] factors = new int[100]; // Declare an array large enough to store factors
        int index = 0; // Index to store the factors
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index] = i;
                index++;
            }
        }
        return factors;
    }
    
    // Method to calculate the sum of factors
    public static int sumOfFactors(int[] factors) {
        int sum = 0;
        for (int factor : factors) {
            if (factor != 0) {
                sum += factor;
            }
        }
        return sum;
    }
    
    // Method to calculate the product of factors
    public static int productOfFactors(int[] factors) {
        int product = 1;
        for (int factor : factors) {
            if (factor != 0) {
                product *= factor;
            }
        }
        return product;
    }
    
    // Method to calculate the sum of squares of factors
    public static double sumOfSquaresOfFactors(int[] factors) {
        double sumOfSquares = 0;
        for (int factor : factors) {
            if (factor != 0) {
                sumOfSquares += Math.pow(factor, 2); // Square each factor and add to the sum
            }
        }
        return sumOfSquares;
    }
}
