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
    MinecraftPlayer player1 = new MinecraftPlayer("Steve", 50, 50);
    MinecraftPlayer player2 = new MinecraftPlayer("Alex", 70, 30);

    // Demonstrates how println automatically calls the toString method which
    // is explained in CSAwesome 5.4
    System.out.println("For Player 1");
    System.out.println(player1.toString());
    player1.decreaseHealth(13);
    player1.moveForward();
    player1.moveForward();
    player1.setName("Johnny");
    System.out.println(player1);

    // Demonstates the mutator method decreaseHealth which has an IF statement
    // to prevent negative health.
    System.out.println("\nNow for Player 2");
    System.out.println(player2);
    player2.setName("Emma");
    player2.decreaseHealth(30);
    System.out.println(player2.getHealth());
    player2.decreaseHealth(50);
    System.out.println(player2.getHealth());
    player2.decreaseHealth(42);
    System.out.println(player2.getHealth());
    player2.moveForward();
    player2.moveForward();
    player2.moveForward();
    System.out.println(player2);

    if (player1.isAlive())
    {
      System.out.println("Player 1 is alive!");
    }
    else
    {
      System.out.println("Player 2 is dead!");
    }

  }

}

// Copyright VHSLearning.org 2022+
