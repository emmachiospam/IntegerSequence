import java.util.NoSuchElementException;
public class Range implements IntegerSequence{
  private int start, end, current;

  public Range(int start, int end) {
    start = start;
    current = start;
    end = end;
  }

  public void reset() {
    current = start;
  }

  public int length() {
    int length = end - start + 1;
    return length;
  }

  public boolean hasNext() throws NoSuchElementException {
    if (current <= end) {
      return true;
    }
    else {
      return false;
    }
  }
}
