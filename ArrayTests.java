import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
  @Test
  public void testReverseInPlace() {
    int[] input1 = { 1, 2, 3, 4 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[] { 4, 3, 2, 1 }, input1);
    int[] input2 = { 3, 2, 1 };
    ArrayExamples.reverseInPlace(input2);
    assertArrayEquals(new int[] { 1, 2, 3 }, input2);
    int[] input3 = { 1 };
    ArrayExamples.reverseInPlace(input3);
    assertArrayEquals(new int[] { 1 }, input3);
    int[] input4 = {};
    ArrayExamples.reverseInPlace(input4);
    assertArrayEquals(new int[] {}, input4);

  }

  @Test
  public void testReversed() {
    int[] input1 = { 1, 2, 3, 4 };
    assertArrayEquals(new int[] { 4, 3, 2, 1 }, ArrayExamples.reversed(input1));
    int[] input2 = { 3, 2, 1 };
    assertArrayEquals(new int[] { 1, 2, 3 }, ArrayExamples.reversed(input2));
    int[] input3 = { 1 };
    assertArrayEquals(new int[] { 1 }, ArrayExamples.reversed(input3));
    int[] input4 = {};
    assertArrayEquals(new int[] {}, ArrayExamples.reversed(input4));
  }

  @Test
  public void testAverageWithoutLowest() {
    double[] input1 = { 1, 2, 3, 4 };
    assertEquals(3.0, ArrayExamples.averageWithoutLowest(input1), .01);
    double[] input2 = { 1, 1, 2, 3, 4 };
    assertEquals(2.25, ArrayExamples.averageWithoutLowest(input2), .01);
    double[] input3 = { 1 };
    assertEquals(0, ArrayExamples.averageWithoutLowest(input3), .01);
    double[] input4 = {};
    assertEquals(0, ArrayExamples.averageWithoutLowest(input4), .01);
  }
}
