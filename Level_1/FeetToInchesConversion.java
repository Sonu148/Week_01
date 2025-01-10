import java.util.*;
public class FeetToInchesConversion{
    public static void main(String[] args){
		
		// creating the double variable for height in cm.
	    double height;
	   
		// Creating the Scanner class object.
	    Scanner input= new Scanner(System.in);
		
		// Taking input as fee.
	    System.out.print("Enter the height in cm: ");
	    height= input.nextInt();
		
		//Convert to feet.
		double cmToFeet= height*0.0328;
		
		//Convert to inches.
		double cmToinches= height*0.3937;
		
		// Display the result.
 		System.out.println("Your Height in cm is "
		+ height+ " while in feet is "+cmToFeet+ 
		" and inches is "+ cmToinches);
		
		// Closing the scanner object.
		input.close();
	}
}