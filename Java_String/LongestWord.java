import java.util.Scanner;
public class LongestWord {
   public static void main(String[]args){
    Scanner input =new Scanner(System.in);
    
    System.out.print("Enter the String: ");
    String text= input.nextLine();

    longestString(text);
    input.close();
   }

   public static void longestString (String text){
    
    String longestWord="";
    String[] words= text.split("\\s"); 
    
    for(String word: words){
    if(word.length()>longestWord.length()){
       longestWord = word;
    }
}
    System.out.println("The longest word is: "+ longestWord);
   }
    
}
