import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;

import org.junit.jupiter.api.*;

@Timeout(3)
@TestMethodOrder(MethodOrderer.DisplayName.class)
public class JU16VHSTest
{

  @Test
  public void test01TestGetRightTriangleSentence1()
  {
    RightTriangle wedge = new RightTriangle(); // #1
    assertTimeoutPreemptively(Duration.ofSeconds(3), () -> {
      assertEquals("base = 3.0, height = 4.0", wedge.getBasicDimensions());
    });

  }

  @Test
  public void test01TestGetRightTriangleSentence2()
  {
    RightTriangle wedge = new RightTriangle(8, 6); // #2
    RightTriangle square = new RightTriangle(5, 5); // #3
    RightTriangle table = new RightTriangle(3, 8); // #4
    RightTriangle roof = new RightTriangle(5, 12); // #5
    assertTimeoutPreemptively(Duration.ofSeconds(3), () -> {
      assertEquals("base = 5.0, height = 12.0", roof.getBasicDimensions());
    });
  }

  @Test
  public void test02TestGetArea1()
  {
    RightTriangle wedge = new RightTriangle(3, 4); // #6
    assertTimeoutPreemptively(Duration.ofSeconds(3), () -> {
      assertEquals("6.0", wedge.getArea() + "");
    });
  }

  @Test
  public void test02TestGetArea2()
  {
    RightTriangle wedge = new RightTriangle(7, 5); // #7
    assertTimeoutPreemptively(Duration.ofSeconds(3), () -> {
      assertEquals("17.5", wedge.getArea() + "");
    });
  }

  @Test
  public void test03TestGetHypotenuse1()
  {
    RightTriangle wedge = new RightTriangle(12, 5); // #7
    assertTimeoutPreemptively(Duration.ofSeconds(3), () -> {
      assertEquals("13.0", wedge.getHypotenuse() + "");
    });
  }

  @Test
  public void test03TestGetHypotenuse2()
  {
    RightTriangle wedge = new RightTriangle(63, 16); // #7
    assertTimeoutPreemptively(Duration.ofSeconds(3), () -> {
      assertEquals("65.0", wedge.getHypotenuse() + "");
    });
  }

  @Test
  public void test04TestPerimeter1()
  {
    RightTriangle wedge = new RightTriangle(3, 4); // #8
    assertTimeoutPreemptively(Duration.ofSeconds(3), () -> {
      assertEquals("12.0", wedge.getPerimeter() + "");
    });
  }

  @Test
  public void test04TestPerimeter2()
  {
    RightTriangle wedge = new RightTriangle(28, 45); // #9
    assertTimeoutPreemptively(Duration.ofSeconds(3), () -> {
      assertEquals("126.0", wedge.getPerimeter() + "");
    });
  }

  @Test
  public void test05FancyDimensions1()
  {
    RightTriangle wedge = new RightTriangle(); // #10
    assertTimeoutPreemptively(Duration.ofSeconds(3), () -> {
      assertEquals("Right Triangle #12 has dimensions base = 3.0, height = 4.0",
                   wedge.getFancyDimensions());
    });
  }

  @Test
  public void test05FancyDimensions2()
  {
    RightTriangle wedge = new RightTriangle(66, 42); // #10
    assertTimeoutPreemptively(Duration.ofSeconds(3), () -> {
      assertEquals("Right Triangle #13 has dimensions base = 66.0, height = 42.0",
                   wedge.getFancyDimensions());
    });
  }

  @Test
  public void test05FancyDimensions3()
  {
    RightTriangle wedge = new RightTriangle(); // #11
    RightTriangle door = new RightTriangle(3, 4); // #12
    RightTriangle fridge = new RightTriangle(3, 4); // #13
    assertTimeoutPreemptively(Duration.ofSeconds(3), () -> {
      assertEquals("Right Triangle #16 has dimensions base = 3.0, height = 4.0",
                   fridge.getFancyDimensions());
    });
  }

  @Test
  public void test06TestScale1()
  {
    RightTriangle wedge = new RightTriangle(5, 1);
    wedge.scale(2.0); // #1
    assertTimeoutPreemptively(Duration.ofSeconds(3), () -> {
      assertEquals("base = 10.0, height = 2.0", wedge.getBasicDimensions());
    });
  }

  @Test
  public void test06TestScale2()
  {
    RightTriangle wedge = new RightTriangle(7, 4);
    wedge.scale(0.5); // #2
    assertTimeoutPreemptively(Duration.ofSeconds(3), () -> {
      assertEquals("base = 3.5, height = 2.0", wedge.getBasicDimensions());
    });
  }

  @Test
  public void test06TestScale3()
  {
    RightTriangle wedge = new RightTriangle(7, 5);
    wedge.scale(3.0); // #3
    assertTimeoutPreemptively(Duration.ofSeconds(3), () -> {
      assertEquals("base = 21.0, height = 15.0", wedge.getBasicDimensions());
    });
  }

  @Test
  public void test06TestScale4()
  {
    RightTriangle wedge = new RightTriangle(8, 8);
    wedge.scale(-0.0001); // #3
    assertTimeoutPreemptively(Duration.ofSeconds(3), () -> {
      assertEquals("base = 8.0, height = 8.0", wedge.getBasicDimensions());
    });
    RightTriangle wedge2 = new RightTriangle(9, 3);
    wedge.scale(0); // #3
    assertTimeoutPreemptively(Duration.ofSeconds(3), () -> {
      assertEquals("base = 9.0, height = 3.0", wedge2.getBasicDimensions());
    });
  }

  @Test
  public void test07SuccessfulScaleCount1()
  {
    RightTriangle door = new RightTriangle(8, 15);
    assertTimeoutPreemptively(Duration.ofSeconds(3), () -> {
      assertEquals("3", RightTriangle.getScaleCount() + "");
    });
  }

  @Test
  public void test07SuccessfulScaleCount2()
  {
    RightTriangle door = new RightTriangle(8, 15);
    door.scale(3); // #4
    door.scale(10); // #5
    door.scale(20); // #6
    door.scale(-2.0); // will not scale negative.
    assertTimeoutPreemptively(Duration.ofSeconds(3), () -> {
      assertEquals("6", RightTriangle.getScaleCount() + "");
    });
  }

  @Test
  public void test07SuccessfulScaleCount3()
  {
    RightTriangle door = new RightTriangle(3, 3);
    door.scale(-3); // #6
    door.scale(100); // #7
    door.scale(-12); // #7
    door.scale(20); // #8
    door.scale(-2.0); // #8
    assertTimeoutPreemptively(Duration.ofSeconds(3), () -> {
      assertEquals("8", RightTriangle.getScaleCount() + "");
    });
  }

  // Copyright 2022+ VHSLearning.org

}