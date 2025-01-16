import java.util.*;
public class Toggle{

public static void main(String[] args){
   Scanner input = new Scanner(System.in);

   //Taking the user input of a string.
   System.out.print("Enter the string: ");
   String str= input.nextLine();
   
   toggle(str);
   input.close();
}
public static void toggle(String str){

    String newString="";
    for(char ch : str.toCharArray()){
      if(Character.isUpperCase(ch)){
        newString+=(Character.toLowerCase(ch));
      }
      else{
        newString+=(Character.isUpperCase(ch));
      }
    }
    System.out.print(newString);
}

}