/**
 * @author: Amy Bian
 */

public class Fortnite
{

  public static void main(String[] args)
  {
    // Construct three objects of the FortnitePlayer class.
    FortnitePlayer player1 = new FortnitePlayer("Spiderman");
    FortnitePlayer player2 = new FortnitePlayer("She-Hulk");
    FortnitePlayer player3 = new FortnitePlayer("Wonder Woman");

    // Mutate some of the objects.
    player1.setName("Captain America");
    player2.setHealthAndShields(42, 42);

    System.out.println();

    // Call the toString on each of the three objects to
    // inspect the values of the instance and static variables.
    System.out.println(player1);
    System.out.println(player2);
    System.out.println(player3);
  }

}
// Copyright 2022+ VHSLearning.org
