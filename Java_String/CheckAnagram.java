import java.util.Scanner;

class CheckAnagram {
    public static void main(String[] args) {
        // Create Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Take input strings from the user
        System.out.print("Enter the first string: ");
        String text1 = sc.nextLine().toLowerCase().trim(); // convert text in lowercase also remove extra spaces
		System.out.print("Enter the second string: ");
        String text2 = sc.nextLine().toLowerCase().trim(); // convert text in lowercase also remove extra spaces

        // Call the method to find if given input is anagram or not
        boolean result = isAnagram(text1, text2);

        // Display results
        System.out.println("The given texts are " + (result ? "Anagrams" : "Not Anagrams"));
        sc.close(); // Close Scanner
    }

    // Method to check if given String is anagram or not
    public static boolean isAnagram(String text1, String text2) {
		// check if length of texts are equal
		if(text1.length()!= text2.length()){
			return false;
		}
		// create an array to store frequency of characters
		int [] charFrequency = new int[256];
		
		// Loop through first string to increament character frequency
		for(int i=0; i<text1.length(); i++){
			charFrequency[text1.charAt(i)]++;
		}
		
		// Loop through second string to decreament character frequency
		for(int i=0; i<text2.length(); i++){
			charFrequency[text2.charAt(i)]--;
		}
		
		// check if all frequency is zero
		for(int count : charFrequency){
			if(count != 0){
				return false;  // if frequency is not zero stringis not anagram
			}
		}
		return true;
    }
}