import java.util.Scanner; 
public class SimpleInterest{
    
	  public static void CalculateSI(double principal, double rate, double time){
		 
		 // Calculating the simpleInterest.
		double simpleInterest= (principal*rate*time)/100;
		 
		System.out.println("The simple interest is "+ simpleInterest+
		" for the pricipal amount "+ principal+", rate of interest "
		+rate+"and time "+ time);
		 
	 }
   
     public static void main(String[] args){
		 
		Scanner input = new Scanner(System.in);

        // Taking the user input as principal amount and time , rate.
		System.out.print("The principal amount is: ");
		 double principal= input.nextDouble();
		 
		 System.out.print("The rate of interest is: ");
		 double rate= input.nextDouble();
		 
		 System.out.print("The time period is: ");
		 double time= input.nextDouble();
		 
		 // Calling the function.
		 CalculateSI(principal, rate , time);
		 
		 input.close();
	 }
}