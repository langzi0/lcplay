/**
 * This represents a car's gasTank. The two properties
 * of a gasTank are the amount of gas and the capacity of
 * the gas tank.
 * 
 * @author Amy Bian
 * @verison 2.0 Fixed constructor parameter.
 */

public class GasTank
{
  private double maxGas;
  private double currentGas;
  private double gasNeeded;
  // TODO: Add code here.

  /**
   * Constructor that sets the maximum capacity of the
   * gas tank. The amount of gas is set to zero.
   */
  public GasTank(double maxCapacityOfGasTank)
  {
    maxGas = maxCapacityOfGasTank;
    currentGas = 0;
  }

  /**
   * bumps up the amount of gas in the gas tank by amount,
   * but will not exceed the capacity of the gas tank.
   * 
   * @param amount
   */
  public void addGas(double amount)
  {
    if (currentGas + amount <= maxGas)
    {
      currentGas += amount;
    }
    else
    {
      currentGas = maxGas;
    }
  }

  /**
   * Removes the gas from the gas tank by amountUsed. You can't have negative
   * gas!! so if the client uses more than what's in the tank then keep it zero.
   * 
   * @param amountUsed
   */
  public void useGas(double amountUsed)
  {
    if (currentGas - amountUsed >= 0)
    {
      currentGas -= amountUsed;
    }
    else
    {
      currentGas = 0;
    }
  }

  /**
   * Tank is empty if we have less than 0.1 gallons of gas. So person has chance
   * to run to the gas station before they are really out.
   * 
   * @return
   */
  public boolean isEmpty()
  {
    if (currentGas < 0.1)
    {
      return true;
    }
    else
    {
      return false;
    }
  }

  /**
   * The gas tank is full if the amount
   * is within 0.1 gallons of the total capacity of the tank.
   * 
   * @return
   */
  public boolean isFull()
  {
    if (maxGas - currentGas < 0.1)
    {
      return true;
    }
    else
    {
      return false;
    }
  }

  /**
   * Fills up the tank but ALSO returns the
   * amount of gas it took to fill up the tank to capacity.
   * Remember there might already be some gas in the tank.
   * This is an example of a mutator method that returns a value.
   * 
   * @return
   */
  public double fillUp()
  {
    gasNeeded = maxGas - currentGas;
    currentGas = maxGas;

    return gasNeeded;
  }

  /**
   * Just a simple getter that returns the amount of gas in the gas tank.
   * 
   * @return
   */
  public double getGasLevel()
  {
    return currentGas;
  }

  /**
   * Returns a complete sentence describing the values
   * of the instance variables.
   */
  public String toString()
  {
    return "The vehicle currently contains " + currentGas
      + " gallons of fuel. The tank has a maximum capactity of " + maxGas
      + " gallons";
  }
  // Copyright VHSLearning.org 2022+

}
