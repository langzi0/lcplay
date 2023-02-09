/**
 * Modify this file per instructions on the lesson.
 * 
 * @author: Amy Bian
 */

public class MinecraftPlayer
{
  private static int MAX_HEALTH = 150;
  private String name;
  private int shields;
  private int health;

  /**
   * Constructor
   * 
   * @param startingName
   */
  public MinecraftPlayer(String startingName)
  {
    this.name = startingName;
    this.health = 100;
    this.shields = 100;
  }

  /**
   * Accessor method
   * 
   * @return
   */
  public int getHealth()
  {
    return this.health;
  }

  /**
   * Accessor method
   * 
   * @return
   */
  public int getShields()
  {
    return this.shields;
  }

  /**
   * Example of a boolean Accessor method
   * 
   * @return true if health > 0
   */
  public boolean isAlive()
  {
    return this.health > 0;
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
    int healthDifference = this.health - amount;
    if (healthDifference >= 0)
    {
      this.health -= amount;
    }
    else
    {
      this.health = 0;
    }
  }

  /**
   * Helper method for toString.
   * Makes it so toString is not so long.
   * 
   * @return
   */
  private String getPercentHealthOfPlayer()
  {
    // Avoid integer division problem by casting to double.
    double value = (double) this.getHealth() / this.MAX_HEALTH;
    double percentage = value * 100;
    double roundedPercentage = (int) (percentage + 0.5);
    String englishVersion = this.name + " is at " + roundedPercentage;
    englishVersion += "% health";
    return englishVersion;
  }

  // Important demonstration of passing the keyword this
  // as a parameter.
  public void addNameToDatabase(MinecraftNamesDatabase player)
  {
    player.addPlayerName(this);
  }

  /**
   * Accessor method that should be in all classes.
   * The purpose of toString is to dump out values
   * of every instance variable in the class.
   */
  public String toString()
  {
    String part1 = this.getPercentHealthOfPlayer();
    String part2 = " with raw health at " + this.health;
    String part3 = " and raw shields at " + this.shields + ".";
    String result = part1 + part2 + part3;
    return result;
  }

  public String getName()
  {
    // TODO Auto-generated method stub
    return this.name;
  }

}
// Copyright VHSLearning.org 2022+
