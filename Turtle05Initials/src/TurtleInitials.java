import java.awt.Color;

import turtle.Turtle;
import turtle.World;

/**
 * @author: Amy Bian
 */

public class TurtleInitials
{
  public static void main(String[] args)
  {
    World world = new World(500, 500);
    // You can delete modify or add to this code.
    Turtle pinkTurtle = new Turtle(350, 100, world);
    Turtle blueTurtle = new Turtle(50, 400, world);
    Turtle greenTurtle = new Turtle(200, 400, world);
    blueTurtle.setColor(Color.BLUE);
    pinkTurtle.setColor(Color.PINK);
    greenTurtle.setColor(Color.GREEN);
    // blue turtle draws inital A
    blueTurtle.forward(300);
    blueTurtle.turnRight();
    blueTurtle.forward(100);
    blueTurtle.turnRight();
    blueTurtle.forward(150);
    blueTurtle.turnRight();
    blueTurtle.forward(100);
    blueTurtle.turn(180);
    blueTurtle.forward(100);
    blueTurtle.turnRight();
    blueTurtle.forward(150);
    // green turtle draws inital B
    greenTurtle.forward(300);
    greenTurtle.turnRight();
    greenTurtle.forward(100);
    greenTurtle.turnRight();
    greenTurtle.forward(140);
    greenTurtle.turnRight();
    greenTurtle.forward(100);
    greenTurtle.turnLeft();
    greenTurtle.forward(20);
    greenTurtle.turnLeft();
    greenTurtle.forward(100);
    greenTurtle.turnRight();
    greenTurtle.forward(140);
    greenTurtle.turnRight();
    greenTurtle.forward(100);
    // pink turtle draws number 6
    pinkTurtle.turnRight();
    pinkTurtle.forward(100);
    pinkTurtle.turn(180);
    pinkTurtle.forward(100);
    pinkTurtle.turnLeft();
    pinkTurtle.forward(300);
    pinkTurtle.turnLeft();
    pinkTurtle.forward(100);
    pinkTurtle.turnLeft();
    pinkTurtle.forward(150);
    pinkTurtle.turnLeft();
    pinkTurtle.forward(100);
    // rectangle border
    greenTurtle.penUp();
    greenTurtle.forward(175);
    greenTurtle.turnLeft();
    greenTurtle.forward(25);
    greenTurtle.penDown();
    greenTurtle.turn(180);
    greenTurtle.forward(350);
    greenTurtle.setColor(Color.PINK);
    greenTurtle.turnRight();
    greenTurtle.forward(450);
    greenTurtle.turnRight();
    greenTurtle.setColor(Color.BLACK);
    greenTurtle.forward(350);
    greenTurtle.turnRight();
    greenTurtle.setColor(Color.CYAN);
    greenTurtle.forward(450);
    greenTurtle.setColor(Color.GREEN);
    // hexagon
    blueTurtle.penUp();
    blueTurtle.forward(85);
    blueTurtle.turnLeft();
    blueTurtle.forward(275);
    blueTurtle.penDown();
    blueTurtle.forward(45);
    blueTurtle.turn(300);
    blueTurtle.forward(45);
    blueTurtle.turn(300);
    blueTurtle.forward(45);
    blueTurtle.turn(300);
    blueTurtle.forward(45);
    blueTurtle.turn(300);
    blueTurtle.forward(45);
    blueTurtle.turn(300);
    blueTurtle.forward(45);
    // pentagon
    greenTurtle.penUp();
    greenTurtle.turnRight();
    greenTurtle.forward(410);
    greenTurtle.penDown();
    greenTurtle.turn(72);
    greenTurtle.forward(35);
    greenTurtle.turn(72);
    greenTurtle.forward(35);
    greenTurtle.turn(72);
    greenTurtle.forward(35);
    greenTurtle.turn(72);
    greenTurtle.forward(35);
    greenTurtle.turn(72);
    greenTurtle.forward(35);

    world.setVisible(true); // always last line of code.
  }
}
