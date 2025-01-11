import java.util.Scanner;
public class Multiplication{
    public static void main(String[] args){
	 
     Scanner input = new Scanner(System.in);
	 
	 // Taking the user input as an number.
	    System.out.print("Enter the number: ");
	    int number = input.nextInt();
	 
	 // Array to store the results of multiplication
        int[] table = new int[10];

     // Compute and store results in the array
        for (int i = 1; i <= 10; i++) {
            table[i - 1] = number * i;
        }
		
	 // Dispaly the result.
	    for(int i= 1; i<=10; i++){
		 System.out.println(number + " x "+ i + " = "+ table[i-1] );
	 }
	 
	 input.close();
	 
	}
}