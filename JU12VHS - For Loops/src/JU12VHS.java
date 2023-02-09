/**
 * Name: Amy Bian
 */
// Copyright 2022+ VHSLearning.org
public class JU12VHS
{
  // Declare any constants here.

  public static String displayStarsOnOneLine(int max)
  {
    // You must solve using a FOR loop.
    // No credit for using a while loop.
    String answer = "";
    for (int i = 0; i < max; i++)
    {
      answer += "*";
    }
    return answer;
  }

  public static String simpleLoop(int max)
  {
    // You must solve using a FOR loop.
    // No credit for using a while loop.
    String answer = "";
    for (int i = 1; i <= max; i++)
    {
      if (i == max)
      {
        answer += i;
      }
      else
      {
        answer += i + ",";
      }
    }
    answer = "[" + answer + "]";
    return answer;
  }

  public static String basicCountUpBy7s(int max)
  {
    // You must solve using a FOR loop(s).
    // No credit for using a while loop.
    String answer = "";
    for (int i = 7; i <= max; i += 7)
    {
      answer += i;
    }
    answer = "[" + answer + "]";
    return answer;
  }

  public static String flexibleLoop(int start, int end, int step)
  {
    String answer = "[";

    if (step < 0)
    {
      for (int i = start; i >= end; i += step)
      {
        answer += i + ",";
      }
    }
    else
    {
      for (int i = start; i <= end; i += step)
      {
        answer += i + ",";
      }
    }

    return answer + "]";
  }

  public static String divisibleBy(int weirdNum, int max)
  {
    // You must solve using a FOR loop(s).
    // No credit for using a while loop. ... like you'd want to anyway.
    String answer = "";
    for (int i = 1; i <= max; i += 1)
    {
      if (i % weirdNum == 0)
      {
        answer += "[" + i + "] ";
      }
      else
      {
        answer += i + " ";
      }
    }
    return answer;
  }

  public static String nasaCountDown(int start)
  {
    // You must solve using a FOR loop(s).
    // No credit for using a while loop.
    String answer = "";
    for (int i = start; i >= 1; i--)
    {
      answer += i + "...";
    }
    answer = "T-Minus " + start + " seconds:" + answer + "BLAST OFF";
    return answer;
  }

  public static String sumThemUp(int min, int max)
  {
    // You must solve using a FOR loop(s).
    // No credit for using a while loop.
    String answer = "";
    int sum = 0;
    for (int i = min; i <= max; i++)
    {
      if (i == max)
      {
        answer += i;
      }
      else
      {
        answer += i + " + ";
      }
      sum += i;
    }
    answer += " = " + sum;
    return answer;
  }

  public static String buildTChart(int min, int max)
  {
    // You must solve using a FOR loop(s).
    // No credit for using a while loop.
    String answer = "";
    int y = 0;
    for (int i = min; i <= max; i++)
    {
      y = 3 * i + 2;
      answer = answer + i + "   " + y + "\n";
    }
    answer =
      "-----------------\n" + "x | f(x) = 3x + 2\n" + "-----------------\n"
        + answer + "-----------------\n";
    return answer;
  }

  // Copyright 2022+ VHSLearning.org

}