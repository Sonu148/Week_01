import java.util.Scanner;
class DayOfWeek {
    public static void main(String[] args) {
		//creating scanner class object to take input
        Scanner input = new Scanner(System.in);
		//enter month
        System.out.print("Enter the month: ");
        int m = input.nextInt();
		//enter day
        System.out.print("Enter the day: ");
        int d = input.nextInt();
		//enter year
        System.out.print("Enter the year: ");
        int y = input.nextInt();
		//calculate month
        int y0 = y - (14 - m) / 12;
		//update
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
		//calculate day
        int m0 = m + 12 * ((14 - m) / 12) - 2;
		//calculate year
        int d0 = (d + x + 31 * m0 / 12) % 7;
		//display result
        System.out.println("Day of the week: " + d0);
		//closing scanner
		input.close();
    }
}
