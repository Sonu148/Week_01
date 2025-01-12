import java.util.Scanner;

public class CalendarProgram {

    // Method to get the name of the month
    public static String getMonthName(int month) {
        String[] months = {
            "January", "February", "March", "April", "May", "June", 
            "July", "August", "September", "October", "November", "December"
        };
        return months[month - 1];
    }

    // Method to check if the year is a leap year
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    // Method to get the number of days in a given month
    public static int getNumberOfDays(int month, int year) {
        // Array for number of days in each month (index 0 for January, 1 for February, ...)
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        // February has 29 days in a leap year
        if (month == 2 && isLeapYear(year)) {
            return 29;
        }

        return daysInMonth[month - 1];
    }

    // Method to calculate the first day of the month using the Gregorian calendar algorithm
    public static int getFirstDayOfMonth(int month, int year) {
        // Adjust year and month based on the formula
        int y0 = year - (14 - month) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = month + 12 * ((14 - month) / 12) - 2;
        int d0 = (1 + x + (31 * m0) / 12) % 7;
        return d0; // Returns the day of the week (0 = Sunday, 1 = Monday, ..., 6 = Saturday)
    }

    // Method to display the calendar for the given month and year
    public static void displayCalendar(int month, int year) {
        // Get the name of the month
        String monthName = getMonthName(month);
        
        // Get the number of days in the month
        int daysInMonth = getNumberOfDays(month, year);
        
        // Get the first day of the month
        int firstDay = getFirstDayOfMonth(month, year);

        // Print the header with the month and year
        System.out.println("     " + monthName + " " + year);
        System.out.println("Su Mo Tu We Th Fr Sa");
        
        // Print the indentation for the first day of the month
        for (int i = 0; i < firstDay; i++) {
            System.out.print("   "); // Add space for days before the 1st
        }
        
        // Print the days of the month
        for (int day = 1; day <= daysInMonth; day++) {
            // Print the day with a width of 3, right justified
            System.out.printf("%3d", day);
            
            // Move to the next line after Saturday
            if ((firstDay + day) % 7 == 0) {
                System.out.println();
            }
        }
        
        // Move to a new line after finishing the last row
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Take month and year as input
        System.out.print("Enter the month (1-12): ");
        int month = scanner.nextInt();
        System.out.print("Enter the year: ");
        int year = scanner.nextInt();
        
        // Display the calendar for the given month and year
        displayCalendar(month, year);
        
        scanner.close();
    }
}
