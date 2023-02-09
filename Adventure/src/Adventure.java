import java.util.Scanner;

public class Adventure
{
  public static void main(String[] args)
  {
    System.out.println("Welcome to Adventure!");
    System.out.println("Written by Amy Bian");
    Scanner scan = new Scanner(System.in);
    System.out
      .println("\nYou are on an island surrounded by water.\nThere is a path to the woods to the north, the sea to the south, jagged cliffs and mountains to the west, and a beach shack to the east.");
    System.out.println("Which way do you want to go (n,e,s,w)?");
    String command = scan.nextLine();
    if (command.equals("n")) // room 1 (woods)
    {
      System.out
        .println("You enter the forest and hear some rustling. There is very little light and there is dangerous plant overgrowth northward. You must not go that way.\nThere may be tigers here or maybe it's just monkeys.");
      System.out.println("Which way do you want to go (n,e,s,w)?");
      String nextCommand = scan.nextLine();
      if (nextCommand.equals("n"))
      {
        System.out
          .println("You can't go that way, there's too much overgrowth!");
      }
      else if (nextCommand.equals("e"))
      {
        System.out
          .println("Brrr. This part of the forest looks very different from the entrance. It's getting cold and dark, and you can no longer see. \nYou get lost in the dangerous wilderness of the forest.");
      }
      else if (nextCommand.equals("s"))
      {
        System.out
          .println("You've returned to the island that you just came from. It looks exactly the same as you left it earlier, and you don't find anything amazing.");
      }
      else if (nextCommand.equals("w"))
      {
        System.out
          .println("You hike westward through the dense forestry for hours, but all you've found are a couple sticks. \nIt's getting late, and you can see many cliffs in the distance. Maybe you'll try going there next time.");
      }
      else
      {
        System.out.println("Sorry adventurer, that's not a valid direction!");
      }

    }
    else if (command.equals("e")) // room 2 (beach shack)
    {
      System.out
        .println("You enter the beach shack and it smells very old and unused. There is wall blocking your way eastward. You must not go that way.\nThere may be some creepy witchcraft hidden in here, who knows.");
      System.out.println("Which way do you want to go (n,e,s,w)?");
      String nextCommand = scan.nextLine();
      if (nextCommand.equals("n"))
      {
        System.out
          .println("You head northward to the gardens next to the beach house. The garden has little to no produce, and it looks as if it hasn't been taken care of properly in years.");
      }
      else if (nextCommand.equals("e"))
      {
        System.out
          .println("You can't go that way, there's a wall blocking your way in that direction!");
      }
      else if (nextCommand.equals("s"))
      {
        System.out
          .println("You discover a dock that has a small dingy boat tied to it with rope. The boat's condition looks too bad to do anything with it. Besides the boat, the dock is completely empty.");
      }
      else if (nextCommand.equals("w"))
      {
        System.out
          .println("You've returned to the island that you just came from. Does it look different from when you left or are you just being paranoid? \nYou don't find anything amazing to return with.");
      }
      else
      {
        System.out.println("Sorry adventurer, that's not a valid direction!");
      }

    }
    else if (command.equals("s")) // room 3 (sea)
    {
      System.out
        .println("You head south to the open sea. The sea is very vast, and you can't see anything but water. However, you find that when you turn to the west, there are huge cliffs blocking your way! You must not go that way.");
      System.out.println("Which way do you want to go (n,e,s,w)?");
      String nextCommand = scan.nextLine();
      if (nextCommand.equals("n"))
      {
        System.out
          .println("You walk northward to find that you are back at the same island that you just came from! \nIt is now getting dark and cold, and you don't find anything cool to return to the island with.");
      }
      else if (nextCommand.equals("e"))
      {
        System.out
          .println("As you attempt to wade in the water eastward, you discover that the sea is getting more gradually shallow. \nJust then, your foot catches onto a lumpy object in the same. Looking down, you discover that it is a treasure chest with gold in it! Congratulations!!!");
      }
      else if (nextCommand.equals("s"))
      {
        System.out
          .println("You roll up your pants and begin to attempt to wade in the water towards the open sea. However, you soon discover that the sea is not as shallow as it looks. You must return to shore before you are swept away");
      }
      else if (nextCommand.equals("w"))
      {
        System.out
          .println("You can't go that way! The cliffs are too steep and dangerous for you to climb!");
      }
      else
      {
        System.out.println("Sorry adventurer, that's not a valid direction!");
      }

    }
    else if (command.equals("w")) // room 4 (cliffs and mountains)
    {
      System.out
        .println("You enter the mountains to find that there are pathways to the north and south. However, the cliff rapidly drops off westward. You must not go that way.");
      System.out.println("Which way do you want to go (n,e,s,w)?");
      String nextCommand = scan.nextLine();
      if (nextCommand.equals("n"))
      {
        System.out
          .println("You begin your trek on the northward trail. The cliffs are very difficult and steep to climb. After several hours of climbing, you reach the top to find nothing but a nice view of the ocean. Maybe the view was worth it?");
      }
      else if (nextCommand.equals("e"))
      {
        System.out
          .println("You walk eastward to discover that you are back at the exact same island you started at!\nYou failed to find anything interesting. The wind is blowing strongly, and uh oh, were those noises animals or just tricks of the wind!?");
      }
      else if (nextCommand.equals("s"))
      {
        System.out
          .println("You begin your hike on the southward trail. The trail is a very nice scenic tour around the mountain range.\nSuddenly, you hear the growls of some sort of animal. Oh no! Better retreat while you still can!");
      }
      else if (nextCommand.equals("w"))
      {
        System.out
          .println("You can't go that way! The cliff drop off is very steep and it would surely result in death!");
      }
      else
      {
        System.out.println("Sorry adventurer, that's not a valid direction!");
      }

    }
    else
    {
      System.out.println("Sorry adventurer, that's not a valid direction!");
    }

    System.out.println("End of adventure!");
    scan.close();
  }
  // Adapted from the CSAwesome Curriculum
}