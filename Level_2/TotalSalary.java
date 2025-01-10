import java.util.*;
public class TotalSalary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Taking input of salary and bonus.
        System.out.print("Enter salary: ");
        double salary = input.nextDouble();
        
        System.out.print("Enter bonus: ");
        double bonus = input.nextDouble();
        
        // Calculating total income.
        double totalIncome = salary + bonus;
        
        // Display the result.
        System.out.println("The salary is INR " + salary +
		" and bonus is INR " + bonus + ". Hence Total Income is INR "
		+ totalIncome);
        
        input.close();
    }
}
