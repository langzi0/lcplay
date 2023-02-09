/**
 * This is the file with the main method and the one you press Play on.
 * 
 * @author: Amy Bian
 */

public class Minecraft
{

  public static void main(String[] args)
  {
    // Create two instances of the MinecraftPlayer class:
    MinecraftPlayer player1 = new MinecraftPlayer("Steve");
    MinecraftPlayer player2 = new MinecraftPlayer("Alex");
    MinecraftPlayer player3 = new MinecraftPlayer("Herobrine");
    MinecraftNamesDatabase db = new MinecraftNamesDatabase();

    // demonstrates using the keyword this.
    db.addPlayerName(player1);
    db.addPlayerName(player2);
    db.addPlayerName(player3);

    System.out.println(db.getEveryPlayersName());

    // Remember that sending an object to println automagically uses
    // the toString method of that object.
    System.out.println("For Player 1");
    System.out.println(player1);
    player1.decreaseHealth(13);
    System.out.println(player1);

  }

}

// Copyright VHSLearning.org 2022+
