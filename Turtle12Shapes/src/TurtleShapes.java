import java.awt.Color;

import turtle.Turtle;
import turtle.World;

/**
 * @author: Amy Bian
 */

public class TurtleShapes
{
  private static final int SIDE_LENGTH = 70;

  public static void main(String[] args)
  {
    World world = new World(500, 500);
    Turtle graceHopper = new Turtle(400, 400, world);
    graceHopper.setPenWidth(3);
    graceHopper.setColor(Color.BLUE);
    for (int i = 0; i < 4; i++)
    {
      graceHopper.turn(90);
      graceHopper.forward(SIDE_LENGTH);
    }
    graceHopper.setColor(Color.BLACK);
    graceHopper.penUp();
    graceHopper.forward(325);
    graceHopper.turn(-90);
    graceHopper.forward(50);
    graceHopper.turn(90);
    graceHopper.penDown();
    for (int i = 0; i < 5; i++)
    {
      graceHopper.turn(72);
      graceHopper.forward(SIDE_LENGTH);
    }
    graceHopper.turn(-90);
    graceHopper.setColor(Color.GREEN);
    graceHopper.penUp();
    graceHopper.forward(300);
    graceHopper.penDown();
    for (int i = 0; i < 2; i++)
    {
      graceHopper.turn(120);
      graceHopper.forward(SIDE_LENGTH);
    }
    world.setVisible(true); // always last line of code for Turtle projects.
  }
}
