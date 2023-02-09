import java.awt.Color;

import turtle.Turtle;
import turtle.World;

/**
 * @author: Amy Bian
 */

public class TurtleArt
{
  // Constants to use
  private static final int TURN_AMOUNT_DEGREES = 30;// smaller, more dense
                                                    // the art.
  private static final int MAX_SHAPES = 360 / TURN_AMOUNT_DEGREES;
  private static final int SHAPE_SIDES = 5; // 3 for triangle, 4 for square etc.
  private static final int EXTERIOR_ANGLE_DEGREES = 360 / SHAPE_SIDES;

  public static void main(String[] args)
  {
    World world = new World(500, 500);
    Turtle graceHopper = new Turtle(world);
    graceHopper.setPenWidth(2);

    for (int shapeNum = 1; shapeNum <= MAX_SHAPES; shapeNum++)
    {
      if (shapeNum % 2 == 0)
      {
        graceHopper.setColor(Color.blue);
      }
      else
      {
        graceHopper.setColor(Color.pink);
      }
      for (int sides = 1; sides <= SHAPE_SIDES; sides++)
      {
        graceHopper.forward(100);
        graceHopper.turn(EXTERIOR_ANGLE_DEGREES);
      }
      graceHopper.turn(TURN_AMOUNT_DEGREES);
    }

    world.setVisible(true); // always last line of code for Turtle projects.
  }
}
