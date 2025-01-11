import java.util.Scanner;
public class CheckNumber{
     public static void main(String[] args){
	 
	     // Creating the scanner object.
	     Scanner input= new Scanner(System.in);
	 
	     // Storing the student age in arary;
	     int [] element = new int[5];
	 
	     // Taking the element as input from user.
	     for(int i=0; i<element.length; i++){
	     System.out.print("Enter the "+ (i+1) +" element: ");
	     element[i]= input.nextInt();
	     }
		
		 // Running the loop for checking the odd and even number.
         for(int i=0; i<element.length; i++){
		 if(element[i]%2==0){ 
		 System.out.println(element[i]+" is a even number.");
		  switch(Integer.compare(element[i], 0)){
		   case 1:
	     	   System.out.println(element[i]+" is a even and positive.");
		        break;

		   case 0:
			   System.out.println(element[i]+" is zero.");
				break;

		   case -1:
		       System.out.println(element[i]+" is a even and negative.");
			   break;
			 }
		   }
		   else{
		    
			System.out.println(element[i]+" is a odd number.");
		   }
		   
		   }
		   		input.close();

		}		
		
		
}