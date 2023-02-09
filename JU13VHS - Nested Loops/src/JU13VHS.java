/**
 * Name: Amy Bian
 * 
 * Nested Loops
 */
// Copyright 2022+ VHSLearning.org
public class JU13VHS
{

  public static String removeLettersFromWord(String aWord, String letter)
  {
    int position = 0;
    while (aWord.indexOf(letter) >= 0)
    {
      position = aWord.indexOf(letter);
      aWord = aWord.substring(0, position) + aWord.substring(position + 1);
    }
    return aWord;
  }

  public static String replaceWord(String sentence, String old,
                                   String replacement)
  {
    String answer = "";
    int position = 0;
    int wordLength = old.length();
    while (sentence.indexOf(old) >= 0)
    {
      position = sentence.indexOf(old);
      sentence =
        sentence.substring(0, position) + replacement
          + sentence.substring(position + wordLength);
    }
    return sentence;
  }

  public static String buildGridOfStars(int height, int width)
  {
    String answer = "";
    for (int i = 0; i < height; i++)
    {
      for (int x = 0; x < width; x++)
      {
        answer += ("*");
      }
      answer += "\n";
    }
    return answer;
  }

  public static String uglyTimesTable(int height, int width)
  {
    String answer = "";
    int number = 0;
    for (int i = 1; i <= height; i++)
    {
      for (int x = 0; x < width; x++)
      {
        number += i;
        answer += number + " ";
      }
      answer += "\n";
      number = 0;
    }
    return answer;
  }

  public static String buildRightJustified(int width)
  {
    String answer = "";
    for (int i = 0; i < 20 - width; i++)
    {
      answer += ".";
    }
    for (int i = 0; i < width; i++)
    {
      answer += "*";
    }
    return answer;
  }

  public static String buildStairs(int height, String symbol)
  {
    String answer = "";
    for (int i = 1; i <= height; i++)
    {
      for (int x = 0; x < height - i; x++)
      {
        answer += " ";
      }
      for (int y = 0; y < i; y++)
      {
        answer += symbol;
      }
      answer += "\n";
    }
    return answer;
  }

  public static String buildNumberMountain(int rows)
  {
    String answer = "";
    int number = 0;
    for (int i = 1; i <= rows; i++)
    {
      for (int x = 0; x < i; x++)
      {
        number++;
        answer += number + " ";
      }
      answer += "\n";
    }
    return answer;
  }

}