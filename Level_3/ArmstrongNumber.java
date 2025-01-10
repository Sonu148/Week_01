import java.util.Scanner;
class ArmstrongNumber {
    public static void main(String[] args) {
		//taking input from scanner class by creating object
        Scanner input = new Scanner(System.in);
		//enter number
        System.out.print("Enter a number: ");
        int number = input.nextInt();
		//shifting place and initializing sum to 0
        int originalNumber = number;
        int sum = 0;
		
		//using while loop
        while (originalNumber != 0) {
			//calculating remainder
            int remainder = originalNumber % 10;
			//updating valiue in sum
            sum += Math.pow(remainder, 3);
			//dividing number to get digits
            originalNumber /= 10;
        }
		
        if (sum == number) {
			//display if true
            System.out.println(number + " is an Armstrong Number.");
        } else {
			//display if false
            System.out.println(number + " is not an Armstrong Number.");
        }
		//closing scanner
		input.close();
    }
}
