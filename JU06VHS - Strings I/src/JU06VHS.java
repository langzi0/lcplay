/**
 * Name: Amy Bian
 * You are not allowed to use any non subset methods to
 * solve these. Please ask your teacher questions in the private topic and paste
 * all of this code into the topic.
 */

public class JU06VHS
{
  public static String sayTheMath(int number1, int number2)
  {
    String response =
      number1 + " times " + number2 + " is " + (number1 * number2);
    return response;
  }

  public static String sayTheLength(String aSentence)
  {
    int stringLength = aSentence.length();
    String response =
      "I count " + stringLength + " characters in the sentence \"" + aSentence
        + "\".";
    return response;
  }

  public static String shout(String name, String phrase)
  {
    String response =
      name + " loves to shout the phrase" + " \"" + phrase + "\"!";
    return response;
  }

  public static String getFilePath(String driveLetter, String mainFolder,
                                   String fileName)
  {
    String response = driveLetter + ":\\" + mainFolder + "\\" + fileName;
    return response;
  }

  public static String noFirstLetterConcat(String word1, String word2)
  {
    String noFirstLetterWord1 = word1.substring(1);
    String noFirstLetterWord2 = word2.substring(1);
    String response = noFirstLetterWord1 + noFirstLetterWord2;
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

  public static String getLastInitials(String firstName, String middleName,
                                       String lastName)
  {
    String initials =
      firstName.substring(firstName.length() - 1)
        + middleName.substring(middleName.length() - 1)
        + lastName.substring(lastName.length() - 1);
    return initials;
  }

  public static String pigLatin(String normalWord)
  {
    String firstLetter = normalWord.substring(0, 1);
    int stringLength = normalWord.length();
    String restOfLetters = normalWord.substring(1, stringLength);
    String response = restOfLetters + firstLetter + "ay";
    return response;
  }

  // Copyright @VHSLearning

}