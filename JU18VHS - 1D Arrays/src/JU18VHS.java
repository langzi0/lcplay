/**
 * Name: Amy, Bian. Exercises practicing using 1D arrays of
 * primitives. Submit this to the dropbox. Restrictions: You may not use the
 * Arrays nor List class to solve any of these problems. This includes the
 * Arrays.equals method which would solve some of these problems in one line of
 * code.
 * 
 * @author - Amy Bian
 * 
 *         You may only official AP Subset methods.
 * 
 */

public class JU18VHS
{
  // Declare any constants here.

  // Since all of these methods are static, you will not
  // declare any instance variables.

  public static void changeThe1stAnd4thValue(int[] score)
  {
    score[0] = 40;
    if (score.length > 3)
    {
      score[3] = 35;
    }
  }

  public static int totalNumberOfElements(int[] arr1, int[] arr2, int[] arr3)
  {
    int digits = arr1.length + arr2.length + arr3.length;
    return digits;
  }

  public static void raiseTheLastElementToThePower(int[] itemArray, int power)
  {
    int length = itemArray.length;
    itemArray[length - 1] = (int) Math.pow(itemArray[length - 1], power);
  }

  public static void swapFirstWithLast(int[] myArray)
  {
    int length = myArray.length;
    int temp = myArray[0];
    myArray[0] = myArray[length - 1];
    myArray[length - 1] = temp;
  }

  public static void tripleFirstHalf(int[] scores)
  {
    int length = (int) (scores.length / 2.0 + 0.5);
    for (int i = 0; i < length; i++)
    {
      scores[i] = scores[i] * 3;
    }
  }

  public static boolean equalArrays(int[] myArray, int[] yourArray)
  {
    int equalCounter = 0;
    if (myArray.length == yourArray.length)
    {
      for (int i = 0; i < myArray.length; i++)
      {
        if (myArray[i] == yourArray[i])
        {
          equalCounter++;
        }
      }
      if (equalCounter == myArray.length)
      {
        return true;
      }
      else
      {
        return false;
      }
    }
    else
    {
      return false;
    }
  }

  public static int countFortyTwos(int[] myArray)
  {
    int counter = 0;
    for (int i = 0; i < myArray.length; i++)
    {
      if (myArray[i] == 42)
      {
        counter++;
      }
    }
    return counter;
  }

  public static int getTotal(int[] myArray)
  {
    int sum = 0;
    for (int i = 0; i < myArray.length; i++)
    {
      sum += myArray[i];
    }
    return sum;
  }

  public static double getAverage(int[] scoreArray)
  {
    int sum = getTotal(scoreArray);
    double average = sum / (double) scoreArray.length;
    return average;
  }

  public static String calculateGrade(int[] scoreArray)
  {
    double grade = getAverage(scoreArray);
    if (grade < 60)
    {
      return "F";
    }
    else if (grade < 70)
    {
      return "D";
    }
    else if (grade < 80)
    {
      return "C";
    }
    else if (grade < 90)
    {
      return "B";
    }
    else
    {
      return "A";
    }

  }

  public static int getTheBiggest(int[] myArray)
  {
    int currentHigh = 0;
    for (int i = 0; i < myArray.length; i++)
    {
      if (currentHigh < myArray[i])
      {
        currentHigh = myArray[i];
      }
    }
    return currentHigh;
  }

  public static String bookAtEndOfShelf(String[] books)
  {
    String currentLast = "A";
    for (int i = 0; i < books.length; i++)
    {
      if (currentLast.compareTo(books[i]) < 0)
      {
        currentLast = books[i];
      }
    }
    return currentLast;

  }

  public static int getTotalLetters(String[] wordArray)
  {
    int sum = 0;
    for (int i = 0; i < wordArray.length; i++)
    {
      int length = wordArray[i].length();
      sum += length;
    }
    return sum;
  }
  // Copyright 2022+ VHSLearning.org

}