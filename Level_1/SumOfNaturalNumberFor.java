import java.util.Scanner;
class SumOfNaturalNumbersFor {
	//creating scanner class object for taking input
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		//enter number
        System.out.print("Enter a natural number: ");
        int n = input.nextInt();
		
		//proceed if condition satisfy
        if (n > 0) {
            int sumFormula = n * (n + 1) / 2;
            int sumLoop = 0;
			
			//using for loop to calculate
            for (int i = 1; i <= n; i++) {
                sumLoop += i;
            }
			
			//dislpay sum using formula
            System.out.println("Sum using formula: " + sumFormula);
			
			//display sum using loop
            System.out.println("Sum using loop: " + sumLoop);
        } else {
			//display if condition is false
            System.out.println("The number is not a natural number");
        }
		
		//closing scanner
		input.close();
    }
}
