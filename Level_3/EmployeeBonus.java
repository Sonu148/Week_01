import java.util.Random;

public class EmployeeBonus {

    // Method to generate random salary and years of service for each employee
    public static int[][] generateEmployeeData() {
        Random rand = new Random();
        int[][] employeeData = new int[10][2]; // 10 employees, 2 columns (Salary, Years of Service)

        for (int i = 0; i < 10; i++) {
            // Generate random 5-digit salary between 10000 and 99999
            employeeData[i][0] = rand.nextInt(90000) + 10000;
            // Generate random years of service between 1 and 20 years
            employeeData[i][1] = rand.nextInt(20) + 1;
        }

        return employeeData;
    }

    // Method to calculate new salary and bonus based on years of service
    public static double[][] calculateBonusAndNewSalary(int[][] employeeData) {
        double[][] updatedEmployeeData = new double[10][3]; // 10 employees, 3 columns (Old Salary, New Salary, Bonus)

        for (int i = 0; i < 10; i++) {
            int oldSalary = employeeData[i][0];
            int yearsOfService = employeeData[i][1];
            double bonusPercentage = 0;

            // Determine bonus percentage based on years of service
            if (yearsOfService > 5) {
                bonusPercentage = 0.05; // 5% bonus for employees with more than 5 years of service
            } else {
                bonusPercentage = 0.02; // 2% bonus for employees with less than or equal to 5 years of service
            }

            // Calculate the bonus and the new salary
            double bonus = oldSalary * bonusPercentage;
            double newSalary = oldSalary + bonus;

            // Store old salary, new salary, and bonus in the updated data array
            updatedEmployeeData[i][0] = oldSalary;
            updatedEmployeeData[i][1] = newSalary;
            updatedEmployeeData[i][2] = bonus;
        }

        return updatedEmployeeData;
    }

    // Method to calculate and display the sum of old salary, new salary, and total bonus
    public static void calculateAndDisplayTotalBonus(double[][] updatedEmployeeData) {
        double totalOldSalary = 0;
        double totalNewSalary = 0;
        double totalBonus = 0;

        System.out.println("---------------------------------------------------------");
        System.out.println("| Employee | Old Salary | New Salary | Bonus  |");
        System.out.println("---------------------------------------------------------");

        // Display each employee's data and calculate total values
        for (int i = 0; i < 10; i++) {
            double oldSalary = updatedEmployeeData[i][0];
            double newSalary = updatedEmployeeData[i][1];
            double bonus = updatedEmployeeData[i][2];

            // Print employee data in tabular format
            System.out.printf("| %-8d | %-10.2f | %-10.2f | %-6.2f |\n", i + 1, oldSalary, newSalary, bonus);

            // Accumulate totals
            totalOldSalary += oldSalary;
            totalNewSalary += newSalary;
            totalBonus += bonus;
        }

        System.out.println("---------------------------------------------------------");

        // Display the total old salary, total new salary, and total bonus
        System.out.printf("\nTotal Old Salary: %.2f\n", totalOldSalary);
        System.out.printf("Total New Salary: %.2f\n", totalNewSalary);
        System.out.printf("Total Bonus: %.2f\n", totalBonus);
    }

    public static void main(String[] args) {
        // Generate employee data (salary and years of service)
        int[][] employeeData = generateEmployeeData();

        // Calculate new salary and bonus
        double[][] updatedEmployeeData = calculateBonusAndNewSalary(employeeData);

        // Calculate and display the totals and individual employee data
        calculateAndDisplayTotalBonus(updatedEmployeeData);
    }
}
