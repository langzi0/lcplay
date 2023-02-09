import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.*;

/**
 * Do not turn this particular file to the dropbox.
 */
@TestMethodOrder(MethodOrderer.DisplayName.class)
public class JU09VHSTest
{

  @Test
  void test01xyInfo1()
  {
    assertEquals("(0, 0) is the origin.", JU09VHS.xyInfo(0, 0));
  }

  @Test
  void test01xyInfo2()
  {
    assertEquals("(4, 0) is on the x-axis.", JU09VHS.xyInfo(4, 0));
    assertEquals("(0, -3) is on the y-axis.", JU09VHS.xyInfo(0, -3));
  }

  @Test
  void test01xyInfo3()
  {
    assertEquals("(6, 8) is in the first quadrant.", JU09VHS.xyInfo(6, 8));
    assertEquals("(3, 3) is in the first quadrant.", JU09VHS.xyInfo(3, 3));
    assertEquals("(-2, 3) is in the second quadrant.", JU09VHS.xyInfo(-2, 3));
    assertEquals("(-11, 25) is in the second quadrant.",
                 JU09VHS.xyInfo(-11, 25));
  }

  @Test
  void test01xyInfo4()
  {
    assertEquals("(-1, -7) is in the third quadrant.", JU09VHS.xyInfo(-1, -7));
    assertEquals("(-8, -7) is in the third quadrant.", JU09VHS.xyInfo(-8, -7));
    assertEquals("(3, -7) is in the fourth quadrant.", JU09VHS.xyInfo(3, -7));
    assertEquals("(5, -5) is in the fourth quadrant.", JU09VHS.xyInfo(5, -5));
  }

  @Test
  void test02CostOfShipping1()
  {
    assertEquals("The shipping cost is $3.5", JU09VHS.costOfShipping(0.75));
    assertEquals("The shipping cost is $3.5", JU09VHS.costOfShipping(1.0));
  }

  @Test
  void test02CostOfShipping2()
  {
    assertEquals("The shipping cost is $5.5", JU09VHS.costOfShipping(1.22));
    assertEquals("The shipping cost is $5.5", JU09VHS.costOfShipping(3.0));
  }

  @Test
  void test02CostOfShipping3()
  {
    assertEquals("The shipping cost is $8.5", JU09VHS.costOfShipping(3.02));
    assertEquals("The shipping cost is $8.5", JU09VHS.costOfShipping(9.5));
    assertEquals("The shipping cost is $8.5", JU09VHS.costOfShipping(10));
  }

  @Test
  void test02CostOfShipping4()
  {
    assertEquals("The shipping cost is $10.5", JU09VHS.costOfShipping(10.3));
    assertEquals("The shipping cost is $10.5", JU09VHS.costOfShipping(15.2));
    assertEquals("The shipping cost is $10.5", JU09VHS.costOfShipping(20));
  }

  @Test
  void test02CostOfShipping5()
  {
    assertEquals("The package cannot be shipped", JU09VHS.costOfShipping(20.1));
    assertEquals("The package cannot be shipped", JU09VHS.costOfShipping(30));
  }

  @Test
  void test03inNumericalOrder1()
  {
    assertEquals("3, 5, and 19 are in numerical order.",
                 JU09VHS.inNumericalOrder(3, 5, 19));
    assertEquals("3, 2, and 3 are NOT in numerical order.",
                 JU09VHS.inNumericalOrder(3, 2, 3));
  }

  @Test
  void test03inNumericalOrder2()
  {
    assertEquals("5, 5, and 5 are in numerical order.",
                 JU09VHS.inNumericalOrder(5, 5, 5));
    assertEquals("5, 5, and 3 are NOT in numerical order.",
                 JU09VHS.inNumericalOrder(5, 5, 3));
  }

  @Test
  void test03inNumericalOrder3()
  {
    assertEquals("6, 10, and 12 are in numerical order.",
                 JU09VHS.inNumericalOrder(6, 10, 12));
    assertEquals("8, 5, and 10 are NOT in numerical order.",
                 JU09VHS.inNumericalOrder(8, 5, 10));
  }

  @Test
  void test04weirdRoundedSum1()
  {
    assertEquals("20", JU09VHS.weirdRoundSum(8, 7, 6) + "");
  }

  @Test
  void test04weirdRoundedSum2()
  {
    assertEquals("150", JU09VHS.weirdRoundSum(50, 51, 49) + "");
  }

  @Test
  void test04weirdRoundedSum3()
  {
    assertEquals("580", JU09VHS.weirdRoundSum(127, 126, 328) + "");
    assertEquals("90", JU09VHS.weirdRoundSum(28, 27, 29) + "");
  }

  @Test
  void test04weirdRoundedSum4()
  {
    assertEquals("170", JU09VHS.weirdRoundSum(55, 56, 74) + "");
    assertEquals("120", JU09VHS.weirdRoundSum(23, 11, 88) + "");
  }

  @Test
  void test04weirdRoundedSum5()
  {
    assertEquals("0", JU09VHS.weirdRoundSum(0, 0, 1) + "");
    assertEquals("10", JU09VHS.weirdRoundSum(9, 4, 4) + "");
  }

  @Test
  void test05NumExpander1()
  {
    assertEquals("914 = 9 X 100 + 1 X 10 + 4 X 1", JU09VHS.numExpander(914));
  }

  @Test
  void test05NumExpander2()
  {
    assertEquals("528 = 5 X 100 + 2 X 10 + 8 X 1", JU09VHS.numExpander(528));
  }

  @Test
  void test05NumExpander3()
  {
    assertEquals("652 = 6 X 100 + 5 X 10 + 2 X 1", JU09VHS.numExpander(652));
  }

  @Test
  void test06RoundToNearestOnesPlace1()
  {
    assertEquals("8.9 rounded to the nearest one's place is 9",
                 JU09VHS.roundToNearestOnesPlace(8.9));
  }

  @Test
  void test06RoundToNearestOnesPlace2()
  {
    assertEquals("-8.9 rounded to the nearest one's place is -9",
                 JU09VHS.roundToNearestOnesPlace(-8.9));
  }

  @Test
  void test06RoundToNearestOnesPlace3()
  {
    assertEquals("59.4 rounded to the nearest one's place is 59",
                 JU09VHS.roundToNearestOnesPlace(59.4));
  }

  @Test
  void test06RoundToNearestOnesPlace4()
  {
    assertEquals("59.5 rounded to the nearest one's place is 60",
                 JU09VHS.roundToNearestOnesPlace(59.5));
  }

  @Test
  void test06RoundToNearestOnesPlace5()
  {
    assertEquals("-59.5 rounded to the nearest one's place is -60",
                 JU09VHS.roundToNearestOnesPlace(-59.5));
  }

  @Test
  void test06RoundToNearestOnesPlace6()
  {
    assertEquals("-8.5 rounded to the nearest one's place is -9",
                 JU09VHS.roundToNearestOnesPlace(-8.5));
  }

  @Test
  void test07GetQuadraticRoots1()
  {
    assertEquals("The equation has two roots 0.5 and -3.0",
                 JU09VHS.getQuadraticRoots(2, 5, -3));
  }

  @Test
  void test07GetQuadraticRoots2()
  {
    assertEquals("The equation has one root -1.0",
                 JU09VHS.getQuadraticRoots(1, 2.0, 1));
  }

  @Test
  void test07GetQuadraticRoots3()
  {
    assertEquals("The equation has two roots 1.0 and -4.0",
                 JU09VHS.getQuadraticRoots(1, 3, -4));
  }

  @Test
  void test07GetQuadraticRoots4()
  {
    assertEquals("The equation has two roots 0.4 and 0.25",
                 JU09VHS.getQuadraticRoots(20, -13, 2));
  }

  @Test
  void test07GetQuadraticRoots5()
  {
    assertEquals("The equation has one root -2.0",
                 JU09VHS.getQuadraticRoots(2, 8, 8));
  }

  @Test
  void test07GetQuadraticRoots6()
  {
    assertEquals("The equation has one root 0.0",
                 JU09VHS.getQuadraticRoots(1, 0, 0));
  }

  @Test
  void test07GetQuadraticRoots7()
  {
    assertEquals("The equation has no real roots",
                 JU09VHS.getQuadraticRoots(1, 4, 5));
  }

  @Test
  void test07GetQuadraticRoots8()
  {
    assertEquals("The equation has no real roots",
                 JU09VHS.getQuadraticRoots(1, -3, 10));
  }
  // Copyright 2022+ VHSLearning.org
}
