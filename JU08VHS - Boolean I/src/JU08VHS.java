/**
 * Name: Amy Bian
 * This goes with chapter 3 and deals with selection statements
 * such as IF THEN ELSE
 *
 * @version 3.0
 *
 */

public class JU08VHS
{
  // declare your constants here to fix "magic" numbers.

  public static String posZeroNeg(int number)
  {
    String response = "";
    // TODO: Finish
    if (number > 0)
    {
      response = number + " is positive.";
    }
    else if (number < 0)
    {
      response = number + " is negative.";
    }
    else
    {
      response = number + " is zero.";
    }
    return response;
  }

  public static String isEvenOrOdd(int number)
  {
    String answer = "";// declare a String variable answer and assign it empty
                       // string (which is different than null)

    // note if you just declare a String variable without initializing it,
    // it will have the value null.
    if (number % 2 == 0)
    {
      answer = number + " is even.";
    }
    else
    {
      answer = number + " is odd.";
    }

    // TODO: Put code here.
    return answer;

  }

  public static String simpleIf(int number)
  {
    String answer = "";
    if (number % 2 == 0 && number % 5 == 0)
    {
      answer = "HiFiveAndEven";
    }
    else if (number % 2 == 0)
    {
      answer = "HiEven";
    }
    else if (number % 5 == 0)
    {
      answer = "HiFive";
    }
    else
    {
      answer = "Sorry";
    }

    return answer;
  }

  public static String getLetterGrade(int score)
  {
    String letterGrade = "";
    if (score >= 90.0)
    {
      letterGrade = "A";
    }
    else if (score >= 80.0)
    {
      letterGrade = "B";
    }
    else if (score >= 70.0)
    {
      letterGrade = "C";
    }
    else if (score >= 60.0)
    {
      letterGrade = "D";
    }
    else
    {
      letterGrade = "F";
    }

    return letterGrade;
  }

  public static String inAlphabeticalOrder(String a, String b, String c)
  {
    String order = "";
    if (a.compareTo(b) < 0 && b.compareTo(c) < 0)
    {
      order = a + ", " + b + ", and " + c + " are in alphabetical order.";
    }
    else
    {
      order = a + ", " + b + ", and " + c + " are NOT in alphabetical order.";
    }

    return order;
  }

  public static String firstTwoCharacters(String phrase)
  {
    String answer = "";
    if (phrase.length() >= 2)
    {
      answer = phrase.substring(0, 2);
    }
    else if (phrase.length() == 1)
    {
      answer = phrase.substring(0, 1) + "#";
    }
    else
    {
      answer = "##";
    }
    return answer;
  }

}