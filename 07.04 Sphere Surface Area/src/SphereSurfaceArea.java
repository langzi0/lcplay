
/**
 * Preference file version 092020
 * 
 * @author: Amy Bian
 */
import java.util.Scanner;

public class SphereSurfaceArea
{
  final static double PI = 3.1415;

  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    System.out.println("Welcome to Amy Bian's Sphere App!");
    System.out
      .println("Please enter the volume of the sphere (in cubic meters):");
    double volume = input.nextDouble();
    double radius = Math.pow((3 * volume) / (4 * PI), 1.0 / 3);
    double surfaceArea = Math.pow(PI, 1.0 / 3) * Math.pow(6 * volume, 2.0 / 3);
    System.out.println("The surface area of a sphere with volume " + volume
      + " is " + surfaceArea + " square meters.");
    System.out.println("The radius of that sphere is " + radius + " meters.");
    System.out.println("Have a great day!");

  }

}
