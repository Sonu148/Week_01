import java.util.Scanner;
class OddEven{
    public static void main(String[] args) {
		//creating scanner class objects
        Scanner input = new Scanner(System.in);
		//enter no
        System.out.print("Enter a number: ");
        int number = input.nextInt();
		
		//check if no is completely divisible by 2
        if (number > 0) {
            for (int i = 1; i <= number; i++) {
                if (i % 2 == 0) {
					//display even
                    System.out.println(i + " is even");
                } else {
					//display odd
                    System.out.println(i + " is odd");
                }
            }
        } else {
			//display if condition false
            System.out.println("Invalid input");
        }
		//closing scanner
		input.close();
    }
}
