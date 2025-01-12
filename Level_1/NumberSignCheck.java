import java.util.Scanner;
class NumberSignCheck {
    public static int checkNumberSign(int number) {
	
        // Return 1 for positive, -1 for negative, and 0 for zero
        if (number > 0) {
            return 1;
        } else if (number < 0) {
            return -1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		
		//Taking the user input as number.
        System.out.println("Enter a number to check if it is positive, negative, or zero:");
        int number = input.nextInt();
		
		//Caling function and storing in the result variable.
        int result = checkNumberSign(number);
		
        // Display the result.
        if (result == 1) {
            System.out.println("The number is positive.");
        } else if (result == -1) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }
        input.close();
    }
}
