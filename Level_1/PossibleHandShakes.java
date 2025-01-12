import java.util.Scanner;
public class PossibleHandShakes{

   public static void MaxHandShakes(int noOfStudents){
     
	 //Claculating the possible handShakes.
	 int handShakes= (noOfStudents * (noOfStudents - 1)) / 2;
	 System.out.print("The number of possible handShakes is "+ handShakes);
	 
   }
   
   public static void main (String[] args){
   
   // Creating the input object for taking the user input.
   Scanner input =new Scanner(System.in);
   
   //Getting the number of studentsas input.
   System.out.println("Enter the number of students: ");
   int students= input.nextInt();
   
   // calling the function.
   MaxHandShakes(students);
   input.close();
   
   }
}