import java.util.Scanner;
public class NaturalSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        if (number >= 0) {
            int total = number * (number + 1) / 2;
            System.out.println("The sum of " + number + " natural numbers is " + total);
        } else {
            System.out.println("The number " + number + " is not a natural number.");
        }
    }
}
