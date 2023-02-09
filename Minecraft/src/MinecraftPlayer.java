/**
 * Modify this file per instructions on the lesson.
 * 
 * @author: Amy Bian
 */

public class MinecraftPlayer
{
  private String name;
  private int shields;
  private int health;
  private int x;
  private int y;

  /**
   * Constructor
   * 
   * @param startingName
   */
  public MinecraftPlayer(String startingName, int startingX, int startingY)
  {
    name = startingName;
    health = 100;
    shields = 100;
    x = startingX;
    y = startingY;
  }

  /**
   * Accessor method
   * 
   * @return
   */
  public int getHealth()
  {
    return health;
  }

  /**
   * Accessor method
   * 
   * @return
   */
  public int getShields()
  {
    return shields;
  }

  /**
   * Example of a boolean Accessor method
   * 
   * @return true if health > 0
   */
  public boolean isAlive()
  {
    return health > 0;
  }

  /**
   * Mutator method - It's smart because it
   * won't allow the health to go below 0.
   * Precondition: amount of health is a positive number
   * 
   * @param amount
   *          >= 0
   */
  public void decreaseHealth(int amount)
  {
    int healthDifference = health - amount;
    if (healthDifference >= 0)
    {
      health -= amount;
    }
    else
    {
      health = 0;
    }
  }

  public void moveForward()
  {
    y += 10;
  }

  public void setName(String newName)
  {
    name = newName;
  }

  /**
   * Accessor method that should be in all classes.
   * The purpose of toString is to dump out values
   * of every instance variable in the class.
   */
  public String toString()
  {
    String part1 = "Minecraft Player with name " + name;
    String part2 = " with health at " + health;
    String part3 = " and shields at " + shields + ".";
    String part4 = " The player is currently at x: " + x + " and y: " + y;
    String result = part1 + part2 + part3 + part4 + ".";
    return result;
  }

}
// Copyright VHSLearning.org 2022+
