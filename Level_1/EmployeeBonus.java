import java.util.Scanner;
class EmployeeBonus{
    public static void main(String[] args) {
		//creating scanner class object for taking input
        Scanner input = new Scanner(System.in);
		//enter salary
        System.out.print("Enter the salary: ");
        double salary = input.nextDouble();
		//enter year of serivice
        System.out.print("Enter years of service: ");
        int years = input.nextInt();
		//check with if that they get bonus or not
        if (years > 5) {
            double bonus = salary * 0.05;
			//display if they get bonus
            System.out.println("The bonus amount is " + bonus);
        } else {
			//no bonus
            System.out.println("No bonus");
        }
		//closing scanner
		input.close();
    }
}
