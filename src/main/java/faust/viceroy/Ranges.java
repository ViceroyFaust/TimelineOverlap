package faust.viceroy;

/**
 * A utility class for Ranges.
 */
public class Ranges {

  /**
   * Checks whether two ranges are overlapping.
   *
   * @param a the first range
   * @param b the second range
   * @return true - overlap exists; false - no overlap
   */
  public static boolean isOverlapping(Range a, Range b) {
    return a.getStart() <= b.getEnd() && a.getEnd() >= b.getStart();
  }
}
