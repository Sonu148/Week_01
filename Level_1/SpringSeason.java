import java.util.Scanner;
class SpringSeason {
    public static boolean isSpringSeason(int month, int day) {
        // Spring Season is from March 20 to June 20
		
        if ((month == 3 && day >= 20) || (month == 6 && day <= 20) || (month > 3 && month < 6)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
		
        Scanner input = new Scanner(System.in);
        
		//Taking the input from the user as mont and day.
		System.out.println("Enter month and day :");
        int month = input.nextInt();
        int day = input.nextInt();
		
        // Check and print it's Spring Season or not
        if (isSpringSeason(month, day)) {
            System.out.println("It's a Spring Season.");
        } else {
            System.out.println("Not a Spring Season.");
        }
        input.close();
    }
}
