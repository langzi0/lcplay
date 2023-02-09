import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.*;

/**
 * Do not turn this particular file to the dropbox.
 */
@Timeout(3)
@TestMethodOrder(MethodOrderer.DisplayName.class)
public class JU14VHSTest
{
  @Test
  public void test01TestGetGasLevel1()
  {
    GasTank tank1 = new GasTank(20);
    assertEquals("0.0", tank1.getGasLevel() + "");
  }

  @Test
  public void test01TestGetGasLevel2()
  {
    GasTank tank1 = new GasTank(20);
    tank1.addGas(15);
    assertEquals("15.0", tank1.getGasLevel() + "");
  }

  @Test
  public void test01TestGetGasLevel3()
  {
    GasTank tank1 = new GasTank(20);
    tank1.addGas(15);
    tank1.addGas(3);
    assertEquals("18.0", tank1.getGasLevel() + "");
  }

  @Test
  public void test02TestUseGas1()
  {
    GasTank tank1 = new GasTank(20);
    tank1.addGas(10);
    tank1.useGas(7);
    assertEquals("3.0", tank1.getGasLevel() + "");
  }

  @Test
  public void test02TestUseGas2()
  {
    GasTank tank1 = new GasTank(100);
    tank1.addGas(20);
    tank1.useGas(7);
    tank1.useGas(5);
    assertEquals("8.0", tank1.getGasLevel() + "");
  }

  @Test
  public void test02TestUseGas3()
  {
    GasTank tank1 = new GasTank(100);
    tank1.addGas(20);
    tank1.useGas(7);
    tank1.useGas(500);
    assertEquals("0.0", tank1.getGasLevel() + "");
  }

  @Test
  public void test02TestUseGas4()
  {
    GasTank tank1 = new GasTank(100);
    tank1.addGas(20);
    tank1.useGas(7);
    tank1.useGas(73);
    assertEquals("0.0", tank1.getGasLevel() + "");
  }

  @Test
  public void test03TestIsEmpty1()
  {
    GasTank tank1 = new GasTank(20);
    assertEquals("true", tank1.isEmpty() + "");
  }

  @Test
  public void test03TestIsEmpty2()
  {
    GasTank tank1 = new GasTank(20);
    tank1.addGas(0.09);
    assertEquals("true", tank1.isEmpty() + "");
  }

  @Test
  public void test03TestIsEmpty3()
  {
    GasTank tank1 = new GasTank(20);
    tank1.addGas(0.1);
    assertEquals("false", tank1.isEmpty() + "");
  }

  @Test
  public void test04IsFull1()
  {
    GasTank tank1 = new GasTank(20);
    tank1.addGas(20);
    assertEquals("true", tank1.isFull() + "");
  }

  @Test
  public void test04IsFull2()
  {
    GasTank tank1 = new GasTank(20);
    tank1.addGas(19.91);
    assertEquals("true", tank1.isFull() + "");
  }

  @Test
  public void test04IsFull3()
  {
    GasTank tank1 = new GasTank(20);
    tank1.addGas(19.89);
    assertEquals("false", tank1.isFull() + "");
  }

  @Test
  public void test04IsFull4()
  {
    GasTank tank1 = new GasTank(100);
    tank1.addGas(99.91);
    assertEquals("true", tank1.isFull() + "");
  }

  @Test
  public void test05FillUp1()
  {
    GasTank tank1 = new GasTank(100);
    tank1.addGas(40.0);
    tank1.fillUp();

    assertEquals(100, tank1.getGasLevel(), 0.01);
  }

  @Test
  public void test05FillUp2()
  {
    GasTank tank1 = new GasTank(100);
    tank1.addGas(40.0);
    assertEquals(60.0, tank1.fillUp(), 0.01);
  }

  @Test
  public void test05FillUp3()
  {
    GasTank tank1 = new GasTank(88);
    tank1.addGas(42.0);
    tank1.fillUp();

    assertEquals(88, tank1.getGasLevel(), 0.01);
  }

  @Test
  public void test05FillUp4()
  {
    GasTank tank1 = new GasTank(88);
    tank1.addGas(42.0);
    assertEquals(46.0, tank1.fillUp(), 0.01);
  }

  @Test
  public void test06ToString1()
  {
    GasTank bigTank = new GasTank(42);
    assertEquals("The vehicle currently contains 0.0 gallons of fuel. The tank has a maximum capactity of 42.0 gallons",
                 bigTank.toString());
  }

  @Test
  public void test06ToString2()
  {
    GasTank bigTank = new GasTank(25);
    bigTank.addGas(33);
    assertEquals("The vehicle currently contains 25.0 gallons of fuel. The tank has a maximum capactity of 25.0 gallons",
                 bigTank.toString());
  }
  // Copyright VHSLearning.org 2022+

}