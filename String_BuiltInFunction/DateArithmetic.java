import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateArithmetic {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Formatter for input and output dates
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        // Input date from user
        System.out.print("Enter a date in the format (yyyy-MM-dd): ");
        String inputDate = scanner.nextLine();

        try {
            // Parse the input date
            LocalDate date = LocalDate.parse(inputDate, formatter);

            // Perform date arithmetic
            LocalDate result = date.plusDays(7).plusMonths(1).plusYears(2).minusWeeks(3);

            // Display results
            System.out.println("Original date: " + date.format(formatter));
            System.out.println("After adding 7 days, 1 month, and 2 years: " + date.plusDays(7).plusMonths(1).plusYears(2).format(formatter));
            System.out.println("After subtracting 3 weeks: " + result.format(formatter));
        } catch (Exception e) {
            System.out.println("Invalid date format! Please use yyyy-MM-dd.");
        }

        scanner.close();
    }
}
