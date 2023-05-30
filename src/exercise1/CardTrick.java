package exercise1;
import java.util.Random;
import java.util.Scanner;
/**
 * A class that fills a hand of 7 cards with random Card Objects and then asks the user to pick a card.
 * It then searches the array of cards for the match to the user's card. 
 * To be used as starting code in Exercise
 *
 * @author dancye
 * @author Paul Bonenfant Jan 25, 2022 
 */
public class CardTrick {
    
    public static void main(String[] args) {
        
        Card[] hand = new Card[7];
Random random = new Random();
        
        for (int i = 0; i < hand.length; i++) {
            Card card = new Card();
            card.setSuit(Card.SUITS[random.nextInt(4)]);
            hand[i] = card;
        }

        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Pick a card from (1-13): ");
        int value = scanner.nextInt();
        System.out.print("Pick a card suit from (0-3): ");
        int suitIndex = scanner.nextInt();

        Card userCard = new Card();
        userCard.setValue(value);
        userCard.setSuit(Card.SUITS[suitIndex]);

        boolean found = false;
        
        
        for (Card card : hand) {
            if (card.getValue() == userCard.getValue() && card.getSuit().equals(userCard.getSuit())) {
                found = true;
                break;
            }
        }
        
        
        if (found) {
            printInfo();
        } else {
            System.out.println("Sorry, your card is not in the hand."); 
        }
    }
    

    /**
     * A simple method to print out personal information. Follow the instructions to 
     * replace this information with your own.
     * @author Paul Bonenfant Jan 2022
     */
    private static void printInfo() {
    
        System.out.println("Congratulations, you guessed right!");
        System.out.println();
        
        System.out.println("My name is Mohamedsaif, but you can call me prof, Moh or sir");
        System.out.println();
        
        System.out.println("My career ambitions:");
        System.out.println("-- Be more active on LinkedIn");
        System.out.println("-- Have a semester with no violations of academic integrity!");
	System.out.println();	

        System.out.println("My hobbies:");
        System.out.println("-- Investing");
        System.out.println("-- trecking");
        System.out.println("-- Reading/Watching TV");
        System.out.println("-- Riding my motorcycle");

        System.out.println();
        //i am finish with Exercise1
        
    
    }

}
