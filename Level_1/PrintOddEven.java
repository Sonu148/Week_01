import java.util.*;
public class PrintOddEven{
     public static void main(String[] args){
	  
	     // Creating the scanner project.
	     Scanner input= new Scanner(System.in);
	  
	  
	    // Taking number as input from user.
	     System.out.print("Enter the number : ");
	     int number= input.nextInt();
		 
	     // Creating the two arraylist to store the odd and even number.
         int [] even = new int [number / 2 + 1 ] ;
         int [] odd = new int[number / 2 + 1 ];
	  
	     // Initialise the index of odd and even array.
		 int oddIndex=0;
		 int evenIndex=0;
		 
	     // Running a loop for the checking the odd and even number.
	     for(int i=1; i<=number; i++){ 
	   
	         if(i%2==0){even[evenIndex++] = i;} 
	   
	         else{odd[oddIndex++] = i;}
	        }	
		 // Displaying the even numbers.
         System.out.println("\nThe even numbers are: ");
		 for(int i=0; i<evenIndex; i++){
			 System.out.print(even[i]+ " ");
			 
		 }
        
         // Displaying the odd numbers.
         System.out.println("\nThe odd numbers are: ");
		 for(int i=0; i<oddIndex; i++){
			 System.out.print(odd[i]+ " ");
			
	    }
      input.close();
	}
	
}