import java.util.Scanner;

public class Statistics
{
  public static void main(String[] args)
  {
    System.out.println("***** Welcome to Mr. Statistics! *****\n");
    Scanner consoleInput = new Scanner(System.in);
    System.out.print("Enter the number of items: ");
    int numberOfItems = consoleInput.nextInt();
    double[] numbers = new double[numberOfItems];
    double sum = 0;

    System.out.print("Enter each number and press enter:\n");
    for (int i = 0; i < numberOfItems; i++)
    {
      System.out.print("number " + (i + 1) + "? ");
      numbers[i] = consoleInput.nextDouble();
      sum += numbers[i];
    }

    double average = sum / numberOfItems;

    int count = 0;
    for (int i = 0; i < numberOfItems; i++)
    {
      if (numbers[i] > average)
      {
        count++;
      }
    }

    double currentLow = numbers[0];
    int indexOf = 0;
    for (int i = 0; i < numbers.length; i++)
    {
      if (currentLow > numbers[i])
      {
        currentLow = numbers[i];
        indexOf = i;
      }
    }
    System.out.println("Average is " + average);
    System.out.println("Number of elements above the average is " + count);
    System.out.println("The smallest value entered was " + currentLow);
    System.out.println("The smallest value was located at index " + indexOf);
  }
  // Copyright 2022+ VHSLearning.org
}