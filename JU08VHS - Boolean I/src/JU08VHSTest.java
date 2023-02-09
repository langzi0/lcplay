import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.*;

/**
 * Do not turn this particular file to the dropbox.
 */
@TestMethodOrder(MethodOrderer.DisplayName.class)
public class JU08VHSTest
{

  @Test
  void test01PosZeroNeg1()
  {
    assertEquals("42 is positive.", JU08VHS.posZeroNeg(42));
  }

  @Test
  void test01PosZeroNeg2()
  {
    assertEquals("-10 is negative.", JU08VHS.posZeroNeg(-10));
  }

  @Test
  void test01PosZeroNeg3()
  {
    assertEquals("0 is zero.", JU08VHS.posZeroNeg(0));
    assertEquals("-4 is negative.", JU08VHS.posZeroNeg(-4));
    assertEquals("8 is positive.", JU08VHS.posZeroNeg(8));
  }

  @Test
  void test02IsEvenOrOdd1()
  {
    assertEquals("100 is even.", JU08VHS.isEvenOrOdd(100));
  }

  @Test
  void test02IsEvenOrOdd2()
  {
    assertEquals("67 is odd.", JU08VHS.isEvenOrOdd(67));
  }

  @Test
  void test02IsEvenOrOdd3()
  {
    assertEquals("44 is even.", JU08VHS.isEvenOrOdd(44));
  }

  @Test
  void test02IsEvenOrOdd4()
  {
    assertEquals("13 is odd.", JU08VHS.isEvenOrOdd(13));
  }

  @Test
  void test03SimpleIf1()
  {
    assertEquals("HiEven", JU08VHS.simpleIf(4));
  }

  @Test
  void test03SimpleIf2()
  {
    assertEquals("HiFiveAndEven", JU08VHS.simpleIf(30));
  }

  @Test
  void test03SimpleIf3()
  {
    assertEquals("HiFiveAndEven", JU08VHS.simpleIf(100));
  }

  @Test
  void test03SimpleIf4()
  {
    assertEquals("HiFive", JU08VHS.simpleIf(15));
  }

  @Test
  void test03SimpleIf5()
  {
    assertEquals("Sorry", JU08VHS.simpleIf(81));
  }

  @Test
  void test03SimpleIf6()
  {
    assertEquals("Sorry", JU08VHS.simpleIf(99));
  }

  @Test
  void test04GetLetterGrade1()
  {
    assertEquals("A", JU08VHS.getLetterGrade(90));
  }

  @Test
  void test04GetLetterGrade2()
  {
    assertEquals("B", JU08VHS.getLetterGrade(89));
  }

  @Test
  void test04GetLetterGrade3()
  {
    assertEquals("B", JU08VHS.getLetterGrade(81));
  }

  @Test
  void test04GetLetterGrade4()
  {
    assertEquals("C", JU08VHS.getLetterGrade(79));
    assertEquals("C", JU08VHS.getLetterGrade(70));
  }

  @Test
  void test04GetLetterGrade5()
  {
    assertEquals("D", JU08VHS.getLetterGrade(69));
    assertEquals("D", JU08VHS.getLetterGrade(66));
    assertEquals("D", JU08VHS.getLetterGrade(60));
  }

  @Test
  void test04GetLetterGrade6()
  {
    assertEquals("F", JU08VHS.getLetterGrade(3));
    assertEquals("F", JU08VHS.getLetterGrade(59));
    assertEquals("F", JU08VHS.getLetterGrade(55));
  }

  @Test
  void test05InAlphabeticalOrder1()
  {
    assertEquals("apple, peach, and zebra are in alphabetical order.",
                 JU08VHS.inAlphabeticalOrder("apple", "peach", "zebra"));
  }

  @Test
  void test05InAlphabeticalOrder2()
  {
    assertEquals("pear, branch, and road are NOT in alphabetical order.",
                 JU08VHS.inAlphabeticalOrder("pear", "branch", "road"));
  }

  @Test
  void test05InAlphabeticalOrder3()
  {
    assertEquals("horse, house, and hzzz are in alphabetical order.",
                 JU08VHS.inAlphabeticalOrder("horse", "house", "hzzz"));
  }

  @Test
  void test05InAlphabeticalOrder4()
  {
    assertEquals("zoo, zip, and zzz are NOT in alphabetical order.",
                 JU08VHS.inAlphabeticalOrder("zoo", "zip", "zzz"));
  }

  @Test
  void test05InAlphabeticalOrder5()
  {
    assertEquals("red, green, and blue are NOT in alphabetical order.",
                 JU08VHS.inAlphabeticalOrder("red", "green", "blue"));
  }

  @Test
  void test06FirstTwoCharacters1()
  {
    assertEquals("gr", JU08VHS.firstTwoCharacters("grace hopper"));
  }

  @Test
  void test06FirstTwoCharacters2()
  {
    assertEquals("i#", JU08VHS.firstTwoCharacters("i"));
  }

  @Test
  void test06FirstTwoCharacters3()
  {
    assertEquals("su", JU08VHS.firstTwoCharacters("supermanisop"));
  }

  @Test
  void test06FirstTwoCharacters4()
  {
    assertEquals("##", JU08VHS.firstTwoCharacters(""));
  }
  // Copyright 2022+ VHSLearning.org

}
