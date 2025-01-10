import java.util.*;
class Calculator{
    public static void main(String[] args){
	   
		// Creating the Scanner class object.
	    Scanner input= new Scanner(System.in);
		
		// Taking input of two number.
	    System.out.print("Enter the first number: ");
	    float number1= input.nextFloat();
		System.out.print("Enter the second number: ");
	    float number2= input.nextFloat();
		
		// Performing the  addition operation.
		float addition= number1+number2;
		
		// Performing the  subtraction operation.
		float subtraction = number1-number2;
		
		// Performing the  Multiple operation.
		float multiple= number1*number2;
		
		// Performing the  Division operation.
		float division= number1/number2;
		
		
		// Display the result.
 		System.out.println("The addition, subtraction,multiplication and division value of 2 numbers "+ number1+" and "+number2+" is " +addition+ ","+subtraction +","+multiple+" and "+ division);
		
		// Closing the scanner object.
		input.close();
	}
}