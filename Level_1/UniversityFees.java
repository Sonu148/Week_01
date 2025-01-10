import java.util.*;
public class UniversityFees{
    public static void main(String[] args){
		
		// creating the variable for fee and discount.
	   int fee, discount;
	   
		// Creating the Scanner class object.
	    Scanner input= new Scanner(System.in);
		
		// Taking input as fee.
	    System.out.print("Enter the fee: ");
	    fee= input.nextInt();
		
		// Taking input as discount. 
		System.out.print("Enter the discount: ");
	    discount= input.nextInt();
	   
		
		// Calculating the discount amount.
        int discountAmount= fee*discount/100;
		
		// Display the result.
		System.out.println("The discount amount is INR "
		+ discountAmount+" and final discounted fee is INR "
		+ (fee-discountAmount));
		
		// Closing the scanner object.
		input.close();
	}
}