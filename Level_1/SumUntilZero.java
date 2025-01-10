import java.util.Scanner;
class SumUntilZero {
    public static void main(String[] args) {
		//creating scanner cass object for input
        Scanner input = new Scanner(System.in);
        double total = 0.0;
		
		//using while loop till inner condition is true
        while (true) {
			//enter accordingly
            System.out.print("Enter a number (0 to stop): ");
            double value = input.nextDouble();
			
			//if condition false loop stops!!
            if (value == 0) {
                break;
            }
            total += value;
        }
		
		//display result
        System.out.println("The total sum is " + total);
		
		//closing scanner class
		input.close();
    }
}
