import java.util.*;
class PerimeterOfSquare{
    public static void main(String[] args){
		
		//Craeting the variable to store the side.
		int side;
 	   
		// Creating the Scanner class object.
	    Scanner input= new Scanner(System.in);
		
		// Taking input as side of square.
	    System.out.print("Enter the side of square: ");
	    side= input.nextInt();
		
		// Calculating the perimeter of square.
		double perimeter= 4*side;
		
		// Display the result.
 		System.out.println(" The length of the side is "
		+side+" whose perimeter is "+ perimeter );
		
		// Closing the scanner object.
		input.close();
	}
}