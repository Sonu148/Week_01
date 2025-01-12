import java.util.*;

public class FootballTeamHeight {

    // Method to generate random heights for the players in the range of 150 to 250 cms
    public int[] generateRandomHeights(int size) {
        int[] heights = new int[size];
        for (int i = 0; i < size; i++) {
            heights[i] = 150 + (int) (Math.random() * 101); // Generates random heights between 150 and 250 cms
        }
        return heights;
    }

    // Method to find the sum of all elements in the array
    public int findSum(int[] heights) {
        int sum = 0;
        for (int height : heights) {
            sum += height;
        }
        return sum;
    }

    // Method to find the mean height of the players
    public double findMean(int[] heights) {
        int sum = findSum(heights);
        return (double) sum / heights.length;
    }

    // Method to find the shortest height of the players
    public int findShortestHeight(int[] heights) {
        int minHeight = heights[0];
        for (int height : heights) {
            minHeight = Math.min(minHeight, height);
        }
        return minHeight;
    }

    // Method to find the tallest height of the players
    public int findTallestHeight(int[] heights) {
        int maxHeight = heights[0];
        for (int height : heights) {
            maxHeight = Math.max(maxHeight, height);
        }
        return maxHeight;
    }

    public static void main(String[] args) {
        FootballTeamHeight footballTeamHeight = new FootballTeamHeight();

        // Generate random heights for 11 players
        int[] heights = footballTeamHeight.generateRandomHeights(11);

        // Find sum, mean, shortest, and tallest heights
        int sum = footballTeamHeight.findSum(heights);
        double mean = footballTeamHeight.findMean(heights);
        int shortest = footballTeamHeight.findShortestHeight(heights);
        int tallest = footballTeamHeight.findTallestHeight(heights);

        // Display the results
        System.out.println("Heights of players (in cms): " + Arrays.toString(heights));
        System.out.println("Sum of heights: " + sum + " cms");
        System.out.println("Mean height: " + mean + " cms");
        System.out.println("Shortest height: " + shortest + " cms");
        System.out.println("Tallest height: " + tallest + " cms");
    }
}
