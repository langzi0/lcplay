
/**
 * Preference file version 092020
 * 
 * @author: Amy Bian
 */
import java.util.Scanner;

public class GuessNumber
{

  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    System.out
      .println("Welcome to Amy Bian's Number Guessing App!\nPlease enter your name.");
    String name = scan.next();
    int attempts = 1;
    int number = (int) (Math.random() * 101);
    System.out.println("Enter a number between 1 and 100.");
    int guess = scan.nextInt();
    while (guess != number)
    {
      attempts++;
      if (guess > number)
      {
        System.out.println("Too high!");
      }
      else
      {
        System.out.println("Too low!");
      }
      guess = scan.nextInt();
    }
    System.out.println("You got it!");
    System.out.println("It took you " + attempts + " tries.");
    if (attempts >= 1 && attempts <= 3)
    {
      System.out.println(name + " is an Epic Gamer!");
    }
    else if (attempts >= 4 && attempts <= 7)
    {
      System.out.println(name + " didn't do too bad.");
    }
    else
    {
      System.out.println(name + " is not efficient.");
    }

  }

}
