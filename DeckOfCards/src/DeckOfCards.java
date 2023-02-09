
/**
 * @author Amy Bian
 */
import java.util.Scanner;

public class DeckOfCards
{
  public static void main(String[] args)
  {
    Scanner consoleInput = new Scanner(System.in);
    System.out.println("The deck is shuffled. How many cards do you want?");
    int numberOfCards = consoleInput.nextInt();
    System.out.println("Dealing " + numberOfCards + " cards:");
    int[] cardDeck = new int[52];
    String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
    String[] ranks =
      {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen",
       "King"};

    // Fill the array with numbers from 0 to 51
    for (int i = 0; i < cardDeck.length; i++)
      cardDeck[i] = i;

    // Randomly shuffle the deck.
    for (int i = 0; i < cardDeck.length; i++)
    {
      // Generate an index randomly
      int index = (int) (Math.random() * cardDeck.length);
      int temp = cardDeck[i];
      cardDeck[i] = cardDeck[index];
      cardDeck[index] = temp;
    }
    // Print out the first four cards of the deck
    int cardSum = 0;
    for (int i = 0; i < numberOfCards; i++)
    {
      String suit = suits[cardDeck[i] / 13];
      String rank = ranks[cardDeck[i] % 13];
      System.out
        .println("Card number " + cardDeck[i] + ": " + rank + " of " + suit);
      if (rank.equals("Ace"))
      {
        cardSum++;
      }
      else if (rank.equals("Jack") || rank.equals("Queen")
        || rank.equals("King"))
      {
        cardSum += 10;
      }
      else
      {
        cardSum += Integer.valueOf(rank);
      }
    }
    System.out.print("The sum of your cards is " + cardSum);
    if (cardSum < 21)
    {
      System.out.println(" which is under 21.");
    }
    else if (cardSum == 21)
    {
      System.out.println(" which is equal to 21.");
    }
    else
    {
      System.out.println(" which is over 21.");
    }
  }
  // Copyright 2022+ VHSLearning.org
}