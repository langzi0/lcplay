/**
 * Name: Amy Bian
 * 
 * Complete the methods below so that they pass all of the tests in the
 * JU04VHSTest.java. Remember to open the JU04VHSTest.java file and press the
 * PLAY button when that file is open. This will open the JUnit pane and you
 * can see the results.
 */

public class JU04VHS
{
  /**
   * Returns a value that is one less than formal parameter value.
   * 
   * @param value
   * @return one less than value.
   */

  public static int decreaseByOne(int value)
  {
    int answer = value;
    // TODO: Write code that decreases answer by one. Use the compound operator
    // rather than
    // the x = x - 1 way.

    answer--;

    return answer;
  }

  /**
   * Return the average of two numbers.
   * 
   * @param number1
   * @param number2
   * @return average
   */
  public static double getAverage(double number1, double number2)
  {
    double average = 0.0;
    // TODO: Write code here

    average = (number1 + number2) / 2;

    return average;
  }

  /**
   * Return the average of three numbers. The answer to this
   * is located in CSAwesome 1.7.
   * 
   * @param grade1
   * @param grade2
   * @param grade3
   * @return average
   */
  public static double getAverage(double grade1, double grade2, double grade3)
  {
    double average = 0.0;
    // TODO: Write code here

    double sum = grade1 + grade2 + grade3;

    average = sum / 3;

    return average;
  }

  /**
   * Rounds any positive decimal to the nearest one's place.
   * 
   * @param unRounded
   *          > 0
   * @return rounded value the AP way
   */
  public static int roundPositiveToNearestInteger(double unRounded)
  {
    int roundedValue = 0;
    // TODO: You may not use any Math class static methods.
    // This includes Math.round or Math.anything.
    // The AP way of rounding is adding 0.5 to the number
    // and then chopping off the decimal.

    roundedValue = (int) (unRounded + 0.5);

    return roundedValue;
  }

  /**
   * Rounds any NEGATIVE decimal to the nearest one's place.
   * 
   * @param unRounded
   *          < 0
   * @return rounded value the AP way
   */
  public static int roundNegativeToNearestInteger(double unRounded)
  {
    int roundedValue = 0;
    // TODO: You may not use any Math class static methods.
    // This includes Math.round or Math.anything.
    // The AP way of rounding is subtracting 0.5 from the number
    // and then chopping off the decimal.

    roundedValue = (int) (unRounded - 0.5);

    return roundedValue;
  }

  /**
   * Finds the remainder when the numerator is divided by the denominator.
   * 
   * @param numerator
   * @param denominator
   *          != 0;
   * @return the remainder of numerator and denominator
   */
  public static int findRemainder(int numerator, int denominator)
  {
    int remainder = 0;
    // TODO: Use the modulo operator. Your Algebra class doesn't have this
    // nifty operator.

    remainder = numerator % denominator;

    return remainder;

  }
  // Copyright VHSLearning.org

}