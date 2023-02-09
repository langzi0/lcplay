/**
 * @author: Amy Bian
 * @version: 2.0
 */

public class TestBreakfastFood
{

  public static void main(String[] args)
  {
    /* You need to have the BreakfastFood class completed and compile correctly
     * first.
     * PT your teacher if you are having issues.
     * 
     * Use this to answer Breakfast Lab Activity 2, Question 7. You will
     * manually
     * construct breakfastfood instances, and then store the reference into a
     * variable.
     * 
     * Create FIVE instances, store them into a variable, and then use
     * System.out.println to call the toString. */

    // Here's a couple of instances called calorieBomb and bestCereal
    // BreakfastFood calorieBomb = new BreakfastFood("Cocoa Puffs", 110, 1.0,
    // other params)
    // BreakfastFood bestCereal = new BreakfastFood("Apple Jacks", 110, 1.0,
    // other params)

    // Here's an example of using an accessor method...
    // System.out.println(bestCerial.getCalories()); //should print 110
    // System.out.println(bestCerial.toString()); //prints all of the info.

    // etc etc ASK YOUR TEACHER FOR HELP IN THE PRIVATE TOPIC!!!!!
    BreakfastFood cereal1 =
      new BreakfastFood("Cheerios", "C", 100, 3, 2, 140, 3, 14, 7, 70, 20, 2,
                        1.5, 1, 57.357);
    BreakfastFood cereal2 =
      new BreakfastFood("Almond Delight", "C", 105, 2, 3, 125, 3, 13, 7, 85, 25,
                        1, 1, 1.5, 61.877);
    BreakfastFood cereal3 =
      new BreakfastFood("Corn Pops", "C", 75, 4, 2, 100, 2, 12, 5, 85, 18, 3, 2,
                        0.67, 55.426);
    BreakfastFood cereal4 =
      new BreakfastFood("Apple Jacks", "C", 130, 4, 4, 120, 5, 16, 10, 65, 25,
                        1, 1.75, 1, 47.325);
    BreakfastFood cereal5 =
      new BreakfastFood("Clusters", "C", 145, 2, 3, 130, 2, 17, 8, 85, 15, 3,
                        1.65, 1, 37.582);
    System.out.println(cereal1.toString() + "\n");
    System.out.println(cereal1.getCalories() + "\n");
    System.out.println(cereal2.toString() + "\n");
    System.out.println(cereal2.getVitamins() + "\n");
    System.out.println(cereal3.toString() + "\n");
    System.out.println(cereal3.getCups() + "\n");
    System.out.println(cereal4.toString() + "\n");
    System.out.println(cereal4.getRating() + "\n");
    System.out.println(cereal5.toString() + "\n");
    System.out.println(cereal5.getSugar() + "\n");
    System.out.println(cereal3.proteinToCalorieRatio());
  }

}
