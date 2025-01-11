import java.util.*;
public class Tallest{

    public static void main(String[] args){
	    
    // Creating the scanner object.
	Scanner input = new Scanner(System.in);
	
	// Initialise the height and age array.
	int [] age = new int [3];
	int [] height= new int [3];

     
	 
	// Taking the input of age.
     	for(int i=0; i<3; i++){
			       System.out.print((i+1)+" Friend age is : ");
			age[i]= input.nextInt();

		}
    
	// Taking the input of height.
    for(int j=0; j<3; j++){
     	System.out.print((j+1)+" Friend height is : ");
		   height[j]= input.nextInt();
		}
		
	// Craeting the variable to store the tallest one.
	 int tallestAsHeight=height[0];
	 int tallestAsAge=age[0];
	 
    for(int i=0; i<age.length; i++){
	     if(age[i]>tallestAsAge){
		   tallestAsAge=age[i];
		 }
	}

    for(int i=0; i<height.length; i++){
	     if(height[i]>tallestAsHeight){
		   tallestAsHeight=height[i];
 		 }
	}	
    System.out.println("The tallest friend as age is "+ tallestAsAge+
	  " and as height is "+ tallestAsHeight);	
	  
	 input.close();
	}
	

}