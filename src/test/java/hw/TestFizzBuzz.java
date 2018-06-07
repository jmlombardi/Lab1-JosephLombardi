 package hw;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

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
    ArrayList<String> expectedResult = new ArrayList<String>();
    expectedResult.add("Please enter a positive integer!");
    ArrayList<String> result = new ArrayList<>();
    result = fixture.fizzBuzzArray(-10);
    assertArrayEquals(expectedResult.toArray(), result.toArray());
  }

  @Test
  public void testNegOne() {
    ArrayList<String> expectedResult = new ArrayList<String>();
    expectedResult.add("Please enter a positive integer!");
    ArrayList<String> result = new ArrayList<>();
    result = fixture.fizzBuzzArray(-1);
    assertArrayEquals(expectedResult.toArray(), result.toArray());
  }


  @Test
  public void testZero() {
    ArrayList<String> expectedResult = new ArrayList<String>();
    expectedResult.add("Please enter a positive integer!");
    ArrayList<String> result = new ArrayList<>();
    result = fixture.fizzBuzzArray(0);
    assertArrayEquals(expectedResult.toArray(), result.toArray());
  }

  @Test
  public void testSeven() {
    ArrayList<String> expectedResult = new ArrayList<String>();
    expectedResult.add("1");
    expectedResult.add("2");
    expectedResult.add("Fizz");
    expectedResult.add("4");
    expectedResult.add("Buzz");
    expectedResult.add("Fizz");
    expectedResult.add("7");
    ArrayList<String> result = new ArrayList<>();
    result = fixture.fizzBuzzArray(7);
    assertArrayEquals(expectedResult.toArray(), result.toArray());
  }

  @Test
  public void test17() {
    ArrayList<String> expectedResult = new ArrayList<String>();
    expectedResult.add("1");
    expectedResult.add("2");
    expectedResult.add("Fizz");
    expectedResult.add("4");
    expectedResult.add("Buzz");
    expectedResult.add("Fizz");
    expectedResult.add("7");
    expectedResult.add("8");
    expectedResult.add("Fizz");
    expectedResult.add("Buzz");
    expectedResult.add("11");
    expectedResult.add("Fizz");
    expectedResult.add("13");
    expectedResult.add("14");
    expectedResult.add("FizzBuzz");
    expectedResult.add("16");
    expectedResult.add("17");
    ArrayList<String> result = new ArrayList<>();
    result = fixture.fizzBuzzArray(17);
    assertArrayEquals(expectedResult.toArray(), result.toArray());
  }

}
