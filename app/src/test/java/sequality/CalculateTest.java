package sequality;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculateTest {
  @Test
  public void Caluculatetest() {
    Calculate calculate = new Calculate();
    String expected = "Sum of 2 and 3 is 5. Average is 2.5.";
    assertEquals(expected, calculate.getSum(2, 3));
    String expected2 = "Sum of 1 to 10 is 55. Average is 5.5.";
    assertEquals(expected2, calculate.getSumXtoY(1, 10));
    String expected3 = "Sum of odd of 1 to 10 is 25. Sum of even is 30.";
    assertEquals(expected3, calculate.getSumOfOdd(1, 10));
  }

}
