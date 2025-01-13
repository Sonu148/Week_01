import java.util.Scanner;
public class Palindrome{
    
	public static void main(String[] args){
	 Scanner input= new Scanner(System.in);
	
    System.out.print("Enter the string: ");	
	String str = input.nextLine();
	
	palindrome(str);
	}
   
    public static String reverseString(String str){
	  String newString="";
	  for(int i=str.length()-1; i>=0; i-- ){
		  newString +=str.charAt(i); 
	  }
	  return newString;
	}
	
	public static void palindrome(String str){
		
	String reversed = reverseString(str);
	if(reversed.equals(str)){
	  System.out.println("Str is palindrome ");
        } else {
            System.out.println("Str is not palindrome ");
        }
   }
}