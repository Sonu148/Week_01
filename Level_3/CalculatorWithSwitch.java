import java.util.Scanner;

class CalculatorWithSwitch{
    public static void main(String[] args) {
		//taking input using scanner class by creating object
        Scanner input = new Scanner(System.in);
		//enter firs number
        System.out.print("Enter first number: ");
        double first = input.nextDouble();
		//enter second number
        System.out.print("Enter second number: ");
        double second = input.nextDouble();
		//enter operator
        System.out.print("Enter operator (+, -, *, /): ");
        String op = input.next();

        switch (op) {
            case "+":
                System.out.println("Result: " + (first + second));
                break;
            case "-":
                System.out.println("Result: " + (first - second));
                break;
            case "*":
                System.out.println("Result: " + (first * second));
                break;
            case "/":
                if (second != 0) {
                    System.out.println("Result: " + (first / second));
                } else {
                    System.out.println("Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Invalid Operator.");
        }
	//	scanner close
	input.close();
    }
}
