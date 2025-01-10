import java.util.Scanner;

class SumOfNaturalNumbersWhile {
    public static void main(String[] args) {
		//creating scanner class object for input
        Scanner input = new Scanner(System.in);
		//enter number
        System.out.print("Enter a natural number: ");
        int n = input.nextInt();
		
		//follow condition
        if (n > 0) {
            int sumFormula = n * (n + 1) / 2;
            int sumLoop = 0;
            int i = 1;
			
			//using while loop to execute
            while (i <= n) {
                sumLoop += i;
                i++;
            }
			
			//display sum with formula
            System.out.println("Sum using formula: " + sumFormula);
			//display sum with loop
            System.out.println("Sum using loop: " + sumLoop);
        } else {
			//display if false above condition
            System.out.println("The number is not a natural number");
        }
		
		//closing scanner
		input.close();
		
    }
}
