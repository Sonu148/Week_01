import java.util.Scanner;
public class RemoveDuplicates{

  public static void main(String[] args){
   Scanner input= new Scanner(System.in);
   
   System.out.print("Enter the string: ");
   String str = input.nextLine();
	
   System.out.print("The duplicate removed string:"+ removeDuplicates(str));	
   input.close();
  }
  
  public static String removeDuplicates(String str ){
	  
	String newString="";
    
	for(int i=0; i<str.length(); i++){
		char ch= str.charAt(i);
		
    if(newString.indexOf(String.valueOf(ch))== -1){
      newString += ch; 		
	}	
  }
	return newString.toString();  
  }
}