import java.util.Scanner;
class CountdownFor {
    public static void main(String[] args) {
		//creating scanner class object for input
        Scanner input = new Scanner(System.in);
		//enter number
        System.out.print("Enter the countdown value: ");
        int counter = input.nextInt();
		
		//using for loop
        for (int i = counter; i > 0; i--) {
            System.out.println(i);
        }
		//display result
        System.out.println("Launch!");
		
		//closing scanner class
		input.close();
    }
}
