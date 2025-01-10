import java.util.Scanner;
class CountDigits {
    public static void main(String[] args) {
		//creating scanner class object for taking input
        Scanner input = new Scanner(System.in);
		//enter number
        System.out.print("Enter a number: ");
        int number = input.nextInt();
		//initializing count to 0
        int count = 0;
		//loop rins till number becomes 0
        while (number != 0) {
			//gives quotient
            number /= 10;
            count++;
        }
		//display result
        System.out.println("Number of digits: " + count);
		//closing scanner
		input.close();
    }
}
