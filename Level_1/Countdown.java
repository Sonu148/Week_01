import java.util.Scanner;
public class Countdown {
    public static void main(String[] args) {
	
        // Create a Scanner object.
        Scanner sc = new Scanner(System.in);

        // enter a starting number for the countdown.
        System.out.print("Enter the countdown starting number: ");
        int counter = sc.nextInt();

        // Perform countdown using a while loop.
        while (counter > 0) {
            System.out.println(counter);
            counter--;
        }
        System.out.println("Liftoff!");

        // Close the Scanner object.
        sc.close();
    }
}
