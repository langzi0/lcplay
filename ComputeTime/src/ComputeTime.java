
// Amy Bian
import java.util.Scanner;

public class ComputeTime
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    // ask the user for input
    System.out.print("Enter an integer for seconds: ");
    int numberOfSeconds = input.nextInt();

    int minutes = numberOfSeconds / 60; // Find minutes in seconds
    int remainingSeconds = numberOfSeconds % 60; // Seconds remaining
    System.out.println(numberOfSeconds + " seconds is " + minutes
      + " minutes and " + remainingSeconds + " seconds");
  }
}