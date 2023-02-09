import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;

import org.junit.jupiter.api.*;

// Copyright 2022+ VHSLearning.org
/**
 * Do not turn this particular file to the dropbox.
 */
@Timeout(3)
@TestMethodOrder(MethodOrderer.DisplayName.class)
public class JU12VHSTest
{
  @Test
  void test01DisplayStarsOnOneLine1()
  {
    assertTimeoutPreemptively(Duration.ofSeconds(3), () -> {
      assertEquals("************", JU12VHS.displayStarsOnOneLine(12));
    });
    assertTimeoutPreemptively(Duration.ofSeconds(3), () -> {
      assertEquals("****", JU12VHS.displayStarsOnOneLine(4));
    });
  }

  @Test
  void test02SimpleLoop()
  {
    assertTimeoutPreemptively(Duration.ofSeconds(3), () -> {
      assertEquals("[1,2,3,4]", JU12VHS.simpleLoop(4));
    });
    assertTimeoutPreemptively(Duration.ofSeconds(3), () -> {
      assertEquals("[1,2,3,4,5,6,7,8,9,10]", JU12VHS.simpleLoop(10));
    });
    assertTimeoutPreemptively(Duration.ofSeconds(3), () -> {
      assertEquals("[1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32]",
                   JU12VHS.simpleLoop(32));
    });
  }

  @Test
  void test03BasicCountUpBy7s1()
  {
    assertTimeoutPreemptively(Duration.ofSeconds(3), () -> {
      assertEquals("[71421]", JU12VHS.basicCountUpBy7s(21));
    });
    assertTimeoutPreemptively(Duration.ofSeconds(3), () -> {
      assertEquals("[714]", JU12VHS.basicCountUpBy7s(20));
    });
  }

  @Test
  void test03BasicCountUpBy7s2()
  {
    assertTimeoutPreemptively(Duration.ofSeconds(3), () -> {
      assertEquals("[714212835424956637077849198]",
                   JU12VHS.basicCountUpBy7s(100));
    });
    assertTimeoutPreemptively(Duration.ofSeconds(3), () -> {
      assertEquals("[714212835424956637077849198105112119126133140147154161168175182189196]",
                   JU12VHS.basicCountUpBy7s(200));
    });
  }

  @Test
  void test04FlexibleLoop1()
  {
    assertTimeoutPreemptively(Duration.ofSeconds(3), () -> {
      assertEquals("[5,6,7,8,]", JU12VHS.flexibleLoop(5, 8, 1));
    });
  }

  @Test
  void test04FlexibleLoop2()
  {
    assertTimeoutPreemptively(Duration.ofSeconds(3), () -> {
      assertEquals("[3,5,7,9,11,]", JU12VHS.flexibleLoop(3, 12, 2));
    });
  }

  @Test
  void test04FlexibleLoop3()
  {
    assertTimeoutPreemptively(Duration.ofSeconds(3), () -> {
      assertEquals("[9,8,7,6,5,4,3,2,1,0,-1,-2,-3,]",
                   JU12VHS.flexibleLoop(9, -3, -1));
    });
  }

  @Test
  void test04FlexibleLoop4()
  {
    assertTimeoutPreemptively(Duration.ofSeconds(3), () -> {
      assertEquals("[10,7,4,1,]", JU12VHS.flexibleLoop(10, 0, -3));
    });
  }

  @Test
  void test04FlexibleLoop5()
  {
    assertTimeoutPreemptively(Duration.ofSeconds(3), () -> {
      assertEquals("[-8,-3,2,7,12,17,22,27,32,]",
                   JU12VHS.flexibleLoop(-8, 34, 5));
    });
  }

  @Test
  void test04FlexibleLoop6()
  {
    assertTimeoutPreemptively(Duration.ofSeconds(3), () -> {
      assertEquals("[50,42,34,26,18,10,2,-6,-14,-22,-30,-38,]",
                   JU12VHS.flexibleLoop(50, -45, -8));
    });
  }

  @Test
  void test05DivisibleBy1()
  {
    assertTimeoutPreemptively(Duration.ofSeconds(3), () -> {
      assertEquals("1 2 [3] 4 5 [6] 7 8 [9] 10 11 [12] 13 14 [15] 16 ",
                   JU12VHS.divisibleBy(3, 16));
    });
    assertTimeoutPreemptively(Duration.ofSeconds(3), () -> {
      assertEquals("1 2 [3] 4 5 [6] 7 8 [9] 10 11 [12] 13 14 [15] 16 17 [18] 19 ",
                   JU12VHS.divisibleBy(3, 19));
    });
    assertTimeoutPreemptively(Duration.ofSeconds(3), () -> {
      assertEquals("1 2 3 4 [5] 6 7 8 9 [10] 11 12 13 14 [15] 16 17 18 19 [20] 21 22 23 24 [25] ",
                   JU12VHS.divisibleBy(5, 25));
    });
  }

  @Test
  void test06NasaCountDown1()
  {
    String actual1 = JU12VHS.nasaCountDown(6);
    assertTimeoutPreemptively(Duration.ofSeconds(3), () -> {
      assertEquals("T-Minus 6 seconds:6...5...4...3...2...1...BLAST OFF",
                   actual1);
    });
    String actual2 = JU12VHS.nasaCountDown(10);
    assertTimeoutPreemptively(Duration.ofSeconds(3), () -> {
      assertEquals("T-Minus 10 seconds:10...9...8...7...6...5...4...3...2...1...BLAST OFF",
                   actual2);
    });

  }

  @Test
  void test07SumThemUp4()
  {
    assertTimeoutPreemptively(Duration.ofSeconds(3), () -> {
      assertEquals("2 + 3 + 4 + 5 = 14", JU12VHS.sumThemUp(2, 5));
    });
    assertTimeoutPreemptively(Duration.ofSeconds(3), () -> {
      assertEquals("7 + 8 + 9 + 10 + 11 + 12 + 13 = 70",
                   JU12VHS.sumThemUp(7, 13));
    });
  }

  @Test
  void test08BuildTChart3()
  {
    assertTimeoutPreemptively(Duration.ofSeconds(3), () -> {
      assertEquals("-----------------\n" + "x | f(x) = 3x + 2\n"
        + "-----------------\n" + "-5   -13\n" + "-4   -10\n" + "-3   -7\n"
        + "-2   -4\n" + "-1   -1\n" + "0   2\n" + "1   5\n" + "2   8\n"
        + "3   11\n" + "4   14\n" + "5   17\n" + "-----------------\n" + "",
                   JU12VHS.buildTChart(-5, 5));
    });
  }

  @Test
  void test08BuildTChart4()
  {
    assertTimeoutPreemptively(Duration.ofSeconds(3), () -> {
      assertEquals("-----------------\n" + "x | f(x) = 3x + 2\n"
        + "-----------------\n" + "0   2\n" + "1   5\n" + "2   8\n" + "3   11\n"
        + "-----------------\n" + "", JU12VHS.buildTChart(0, 3));
    });
  }
  // Copyright 2022+ VHSLearning.org

}
