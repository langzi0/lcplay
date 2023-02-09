import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.*;

/**
 * Do not turn this particular file to the dropbox
 * grading system.
 */
@TestMethodOrder(MethodOrderer.DisplayName.class)
public class JU07VHSTest
{
  @Test
  void test01SquareRootSentence1()
  {
    String expected = "The square root of 25 is 5.0";
    String actual = JU07VHS.squareRootSentence(25);
    assertEquals(expected, actual);
  }

  @Test
  void test01SquareRootSentence2()
  {
    String expected = "The square root of 100 is 10.0";
    String actual = JU07VHS.squareRootSentence(100);
    assertEquals(expected, actual);
  }

  @Test
  void test01SquareRootSentence3()
  {
    String expected = "The square root of 30 is 5.477225575051661";
    String actual = JU07VHS.squareRootSentence(30);
    assertEquals(expected, actual);
  }

  @Test
  void test02ExponentSentence1()
  {
    String expected = "3 ^ 5 == 243.0";
    String actual = JU07VHS.exponentSentence(3, 5);
    assertEquals(expected, actual);
  }

  @Test
  void test02ExponentSentence2()
  {
    String expected = "5 ^ 3 == 125.0";
    String actual = JU07VHS.exponentSentence(5, 3);
    assertEquals(expected, actual);
  }

  @Test
  void test02ExponentSentence3()
  {
    String expected = "10 ^ 4 == 10000.0";
    String actual = JU07VHS.exponentSentence(10, 4);
    assertEquals(expected, actual);
  }

  @Test
  void test03NoFirstLetterConcat1()
  {
    assertEquals("raceopper", JU07VHS.noFirstLetterConcat("Grace", "Hopper"));
  }

  @Test
  void test03NoFirstLetterConcat2()
  {
    assertEquals("teveobs", JU07VHS.noFirstLetterConcat("Steve", "Jobs"));
  }

  @Test
  void test03NoFirstLetterConcat3()
  {
    assertEquals("haggyoo", JU07VHS.noFirstLetterConcat("Shaggy", "Doo"));
  }

  @Test
  void test04GetMiddleThree1()
  {
    assertEquals("and", JU07VHS.getMiddleThree("Candy"));
  }

  @Test
  void test04GetMiddleThree2()
  {
    assertEquals("exe", JU07VHS.getMiddleThree("barreexercise"));
  }

  @Test
  void test04GetMiddleThree3()
  {
    assertEquals("gsa", JU07VHS.getMiddleThree("stringsarefun"));
  }

  @Test
  void test04GetMiddleThree4()
  {
    assertEquals("nope", JU07VHS.getMiddleThree("even"));
    assertEquals("nope", JU07VHS.getMiddleThree("rt"));
    assertEquals("nope", JU07VHS.getMiddleThree("bathbathbath"));
  }

  @Test
  void test05ConvertName1()
  {
    assertEquals("John von Neumann", JU07VHS.convertName("von Neumann, John"));
  }

  @Test
  void test05ConvertName2()
  {
    assertEquals("Grace Hopper", JU07VHS.convertName("Hopper, Grace"));
  }

  @Test
  void test06FirstAndLast1()
  {
    assertEquals("pe", JU07VHS.firstAndLast("pasta", "rice"));
  }

  @Test
  void test06FirstAndLast2()
  {
    assertEquals("t#", JU07VHS.firstAndLast("turbo", ""));
  }

  @Test
  void test06FirstAndLast3()
  {
    assertEquals("##", JU07VHS.firstAndLast("", ""));
  }

  @Test
  void test07GetEuroDate1()
  {
    assertEquals("31-05-2009", JU07VHS.getEuroDate("05/31/2009"));
  }

  @Test
  void test07GetEuroDate2()
  {
    assertEquals("01-01-2001", JU07VHS.getEuroDate("01/01/2001"));
  }

  @Test
  void test08FindVowels1()
  {
    assertEquals("The first position of a is 14.\nThe first position of e is 4.\nThe first position of i is 2.\nThe first position of o is 11.\nThe first position of u is 0.\n",
                 JU07VHS.findVowels("university of arizona"));
  }

  @Test
  void test08FindVowels2()
  {
    assertEquals("The first position of a is -1.\nThe first position of e is 6.\nThe first position of i is 11.\nThe first position of o is 1.\nThe first position of u is 4.\n",
                 JU07VHS.findVowels("computer science"));
  }

  @Test
  void test09HowMuchPaint1()
  {
    String expected = "Buy 11 gallons of paint.";
    assertEquals(expected, JU07VHS.howMuchPaint(2.8, 3, 5));
  }

  @Test
  void test09HowMuchPaint2()
  {
    String expected = "Buy 7 gallons of paint.";
    assertEquals(expected, JU07VHS.howMuchPaint(1.1, 3.2, 2));
  }

  @Test
  void test09HowMuchPaint3()
  {
    String expected = "Buy 16 gallons of paint.";
    assertEquals(expected, JU07VHS.howMuchPaint(3.75, 2.25, 10));
  }

  @Test
  void test09HowMuchPaint4()
  {
    String expected = "Buy 62 gallons of paint.";
    assertEquals(expected, JU07VHS.howMuchPaint(7, 42, 13));
  }

  // Copyright 2022+ VHSLearning

}