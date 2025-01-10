import java.util.Scanner;
class FactorialFor {
    public static void main(String[] args) {
		//creating scanner class object for input
        Scanner input = new Scanner(System.in);
		//enter no
        System.out.print("Enter a positive number: ");
        int number = input.nextInt();
		//proceed if no>0
        if (number >= 0) {
            int factorial = 1;
			//calculating using for loop
            for (int i = 1; i <= number; i++) {
                factorial *= i;
            }
			
			//display result
            System.out.println("The factorial of " + number + " is " + factorial);
        } else {
			//display if condition false
            System.out.println("Invalid input");
        }
		//closing scanner class
		input.close();
    }
}
