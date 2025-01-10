import java.util.Scanner;
class SumUntilNegative {
    public static void main(String[] args) {
		//creating scanner class object for taking input
        Scanner input = new Scanner(System.in);
        double total = 0.0;
		
		//while condition is true loop will run
        while (true) {
			//enter accordingly
            System.out.print("Enter a number (0 or negative to stop): ");
            double value = input.nextDouble();
			
			//if condition false loop breaks!
            if (value <= 0) {
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
