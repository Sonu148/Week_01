import java.util.*;
public class KiloToMilesCoversion{
    public static void main(String[] args){
	   
	   // creating the variable km.
	   double km;
	   
	   // Creating the Scanner class object.
	   Scanner input= new Scanner(System.in);
	   System.out.print("Enter the distace in km: ");
	   km= input.nextInt();
	   
	   // Display the result.
	   System.out.println("The total miles is "
	   + ((double)km*1.6));
	   
	   // Closing the Scanner class object.
	   input.close();
	   
	}
}