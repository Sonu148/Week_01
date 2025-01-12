import java.util.Scanner;
class TriangularPark {
    public static void calculateRounds(double side1, double side2, double side3) {
	
        // Calculate the perimeter of the triangular park
        double perimeter = side1 + side2 + side3;
		
        double distanceToRun = 5000;
		
        // Calculate the number of rounds: total distance / perimeter
        double rounds = distanceToRun / perimeter;
		
        System.out.println("The athlete needs to complete approximately " + Math.ceil(rounds) + " rounds.");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		
		//getting the side of the triangular park.
        System.out.println("Enter the 3 sides of the triangular park in meters:");
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double side3 = input.nextDouble();
		
		// calling the function calculateRounds.
        calculateRounds(side1, side2, side3);
        input.close();
    }
}
