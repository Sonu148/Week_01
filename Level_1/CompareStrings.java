import java.util.*;
public class CompareStrings{
   
   public static void main(String [] args  ){
     
	 // creatig the object to take the input.
     Scanner input = new Scanner (System.in);
	 
	 // Taking the first string. 
	 System.out.print("The str1: ");
     String str1= input.nextLine();
 	 
	 // Taking the second string. 
	 System.out.print("The str2: ");
     String str2= input.nextLine();
	 
	 
	 // Checking the condition is it same or not.
	 if(compareStrings(str1, str2)){
	    System.out.println("The both the strings are same ");
	 }	
	else{
		System.out.println("The both the strings are not same ");
	}
	 
	input.close(); 
   }
   
   public static boolean compareStrings(String str1, String str2){
   
   
   return  str1.equals(str2);
  }
 }
