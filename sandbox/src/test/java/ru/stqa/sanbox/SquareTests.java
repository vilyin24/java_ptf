package ru.stqa.sanbox;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.sandbox.Square;

public class SquareTests {
  @Test
  public void testArea(){
  Square s = new Square(5);
    Assert.assertEquals(s.area(),25);

  }

}
