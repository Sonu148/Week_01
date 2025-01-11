import java.util.Scanner;
public class LargestElement{
   public static void main (String[] args){
   
   // Creating the scanner object.
   Scanner input = new Scanner(System.in);
   
   // Creating the digit array to store the digit by  user.
   int maxDigit=10;
   int largest=0;
   int secondLargest=0;
   int index=0;
   int [] digit = new int[maxDigit];
   
   //Takking the input from the user. 
    System.out.println("Enter the digit :");
	
	for(int i=0; i<maxDigit; i++ ){
	digit[i] =input.nextInt();
	}
	//Calculate the largest  number;
	for(int i=0; i<digit.length; i++){
	    if(digit[i]>largest){
		   largest=digit[i];
		}	
	}
	//Calculate the second largest nummber.
	for(int i=0; i<digit.length; i++){
	    if(largest>digit[i] && digit[i]>secondLargest){
		   secondLargest=digit[i];
		}	
	}
	
	// Display the largest and secondlargest number.
	System.out.print("The largest number is "+ largest+" and second largest is "+ secondLargest );
	
	// Closing the scannner object.
	input.close();
   }

}