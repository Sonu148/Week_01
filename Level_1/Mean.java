import java.util.Scanner;
public class Mean{
   public static void main(String[] args){
      
	//  Creating the scanner object.
	Scanner input = new Scanner(System.in);
	
	// Creating the variable the store the sum of height.
	double sumOfheight=0;
	
	// Creating the new array to store the input.
    double [] height = new double[11];
	
	for(int i=0; i<11; i++){
	// Taking tge user  input.
	System.out.print("Enter the height of "+ (i+1)+" palyers: ");
	height[i]= input.nextDouble();
	}
	
	// calculate the mean of the height of the player.
	for(int i=0; i<11; i++){
	   sumOfheight+=height[i];
	}
    System.out.println("The mean of height of football players is : "+ sumOfheight/11);

  input.close();
   }

}