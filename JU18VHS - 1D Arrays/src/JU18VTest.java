import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.jupiter.api.*;

/**
 * Do not turn this particular file to the dropbox.
 */
@Timeout(3)
@TestMethodOrder(MethodOrderer.DisplayName.class)
public class JU18VTest
{

  @Test
  void test01ChangeThe1stAnd4thValue1()
  {
    int[] myArray = {10, 20, 30, 32, 40};
    JU18VHS.changeThe1stAnd4thValue(myArray);
    assertEquals("[40, 20, 30, 35, 40]", Arrays.toString(myArray));
  }

  @Test
  void test01ChangeThe1stAnd4thValue2()
  {
    int[] myArray = {4, 2, 3};
    JU18VHS.changeThe1stAnd4thValue(myArray);
    assertEquals("[40, 2, 3]", Arrays.toString(myArray));
  }

  @Test
  void test02TotalNumberOfElements1()
  {
    int[] a = {3, 3, 3};
    int[] b = {8, 8};
    int[] c = {9, 2, 3, 3};
    assertEquals(9, JU18VHS.totalNumberOfElements(a, b, c));
  }

  @Test
  void test02TotalNumberOfElements2()
  {
    int[] a = {3, 3, 3, 4, 3, 9};
    int[] b = {8, 8, 23};
    int[] c = {3, 9};
    assertEquals(11, JU18VHS.totalNumberOfElements(a, b, c));
  }

  @Test
  void test02TotalNumberOfElements3()
  {
    int[] a = {3};
    int[] b = {8, 8, 5, 1, 1, 1};
    int[] c = {9, 2, 3, 3, 3, 3, 4, 5, 10};
    assertEquals(16, JU18VHS.totalNumberOfElements(a, b, c));
  }

  @Test
  void test04RaiseTheLastElementToThePower1()
  {
    int[] arr = {1, 2, 3, 3, 2, -1, 4};
    JU18VHS.raiseTheLastElementToThePower(arr, 2);
    assertEquals("[1, 2, 3, 3, 2, -1, 16]", Arrays.toString(arr));
  }

  @Test
  void test04RaiseTheLastElementToThePower2()
  {
    int[] arr = {1, 2, 3};
    JU18VHS.raiseTheLastElementToThePower(arr, 5);
    assertEquals("[1, 2, 243]", Arrays.toString(arr));
  }

  @Test
  void test06SwapFirstWithLast1()
  {
    int[] arr = {2, 3, 14, 18, 9, 7, 100};
    JU18VHS.swapFirstWithLast(arr);
    assertEquals("[100, 3, 14, 18, 9, 7, 2]", Arrays.toString(arr));
  }

  @Test
  void test06SwapFirstWithLast2()
  {
    int[] arr = {4, 2, 8};
    JU18VHS.swapFirstWithLast(arr);
    assertEquals("[8, 2, 4]", Arrays.toString(arr));
  }

  @Test
  void test07TripleFirstHalf1()
  {
    int[] arr = {2, 3, 14, 18, 9, 7, 100};
    JU18VHS.tripleFirstHalf(arr);
    assertEquals("[6, 9, 42, 54, 9, 7, 100]", Arrays.toString(arr));
  }

  @Test
  void test07TripleFirstHalf2()
  {
    int[] arr = {3, 1, 4, 9};
    JU18VHS.tripleFirstHalf(arr);
    assertEquals("[9, 3, 4, 9]", Arrays.toString(arr));
  }

  @Test
  void test07TripleFirstHalf3()
  {
    int[] arr = {3, 1, 4};
    JU18VHS.tripleFirstHalf(arr);
    assertEquals("[9, 3, 4]", Arrays.toString(arr));
  }

  @Test
  void test12EqualArrays1()
  {
    int[] myArray = {1, 3, 3};
    int[] yourArray = {1, 3, 3};
    int[] diffArray = {0, 3, 3};
    assertTrue(JU18VHS.equalArrays(myArray, yourArray));
    assertFalse(JU18VHS.equalArrays(myArray, diffArray));
  }

  @Test
  void test12EqualArrays2()
  {
    int[] myArray = {1, 2, 3, 7, 2, -1, 4, 9, 10};
    int[] yourArray = {1, 2, 3, 3, 2, -1, 4, 9, 10};
    int[] diffArray = {1, 2, 3, 7, 2, -1, 4, 9, 10};
    assertFalse(JU18VHS.equalArrays(myArray, yourArray));
    assertTrue(JU18VHS.equalArrays(myArray, diffArray));

  }

  @Test
  void test12EqualArrays3()
  {
    int[] myArray = {1, 2, 3, 3, 2, -1, 4, 9, 10};
    int[] yourArray = {1, 2, 3, 3, 2, -1, 4};
    int[] diffArray = {1, 2, 3, 3, 2, -1, 4, 9, 10};
    assertFalse(JU18VHS.equalArrays(myArray, yourArray));
    assertTrue(JU18VHS.equalArrays(myArray, diffArray));
  }

  @Test
  void test12EqualArrays4()
  {

    int[] myArray = {1, 2, 3, 3};
    int[] yourArray = {1, 2, 3, 3, 2, -1, 4};
    assertFalse(JU18VHS.equalArrays(myArray, yourArray));
    int[] myArray2 = {1, 2, 3, 3, 2, -1, 4, 9, 10};
    int[] yourArray2 = {1, 2, 3, 3, 2, -1, 4, 9, 10};
    assertTrue(JU18VHS.equalArrays(myArray2, yourArray2));
  }

  @Test
  void test14CountFortyTwos1()
  {
    int[] myArray = {1, 42, 3, 4, 1, 42, 3, 42};
    assertEquals(3, JU18VHS.countFortyTwos(myArray));

  }

  @Test
  void test14CountFortyTwos2()
  {
    int[] myArray = {1, 42, 3, 4, 1, 3, 42};
    assertEquals(2, JU18VHS.countFortyTwos(myArray));
  }

  @Test
  void test14CountFortyTwos3()
  {
    int[] myArray = {0, 1, 1, 4, 2, 4, 2};
    assertEquals(0, JU18VHS.countFortyTwos(myArray));
  }

  @Test
  void test15GetTotal1()
  {
    int[] myArray = {1, 2, 3, 4, 1, 2, 3, 4};
    assertEquals(20, JU18VHS.getTotal(myArray));
  }

  @Test
  void test15GetTotal2()
  {
    int[] myArray = {1, 2, 3, 4, 1, 2, 3, 4, 10, -4, -8};
    assertEquals(18, JU18VHS.getTotal(myArray));
  }

  @Test
  void test16GetAverage1()
  {
    int[] myArray = {1, 2};
    assertEquals(1.5, JU18VHS.getAverage(myArray), 0.01);
  }

  @Test
  void test16GetAverage2()
  {
    int[] myArray = {100, 90, 85, 20, 20, 20};
    assertEquals(55.83, JU18VHS.getAverage(myArray), 0.01);
  }

  @Test
  void test16GetAverage3()
  {
    int[] myArray = {100, 40, 85, 10};
    assertEquals(58.75, JU18VHS.getAverage(myArray), 0.01);
  }

  @Test
  void test17CalculateGrade1()
  {
    int[] myArray = {100, 90, 85};
    assertEquals("A", JU18VHS.calculateGrade(myArray));
  }

  @Test
  void test17CalculateGrade2()
  {
    int[] myArray = {100, 90, 85, 20, 20, 20};
    assertEquals("F", JU18VHS.calculateGrade(myArray));
  }

  @Test
  void test17CalculateGrade3()
  {
    int[] myArray = {100, 90, 85, 70, 20, 20};
    assertEquals("D", JU18VHS.calculateGrade(myArray));
  }

  @Test
  void test17CalculateGrade4()
  {
    int[] myArray = {82, 80, 78, 80};
    assertEquals("B", JU18VHS.calculateGrade(myArray));
  }

  @Test
  void test18GetTheBiggest1()
  {
    int[] myArray = {-100, 90, 85, 343, 20, 20};
    assertEquals(343, JU18VHS.getTheBiggest(myArray));
  }

  @Test
  void test18GetTheBiggest2()
  {
    int[] myArray = {100, 90, 85, 70, 90, 90, 18, 200, 19, 5000};
    assertEquals(5000, JU18VHS.getTheBiggest(myArray));
  }

  @Test
  void test18GetTheBiggest3()
  {
    int[] myArray = {123, -5, 85, -5, 90, 90, 100, 90, 85, 70, 90, 90};
    assertEquals(123, JU18VHS.getTheBiggest(myArray));
  }

  @Test
  void test19BookAtEndOfShelf1()
  {
    String[] myArray = {"B", "C", "A", "X", "F"};
    assertEquals("X", JU18VHS.bookAtEndOfShelf(myArray));
  }

  @Test
  void test19BookAtEndOfShelf2()
  {
    String[] myArray = {"B", "C", "A", "X", "F", "Z"};
    assertEquals("Z", JU18VHS.bookAtEndOfShelf(myArray));
  }

  @Test
  void test19BookAtEndOfShelf3()
  {
    String[] myArray = {"Thor", "Black Widow", "Ant-man", "Rocket"};
    assertEquals("Thor", JU18VHS.bookAtEndOfShelf(myArray));
  }

  @Test
  void test21GetTotalLetters1()
  {
    String[] planets = {"Mercury", "Venus", "Earth"};
    assertEquals(17, JU18VHS.getTotalLetters(planets));
  }

  @Test
  void test21GetTotalLetters2()
  {
    String[] starWars = {"Luke", "Yoda", "Obiwan", "Chewie", "Han"};
    assertEquals(23, JU18VHS.getTotalLetters(starWars));
  }
  // Copyright 2022+ VHSLearning.org

}