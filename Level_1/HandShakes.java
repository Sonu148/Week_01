import java.util.Scanner;
public class HandShakes{

   public static void MaxHandShakes(int noOfStudents){
     
	 //Calculating the maximumnumber of handShakes.
	 int handShakes= (noOfStudents * (noOfStudents - 1)) / 2;
	 System.out.print("The maximum number of handShakes is "+ handShakes);
	 
   }
   
   public static void main (String[] args){
   
   Scanner input =new Scanner(System.in);
   
   //Getting the number of studentsas input.
   System.out.println("Enter the number of students: ");
   int students= input.nextInt();
   
   // calling the function.
   MaxHandShakes(students);
   input.close();
   
   }
}