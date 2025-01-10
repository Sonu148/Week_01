import java.util.Scanner;
class AbundantNumber {
	//creating object for scanner class to take input 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		//enter no
        System.out.print("Enter a number: ");
        int number = input.nextInt();
		//initialize sum
        int sum = 0;
		//loop 
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
				//update sum
                sum += i;
            }
        }

        if (sum > number) {
			//display if true
            System.out.println(number + " is an Abundant Number.");
        } else {
			//display if false
            System.out.println(number + " is not an Abundant Number.");
        }
		//closing scanner
		input.close();
    }
}
