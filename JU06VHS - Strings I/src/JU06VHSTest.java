
/**
 * Make no changes to this file.
 * Do not submit this file to dropbox.
 * Press play on this file once, then you can press play in the other file
 * at any time.
 */
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.DisplayName.class)
public class JU06VHSTest
{

  @Test
  void test01SayTheMath1()
  {
    String expected = "3 times 4 is 12";
    String actual = JU06VHS.sayTheMath(3, 4);
    assertEquals(expected, actual);
  }

  @Test
  void test01SayTheMath2()
  {
    String expected = "-10 times -5 is 50";
    String actual = JU06VHS.sayTheMath(-10, -5);
    assertEquals(expected, actual);
  }

  @Test
  void test01SayTheMath3()
  {
    String expected = "-7 times 4 is -28";
    String actual = JU06VHS.sayTheMath(-7, 4);
    assertEquals(expected, actual);
  }

  @Test
  void test02SayTheLength1()
  {
    String expected =
      "I count 20 characters in the sentence \"I love VHS Learning!\".";
    String actual = JU06VHS.sayTheLength("I love VHS Learning!");
    assertEquals(expected, actual);
  }

  @Test
  void test02SayTheLength2()
  {
    String expected =
      "I count 22 characters in the sentence \"Strings are immutable.\".";
    String actual = JU06VHS.sayTheLength("Strings are immutable.");
    assertEquals(expected, actual);
  }

  @Test
  void test02SayTheLength3()
  {
    String expected =
      "I count 48 characters in the sentence \"I ask my teachers questions in my private topic.\".";
    String actual =
      JU06VHS.sayTheLength("I ask my teachers questions in my private topic.");
    assertEquals(expected, actual);
  }

  @Test
  void test03Shout1()
  {
    assertEquals("Steve loves to shout the phrase \"Apple\"!",
                 JU06VHS.shout("Steve", "Apple"));
  }

  @Test
  void test03Shout2()
  {
    assertEquals("Ellen loves to shout the phrase \"Games and Fun\"!",
                 JU06VHS.shout("Ellen", "Games and Fun"));
  }

  @Test
  void test03Shout3()
  {
    assertEquals("SpongeBob loves to shout the phrase \"Patrick\"!",
                 JU06VHS.shout("SpongeBob", "Patrick"));
  }

  @Test
  void test04GetFilePath1()
  {
    assertEquals("D:\\Downloads\\fred.txt",
                 JU06VHS.getFilePath("D", "Downloads", "fred.txt"));
  }

  @Test
  void test04GetFilePath2()
  {
    assertEquals("C:\\Documents\\ace.mp3",
                 JU06VHS.getFilePath("C", "Documents", "ace.mp3"));
  }

  @Test
  void test04GetFilePath3()
  {
    assertEquals("B:\\Videos\\math.mp4",
                 JU06VHS.getFilePath("B", "Videos", "math.mp4"));
  }

  @Test
  void test05NoFirstLetterConcat1()
  {
    assertEquals("raceopper", JU06VHS.noFirstLetterConcat("Grace", "Hopper"));
  }

  @Test
  void test05NoFirstLetterConcat2()
  {
    assertEquals("teveobs", JU06VHS.noFirstLetterConcat("Steve", "Jobs"));
  }

  @Test
  void test05NoFirstLetterConcat3()
  {
    assertEquals("haggyoo", JU06VHS.noFirstLetterConcat("Shaggy", "Doo"));
  }

  @Test
  void test06FindVowels1()
  {
    assertEquals("The first position of a is 14.\nThe first position of e is 4.\nThe first position of i is 2.\nThe first position of o is 11.\nThe first position of u is 0.\n",
                 JU06VHS.findVowels("university of arizona"));
  }

  @Test
  void test06FindVowels2()
  {
    assertEquals("The first position of a is -1.\nThe first position of e is 6.\nThe first position of i is 11.\nThe first position of o is 1.\nThe first position of u is 4.\n",
                 JU06VHS.findVowels("computer science"));
  }

  @Test
  void test06FindVowels3()
  {
    assertEquals("The first position of a is 1.\nThe first position of e is 8.\nThe first position of i is -1.\nThe first position of o is 4.\nThe first position of u is -1.\n",
                 JU06VHS.findVowels("canyon del oro"));
  }

  @Test
  void test07getLastInitials1()
  {
    assertEquals("lhl", JU06VHS.getLastInitials("Virtual", "High", "School"));
  }

  @Test
  void test07getLastInitials2()
  {
    assertEquals("aag", JU06VHS.getLastInitials("Augusta", "Ada", "King"));
  }

  @Test
  void test07getLastInitials3()
  {
    assertEquals("eyr", JU06VHS.getLastInitials("Grace", "Murray", "Hopper"));
  }

  @Test
  void test08PigLatin1()
  {
    assertEquals("igpay", JU06VHS.pigLatin("pig"));
  }

  @Test
  void test08PigLatin2()
  {
    assertEquals("avajay", JU06VHS.pigLatin("java"));
  }

  @Test
  void test08PigLatin3()
  {
    assertEquals("onstructorcay", JU06VHS.pigLatin("constructor"));
  }
  // Copyright @VHSLearning
}
