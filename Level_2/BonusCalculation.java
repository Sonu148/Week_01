import java.util.Scanner;

public class BonusCalculation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Creating th variable type of double to store 
		// the salary, yearsOfService, bonus and newSalary.
        double[] salary = new double[10];
        double[] yearsOfService = new double[10];
        double[] bonus = new double[10];
        double[] newSalary = new double[10];

        // Initiate the totalBonus,totalNewSalary,totalOldSalary to zeo.
        double totalBonus = 0;
        double totalOldSalary = 0;
        double totalNewSalary = 0;

        // Taking input for salary and yearsofservice.
        for (int i = 0; i < 10; i++) {
            boolean validInput = false;
            while (!validInput) {
                System.out.print("Enter salary for employee " + (i + 1) + ": ");
                salary[i] = input.nextDouble();
                System.out.print("Enter years of service for employee " + (i + 1) + ": ");
                yearsOfService[i] = input.nextDouble();

                // Validate input
                if (salary[i] > 0 && yearsOfService[i] >= 0) {
                    validInput = true; // If valid, exit the loop
                } else {
                    System.out.println("Invalid input, please enter again.");
                }
            }
        }

        // Checking the year of service for validating the bonus.
        for (int i = 0; i < 10; i++) {
            if (yearsOfService[i] > 5) {
                bonus[i] = salary[i] * 0.05; 
            } else {
                bonus[i] = salary[i] * 0.02;
            }
            
		// Calculate bonus, new salary, and the old salary
            newSalary[i] = salary[i] + bonus[i];

            totalBonus += bonus[i]; 
            totalOldSalary += salary[i]; 
            totalNewSalary += newSalary[i]; 
        }

        // Display results
        System.out.println("\nTotal Bonus : " + totalBonus);
        System.out.println("Total Old Salary: " + totalOldSalary);
        System.out.println("Total New Salary: " + totalNewSalary);

        input.close();
    }
}
