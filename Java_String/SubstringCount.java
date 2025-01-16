import java.util.*;
public class SubstringCount {
    
    public static void main(String[]args){
    Scanner input =new Scanner(System.in);

    System.out.println("Enter the string: ");
    String str= input.nextLine();
    
    System.out.println("Enter the substring: ");
    String subStr= input.nextLine();
    
    substringCount(str, subStr);
    input.close();
    }

    public static void substringCount(String str, String subStr){
     String[] words= str.split("\\s");
     int count=0;
     for(int i=0; i<words.length; i++){
      if(subStr.equals(words[i])){
        count++;
      }
     }
    System.out.println("The count of the substring is: "+ count);
    }
}
