import java.util.ArrayList;

/**
 * There are some review problems of 1D arrays so you will appreciate the power
 * of ArrayLists.
 * You are only allowed to use AP Subset methods.
 * 
 * @author: Amy Bian
 */

public class JU20VHS
{
  // Declare your constants up here.
  // Don't use non-descriptive names like EIGHT=8

  public static void epicAdd(int location, String aName, ArrayList<String> arr)
  {
    arr.add(location, aName);
  }

  public static void removeTheFirstTwoValues(ArrayList<Integer> myList)
  {
    myList.remove(0);
    myList.remove(0);
  }

  public static void removeTheLastValue(ArrayList<String> myList)
  {
    if (myList.size() > 0)
    {
      myList.remove(myList.size() - 1);
    }
  }

  public static void addSpaghetti(ArrayList<String> sandwich)
  {
    int index = sandwich.size() / 2;
    sandwich.add(index, "spaghetti");
  }

  public static void thanosSnap(ArrayList<String> victims)
  {
    double half = victims.size() / 2.0;
    if (victims.size() % 2 == 1)
    {
      half = (int) (half - 0.5);
    }
    for (int i = 0; i < half; i++)
    {
      victims.remove(victims.size() - 1);
    }
  }

  public static void removeThatWord(ArrayList<String> myList, String target)
  {
    int i = 0;
    while (i < myList.size())
    {
      if (myList.get(i).equals(target))
      {
        myList.remove(i);
      }
      else
      {
        i++;
      }
    }
  }

  public static void makeMeHealthy(ArrayList<String> myFood)
  {
    int i = 0;
    while (i < myFood.size())
    {
      if (myFood.get(i).equals("pizza") || myFood.get(i).equals("hamburger"))
      {
        myFood.set(i, "broccoli");
      }
      else
      {
        i++;
      }
    }
  }

  public static ArrayList<String> reverse(ArrayList<String> myList)
  {
    ArrayList<String> reverse = new ArrayList<String>();
    for (int i = 0; i < myList.size(); i++)
    {
      reverse.add(myList.get(myList.size() - i - 1));
    }
    return reverse;
  }

  public static int[] fill1DArray(int[] arr)
  {
    int[] newArr = new int[arr.length + 4];
    for (int i = 0; i < arr.length; i++)
    {
      newArr[i] = arr[i];
    }
    newArr[arr.length] = 4;
    newArr[arr.length + 1] = 3;
    newArr[arr.length + 2] = 1;
    newArr[arr.length + 3] = 8;
    return newArr;
  }

  public static ArrayList<Integer> fillArrayList(ArrayList<Integer> arr)
  {
    int index = arr.size();
    arr.add(index, 4);
    arr.add(index + 1, 3);
    arr.add(index + 2, 1);
    arr.add(index + 3, 8);
    return arr;
  }

  public static void destroySmallest(ArrayList<Integer> myList)
  {
    int smallest = myList.get(0);
    int index = 0;
    for (int i = 0; i < myList.size(); i++)
    {
      if (myList.get(i) < smallest)
      {

        index = i;
        smallest = myList.get(i);
      }
    }
    myList.remove(index);
  }

  public static int getSumButNotAfter42(ArrayList<Integer> numList)
  {
    int i = 0;
    int sum = 0;
    while (i < numList.size() && numList.get(i) != 42)
    {
      sum += numList.get(i);
      i++;
    }

    if (i != numList.size())
    {
      sum += 42;
    }
    return sum;
  }

  public static int getRange(ArrayList<Integer> numList)
  {
    int smallest = numList.get(0);
    for (int i = 0; i < numList.size(); i++)
    {
      if (numList.get(i) < smallest)
      {

        smallest = numList.get(i);
      }
    }

    int biggest = numList.get(0);
    for (int i = 0; i < numList.size(); i++)
    {
      if (numList.get(i) > biggest)
      {

        biggest = numList.get(i);
      }
    }
    int difference = biggest - smallest;
    return difference;

  }

  public static int getSizeOfBigWord(ArrayList<String> aList)
  {
    int longest = 0;
    for (int i = 0; i < aList.size(); i++)
    {
      if (aList.get(i).length() > longest)
      {

        longest = aList.get(i).length();
      }
    }
    return longest;
  }

  public static void destroyDupes(ArrayList<String> aList)
  {
    ArrayList<String> bList = new ArrayList<String>();
    if (aList.size() > 0)
    {
      bList.add(aList.get(0));
    }

    for (int i = 1; i < aList.size(); i++)
    {
      boolean found = false;
      for (String s : bList)
      {
        if (aList.get(i) == s)
        {
          found = true;
        }
      }

      if (!found)
      {
        bList.add(aList.get(i));
      }
    }
    for (int i = aList.size() - 1; i >= bList.size(); i--)
    {
      aList.remove(i);
    }

    for (int i = 0; i < bList.size(); i++)
    {
      aList.set(i, bList.get(i));
    }
  }

  public static void talktalk(ArrayList<String> aList)
  {
    for (int i = 0; i < aList.size(); i += 2)
    {
      aList.add(i, aList.get(i));
    }
  }

  public static boolean threeOddEven(ArrayList<Integer> numList)
  {
    boolean sequence = false;
    if (numList.size() < 3)
    {
      return false;
    }
    for (int i = 0; i <= numList.size() - 3; i++)
    {
      if (numList.get(i) % 2 == 0 && numList.get(i + 1) % 2 == 0
        && numList.get(i + 2) % 2 == 0)
      {
        sequence = true;
      }
      if (numList.get(i) % 2 == 1 && numList.get(i + 1) % 2 == 1
        && numList.get(i + 2) % 2 == 1)
      {
        sequence = true;
      }
    }
    return sequence;
  }

  public static void targetThrees(ArrayList<String> aList)
  {
    int i = 0;
    while (i < aList.size())
    {
      if (aList.get(i).length() == 3)
      {
        aList.add(i, "***");
        i++;
      }
      i++;
    }
  }

  public static void flipPairs(ArrayList<String> aList)
  {
    for (int i = 0; i < aList.size() - 1; i += 2)
    {
      String temp = aList.get(i);
      aList.set(i, aList.get(i + 1));
      aList.set(i + 1, temp);
    }
  }

  public static ArrayList<String> makeWordPairs(String[] words)
  {
    ArrayList<String> wordPairList = new ArrayList<>();
    int length = words.length;
    for (int i = 0; i < length; i++)
    {
      for (int k = i + 1; k < length; k++)
      {
        wordPairList.add(words[i] + words[k]);
      }
    }
    return wordPairList;
  }

}
