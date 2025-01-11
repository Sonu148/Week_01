import java.util.Scanner;
public class CheckForVote{
     public static void main(String[] args){
	 
	  // Creating the scanner object.
	  Scanner input= new Scanner(System.in);
	 
	   // Storing the student age in arary;
	   int [] age = new int[10];
	 
	   // Taking the age as input from user.
	   for(int i=0; i<age.length; i++){
	   System.out.print("Enter the age of "+ (i+1) +" student: ");
	   age[i]= input.nextInt();
	  }
	 
	   // Running loop for checking the eligibility for vote.
	   for (int i=0; i<age.length; i++){
	   if(age[i]>=18){
	   System.out.println("The student with the age "+ i +" can vote");
	   }
	   else if(age[i]<18) {
	   System.out.println("The student with the age "+ i +" cannot vote");
	   }
	   else{
	   System.out.println("Invalid age");
		 }
	 }
	 input.close();
   } 
}