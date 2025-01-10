import java.util.Scanner;
class TravelComputation {

   public static void main(String[] args) {

      // Create a Scanner object.
      Scanner input = new Scanner(System.in);

      // Take user name.
      System.out.print("Enter the traveler's name: ");
      String name = input.nextLine();

      // Take fromcity , viacity and tocity name as input.
      System.out.print("Enter the starting city: ");
      String fromCity = input.nextLine();

      System.out.print("Enter the via city: ");
      String viaCity = input.nextLine();

      System.out.print("Enter the destination city: ");
      String toCity = input.nextLine();

      // Take the distance from fromCity to viaCity
      System.out.print("Enter the distance from " +
	  fromCity + " to " + viaCity + " (in km): ");
      double distanceFromToVia = input.nextDouble();

      // Take the time taken from fromCity to viaCity in minutes.
      System.out.print("Enter the time taken from " 
	  + fromCity + " to " + viaCity + " (in minutes): ");
      int timeFromToVia = input.nextInt();

      // Take the distance from viaCity to toCity.
      System.out.print("Enter the distance from " 
	  + viaCity + " to " + toCity + " (in km): ");
      double distanceViaToFinalCity = input.nextDouble();

      // Take the time taken from viaCity to toCity in minutes.
      System.out.print("Enter the time taken from " 
	  + viaCity + " to " + toCity + " (in minutes): ");
      int timeViaToFinalCity = input.nextInt();

      // Calculate the total distance.
      double totalDistance = distanceFromToVia + distanceViaToFinalCity;

      // Calculate the total time.
      int totalTime = timeFromToVia + timeViaToFinalCity;

      // Display the result.
      System.out.println("\nThe Total Distance travelled by " 
	  + name + " from " + fromCity + " to " + toCity + " via "
	  + viaCity +" is " + totalDistance + " km and " 
	  +"the Total Time taken is " + totalTime + " minutes.");
      
      // Close the scanner object
      input.close();
   }
}
