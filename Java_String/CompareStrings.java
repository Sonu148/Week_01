import java.util.*;
public class CompareStrings {
    
    public static void compareStrings(String str1, String str2 ){
        int minLength = Math.min(str1.length(), str2.length());
        String[] element= new String[2];
        for(int i=0; i<minLength; i++){
          if((int)str1.charAt(i)==((int)str2.charAt(i))){
          }
          else if ((int)str1.charAt(i)>((int)str2.charAt(i))){
              element[0]=str2;
              element[1]=str1;
            //System.out.println("The "+str2+ " comes before"+str1+" in lexicographical order ");
          }
          else{
            element[0]=str1;
            element[1]=str2;
            //System.out.println("The "+str1+ " comes before"+str2+" in lexicographical order ");
          }
        }
        System.out.println(element[0]+" comes before the "+element[1]+" in lexicographical order");

    }

    public static void main(String[] args){
     Scanner input= new Scanner(System.in);

    System.out.println("Enter the first word: ");
    String str1= input.next();
    System.out.println("Enter the second word: ");
    String str2= input.next();
     
    compareStrings(str1, str2);
    input.close();
    }
}
