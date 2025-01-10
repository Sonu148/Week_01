import java.util.*;
public class ChocolatesDistribution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Taking number of chocolates and children.
        System.out.print("Enter number of chocolates: ");
        int numberOfChocolates = input.nextInt();
        
        System.out.print("Enter number of children: ");
        int numberOfChildren = input.nextInt();
        
        // Calculate chocolates distributed and remaining chocolates
        int chocolatesPerChild = numberOfChocolates / numberOfChildren;
        int remainingChocolates = numberOfChocolates % numberOfChildren;
        
        // Display the results.
        System.out.println("The number of chocolates each child gets is "
		+ chocolatesPerChild + " and the number of remaining chocolates are "
		+ remainingChocolates);
        
        input.close();
    }
}
