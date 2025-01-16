import java.util.Scanner;
public class Palindrome{
    //Creating the main method.
	public static void main(String[] args){
	 Scanner input= new Scanner(System.in);
	
	 //Taking the user input.
    System.out.print("Enter the string: ");	
	String str = input.nextLine();
	
	// Calling the method.
	palindrome(str);

	// Closing the input object. 
	input.close();

	}
   
	//Performing the reverseString method 
    public static String reverseString(String str){

	// Creating the new String.	
	  String newString="";

	  //Performing the for loop to reverse the string.
	  for(int i=str.length()-1; i>=0; i-- ){
		  newString +=str.charAt(i); 
	  }
	  return newString;
	}
	
	// Method to find the palindrome.
	public static void palindrome(String str){
		
	String reversed = reverseString(str);

	// Checking the reversed string is same as original string.
	if(reversed.equals(str)){
	  System.out.println("Str is palindrome ");
        } else {
            System.out.println("Str is not palindrome ");
        }
   }
}