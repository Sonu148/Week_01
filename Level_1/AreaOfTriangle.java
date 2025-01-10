import java.util.*;
class AreaOfTriangle{
    public static void main(String[] args){
		
		//Craeting the variable to store the base and height.
		int base , height;
 	   
		// Creating the Scanner class object.
	    Scanner input= new Scanner(System.in);
		
		// Taking input as base of triangle in cm.
	    System.out.print("Enter the base in cm: ");
	    base= input.nextInt();
		
		// Taking input as height of  triangle in cm.
	    System.out.print("Enter the height in cm: ");
	    height= input.nextInt();
		
		// Calculating the area of triangle.
		double area= 0.5* base * height;
		
		// Display the result.
 		System.out.println("Your Height in cm is " + area +
		" while in feet is "+ ((double)area*0.001076) +
		" and inches is "+((double)area*0.155));
		
		// Closing the scanner object.
		input.close();
	}
}