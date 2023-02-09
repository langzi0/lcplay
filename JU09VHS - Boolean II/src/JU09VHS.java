/**
 * Name: Amy Bian
 */

public class JU09VHS
{
  // declare your constants here to fix "magic" numbers.
  // A constant declaration looks like this
  // public static final int MAX_SCORE = 10;

  public static String xyInfo(int x, int y)
  {
    String response = "";
    if (x == 0 && y == 0)
    {
      response = "(" + x + ", " + y + ") is the origin.";
    }
    else if (x > 0 && y > 0)
    {
      response = "(" + x + ", " + y + ") is in the first quadrant.";
    }
    else if (x == 0)
    {
      response = "(" + x + ", " + y + ") is on the y-axis.";
    }
    else if (y == 0)
    {
      response = "(" + x + ", " + y + ") is on the x-axis.";
    }
    else if (x < 0 && y > 0)
    {
      response = "(" + x + ", " + y + ") is in the second quadrant.";
    }
    else if (x < 0 && y < 0)
    {
      response = "(" + x + ", " + y + ") is in the third quadrant.";
    }
    else if (x > 0 && y < 0)
    {
      response = "(" + x + ", " + y + ") is in the fourth quadrant.";
    }

    return response;
  }

  public static String costOfShipping(double packageWeight)
  {
    String response = "";
    if (packageWeight <= 1)
    {
      response = "The shipping cost is $3.5";
    }
    else if (packageWeight <= 3)
    {
      response = "The shipping cost is $5.5";
    }
    else if (packageWeight <= 10)
    {
      response = "The shipping cost is $8.5";
    }
    else if (packageWeight <= 20)
    {
      response = "The shipping cost is $10.5";
    }
    else
    {
      response = "The package cannot be shipped";
    }

    return response;
  }

  public static String inNumericalOrder(int a, int b, int c)
  {
    String sentence = "";
    if (a <= b && b <= c)
    {
      sentence = a + ", " + b + ", and " + c + " are in numerical order.";
    }
    else
    {
      sentence = a + ", " + b + ", and " + c + " are NOT in numerical order.";
    }
    return sentence;
  }

  public static int weirdRoundSum(int firstNum, int secondNum, int thirdNum)
  {
    int roundedFirstNum;
    int roundedSecondNum;
    int roundedThirdNum;
    if (firstNum % 10 >= 7)
    {
      roundedFirstNum = firstNum + 10 - firstNum % 10;
    }
    else
    {
      roundedFirstNum = firstNum - firstNum % 10;
    }
    if (secondNum % 10 >= 7)
    {
      roundedSecondNum = secondNum + 10 - secondNum % 10;
    }
    else
    {
      roundedSecondNum = secondNum - secondNum % 10;
    }
    if (thirdNum % 10 >= 7)
    {
      roundedThirdNum = thirdNum + 10 - thirdNum % 10;
    }
    else
    {
      roundedThirdNum = thirdNum - thirdNum % 10;
    }
    int total = roundedFirstNum + roundedSecondNum + roundedThirdNum;

    return total;
  }

  public static String numExpander(int threeDigitNumber)
  {
    String response =
      threeDigitNumber + " = " + threeDigitNumber / 100 + " X 100 + "
        + threeDigitNumber % 100 / 10 + " X 10 + " + threeDigitNumber % 10
        + " X 1";
    return response;
  }

  public static String roundToNearestOnesPlace(double number)
  {
    String response = "";
    if (number < 0)
    {
      response =
        number + " rounded to the nearest one's place is "
          + (int) (number - 0.5);
    }
    else
    {
      response =
        number + " rounded to the nearest one's place is "
          + (int) (number + 0.5) + "";
    }

    return response;

  }

  public static String getQuadraticRoots(double a, double b, double c)
  {
    String response = "";
    double descriminant = Math.pow(b, 2) - 4 * a * c;
    if (descriminant < 0)
    {
      response = "The equation has no real roots";
    }
    else if (descriminant > 0)
    {
      double root1 = (-b + Math.sqrt(descriminant)) / (2 * a);
      double root2 = (-b - Math.sqrt(descriminant)) / (2 * a);
      response = "The equation has two roots " + root1 + " and " + root2;
    }
    else
    {
      double root1;
      if ((Math.abs(b) == 0))
      {
        root1 = 0;
      }
      else
      {
        root1 = -b / (2 * a);
      }
      response = "The equation has one root " + root1;
    }
    return response;
  }
  // Copyright 2022+ VHSLearning.org

}