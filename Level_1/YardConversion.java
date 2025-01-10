import java.util.*;
class YardConversion{
    public static void main(String[] args){
		
		// creating the double variable for height in feets.
	    double distance;
	   
		// Creating the Scanner class object.
	    Scanner input= new Scanner(System.in);
		
		// Taking input as fee.
	    System.out.print("Enter the distance in feets: ");
	    distance= input.nextDouble();
		
		//Convert to yards.
		double feetsToYards= distance*0.333;
		
		//Convert to miles.
		double feetsToMiles= distance*0.000189;
		
		// Display the result.
 		System.out.println("Your Distance in yards is "
		+ feetsToYards+ " while in feets is "+distance+
		" and miles is "+ feetsToMiles);
		
		// Closing the scanner object.
		input.close();
	}
}