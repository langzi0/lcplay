
/**
 * JUnitTestReview - Tests to help verify answers to questions in Activity 2.
 * 
 * @version 2.0
 */
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.*;

/**
 * Do not turn this particular file to the dropbox.
 */
@TestMethodOrder(MethodOrderer.DisplayName.class)
@Timeout(3)
public class JUnitTestReview
{

  @Test
  void Activity201TotalSentiment1()
  {
    assertEquals(-2.92, Review.totalSentiment("SimpleReview.txt"), 0.01);
  }

  @Test
  void Activity202TotalSentiment2()
  {
    assertEquals(29.05, Review.totalSentiment("26WestReview.txt"), 0.01);
  }

  @Test
  void Activity203TotalSentiment3()
  {
    assertEquals(4.03, Review.totalSentiment("StarWarsReview.txt"), 0.01);
  }

  @Test
  void Activity204TotalSentiment4()
  {
    assertEquals(0.83, Review.totalSentiment("GoodRottenReview.txt"), 0.01);
  }

  @Test
  void Activity205TotalSentiment5()
  {
    assertEquals(-0.06, Review.totalSentiment("BadRottenReview.txt"), 0.01);
  }

  @Test
  void Activity206StarRating1()
  {
    assertEquals(1, Review.starRating("SimpleReview.txt"));
  }

  @Test
  void Activity207StarRating2()
  {
    assertEquals(4, Review.starRating("26WestReview.txt"));
  }

  @Test
  void Activity208StarRating3()
  {
    assertEquals(2, Review.starRating("StarWarsReview.txt"));
  }

  @Test
  void Activity209StarRating4()
  {
    assertEquals(2, Review.starRating("GoodRottenReview.txt"));
  }

  @Test
  void Activity210StarRating5()
  {
    assertEquals(1, Review.starRating("BadRottenReview.txt"));
  }
  // Copyright 2022+ VHSLearning.org

}