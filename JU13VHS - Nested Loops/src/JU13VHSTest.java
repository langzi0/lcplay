
import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;

import org.junit.jupiter.api.*;

// Copyright 2022+ VHSLearning.org
@Timeout(3)
@TestMethodOrder(MethodOrderer.DisplayName.class)
public class JU13VHSTest
{
  @Test
  public void test01RemoveLettersFromWord1()
  {
    String expected = "w do njoy vhs larning";
    String thePhrase = "we do enjoy vhs learning";
    assertTimeoutPreemptively(Duration.ofSeconds(3), () -> {
      assertEquals(expected, JU13VHS.removeLettersFromWord(thePhrase, "e"));
    });
  }

  @Test
  public void test01RemoveLettersFromWord2()
  {
    String expected = "apple";
    String thePhrase = "apple";
    assertTimeoutPreemptively(Duration.ofSeconds(3), () -> {
      assertEquals(expected, JU13VHS.removeLettersFromWord(thePhrase, "x"));
    });
    assertTimeoutPreemptively(Duration.ofSeconds(3), () -> {
      assertEquals("bnn", JU13VHS.removeLettersFromWord("banana", "a"));
    });
  }

  @Test
  public void test01RemoveLettersFromWord3()
  {
    String expected = "pple";
    String thePhrase = "apple";
    assertTimeoutPreemptively(Duration.ofSeconds(3), () -> {
      assertEquals(expected, JU13VHS.removeLettersFromWord(thePhrase, "a"));
    });
    assertTimeoutPreemptively(Duration.ofSeconds(3), () -> {
      assertEquals("appl", JU13VHS.removeLettersFromWord(thePhrase, "e"));
    });
  }

  @Test
  public void test01RemoveLettersFromWord4()
  {
    String expected = "ale";
    String thePhrase = "apple";
    assertTimeoutPreemptively(Duration.ofSeconds(3), () -> {
      assertEquals(expected, JU13VHS.removeLettersFromWord(thePhrase, "p"));
    });
  }

  @Test
  public void test02ReplaceWord1()
  {
    String thePhrase = "I love dogs! I have a dog named Frodo.";
    String expected = "I love cats! I have a cat named Frodo.";

    assertTimeoutPreemptively(Duration.ofSeconds(3), () -> {
      assertEquals(expected, JU13VHS.replaceWord(thePhrase, "dog", "cat"));
    });
  }

  @Test
  public void test02ReplaceWord2()
  {
    String thePhrase = "I love dogs! I have a dog named Frodo.";
    String expected = "I love dogs! I had a dog named Frodo.";

    assertTimeoutPreemptively(Duration.ofSeconds(3), () -> {
      assertEquals(expected, JU13VHS.replaceWord(thePhrase, "have", "had"));
    });
  }

  @Test
  public void test02ReplaceWord3()
  {
    String thePhrase = "I love dogs! I have a dog named Frodo.";
    String expected = "I leeve deegs! I have a deeg named Freedee.";

    assertTimeoutPreemptively(Duration.ofSeconds(3), () -> {
      assertEquals(expected, JU13VHS.replaceWord(thePhrase, "o", "ee"));
    });
  }

  @Test
  public void test02ReplaceWord4()
  {
    String thePhrase =
      "Why does batman speak in batman voice but doesn't use a bat?";
    String expected =
      "Why does singman speak in singman voice but doesn't use a sing?";

    assertTimeoutPreemptively(Duration.ofSeconds(3), () -> {
      assertEquals(expected, JU13VHS.replaceWord(thePhrase, "bat", "sing"));
    });
  }

  @Test
  public void test01BuildGridOfStars1()
  {
    assertTimeoutPreemptively(Duration.ofSeconds(3), () -> {
      assertEquals("*\n", JU13VHS.buildGridOfStars(1, 1));
    });
  }

  @Test
  public void test01BuildGridOfStars2()
  {
    assertTimeoutPreemptively(Duration.ofSeconds(3), () -> {
      assertEquals("**********\n", JU13VHS.buildGridOfStars(1, 10));
    });
  }

  @Test
  public void test01BuildGridOfStars3()
  {
    assertTimeoutPreemptively(Duration.ofSeconds(3), () -> {
      assertEquals("**********\n" + "**********\n" + "",
                   JU13VHS.buildGridOfStars(2, 10));
    });
  }

  @Test
  public void test01BuildGridOfStars4()
  {
    assertTimeoutPreemptively(Duration.ofSeconds(3), () -> {
      assertEquals("*****\n" + "*****\n" + "*****\n" + "",
                   JU13VHS.buildGridOfStars(3, 5));
    });
  }

  @Test
  public void test01BuildGridOfStars5()
  {
    assertTimeoutPreemptively(Duration.ofSeconds(3), () -> {
      assertEquals("******\n" + "******\n" + "******\n" + "******\n"
        + "******\n" + "******\n" + "******\n" + "******\n" + "******\n"
        + "******\n" + "", JU13VHS.buildGridOfStars(10, 6));
    });
  }

  @Test
  public void test01BuildGridOfStars6()
  {
    assertTimeoutPreemptively(Duration.ofSeconds(3), () -> {
      assertEquals("***************\n" + "***************\n"
        + "***************\n" + "***************\n" + "***************\n"
        + "***************\n" + "***************\n" + "***************\n"
        + "***************\n" + "***************\n" + "***************\n"
        + "***************\n" + "***************\n" + "",
                   JU13VHS.buildGridOfStars(13, 15));
    });
  }

  @Test
  public void test03UglyTimesTable1()
  {
    assertTimeoutPreemptively(Duration.ofSeconds(3), () -> {
      assertEquals("1 2 3 4 5 6 7 \n" + "2 4 6 8 10 12 14 \n"
        + "3 6 9 12 15 18 21 \n" + "4 8 12 16 20 24 28 \n" + "",
                   JU13VHS.uglyTimesTable(4, 7));
    });
  }

  @Test
  public void test03UglyTimesTable2()
  {
    assertTimeoutPreemptively(Duration.ofSeconds(3), () -> {
      assertEquals("1 2 3 4 5 6 7 8 \n" + "2 4 6 8 10 12 14 16 \n"
        + "3 6 9 12 15 18 21 24 \n" + "4 8 12 16 20 24 28 32 \n"
        + "5 10 15 20 25 30 35 40 \n" + "6 12 18 24 30 36 42 48 \n"
        + "7 14 21 28 35 42 49 56 \n" + "8 16 24 32 40 48 56 64 \n"
        + "9 18 27 36 45 54 63 72 \n" + "10 20 30 40 50 60 70 80 \n" + "",
                   JU13VHS.uglyTimesTable(10, 8));
    });
  }

  @Test
  public void test03UglyTimesTable3()
  {
    assertTimeoutPreemptively(Duration.ofSeconds(3), () -> {
      assertEquals("1 2 3 4 5 6 7 8 \n" + "2 4 6 8 10 12 14 16 \n"
        + "3 6 9 12 15 18 21 24 \n" + "4 8 12 16 20 24 28 32 \n" + "",
                   JU13VHS.uglyTimesTable(4, 8));
    });
  }

  @Test
  public void test04BuildRightJustified1()
  {
    assertTimeoutPreemptively(Duration.ofSeconds(3), () -> {
      assertEquals("...................*", JU13VHS.buildRightJustified(1));
    });
  }

  @Test
  public void test04BuildRightJustified2()
  {
    assertTimeoutPreemptively(Duration.ofSeconds(3), () -> {
      assertEquals("..................**", JU13VHS.buildRightJustified(2));
    });
  }

  @Test
  public void test04BuildRightJustified3()
  {
    assertTimeoutPreemptively(Duration.ofSeconds(3), () -> {
      assertEquals("............********", JU13VHS.buildRightJustified(8));
    });
  }

  @Test
  public void test04BuildRightJustified4()
  {
    assertTimeoutPreemptively(Duration.ofSeconds(3), () -> {
      assertEquals(".......*************", JU13VHS.buildRightJustified(13));
    });
    assertTimeoutPreemptively(Duration.ofSeconds(3), () -> {
      assertEquals(".....***************", JU13VHS.buildRightJustified(15));
    });
    assertTimeoutPreemptively(Duration.ofSeconds(3), () -> {
      assertEquals(".*******************", JU13VHS.buildRightJustified(19));
    });
  }

  @Test
  public void test05BuildStairs1()
  {
    assertTimeoutPreemptively(Duration.ofSeconds(3), () -> {
      assertEquals("&\n", JU13VHS.buildStairs(1, "&"));
    });
  }

  @Test
  public void test05BuildStairs2()
  {
    assertTimeoutPreemptively(Duration.ofSeconds(3), () -> {
      assertEquals(" @\n" + "@@\n" + "", JU13VHS.buildStairs(2, "@"));
    });
  }

  @Test
  public void test05BuildStairs3()
  {
    assertTimeoutPreemptively(Duration.ofSeconds(3), () -> {
      assertEquals("  ^\n" + " ^^\n" + "^^^\n" + "",
                   JU13VHS.buildStairs(3, "^"));
    });
  }

  @Test
  public void test05BuildStairs4()
  {
    assertTimeoutPreemptively(Duration.ofSeconds(3), () -> {
      assertEquals("       %\n" + "      %%\n" + "     %%%\n" + "    %%%%\n"
        + "   %%%%%\n" + "  %%%%%%\n" + " %%%%%%%\n" + "%%%%%%%%\n" + "",
                   JU13VHS.buildStairs(8, "%"));
    });
  }

  @Test
  public void test05BuildStairs5()
  {
    assertTimeoutPreemptively(Duration.ofSeconds(3), () -> {
      assertEquals("            $\n" + "           $$\n" + "          $$$\n"
        + "         $$$$\n" + "        $$$$$\n" + "       $$$$$$\n"
        + "      $$$$$$$\n" + "     $$$$$$$$\n" + "    $$$$$$$$$\n"
        + "   $$$$$$$$$$\n" + "  $$$$$$$$$$$\n" + " $$$$$$$$$$$$\n"
        + "$$$$$$$$$$$$$\n" + "", JU13VHS.buildStairs(13, "$"));
    });
  }

  @Test
  public void test06BuildNumberMountain1()
  {
    assertTimeoutPreemptively(Duration.ofSeconds(3), () -> {
      assertEquals("1 \n", JU13VHS.buildNumberMountain(1));
    });
  }

  @Test
  public void test06BuildNumberMountain2()
  {
    assertTimeoutPreemptively(Duration.ofSeconds(3), () -> {
      assertEquals("1 \n" + "2 3 \n" + "", JU13VHS.buildNumberMountain(2));
    });
  }

  @Test
  public void test06BuildNumberMountain3()
  {
    assertTimeoutPreemptively(Duration.ofSeconds(3), () -> {
      assertEquals("1 \n" + "2 3 \n" + "4 5 6 \n" + "",
                   JU13VHS.buildNumberMountain(3));
    });
  }

  @Test
  public void test06BuildNumberMountain4()
  {
    assertTimeoutPreemptively(Duration.ofSeconds(3), () -> {
      assertEquals("1 \n" + "2 3 \n" + "4 5 6 \n" + "7 8 9 10 \n"
        + "11 12 13 14 15 \n" + "16 17 18 19 20 21 \n"
        + "22 23 24 25 26 27 28 \n" + "29 30 31 32 33 34 35 36 \n"
        + "37 38 39 40 41 42 43 44 45 \n" + "46 47 48 49 50 51 52 53 54 55 \n"
        + "", JU13VHS.buildNumberMountain(10));
    });
  }

  @Test
  public void test06BuildNumberMountain5()
  {
    assertTimeoutPreemptively(Duration.ofSeconds(3), () -> {
      assertEquals("1 \n" + "2 3 \n" + "4 5 6 \n" + "7 8 9 10 \n"
        + "11 12 13 14 15 \n" + "16 17 18 19 20 21 \n"
        + "22 23 24 25 26 27 28 \n" + "29 30 31 32 33 34 35 36 \n"
        + "37 38 39 40 41 42 43 44 45 \n" + "46 47 48 49 50 51 52 53 54 55 \n"
        + "56 57 58 59 60 61 62 63 64 65 66 \n"
        + "67 68 69 70 71 72 73 74 75 76 77 78 \n"
        + "79 80 81 82 83 84 85 86 87 88 89 90 91 \n"
        + "92 93 94 95 96 97 98 99 100 101 102 103 104 105 \n"
        + "106 107 108 109 110 111 112 113 114 115 116 117 118 119 120 \n" + "",
                   JU13VHS.buildNumberMountain(15));
    });
  }

}
