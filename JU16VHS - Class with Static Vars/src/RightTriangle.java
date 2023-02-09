/**
 * This class allows clients to construct right triangles by providing
 * the base length and height. It contains a number of accessor and mutator
 * methods as well.
 * 
 * @author Amy Bian
 *         Copyright 2022+ VHSLearning.org
 *
 */
public class RightTriangle
{

  // constants - declare for any numbers
  // TODO: Fix

  // static variables
  private static int numRightTriangles = 0;
  private static int scaledTriangles = 0;

  // instance variables
  private double width = 0;
  private double height = 0;

  public RightTriangle()
  {
    width = 3.0;
    height = 4.0;
    numRightTriangles++;
  }

  public RightTriangle(double initialBase, double initialHeight)
  {
    width = initialBase;
    height = initialHeight;
    numRightTriangles++;
  }

  public double getArea()
  {
    double answer = 0.5 * width * height;
    return answer;

  }

  public double getHypotenuse()
  {
    double hypotnuseLength =
      Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
    return hypotnuseLength;
  }

  public double getPerimeter()
  {
    double perimeter = width + height + getHypotenuse();

    return perimeter;
  }

  public void scale(double factor)
  {
    if (factor > 0)
    {
      width = width * factor;
      height = height * factor;
      scaledTriangles++;
    }
  }

  public String getBasicDimensions()
  {
    return "base = " + width + ", height = " + height;
  }

  public String getFancyDimensions()
  {
    return "Right Triangle #" + numRightTriangles + " has dimensions "
      + getBasicDimensions();

  }

  public static int getScaleCount()
  {
    return scaledTriangles;
  }
  // Copyright 2022+ VHSLearning.org
}
