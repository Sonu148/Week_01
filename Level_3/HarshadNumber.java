import java.util.Scanner;
class HarshadNumber {
    public static void main(String[] args) {
		//taking input from scanner class by creating object
        Scanner input = new Scanner(System.in);
		//enter number
        System.out.print("Enter a number: ");
        int number = input.nextInt();
		
		//assigning variable and sum to 0
        int originalNumber = number;
        int sum = 0;
		
		//loop runs till condition is false
        while (number != 0) {
			//updating sum with remainder of number
            sum += number % 10;
			//then dividing number to get quotient
            number /= 10;
        }
		
        if (originalNumber % sum == 0) {
			//display if true
            System.out.println(originalNumber + " is a Harshad Number.");
        } else {
			//display if false
            System.out.println(originalNumber + " is not a Harshad Number.");
        }
		//cloing scanner
		input.close();
    }
}
