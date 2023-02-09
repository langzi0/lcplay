/**
 * Some methods require you to call a previous defined method.
 * 
 * @author Amy Bian
 */
public class JU17VHS
{
  // Declare any constants here.

  public static double getTriangleArea(int width, int height)
  {
    // This method requires you to return a double.

    return 0.5 * width * height;
    // TODO: Also, did you put your name at the top of this file?
  }

  public static boolean approxEqual(double a, double b)
  {
    // TODO: Use Math.abs or do it the hard way.
    double difference = Math.abs(a - b);
    if (difference < 0.0099999999)
    {
      return true;
    }
    else
    {
      return false;
    }
  }

  public static double funnySum(double a, double b)
  {
    // Note: YOU MUST CALL A PREVIOUS METHOD TO SOLVE THIS.
    // No credit will be awarded if you don't
    // call your approxEqual method to solve this.
    if (approxEqual(a, b))
    {
      return 3 * (a + b);
    }
    else
    {
      return a + b;
    }
  }

  public static int roundAP(double number)
  {
    // The return type of this method is "int"
    // that means you have to return an integer, not
    // something in between quotes (aka String)
    int rounded;
    if (number < 0)
    {
      rounded = (int) (number - 0.5);
    }
    else
    {
      rounded = (int) (number + 0.5);
    }
    return rounded;
  }

  public static double roundAPHundredths(double number)
  {
    // The return type of this method is "int"
    // that means you have to return an integer, not
    // something in between quotes (aka String)
    int roundedInt;
    double altNumber = number * 100.0;
    if (altNumber < 0)
    {
      roundedInt = (int) (altNumber - 0.5);
    }
    else
    {
      roundedInt = (int) (altNumber + 0.5);
    }
    double rounded = roundedInt / 100.0;
    return rounded;
  }

  public static String compoundInterest(double principle, double rate,
                                        int numberOfTimes, double time)
  {
    // You must call the roundAPHundredths to solve this.
    double a =
      principle
        * Math.pow((1 + rate / (100 * numberOfTimes)), (numberOfTimes * time));
    String sentence =
      "$" + principle + " saved at " + rate + "% compounded " + numberOfTimes
        + "\ntimes per year for " + time + " years is $" + roundAPHundredths(a);
    return sentence;
  }

  public static boolean sumOfTwoMakesThird(int x, int y, int z)
  {
    if (x + y == z || x + z == y || y + z == x)
    {
      return true;
    }
    else
    {
      return false;
    }

  }

  public static boolean isMultipleOf5or7(int number)
  {
    // Your first boolean returning method.
    // Make sure you return a true or false at some point in this code.
    // You will use an if statement to solve this.
    if (number % 5 == 0 || number % 7 == 0)
    {
      return true;
    }
    else
    {
      return false;
    }
  }

  public static String numbersMult5or7(int max)
  {
    // Note: YOU MUST CALL A PREVIOUS METHOD TO SOLVE THIS.
    // DO NOT USE MOD IN THIS PROBLEM,
    // Call your nifty isMultipleOf5or7 method in your
    // if statement.
    String answer = "";
    for (int i = 1; i <= max; i++)
    {
      if (isMultipleOf5or7(i))
      {
        answer = answer + i + ",";
      }
    }
    return "Answer:" + answer;
  }

  public static double convertToFahrenheit(double degreesCelsius)
  {
    double answer = degreesCelsius * (9.0 / 5) + 32;
    return answer;
  }

  public static double convertToCelsius(double degreesFahrenheit)
  {
    double answer = (degreesFahrenheit - 32) * (5 / 9.0);
    return answer;
  }

  public static String getCelsiusTemps(int cMin, int cMax, int step)
  {
    String sentence = "";
    // Do not use multiplication or division in this problem.
    // Call your previous convertToCelsius method to help solve this.
    for (int i = cMin; i <= cMax; i += step)
    {
      sentence += i + "      " + roundAPHundredths(convertToCelsius(i)) + "\n";
    }
    return "Fahrenheit Celsius\n" + "------------------\n" + sentence
      + "------------------";
  }
  // Copyright 2022+ VHSLearning.org
}