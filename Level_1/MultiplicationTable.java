import java.util.Scanner;
class MultiplicationTable {
    public static void main(String[] args) {
		//creating scanner class object for taking input
        Scanner input = new Scanner(System.in);
		//enter no
        System.out.print("Enter a number: ");
        int number = input.nextInt();
		
		//using for loop create table
        for (int i = 6; i <= 9; i++) {
			//display result
            System.out.println(number + " * " + i + " = " + (number * i));
        }
		//closing scanner
		input.close();
    }
}
