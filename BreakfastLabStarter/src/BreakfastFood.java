/**
 * This goes with Activity 2, Question 6.
 * Copy all of this into Question 6 when complete.
 * After you create this class, you'll want to work on TestBreakfastFood.java
 * 
 * @author Amy Bian
 *
 */
public class BreakfastFood
{
  // Instance variables go here. (look at your answers to question 5)
  private String name;
  private String type;
  private int calories;
  private int protein;
  private int fat;
  private int sodium;
  private double fiber;
  private double carbohydrates;
  private int sugar;
  private int potassium;
  private int vitamins;
  private int shelf;
  private double weight;
  private double cups;
  private double rating;

  // Constructor(s) go here
  public BreakfastFood(String inName, String inType, int inCalories,
    int inProtein, int inFat, int inSodium, double inFiber,
    double inCarbohydrates, int inSugar, int inPotassium, int inVitamins,
    int inShelf, double inWeight, double inCups, double inRating)
  {
    name = inName;
    type = inType;
    calories = inCalories;
    protein = inProtein;
    fat = inFat;
    sodium = inSodium;
    fiber = inFiber;
    carbohydrates = inCarbohydrates;
    sugar = inSugar;
    potassium = inPotassium;
    vitamins = inVitamins;
    shelf = inShelf;
    weight = inWeight;
    cups = inCups;
    rating = inRating;
  }

  // Accessor methods
  public String toString()
  {
    return "Name: " + name + "\nType: " + type + "\nCalories: " + calories
      + "\nProtein: " + protein + "\nFat: " + fat + "\nSodium: " + sodium
      + "\nFiber: " + fiber + "\nCarbohydrates: " + carbohydrates + "\nSugar: "
      + sugar + "\nPotassium: " + potassium + "\nVitamins: " + vitamins
      + "\nShelf: " + shelf + "\nWeight: " + weight + "\nCups: " + cups
      + "\nRating: " + rating;
  }

  public String getName()
  {
    return name;
  }

  public String getType()
  {
    return type;
  }

  public int getCalories()
  {
    return calories;
  }

  public int getProtein()
  {
    return protein;
  }

  public int getFat()
  {
    return fat;
  }

  public int getSodium()
  {
    return sodium;
  }

  public double getFiber()
  {
    return fiber;
  }

  public double getCarbohydrates()
  {
    return carbohydrates;
  }

  public int getSugar()
  {
    return sugar;
  }

  public int getPotassium()
  {
    return potassium;
  }

  public int getVitamins()
  {
    return vitamins;
  }

  public int getShelf()
  {
    return shelf;
  }

  public double getWeight()
  {
    return weight;
  }

  public double getCups()
  {
    return cups;
  }

  public double getRating()
  {
    return rating;
  }

  public double proteinToCalorieRatio()
  {
    double doubleProtein = protein + 0.00;
    return doubleProtein / calories;
  }
  // Mutator methods

}
