
/**
 * Hello. You will press play on this file once, then
 * you can press PLAY on the JU04VHS.java file anytime after that.
 * You may look at the test cases below, but do not change them.
 * DO NOT TURN THIS FILE IN. SUBMIT JU04VHS.java to the dropbox.
 */

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.DisplayName.class)
public class JU04VHSTest
{

  @Test
  void test01DecreaseByOne1()
  {
    assertEquals(4, JU04VHS.decreaseByOne(5));
  }

  @Test
  void test01DecreaseByOne2()
  {
    assertEquals(-10, JU04VHS.decreaseByOne(-9));
  }

  @Test
  void test02GetAverage1()
  {
    assertEquals(1.5, JU04VHS.getAverage(1, 2), 0.001);
  }

  @Test
  void test02GetAverage2()
  {
    assertEquals(3.5, JU04VHS.getAverage(6, 1), 0.001);
  }

  @Test
  void test02GetAverage3()
  {
    assertEquals(-1.0, JU04VHS.getAverage(3, -5), 0.001);
  }

  @Test
  void test03GetAverage4()
  {
    assertEquals(94.667, JU04VHS.getAverage(90, 100, 94), 0.001);
  }

  @Test
  void test03GetAverage5()
  {
    assertEquals(68.0, JU04VHS.getAverage(50, 82, 72), 0.001);
  }

  @Test
  void test03GetAverage6()
  {
    assertEquals(84.0, JU04VHS.getAverage(66, 86, 100), 0.001);
  }

  @Test
  void test04RoundPositiveToNearestInteger1()
  {
    assertEquals(6, JU04VHS.roundPositiveToNearestInteger(5.8));
  }

  @Test
  void test04RoundPositiveToNearestInteger2()
  {
    assertEquals(6, JU04VHS.roundPositiveToNearestInteger(5.5));
  }

  @Test
  void test05RoundNegativeToNearestInteger1()
  {
    assertEquals(-5, JU04VHS.roundNegativeToNearestInteger(-5.49));
  }

  @Test
  void test05RoundNegativeToNearestInteger2()
  {
    assertEquals(-6, JU04VHS.roundNegativeToNearestInteger(-5.8));
  }

  @Test
  void test06FindRemainder1()
  {
    assertEquals(1, JU04VHS.findRemainder(17, 4));
  }

  @Test
  void test06FindRemainder2()
  {
    assertEquals(3, JU04VHS.findRemainder(3, 5));
  }

  @Test
  void test06FindRemainder3()
  {
    assertEquals(5, JU04VHS.findRemainder(21, 8));
  }

  // Copyright VHSLearning.org

}