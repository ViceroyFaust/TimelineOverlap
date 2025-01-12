package faust.viceroy;

public class Range {
  private int start;
  private int end;

  public Range(int start, int end) {
    this.start = start;
    this.end = end;
  }

  public void setStart(int start) {
    this.start = start;
  }

  public void setEnd(int end) {
    this.end = end;
  }

  public int getStart() {
    return start;
  }

  public int getEnd() {
    return end;
  }

}
