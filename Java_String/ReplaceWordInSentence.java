import java.util.Scanner;

class ReplaceWordInSentence {
    public static void main(String[] args) {
        // Create Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Take input sentence from the user
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        // Take the word to replace and its replacement from the user
        System.out.print("Enter the word to replace: ");
        String wordToReplace = sc.nextLine();

        System.out.print("Enter the replacement word: ");
        String replacementWord = sc.nextLine();

        // Call the custom method to replace the word
        String modifiedSentence = replaceWord(sentence, wordToReplace, replacementWord);

        // Display the modified sentence
        System.out.println("Modified Sentence: " + modifiedSentence);

        sc.close(); // Close Scanner
    }

    // User-defined method to replace a word in a sentence
    public static String replaceWord(String sentence, String wordToReplace, String replacementWord) {
        StringBuilder modifiedSentence = new StringBuilder(); // To construct the modified sentence
        String[] words = sentence.split(" "); // Split sentence into words

        // Loop through each word in the sentence
        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(wordToReplace)) {
                // If the current word matches the word to replace, add the replacement word
                modifiedSentence.append(replacementWord);
            } else {
                // Otherwise, keep the original word
                modifiedSentence.append(words[i]);
            }

            // Add a space after each word except the last one
            if (i < words.length - 1) {
                modifiedSentence.append(" ");
            }
        }

        return modifiedSentence.toString(); // Convert StringBuilder to String
    }
}
