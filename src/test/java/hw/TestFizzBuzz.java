 package hw;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestFizzBuzz {

  private FizzBuzz fixture;

  @Before
  public void setUp() throws Exception {
    fixture = new FizzBuzz();
  }

  @After
  public void tearDown() throws Exception {
    fixture = null;
  }

  @Test
  public void testNegTen() {
    String[] expectedResult = new String[1];
    expectedResult[0] = "Please enter a positive integer!";
    String[] result = new String[1];
    result = fixture.fizzBuzzArray(-10);
    assertArrayEquals(expectedResult, result);
  }

  @Test
  public void testNegOne() {
    String[] expectedResult = new String[1];
    expectedResult[0] = "Please enter a positive integer!";
    String[] result = new String[1];
    result = fixture.fizzBuzzArray(-1);
    assertArrayEquals(expectedResult, result);
  }


  @Test
  public void testZero() {
    String[] expectedResult = new String[1];
    expectedResult[0] = "Please enter a positive integer!";
    String[] result = new String[1];
    result = fixture.fizzBuzzArray(0);
    assertArrayEquals(expectedResult, result);
  }

  @Test
  public void testSeven() {
    String[] expectedResult = new String[] { "1", "2", "Fizz", "4", "Buzz", "Fizz", "7" };
    String [] result = fixture.fizzBuzzArray(7);
    assertArrayEquals(expectedResult, result);
  }

  @Test
  public void test17() {
    String[] expectedResult = new String[] { "1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz", "16", "17" };
    String [] result = fixture.fizzBuzzArray(17);

    assertArrayEquals(expectedResult, result);
  }
}
