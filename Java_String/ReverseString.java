import java.util.Scanner;
public class ReverseString{
    

    public static void main(String[] args){
		
	// Create the scanner class object.	
     Scanner input = new Scanner(System.in);
	 
	 System.out.print("Enetr the string ");
	 String text= input.nextLine();	 
  
     // print the reverse string.
     System.out.print("The reverse string "+reverseString (text)); 
	 
	 input.close();
  }
  
    public static String reverseString(String str){
		
	// Creating the new string to store the string.	
	  String newString="";
	  for(int i=str.length()-1; i>=0; i-- ){
		  newString +=str.charAt(i); 
	  }
	  return newString;
	}
}