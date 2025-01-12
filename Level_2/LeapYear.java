import java.util.*;

class LeapYear{
	public static void main(String[] args) {
        // Create Scanner object to get user input
        Scanner sc = new Scanner(System.in);
        
        // Taking an integer input for year
        System.out.print("Enter the year: ");
        int number = sc.nextInt();
		
		//print if year is leap or not
		if(checkLeapYear(number)){
			System.out.println("The year " + number + " is leap year");
		}else{
			System.out.println("The year " + number + " is not a leap year");
		}
	}
	
	public static boolean checkLeapYear(int number){
		if((number%4==0 && number%100 !=0) || number%400==0){
			return true;
		}
		return false;
	}
}