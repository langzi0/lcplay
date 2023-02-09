import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.*;

/**
 * Do not turn this particular file to the dropbox.
 */
@TestMethodOrder(MethodOrderer.DisplayName.class)
public class JU10VHSTest
{

  @Test
  void test01LastThree1()
  {
    assertEquals("Yes, VHS is at the front!", JU10VHS.frontVHS("VHSIloveVHS"));
  }

  @Test
  void test01LastThree2()
  {
    assertEquals("No, VHS is not at the front.", JU10VHS.frontVHS("HappyVHS"));
  }

  @Test
  void test01LastThree3()
  {
    assertEquals("Yes, VHS is at the front!", JU10VHS.frontVHS("VHS"));
  }

  @Test
  void test02SortCombine1()
  {
    assertEquals("learningvhs", JU10VHS.sortCombine("vhs", "learning"));
  }

  @Test
  void test02SortCombine2()
  {
    assertEquals("applebanana", JU10VHS.sortCombine("apple", "banana"));
  }

  @Test
  void test02SortCombine3()
  {
    assertEquals("freezefreeze", JU10VHS.sortCombine("freeze", "freeze"));
  }

  @Test
  void test02SortCombine4()
  {
    assertEquals("funlearningvhs",
                 JU10VHS.sortCombine("vhs", "learning", "fun"));
  }

  @Test
  void test02SortCombine5()
  {
    assertEquals("applecornzebra",
                 JU10VHS.sortCombine("corn", "apple", "zebra"));
  }

  @Test
  void test02SortCombine6()
  {
    assertEquals("freezehotmild", JU10VHS.sortCombine("freeze", "mild", "hot"));
  }

  @Test
  void test02SortCombine7()
  {
    assertEquals("booleandoubleint",
                 JU10VHS.sortCombine("boolean", "double", "int"));
  }

  @Test
  void test02SortCombine8()
  {
    assertEquals("calculushistorystatistics",
                 JU10VHS.sortCombine("calculus", "statistics", "history"));
  }

  @Test
  void test03SameBookEnds1()
  {
    assertEquals("**", JU10VHS.sameBookEnds("**kitten**"));
  }

  @Test
  void test03SameBookEnds2()
  {
    assertEquals("*kitten**", JU10VHS.sameBookEnds("*kitten**"));
  }

  @Test
  void test03SameBookEnds3()
  {
    assertEquals("^^", JU10VHS.sameBookEnds("^^thorisnotloki^^"));
  }

  @Test
  void test03SameBookEnds4()
  {
    assertEquals("$$", JU10VHS.sameBookEnds("$$ijustlovevhs$$"));
  }

  @Test
  void test03SameBookEnds5()
  {
    assertEquals("$$ijustlovevhs", JU10VHS.sameBookEnds("$$ijustlovevhs"));
  }

  @Test
  void test03SameBookEnds6()
  {
    assertEquals("##", JU10VHS.sameBookEnds("##java##"));
  }

  // Copyright 2022+ VHSLearning.org
}
