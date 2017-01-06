package io.swagger;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by richardspellman on 6/1/17.
 */
public class UtilsTest {

  @Test
  public void testFibonacci() throws Exception {

    Assert.assertEquals(1, Utils.fibonacci(1));
    Assert.assertEquals(1, Utils.fibonacci(2));
    Assert.assertEquals(2, Utils.fibonacci(3));
    Assert.assertEquals(0, Utils.fibonacci(0));
    Assert.assertEquals(1, Utils.fibonacci(1));
    Assert.assertEquals(55, Utils.fibonacci(10));
    Assert.assertEquals(-55, Utils.fibonacci(-10));
  }

  @Test
  public void testReverseWords() throws Exception {

  }

  @Test
  public void testToken() throws Exception {

  }

  @Test
  public void testTriangleType() throws Exception {

  }
}