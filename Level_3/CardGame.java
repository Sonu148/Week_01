import java.util.Arrays;
import java.util.Random;

public class CardGame {

    // Method to initialize the deck of cards
    public static String[] initializeDeck() {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        int numOfCards = suits.length * ranks.length;

        String[] deck = new String[numOfCards];
        int index = 0;
        
        // Initialize the deck with all combinations of suits and ranks
        for (String suit : suits) {
            for (String rank : ranks) {
                deck[index++] = rank + " of " + suit;
            }
        }
        
        return deck;
    }

    // Method to shuffle the deck of cards
    public static void shuffleDeck(String[] deck) {
        Random rand = new Random();
        
        // Iterate over the deck and swap each card with a random card
        for (int i = 0; i < deck.length; i++) {
            int randomCardNumber = i + rand.nextInt(deck.length - i); // Random card number between i and n
            String temp = deck[i];
            deck[i] = deck[randomCardNumber];
            deck[randomCardNumber] = temp;
        }
    }

    // Method to distribute the cards to the players
    public static String[][] distributeCards(String[] deck, int numOfCards, int numOfPlayers) {
        if (numOfCards % numOfPlayers != 0) {
            System.out.println("Cards cannot be evenly distributed among players.");
            return new String[0][0];
        }
        
        // Create a 2D array to store the players' cards
        String[][] players = new String[numOfPlayers][numOfCards / numOfPlayers];
        
        int cardIndex = 0;
        // Distribute cards to each player
        for (int i = 0; i < numOfPlayers; i++) {
            for (int j = 0; j < numOfCards / numOfPlayers; j++) {
                players[i][j] = deck[cardIndex++];
            }
        }
        
        return players;
    }

    // Method to print the players' cards
    public static void printPlayerCards(String[][] players) {
        for (int i = 0; i < players.length; i++) {
            System.out.println("Player " + (i + 1) + "'s cards: " + Arrays.toString(players[i]));
        }
    }

    public static void main(String[] args) {
        int numOfPlayers = 4;  // Number of players
        int numOfCards = 52;   // Total number of cards in the deck
        
        // Initialize, shuffle, and distribute the deck
        String[] deck = initializeDeck();
        shuffleDeck(deck);
        String[][] players = distributeCards(deck, numOfCards, numOfPlayers);
        
        // Print the cards of each player
        printPlayerCards(players);
    }
}
