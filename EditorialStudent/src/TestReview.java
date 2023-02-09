/**
 * This class is used to call and test methods of the Review class.
 * Open this file, and press play. It will test all four activities;
 * but only concern yourself with the current Activity you are actually working
 * on.
 * 
 * @author Amy Bian
 * @version 3.0 - 11/08/21
 */
public class TestReview
{
  public static void main(String[] args)
  {
    System.out.println("******* Activity 1 *******");
    System.out.println(Review.sentimentVal("happily")); // 2.32
    System.out.println(Review.sentimentVal("terrible")); // -3.38
    System.out.println(Review.sentimentVal("cold")); // -0.04
    System.out.println(Review.sentimentVal("amazing")); // depends
    System.out.println(Review.sentimentVal("interesting")); // depends
    System.out.println(Review.sentimentVal("weird")); // depends

    System.out.println("******* Activity 2 *******");
    System.out.println("Run the app JUnitTestReview.java for Activity 2!");

    System.out.println("******* Activity 3 *******");
    System.out.println("fakeReview will randomly substitute adjectives for");
    System.out.println("words marked with asterisks.");
    System.out.println(Review.fakeReview("SimpleReview.txt"));
    System.out.println(Review.fakeReview("StarWarsReview.txt"));

    System.out.println("******* Activity 4 *******");
    /* Hack the fakeReview method to make reviews more intense. Replace
     * negative adjectives with worse versions and replace positive adjectives
     * with better and stronger ones. */
    System.out.println("fakeReview should now make \"stronger\" reviews.");
    System.out.println(Review.fakeReview("SimpleReview.txt"));
    System.out.println(Review.fakeReview("StarWarsReview.txt"));

  }

}
