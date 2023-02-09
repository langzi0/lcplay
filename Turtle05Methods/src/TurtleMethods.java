import turtle.Turtle;
import turtle.World;

/**
 * Just a reminder, make sure you have imported the VHS AP CSA preference
 * file otherwise your instructor make deduct points for formatting issues.
 * 
 * @author: Amy Bian
 */

public class TurtleMethods
{
  public static void main(String[] args)
  {
    // Create an instance of the World called world.
    World world = new World(300, 300);
    // Create an instance of Turtle called yertle.

    Turtle yertle = new Turtle(world);

    // ADD CODE HERE
    Turtle myrtle = new Turtle(world);
    yertle.setWidth(100);
    yertle.setHeight(200);
    System.out.println(myrtle.getXPos());
    myrtle.turnLeft();
    System.out.println(yertle.getHeight());
    System.out.println(myrtle.getWidth());
    int x = myrtle.getXPos();
    int y = myrtle.getYPos();
    int yWidth = yertle.getWidth();
    int yHeight = yertle.getHeight();
    System.out.println("Myrtle is at (" + myrtle.getXPos() + ", "
      + myrtle.getYPos() + ") and Yertle is at (" + yertle.getXPos() + ", "
      + yertle.getYPos() + ")");

    world.setVisible(true);
  }
}
