package sequality;

import org.junit.Test;
import static org.junit.Assert.*;

public class task02Test {
  @Test
  public void testsort() {
    task02 test = new task02();
    String expected = "Average of 1 to 10 is 5.5. Distributed is 8.25.";
    assertEquals(expected, test.getDistributed(1, 10));
  }
}
