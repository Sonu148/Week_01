import java.util.Scanner;
public class Factor{
   public static void main(String[] args){
     
	 //Creating the scanner object.
	 Scanner input= new Scanner(System.in);
	 
	 // Taking the user input.
	 System.out.print("Enter the number ");
	 int number = input.nextInt();
	 
	 // Initialise the array to store the factor.
	 int maxFactor=10;
	 int [] factor= new int [maxFactor];
	 int index=0;
      
    // For loop for checking the factor.
    for(int i=1; i<=number; i++){
	     if(number%i==0){
			 // Check if the array needs resizing
                if (index == maxFactor) {
                    maxFactor = maxFactor* 2;
                    int[] temp = new int[maxFactor];
                    for (int j = 0; j < factor.length; j++) {
                        temp[j] = factor[j];
                    }
                    factor = temp;
                } 
			 
 		     else{ 
			       factor[index]= i; 
				   index++;
			    }
		 }
	}	
     System.out.println("The factor of the number is ");
	 for(int k=0; k<index; k++){
	  System.out.println(factor[k]);
	 }

	input.close();
   }

}