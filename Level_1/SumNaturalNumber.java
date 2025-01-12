import java.util.Scanner;
public class SumNaturalNumber{

    public static void findSum(int number)
    {   // Initialise the sum variable.
        int sum = 0;
		
		//Using for loop for finding the sum of natural no.
        for (int x = 1; x <= number; x++) 
            sum = sum + x;
        System.out.println("The the sum of "+number+" natural number is "+sum);
    }

    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
		
		// Taking the user input.
		System.out.print("Enetr the number ");
		int number = input.nextInt();
		
		// Calling the function findSum.
       findSum(number);
	   
	   //closing the input object;
	   input.close();
    } 
	
}