import java.util.Scanner;

public class FriendsDetails {

    // Method to find the youngest friend
    public String findYoungest(int[] ages, String[] names) {
        int youngestAge = ages[0];
        String youngestFriend = names[0];
        
        // Check who is the youngest among the three
        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < youngestAge) {
                youngestAge = ages[i];
                youngestFriend = names[i];
            }
        }
        return youngestFriend;
    }

    // Method to find the tallest friend
    public String findTallest(int[] heights, String[] names) {
        int tallestHeight = heights[0];
        String tallestFriend = names[0];
        
        // Check who is the tallest among the three
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > tallestHeight) {
                tallestHeight = heights[i];
                tallestFriend = names[i];
            }
        }
        return tallestFriend;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create an instance of the FriendDetails class to call methods
        FriendDetails details = new FriendDetails();

        // Array to store names of friends
        String[] names = {"Amar", "Akbar", "Anthony"};
        
        // Arrays to store ages and heights of the three friends
        int[] ages = new int[3];
        int[] heights = new int[3];
        
        // Take user input for age and height of each friend
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter the age of " + names[i] + ": ");
            ages[i] = sc.nextInt();
            
            System.out.print("Enter the height (in cm) of " + names[i] + ": ");
            heights[i] = sc.nextInt();
        }

        // Call the methods to find the youngest and tallest
        String youngest = details.findYoungest(ages, names);
        String tallest = details.findTallest(heights, names);

        // Display the results
        System.out.println("The youngest friend is: " + youngest);
        System.out.println("The tallest friend is: " + tallest);

        // Close the scanner to avoid resource leak
        sc.close();
    }
}
