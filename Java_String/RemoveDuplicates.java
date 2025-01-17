import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
		
		// create the scanner class object.
        Scanner input = new Scanner(System.in);
        
		// Taking the input from the user.
        System.out.print("Enter the string: ");
        String str = input.nextLine();
        
		// Display the removed duplicates strings.
        System.out.println("The string with duplicates removed: " + removeDuplicates(str));
        
        input.close();// closing the input.
    }
    
    public static String removeDuplicates(String str) {
        StringBuilder newString = new StringBuilder();
        
		// Running for loop for checking the duplicates. 
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (newString.indexOf(String.valueOf(ch)) == -1) {
                newString.append(ch);
            }
        }
        
        return newString.toString();
    }
}
