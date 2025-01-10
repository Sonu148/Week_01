import java.util.*;
class TotalPriceCalculation {
    public static void main(String[] args) {
        
        // Creating the variable for price.
        double Price;
        
        // Creating the variable for quantity.
        int quantity;
        
        // Creating the Scanner class object.
        Scanner input = new Scanner(System.in);
        
        // Taking input for price and quantity.
        System.out.print("Enter the price of the item: ");
        Price = input.nextDouble();
        
        System.out.print("Enter the quantity of the item: ");
        quantity = input.nextInt();
        
        // Calculating the total price.
        double totalPrice = unitPrice * quantity;
        
        // Display the result.
        System.out.println("The total purchase price is INR "
		+ totalPrice + " if the quantity is " + quantity +
		" and unit price is INR " + unitPrice);
        
        // Closing the scanner object.
        input.close();
    }
}
