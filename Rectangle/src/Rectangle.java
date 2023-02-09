
/**
 * Name: Amy Bian
 * Lesson 3.6 Program It: Rectangle
 */
import java.util.Scanner;

public class Rectangle
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    System.out.println("Welcome to Amy Bian's Rectangle App.");
    System.out.println("Please enter the width of the rectangle:");
    double width = input.nextDouble();
    System.out.println("Please enter the height of the rectangle:");
    double height = input.nextDouble();
    System.out
      .println("For your rectangle with dimensions " + width + " X " + height);
    double area = width * height;
    double perimeter = 2 * width + 2 * height;
    System.out.println("The area is " + area);
    System.out.println("The perimeter is " + perimeter);
  }
}
