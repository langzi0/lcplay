import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;

import org.junit.jupiter.api.*;

/**
 * Do not turn this particular file to the dropbox.
 */
@Timeout(3)
@TestMethodOrder(MethodOrderer.DisplayName.class)
public class JU11VHSTest
{

  @Test
  void test01DisplayStarsOnOneLine1()
  {
    assertTimeoutPreemptively(Duration.ofSeconds(3), () -> {
      assertEquals("***", JU11VHS.displayStarsOnOneLine(3));
    });
  }

  @Test
  void test01DisplayStarsOnOneLine2()
  {
    assertTimeoutPreemptively(Duration.ofSeconds(3), () -> {
      assertEquals("************", JU11VHS.displayStarsOnOneLine(12));
    });
  }

  @Test
  void test01DisplayStarsOnOneLine3()
  {
    assertTimeoutPreemptively(Duration.ofSeconds(3), () -> {
      assertEquals("*****", JU11VHS.displayStarsOnOneLine(5));
    });
  }

  @Test
  void test01DisplayStarsOnOneLine4()
  {
    assertTimeoutPreemptively(Duration.ofSeconds(3), () -> {
      assertEquals("****", JU11VHS.displayStarsOnOneLine(4));
    });
  }

  @Test
  void test02DisplayStarsOnSeparateLines1()
  {
    assertTimeoutPreemptively(Duration.ofSeconds(3), () -> {
      assertEquals("*\n" + "*\n" + "*\n" + "*\n" + "",
                   JU11VHS.displayStarsOnSeparateLines(4));
    });

  }

  @Test
  void test02DisplayStarsOnSeparateLines2()
  {
    assertTimeoutPreemptively(Duration.ofSeconds(3), () -> {
      assertEquals("*\n" + "*\n" + "*\n" + "*\n" + "*\n" + "*\n" + "*\n" + "*\n"
        + "*\n" + "*\n" + "*\n" + "*\n" + "*\n" + "*\n" + "*\n" + "*\n" + "*\n"
        + "*\n" + "*\n" + "*\n" + "", JU11VHS.displayStarsOnSeparateLines(20));
    });
  }

  @Test
  void test03SimpleLoop1()
  {
    assertTimeoutPreemptively(Duration.ofSeconds(3), () -> {
      assertEquals("1,2,3,4,", JU11VHS.simpleLoop(4));
    });
  }

  @Test
  void test03SimpleLoop2()
  {
    assertTimeoutPreemptively(Duration.ofSeconds(3), () -> {
      assertEquals("1,2,3,4,5,6,7,8,9,10,", JU11VHS.simpleLoop(10));
    });
  }

  @Test
  void test03SimpleLoop3()
  {
    assertTimeoutPreemptively(Duration.ofSeconds(3), () -> {
      assertEquals("1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,",
                   JU11VHS.simpleLoop(32));
    });
  }

  @Test
  void test04SimpleLoopWordWrap1()
  {
    assertTimeoutPreemptively(Duration.ofSeconds(3), () -> {
      assertEquals("1,2,3,4,5,\n" + "6,7,8,9,10,\n" + "",
                   JU11VHS.simpleLoopWordWrap(10, 5));
    });
  }

  @Test
  void test04SimpleLoopWordWrap2()
  {
    assertTimeoutPreemptively(Duration.ofSeconds(3), () -> {
      assertEquals("1,2,3,\n" + "4,5,6,\n" + "7,8,9,\n" + "10,",
                   JU11VHS.simpleLoopWordWrap(10, 3));
    });
  }

  @Test
  void test04SimpleLoopWordWrap3()
  {
    assertTimeoutPreemptively(Duration.ofSeconds(3), () -> {
      assertEquals("1,2,3,4,\n" + "5,6,7,8,\n" + "9,10,11,12,\n"
        + "13,14,15,16,\n" + "17,18,19,20,\n" + "21,22,23,24,\n" + "25,",
                   JU11VHS.simpleLoopWordWrap(25, 4));
    });
  }

  @Test
  void test04SimpleLoopWordWrap4()
  {
    assertTimeoutPreemptively(Duration.ofSeconds(3), () -> {
      assertEquals("1,2,3,4,5,6,7,8,9,\n" + "10,11,12,13,14,15,16,17,18,\n"
        + "19,20,21,22,23,24,25,26,27,\n" + "28,29,30,31,32,33,34,",
                   JU11VHS.simpleLoopWordWrap(34, 9));
    });
  }

  @Test
  void test05CountUp1()
  {
    assertTimeoutPreemptively(Duration.ofSeconds(3), () -> {
      assertEquals("Starting counting at 1,2,3,4,5,and we are done!",
                   JU11VHS.countUpTo(5));
    });
  }

  @Test
  void test05CountUp2()
  {
    assertTimeoutPreemptively(Duration.ofSeconds(3), () -> {
      assertEquals("Starting counting at 1,2,3,4,5,6,7,8,9,10,11,12,13,and we are done!",
                   JU11VHS.countUpTo(13));
    });
  }

  @Test
  void test05CountUp3()
  {
    assertTimeoutPreemptively(Duration.ofSeconds(3), () -> {
      assertEquals("Starting counting at 1,2,3,4,5,6,7,8,and we are done!",
                   JU11VHS.countUpTo(8));
    });
  }

  @Test
  void test05CountUp4()
  {
    assertTimeoutPreemptively(Duration.ofSeconds(3), () -> {
      assertEquals("Starting counting at 1,2,3,4,5,6,7,and we are done!",
                   JU11VHS.countUpTo(7));
    });
  }

  @Test
  void test06CountDownBrackets1()
  {
    assertTimeoutPreemptively(Duration.ofSeconds(3), () -> {
      assertEquals("[9] [7] [5] [3] [1] ", JU11VHS.countDownBrackets(9));
    });
  }

  @Test
  void test06CountDownBrackets2()
  {
    assertTimeoutPreemptively(Duration.ofSeconds(3), () -> {
      assertEquals("[18] [16] [14] [12] [10] [8] [6] [4] [2] [0] ",
                   JU11VHS.countDownBrackets(18));
    });
    assertTimeoutPreemptively(Duration.ofSeconds(3), () -> {
      assertEquals("[5] [3] [1] ", JU11VHS.countDownBrackets(5));
    });
  }

  @Test
  void test07DivisibleBy1()
  {
    assertTimeoutPreemptively(Duration.ofSeconds(3), () -> {
      assertEquals("1 [2] 3 [4] 5 [6] 7 [8] 9 [10] ",
                   JU11VHS.divisibleBy(2, 10));
    });
  }

  @Test
  void test07DivisibleBy2()
  {
    assertTimeoutPreemptively(Duration.ofSeconds(3), () -> {
      assertEquals("1 2 [3] 4 5 [6] 7 8 [9] 10 11 [12] 13 14 [15] 16 ",
                   JU11VHS.divisibleBy(3, 16));
    });
  }

  @Test
  void test07DivisibleBy3()
  {
    assertTimeoutPreemptively(Duration.ofSeconds(3), () -> {
      assertEquals("1 2 [3] 4 5 [6] 7 8 [9] 10 11 [12] 13 14 [15] 16 17 [18] 19 ",
                   JU11VHS.divisibleBy(3, 19));
    });
    assertTimeoutPreemptively(Duration.ofSeconds(3), () -> {
      assertEquals("1 2 3 4 [5] 6 7 8 9 [10] 11 12 13 14 [15] 16 17 18 19 [20] 21 22 23 24 [25] ",
                   JU11VHS.divisibleBy(5, 25));
    });
  }

  @Test
  void test07DivisibleBy4()
  {
    assertTimeoutPreemptively(Duration.ofSeconds(3), () -> {
      assertEquals("1 2 [3] 4 5 [6] 7 8 [9] 10 11 [12] 13 14 [15] 16 17 [18] 19 ",
                   JU11VHS.divisibleBy(3, 19));
    });
    assertTimeoutPreemptively(Duration.ofSeconds(3), () -> {
      assertEquals("1 2 3 4 [5] 6 7 8 9 [10] 11 12 13 14 [15] 16 17 18 19 [20] 21 22 23 24 [25] ",
                   JU11VHS.divisibleBy(5, 25));
    });
  }

  @Test
  void test08NumbersThatAreDivisibleByFiveOrSixButNotBoth1()
  {
    assertTimeoutPreemptively(Duration.ofSeconds(3), () -> {
      assertEquals("10,12,15,18,20,", JU11VHS
        .numbersThatAreDivisibleByFiveOrSixButNotBoth(10, 21));
    });
  }

  @Test
  void test08NumbersThatAreDivisibleByFiveOrSixButNotBoth2()
  {
    assertTimeoutPreemptively(Duration.ofSeconds(3), () -> {
      assertEquals("24,25,35,36,40,", JU11VHS
        .numbersThatAreDivisibleByFiveOrSixButNotBoth(23, 41));
    });
  }

  @Test
  void test08NumbersThatAreDivisibleByFiveOrSixButNotBoth3()
  {
    assertTimeoutPreemptively(Duration.ofSeconds(3), () -> {
      assertEquals("50,54,55,65,66,70,72,75,78,80\n" + "84,85,95,96,100,",
                   JU11VHS.numbersThatAreDivisibleByFiveOrSixButNotBoth(50,
                                                                        100));
    });
  }

  @Test
  void test08NumbersThatAreDivisibleByFiveOrSixButNotBoth4()
  {
    assertTimeoutPreemptively(Duration.ofSeconds(3), () -> {
      assertEquals("75,78,80,84,85,95,96,100,102,105\n"
        + "108,110,114,115,125,126,130,132,135,138\n"
        + "140,144,145,155,156,160,162,165,168,170\n"
        + "174,175,185,186,190,192,195,198,200,204\n"
        + "205,215,216,220,222,225,228,230,234,235\n"
        + "245,246,250,252,255,258,260,264,265,275\n"
        + "276,280,282,285,288,290,294,295,",
                   JU11VHS.numbersThatAreDivisibleByFiveOrSixButNotBoth(73,
                                                                        300));
    });
  }

  @Test
  void test09SimpleLoopNoTrailingComma1()
  {
    assertTimeoutPreemptively(Duration.ofSeconds(3), () -> {
      assertEquals("1,2,3,4", JU11VHS.simpleLoopNoTrailingComma(4));
    });
  }

  @Test
  void test09SimpleLoopNoTrailingComma2()
  {
    assertTimeoutPreemptively(Duration.ofSeconds(3), () -> {
      assertEquals("1,2,3,4,5,6,7,8,9,10",
                   JU11VHS.simpleLoopNoTrailingComma(10));
    });
    assertTimeoutPreemptively(Duration.ofSeconds(3), () -> {
      assertEquals("1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32",
                   JU11VHS.simpleLoopNoTrailingComma(32));
    });
  }

  @Test
  void test10NasaCountDown1()
  {
    String actual = JU11VHS.nasaCountDown(6);
    assertTimeoutPreemptively(Duration.ofSeconds(3), () -> {
      assertEquals("T-Minus 6 seconds:6...5...4...3...2...1...BLAST OFF",
                   actual);
    });
  }

  @Test
  void test10NasaCountDown2()
  {
    String actual = JU11VHS.nasaCountDown(10);
    assertTimeoutPreemptively(Duration.ofSeconds(3), () -> {
      assertEquals("T-Minus 10 seconds:10...9...8...7...6...5...4...3...2...1...BLAST OFF",
                   actual);
    });
  }

  @Test
  void test11SumThemUp1()
  {
    assertTimeoutPreemptively(Duration.ofSeconds(3), () -> {
      assertEquals("1 + 2 = 3", JU11VHS.sumThemUp(1, 2));
    });
  }

  @Test
  void test11SumThemUp2()
  {
    assertTimeoutPreemptively(Duration.ofSeconds(3), () -> {
      assertEquals("2 = 2", JU11VHS.sumThemUp(2, 2));
    });
  }

  @Test
  void test11SumThemUp3()
  {
    assertTimeoutPreemptively(Duration.ofSeconds(3), () -> {
      assertEquals("2 + 3 + 4 + 5 = 14", JU11VHS.sumThemUp(2, 5));
    });
  }

  @Test
  void test11SumThemUp4()
  {
    assertTimeoutPreemptively(Duration.ofSeconds(3), () -> {
      assertEquals("7 + 8 + 9 + 10 + 11 + 12 + 13 = 70",
                   JU11VHS.sumThemUp(7, 13));
    });
  }

  @Test
  void test12BuildTChart1()
  {
    assertTimeoutPreemptively(Duration.ofSeconds(3), () -> {
      assertEquals("-----------------\n" + "x | f(x) = 3x + 2\n"
        + "-----------------\n" + "3   11\n" + "4   14\n" + "5   17\n"
        + "6   20\n" + "7   23\n" + "8   26\n" + "-----------------\n" + "",
                   JU11VHS.buildTChart(3, 8));
    });
  }

  @Test
  void test12BuildTChart2()
  {
    assertTimeoutPreemptively(Duration.ofSeconds(3), () -> {
      assertEquals("-----------------\n" + "x | f(x) = 3x + 2\n"
        + "-----------------\n" + "5   17\n" + "6   20\n" + "7   23\n"
        + "8   26\n" + "9   29\n" + "10   32\n" + "11   35\n"
        + "-----------------\n" + "", JU11VHS.buildTChart(5, 11));
    });
  }

  @Test
  void test12BuildTChart3()
  {
    assertTimeoutPreemptively(Duration.ofSeconds(3), () -> {
      assertEquals("-----------------\n" + "x | f(x) = 3x + 2\n"
        + "-----------------\n" + "-5   -13\n" + "-4   -10\n" + "-3   -7\n"
        + "-2   -4\n" + "-1   -1\n" + "0   2\n" + "1   5\n" + "2   8\n"
        + "3   11\n" + "4   14\n" + "5   17\n" + "-----------------\n" + "",
                   JU11VHS.buildTChart(-5, 5));
    });
  }

  @Test
  void test12BuildTChart4()
  {
    assertTimeoutPreemptively(Duration.ofSeconds(3), () -> {
      assertEquals("-----------------\n" + "x | f(x) = 3x + 2\n"
        + "-----------------\n" + "0   2\n" + "1   5\n" + "2   8\n" + "3   11\n"
        + "-----------------\n" + "", JU11VHS.buildTChart(0, 3));
    });
  }

  @Test
  void test13BuildSqrtTChart1()
  {
    assertTimeoutPreemptively(Duration.ofSeconds(3), () -> {
      assertEquals("---------------------------\n"
        + "x | f(x) = Square root of x\n" + "---------------------------\n"
        + "9000   95\n" + "10000   100\n" + "---------------------------\n"
        + "", JU11VHS.buildSqrtTChart(9000, 10000));
    });
  }

  @Test
  void test13BuildSqrtTChart2()
  {
    assertTimeoutPreemptively(Duration.ofSeconds(3), () -> {
      assertEquals("---------------------------\n"
        + "x | f(x) = Square root of x\n" + "---------------------------\n"
        + "1000   32\n" + "2000   45\n" + "3000   55\n" + "4000   63\n"
        + "5000   71\n" + "6000   77\n" + "7000   84\n"
        + "---------------------------\n" + "",
                   JU11VHS.buildSqrtTChart(1000, 7000));
    });
  }

  @Test
  void test13BuildSqrtTChart3()
  {
    assertTimeoutPreemptively(Duration.ofSeconds(3), () -> {
      assertEquals("---------------------------\n"
        + "x | f(x) = Square root of x\n" + "---------------------------\n"
        + "-5000   71i\n" + "-4000   63i\n" + "-3000   55i\n" + "-2000   45i\n"
        + "-1000   32i\n" + "0   0\n" + "1000   32\n" + "2000   45\n"
        + "3000   55\n" + "---------------------------\n" + "",
                   JU11VHS.buildSqrtTChart(-5000, 3000));
    });
  }

  @Test
  void test13BuildSqrtTChart4()
  {
    assertTimeoutPreemptively(Duration.ofSeconds(3), () -> {
      assertEquals("---------------------------\n"
        + "x | f(x) = Square root of x\n" + "---------------------------\n"
        + "-3000   55i\n" + "-2000   45i\n" + "-1000   32i\n" + "0   0\n"
        + "1000   32\n" + "2000   45\n" + "3000   55\n" + "4000   63\n"
        + "5000   71\n" + "6000   77\n" + "---------------------------\n" + "",
                   JU11VHS.buildSqrtTChart(-3000, 6000));
    });
  }

  @Test
  void test14FavoriteGame1()
  {
    String actual = JU11VHS.favoriteGame("Sorry", 4);
    assertTimeoutPreemptively(Duration.ofSeconds(3), () -> {
      assertEquals("My favorite game is \"Sorry\", \"Sorry\", \"Sorry\", \"Sorry\"!",
                   actual);
    });
  }

  @Test
  void test14FavoriteGame2()
  {
    String actual = JU11VHS.favoriteGame("Chess", 3);
    assertTimeoutPreemptively(Duration.ofSeconds(3), () -> {
      assertEquals("My favorite game is \"Chess\", \"Chess\", \"Chess\"!",
                   actual);
    });
  }

  @Test
  void test15Tardies1()
  {
    assertTimeoutPreemptively(Duration.ofSeconds(3), () -> {
      assertEquals("4th tardy\n" + "5th tardy\n" + "6th tardy\n" + "7th tardy\n"
        + "", JU11VHS.tardies(4, 7));
    });
  }

  @Test
  void test15Tardies2()
  {
    assertTimeoutPreemptively(Duration.ofSeconds(3), () -> {
      assertEquals("1st tardy\n" + "2nd tardy\n" + "3rd tardy\n" + "",
                   JU11VHS.tardies(1, 3));
    });
  }

  @Test
  void test15Tardies3()
  {
    assertTimeoutPreemptively(Duration.ofSeconds(3), () -> {
      assertEquals("9th tardy\n" + "10th tardy\n" + "11th tardy\n"
        + "12th tardy\n" + "13th tardy\n" + "14th tardy\n" + "15th tardy\n"
        + "", JU11VHS.tardies(9, 15));
    });

    assertTimeoutPreemptively(Duration.ofSeconds(3), () -> {
      assertEquals("178th tardy\n" + "179th tardy\n" + "180th tardy\n"
        + "181st tardy\n" + "182nd tardy\n" + "183rd tardy\n" + "184th tardy\n"
        + "185th tardy\n" + "186th tardy\n" + "187th tardy\n" + "188th tardy\n"
        + "189th tardy\n" + "190th tardy\n" + "191st tardy\n" + "",
                   JU11VHS.tardies(178, 191));
    });
  }

  @Test
  void test15Tardies4()
  {
    assertTimeoutPreemptively(Duration.ofSeconds(3), () -> {
      assertEquals("8th tardy\n" + "9th tardy\n" + "10th tardy\n"
        + "11th tardy\n" + "12th tardy\n" + "13th tardy\n" + "14th tardy\n"
        + "15th tardy\n" + "16th tardy\n" + "17th tardy\n" + "18th tardy\n"
        + "19th tardy\n" + "20th tardy\n" + "21st tardy\n" + "22nd tardy\n"
        + "23rd tardy\n" + "", JU11VHS.tardies(8, 23));
    });

    assertTimeoutPreemptively(Duration.ofSeconds(3), () -> {
      assertEquals("212th tardy\n" + "213th tardy\n" + "214th tardy\n"
        + "215th tardy\n" + "216th tardy\n" + "217th tardy\n" + "218th tardy\n"
        + "219th tardy\n" + "220th tardy\n" + "221st tardy\n" + "222nd tardy\n"
        + "223rd tardy\n" + "224th tardy\n" + "225th tardy\n" + "226th tardy\n"
        + "227th tardy\n" + "228th tardy\n" + "229th tardy\n" + "230th tardy\n"
        + "231st tardy\n" + "232nd tardy\n" + "233rd tardy\n" + "234th tardy\n"
        + "", JU11VHS.tardies(212, 234));
    });
  }

  @Test
  void test15Tardies5()
  {
    assertTimeoutPreemptively(Duration.ofSeconds(3), () -> {
      assertEquals("199th tardy\n" + "200th tardy\n" + "201st tardy\n"
        + "202nd tardy\n" + "203rd tardy\n" + "204th tardy\n" + "205th tardy\n"
        + "206th tardy\n" + "207th tardy\n" + "208th tardy\n" + "209th tardy\n"
        + "210th tardy\n" + "211th tardy\n" + "212th tardy\n" + "213th tardy\n"
        + "214th tardy\n" + "215th tardy\n" + "216th tardy\n" + "217th tardy\n"
        + "218th tardy\n" + "219th tardy\n" + "220th tardy\n" + "221st tardy\n"
        + "", JU11VHS.tardies(199, 221));
    });
  }

  @Test
  void test15Tardies6()
  {
    assertTimeoutPreemptively(Duration.ofSeconds(3), () -> {
      assertEquals("948th tardy\n" + "949th tardy\n" + "950th tardy\n"
        + "951st tardy\n" + "952nd tardy\n" + "953rd tardy\n" + "954th tardy\n"
        + "955th tardy\n" + "956th tardy\n" + "957th tardy\n" + "958th tardy\n"
        + "959th tardy\n" + "960th tardy\n" + "", JU11VHS.tardies(948, 960));
    });
  }

}
