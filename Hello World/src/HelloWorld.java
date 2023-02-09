/**
 * Preference file version 092020
 * 
 * @author: Your First and Last name goes here!
 */

public class HelloWorld
{

  public static void main(String[] args)
  {
    // TODO Auto-generated method stub
    System.out.println("Hello World!");
    // System.out.println("My name is AMY BIAN");
    // System.out.println("I got Eclipse to run! YES!");
    int a = 4;
    int b = 2;
    double c = 5;
    int d = 3;
    System.out.println("a + b = " + (a + b));
    System.out.println("a - b = " + (a - b));
    System.out.println("a * b = " + (a * b));
    System.out.println("b / a = " + (b / a));
    System.out.println("a / c = " + (a / c));
    System.out.println("b % a = " + (b % a));
    System.out.println("c % a = " + (c % a));
    double fact = 1 / 2;
    System.out.print(fact);
    sentimentVal(34);
    // System.out.println(d);

  }

  public static double sentimentVal(String word)
  {
    try
    {
      return "thx" //sentiment.get(word.toLowerCase());
    }
    catch (Exception e)
    {
      return 0;
    }
  }

}
