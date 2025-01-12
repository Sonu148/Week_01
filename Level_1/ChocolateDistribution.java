import java.util.Scanner;
public class ChocolateDistribution {

    // Method to find the number of chocolates each child gets and remaining chocolates
    public static int[] findRemainderAndQuotient(int numberOfChocolates, int numberOfChildren) {
        int chocolatesPerChild = numberOfChocolates / numberOfChildren;   
        int remainingChocolates = numberOfChocolates % numberOfChildren;  
        return new int[] {chocolatesPerChild, remainingChocolates};
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take user input as numbe rof chocolates
        System.out.print("Enter the number of chocolates: ");
        int numberOfChocolates = input.nextInt();
        
        System.out.print("Enter the number of children: ");
        int numberOfChildren = input.nextInt();

        // Call the method and storing it in result variable.
        int[] result = findRemainderAndQuotient(numberOfChocolates, numberOfChildren);

        // Display the result
        System.out.println("Each child gets: " + result[0] + " chocolates");
        System.out.println("Remaining chocolates: " + result[1]);

        input.close();
    }
}
