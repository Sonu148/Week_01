import java.util.Scanner;
class FactorialUsingWhile {
    public static void main(String[] args) {
		//creating scanner class object for input
        Scanner input = new Scanner(System.in);
		
		//enter positive no 
        System.out.print("Enter a positive number: ");
        int number = input.nextInt();
		
		//if no is positive then only proceed
        if (number >= 0) {
            int factorial = 1;
            int i = 1;
			
			//calculating using while loop
            while (i <= number) {
                factorial *= i;
                i++;
            }
			
			//display result
            System.out.println("The factorial of " + number + " is " + factorial);
        } else {
			//display if false
            System.out.println("Invalid input");
        }
		
		//closing scanner class
		input.close();
    }
}
