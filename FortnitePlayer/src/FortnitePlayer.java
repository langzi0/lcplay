/**
 * @author: Amy Bian
 */

public class FortnitePlayer
{
  private static final int MAX_HEALTH_AND_SHIELDS = 100;
  private static int playerCount;
  private String name;
  private int health;
  private int shields;

  public FortnitePlayer(String initialName)
  {
    name = initialName;
    health = MAX_HEALTH_AND_SHIELDS;
    shields = MAX_HEALTH_AND_SHIELDS;
    playerCount++;
  }

  public void setName(String nName)
  {
    name = nName;
  }

  public void setHealthAndShields(int nHealth, int nShields)
  {
    health = nHealth;
    shields = nShields;
  }

  public String toString()
  {
    String response = "playerCount:" + playerCount;
    response += ", name:" + name;
    response += ", health:" + health;
    response += ", shields:" + shields;
    return response;
  }

}
// Copyright 2022+ VHSLearning.org