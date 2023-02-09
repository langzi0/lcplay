
/**
 * Name: Amy Bian
 * Non-AP Subset methods are not allowed.
 * ArrayLists are not allowed for this JUnit.
 * Use FOR EACH as much as you can.
 */

public class JU19VHS
{
  // Declare any constants up here.

  public static String dumpNamesForReg(String[] names)
  {
    // You MUST use a regular FOR loop to solve this.
    String sentence = "Start:";
    for (int i = 0; i < names.length; i++)
    {
      sentence = sentence + "<" + names[i] + ">";
    }
    return sentence + ":Finish";
  }

  public static String dumpNamesForEach(String[] names)
  {
    // Remember to do this using a FOR EACH loop.
    // In my experience, newbie coders often fear the so-called enhanced loop.
    // The AP Exam is obsessed with it - you'll see it's use often in the
    // multiple choice questions.

    String sentence = "Start:";
    for (String value : names)
    {
      sentence += "<" + value + ">";
    }
    return sentence + ":Finish";
  }

  public static int tally42sForReg(int[] arr)
  {
    // Hint: You can use a normal FOR loop here. Do not use a FOR EACH loop.
    int counter = 0;
    for (int i = 0; i < arr.length; i++)
    {
      if (arr[i] == 42)
      {
        counter++;
      }
    }
    return counter;
  }

  public static int tally42sForEach(int[] arr)
  {
    // Hint: You can use a FOR EACH loop here.
    int counter = 0;
    for (int value : arr)
    {
      if (value == 42)
      {
        counter++;
      }
    }
    return counter;
  }

  public static boolean spellCheck(String[] dictionary, String aSingleWord)
  {
    for (String value : dictionary)
    {
      if (aSingleWord.equals(value))
      {
        return true;
      }
    }
    return false;
  }

  public static int countTheIngs(String[] words)
  {
    int counter = 0;
    for (String value : words)
    {
      int wordLength = value.length();
      if (wordLength > 5
        && value.substring(wordLength - 3, wordLength).equals("ing"))
      {
        counter++;
      }
    }
    return counter;
  }

  public static void shiftThemToTheRight(int[] values)
  {
    int firstValue = values[values.length - 1];
    for (int i = values.length - 1; i >= 0; i--)
    {
      if (i == 0)
      {
        values[i] = firstValue;
      }
      else
      {
        values[i] = values[i - 1];
      }
    }
  }

  public static int[] createArrayOfWholeNumbers(int max)
  {
    int[] numbers = new int[max + 1];
    for (int i = 0; i <= max; i++)
    {
      numbers[i] = i;
    }
    return numbers;
  }

  public static int[] appendArrays(int[] myArray, int[] yourArray)
  {
    int totalLength = myArray.length + yourArray.length;
    int[] combinedArray = new int[totalLength];
    for (int i = 0; i < myArray.length; i++)
    {
      combinedArray[i] = myArray[i];
    }
    for (int i = myArray.length; i < totalLength; i++)
    {
      combinedArray[i] = yourArray[i - myArray.length];
    }
    return combinedArray;
  }

  public static boolean fourSame(int[] values)
  {
    boolean answer = false;
    for (int i = 0; i < values.length - 3; i++)
    {
      if (values[i] == values[i + 1] && values[i + 1] == values[i + 2]
        && values[i + 2] == values[i + 3])
      {
        answer = true;
      }

    }
    return answer;
  }

  public static void switchEm(int[] arr, int x, int y)
  {
    // first check if the indexes are valid.
    // Java subscripts can not be negative nor larger than the length.
    if (x >= 0 && y >= 0 && x < arr.length && y < arr.length)
    {
      int tempValue = arr[x];
      arr[x] = arr[y];
      arr[y] = tempValue;
    }
    // if either of the indexes are valid, then do nothing.
  }

  public static String gimmeBig(int[] arr)
  {
    int lowest = arr[0];
    int highest = arr[0];
    int index = 0;
    for (int i = 0; i < arr.length; i++)
    {
      if (arr[i] > highest)
      {
        highest = arr[i];
        index = i;
      }
    }
    String array = "";
    for (int i = 0; i < arr.length; i++)
    {
      if (i == arr.length - 1)
      {
        array += arr[i];
      }
      else
      {
        array += arr[i] + ", ";
      }
    }
    array = "[" + array + "]";
    return "For the array " + array + ", the largest value " + highest
      + " can be found at index " + index;
  }

  public static String mostPopular(String[] studentNames)
  {

    int highestEqualCounter = 0;
    String mostOccuredName = "";
    for (int i = 0; i < studentNames.length; i++)
    {
      int tempEqualCounter = 0;
      for (String value : studentNames)
      {
        if (studentNames[i].equals(value))
        {
          tempEqualCounter++;
        }
      }
      if (tempEqualCounter > highestEqualCounter)
      {
        highestEqualCounter = tempEqualCounter;
        mostOccuredName = studentNames[i];
      }
    }
    if (highestEqualCounter == 1)
    {
      return "No name occured more than once.";
    }
    else
    {
      return "The most popular name was " + mostOccuredName + " with "
        + highestEqualCounter + " occurances.";
    }

  }
  // Copyright 2022+ VHSLearning.org

}