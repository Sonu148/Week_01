import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateComparison {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Define the date format
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        try {
            // Input the first date
            System.out.print("Enter the first date (yyyy-MM-dd): ");
            String firstDateInput = scanner.nextLine();
            LocalDate firstDate = LocalDate.parse(firstDateInput, formatter);

            // Input the second date
            System.out.print("Enter the second date (yyyy-MM-dd): ");
            String secondDateInput = scanner.nextLine();
            LocalDate secondDate = LocalDate.parse(secondDateInput, formatter);

            // Compare the dates
            if (firstDate.isBefore(secondDate)) {
                System.out.println("The first date is before the second date.");
            } else if (firstDate.isAfter(secondDate)) {
                System.out.println("The first date is after the second date.");
            } else if (firstDate.isEqual(secondDate)) {
                System.out.println("The first date is the same as the second date.");
            }
        } catch (Exception e) {
            System.out.println("Invalid date format! Please use yyyy-MM-dd.");
        }

        scanner.close();
    }
}
