/**
 * Name: Amy Bian WHILE LOOPS
 * 
 */
public class JU11VHS
{
  // Declare any constants here.

  public static String displayStarsOnOneLine(int max)
  {
    String response = "";
    int counter = 1;
    while (counter <= max)
    {
      response = response + "*";
      counter++;
    }
    return response;
  }

  public static String displayStarsOnSeparateLines(int max)
  {
    String answer = "";
    int counter = 1;
    while (counter <= max)
    {
      answer = answer + "*\n";
      counter++;
    }
    return answer;
  }

  public static String simpleLoop(int max)
  {
    String answer = "";
    int counter = 1;
    while (counter <= max)
    {
      answer = answer + counter + ",";
      counter++;
    }
    return answer;
  }

  public static String simpleLoopWordWrap(int max, int length)
  {
    String answer = "";
    int count = 0;
    int i = 1;
    while (i <= max)
    {
      answer = answer + i + ",";
      i++;
      count++;
      if (count % length == 0)
      {
        answer += "\n";
      }
    }

    return answer;
  }

  public static String countUpTo(int max)
  {
    String answer = "";
    int counter = 1;
    while (counter <= max)
    {
      answer = answer + counter + ",";
      counter++;
    }
    answer = "Starting counting at " + answer + "and we are done!";
    return answer;
  }

  public static String countDownBrackets(int max)
  {
    String answer = "[" + (max) + "] ";
    while (max > 1)
    {
      answer = answer + "[" + (max - 2) + "] ";
      max -= 2;
    }
    return answer;
  }

  public static String divisibleBy(int weirdNum, int max)
  {
    String answer = "";
    int counter = 1;
    while (counter <= max)
    {
      if (counter % weirdNum == 0)
      {
        answer = answer + "[" + counter + "]" + " ";
      }
      else
      {
        answer = answer + counter + " ";
      }
      counter++;
    }
    return answer;
  }

  public static String numbersThatAreDivisibleByFiveOrSixButNotBoth(int min,
                                                                    int max)
  {
    String response = "";
    int i = min; // We'll use i as the LCV
    int count = 1; // keep track of the end of each line.

    while (i <= max)
    {
      if (i != 0 && (i % 5 == 0 && i % 6 != 0) || (i % 6 == 0 && i % 5 != 0))
      {
        if (count % 10 == 0 && count != 0)
        {
          response = response + i + "\n";
        }
        else
        {
          response = response + i + ",";
        }
        count++;
      }
      i++;

    }

    return response;
  }

  public static String simpleLoopNoTrailingComma(int max)
  {
    int count = 1;
    String answer = "";
    while (count <= max)
    {
      if (count == max)
      {
        answer = answer + count;
      }
      else
      {
        answer = answer + count + ",";
      }
      count++;
    }
    return answer;
  }

  public static String nasaCountDown(int start)
  {
    String answer = "";
    int counter = start;
    while (counter >= 1)
    {
      answer = answer + counter + "...";
      counter -= 1;
    }
    answer = "T-Minus " + start + " seconds:" + answer + "BLAST OFF";
    return answer;
  }

  public static String sumThemUp(int min, int max)
  {
    String answer = "";
    int counter = min;
    int total = 0;
    while (counter <= max)
    {
      if (counter == max)
      {
        answer = answer + counter;
      }
      else
      {
        answer = answer + counter + " + ";
      }
      total = total + counter;
      counter++;
    }
    answer = answer + " = " + total;
    return answer;
  }

  public static String buildTChart(int min, int max)
  {
    String answer = "";
    int count = min;
    int y;
    while (count <= max)
    {
      y = 3 * count + 2;
      answer = answer + count + "   " + y + "\n";
      count++;
    }
    answer =
      "-----------------\n" + "x | f(x) = 3x + 2\n" + "-----------------\n"
        + answer + "-----------------\n";
    return answer;
  }

  public static String buildSqrtTChart(int min, int max)
  {
    int count = min;
    int y;
    String answer = "";
    while (count <= max)
    {
      y = (int) (Math.sqrt(Math.abs(count)) + 0.5);
      if (count < 0)
      {
        answer = answer + count + "   " + y + "i\n";
      }
      else
      {
        answer = answer + count + "   " + y + "\n";
      }
      count += 1000;
    }
    answer =
      "---------------------------\n" + "x | f(x) = Square root of x\n"
        + "---------------------------\n" + answer
        + "---------------------------\n";
    return answer;
  }

  public static String favoriteGame(String game, int times)
  {
    String answer = "";
    int count = 1;
    while (count <= times)
    {
      if (count == times)
      {
        answer = answer + "\"" + game + "\"";
      }
      else
      {
        answer = answer + "\"" + game + "\", ";
      }
      count++;
    }
    answer = "My favorite game is " + answer + "!";
    return answer;
  }

  public static String tardies(int min, int max)
  {
    int count = min;
    String answer = "";
    while (count <= max)
    {
      if (count % 10 == 1)
      {
        if (count % 100 == 11)
        {
          answer = answer + count + "th tardy\n";
        }
        else
        {
          answer = answer + count + "st tardy\n";
        }
      }
      else if (count % 10 == 2)
      {
        if (count % 100 == 12)
        {
          answer = answer + count + "th tardy\n";
        }
        else
        {
          answer = answer + count + "nd tardy\n";
        }
      }
      else if (count % 10 == 3)
      {
        if (count % 100 == 13)
        {
          answer = answer + count + "th tardy\n";
        }
        else
        {
          answer = answer + count + "rd tardy\n";
        }
      }
      else
      {
        answer = answer + count + "th tardy\n";
      }
      count++;
    }
    return answer;
  }

}