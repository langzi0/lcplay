/**
 * Class to demonstrate passing of "this" as a parameter
 * 
 * @author: Your First and Last name goes here!
 */

public class MinecraftNamesDatabase
{
  private String everyPlayersName;

  public MinecraftNamesDatabase()
  {
    everyPlayersName = "List of all players: ";
  }

  public void addPlayerName(MinecraftPlayer aPlayer)
  {
    everyPlayersName += aPlayer.getName() + " ";
  }

  public String getEveryPlayersName()
  {
    return everyPlayersName;
  }

}
