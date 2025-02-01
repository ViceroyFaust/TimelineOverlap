package faust.viceroy;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class RangesTest {
  @Test
  public void testOverlapA() {
    Range range1 = new Range(0, 4);
    Range range2 = new Range(2, 5);

    assertTrue(Ranges.isOverlapping(range1, range2));
  }

  @Test
  public void testBackwardsOverlapA() {
    Range range1 = new Range(0, 4);
    Range range2 = new Range(2, 5);

    assertTrue(Ranges.isOverlapping(range2, range1));
  }

  @Test
  public void testNoOverlapA() {
    Range range1 = new Range(0, 4);
    Range range2 = new Range(5, 6);

    assertFalse(Ranges.isOverlapping(range1, range2));
  }
}
