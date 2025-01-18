import java.util.Scanner;

public class BasicCalculator {

    // Function for addition
    public static double add(double num1, double num2) {
        return num1 + num2;
    }

    // Function for subtraction
    public static double subtract(double num1, double num2) {
        return num1 - num2;
    }

    // Function for multiplication
    public static double multiply(double num1, double num2) {
        return num1 * num2;
    }

    // Function for division
    public static double divide(double num1, double num2) {
        if (num2 == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return num1 / num2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Basic Calculator");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.print("Enter your choice (1-4): ");
        int choice = scanner.nextInt();

        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        try {
            double result;
            switch (choice) {
                case 1:
                    result = add(num1, num2);
                    System.out.printf("Result of addition: %.2f%n", result);
                    break;
                case 2:
                    result = subtract(num1, num2);
                    System.out.printf("Result of subtraction: %.2f%n", result);
                    break;
                case 3:
                    result = multiply(num1, num2);
                    System.out.printf("Result of multiplication: %.2f%n", result);
                    break;
                case 4:
                    result = divide(num1, num2);
                    System.out.printf("Result of division: %.2f%n", result);
                    break;
                default:
                    System.out.println("Invalid choice! Please select a valid operation.");
            }
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }
}
