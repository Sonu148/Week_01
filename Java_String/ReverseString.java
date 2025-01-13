import java.util.Scanner;
public class ReverseString{
    
    public static void main(String[] args){
     Scanner input = new Scanner(System.in);
	 
	 System.out.print("Enetr the string ");
	 String text= input.nextLine();	 
  
     System.out.print("The reverse string "+reverseString (text)); 
	 
	 input.close();
  }
  
    public static String reverseString(String str){
	  String newString="";
	  for(int i=str.length()-1; i>=0; i-- ){
		  newString +=str.charAt(i); 
	  }
	  return newString;
	}
}