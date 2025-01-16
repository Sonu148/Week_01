import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the string: ");
        String str = input.nextLine();
        
        System.out.println("The string with duplicates removed: " + removeDuplicates(str));
        
        input.close();
    }
    
    public static String removeDuplicates(String str) {
        StringBuilder newString = new StringBuilder();
        
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (newString.indexOf(String.valueOf(ch)) == -1) {
                newString.append(ch);
            }
        }
        
        return newString.toString();
    }
}
