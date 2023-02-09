/**
 * @author Amy Bian
 *         Note: You are only allowed to use methods from
 *         the official APCS Subset. The String class specific ones are:
 *         <ol>
 *         <li>int length()</li>
 *         <li>String substring(from, to),</li>
 *         <li>String substring(from),</li>
 *         <li>int indexOf(String value),</li>
 *         <li>int compareTo(Object other),</li>
 *         <li>boolean equals(Object other)</li>
 *         <li>String toString()</li>
 *         </ol>
 *         <p>
 *         Use of any other method from the String class will result in a zero.
 *         </p>
 * 
 */

public class JU07VHS
{
  // TODO: Add constant declarations here.
  // Use descriptive names. Do not say FIVE = 5, rather HIGH_SCORE = 5;

  public static String squareRootSentence(int number)
  {
    String response =
      "The square root of " + number + " is " + Math.sqrt(number);
    return response;
  }

  public static String exponentSentence(int base, int exponent)
  {
    String response =
      base + " ^ " + exponent + " == " + Math.pow(base, exponent);
    return response;
  }

  public static String noFirstLetterConcat(String word1, String word2)
  {
    String noFirstLetterWord1 = word1.substring(1);
    String noFirstLetterWord2 = word2.substring(1);
    String response = noFirstLetterWord1 + noFirstLetterWord2;
    return response;
  }

  public static String getMiddleThree(String str)
  {
    double middlePosition = str.length() / 2.0;
    int firstPosition = (int) (middlePosition - 1.5); // position of the first
                                                      // character in the 3
                                                      // letter output
    int lastPosition = (int) (middlePosition + 1.5); // position of the last
                                                     // character in the 3
                                                     // letter output
    if (middlePosition % 2 == 0.0)// if the string is an even number
    {
      String response = "nope";
      return response;
    }
    if (str.length() < 3) // if the string length is less than three
    {
      String response = "nope";
      return response;
    }
    else
    {
      String threeLetterWord = str.substring(firstPosition, lastPosition);
      String response = threeLetterWord;
      return response;
    }

  }

  public static String getEuroDate(String usaDate)
  {
    String month = usaDate.substring(0, 2);
    String day = usaDate.substring(3, 5);
    String year = usaDate.substring(6, 10);
    String response = day + "-" + month + "-" + year;
    return response;
  }

  public static String firstAndLast(String firstWord, String lastWord)
  {
    String firstLetterFirstWord;
    String lastLetterLastWord;
    if (firstWord == "")
    {
      firstLetterFirstWord = "#";
    }
    else
    {
      firstLetterFirstWord = firstWord.substring(0, 1);
    }

    if (lastWord == "")
    {
      lastLetterLastWord = "#";
    }
    else
    {
      lastLetterLastWord =
        lastWord.substring(lastWord.length() - 1, lastWord.length());
    }
    String response = firstLetterFirstWord + lastLetterLastWord;
    return response;
  }

  public static String convertName(String phrase)
  {
    int endOfLastName = phrase.indexOf(",");
    int startOfFirstName = endOfLastName + 2;
    String lastName = phrase.substring(0, endOfLastName);
    String firstName = phrase.substring(startOfFirstName, phrase.length());
    String response = firstName + " " + lastName;
    return response;
  }

  public static String findVowels(String sentence)
  {

    int aPosition = sentence.indexOf("a");
    int ePosition = sentence.indexOf("e");
    int iPosition = sentence.indexOf("i");
    int oPosition = sentence.indexOf("o");
    int uPosition = sentence.indexOf("u");
    String response =
      "The first position of a is " + aPosition
        + ".\nThe first position of e is " + ePosition
        + ".\nThe first position of i is " + iPosition
        + ".\nThe first position of o is " + oPosition
        + ".\nThe first position of u is " + uPosition + ".\n";
    return response;
  }

  public static String howMuchPaint(double house1, double house2, double house3)
  {
    double allHouses = house1 + house2 + house3;
    int ceilingAllHouses = (int) (allHouses + 0.99);
    String response = "Buy " + ceilingAllHouses + " gallons of paint.";
    return response;
  }
  // Copyright 2022+ VHSLearning

}