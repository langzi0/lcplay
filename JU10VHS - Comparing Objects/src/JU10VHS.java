/**
 * Name: Amy Bian
 */

public class JU10VHS
{

  public static String frontVHS(String sentence)
  {
    String response;
    if (sentence.substring(0, 3).equals("VHS"))
    {
      response = "Yes, VHS is at the front!";
    }
    else
    {
      response = "No, VHS is not at the front.";
    }
    return response;
  }

  public static String sortCombine(String word1, String word2)
  {
    String response;
    if (word1.compareTo(word2) < 0 || word1.equals(word2))
    {
      response = word1 + word2;
    }
    else
    {
      response = word2 + word1;
    }

    return response;
  }

  public static String sortCombine(String word1, String word2, String word3)
  {
    String response = "";
    if (word1.compareTo(word2) < 0 && word2.compareTo(word3) < 0)
    {
      response = word1 + word2 + word3;
    }
    else if (word1.compareTo(word3) < 0 && word3.compareTo(word2) < 0)
    {
      response = word1 + word3 + word2;
    }
    else if (word2.compareTo(word1) < 0 && word1.compareTo(word3) < 0)
    {
      response = word2 + word1 + word3;
    }
    else if (word2.compareTo(word3) < 0 && word3.compareTo(word1) < 0)
    {
      response = word2 + word3 + word2;
    }
    else if (word3.compareTo(word1) < 0 && word1.compareTo(word2) < 0)
    {
      response = word3 + word1 + word2;
    }
    else if (word3.compareTo(word2) < 0 && word2.compareTo(word1) < 0)
    {
      response = word3 + word2 + word1;
    }
    return response;
  }

  public static String sameBookEnds(String sentence)
  {
    String response = "";
    String firstTwoLetters = sentence.substring(0, 2);
    int length = sentence.length();
    if (firstTwoLetters.equals(sentence.substring(length - 2, length)))
    {
      response = firstTwoLetters;
    }
    else
    {
      response = sentence;
    }
    return response;
  }

  // Copyright 2022+ VHSLearning.org

}