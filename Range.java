import java.util.NoSuchElementException;
public class Range implements IntegerSequence{
  private int start, end, current;

  public Range(int startValue, int endValue) {
    start = startValue;
    current = start;
    end = endValue;
  }

  public void reset() {
    current = start;
  }

  public int length() {
    int length = end - start + 1;
    return length;
  }

  public boolean hasNext() {
    if (current <= end) {
      return true;
    }
    else {
      return false;
    }
  }

  public int next() throws NoSuchElementException{
    if(hasNext()) {
      current++;
      return (current - 1);
    }
    else{
      throw new NoSuchElementException("there is not such element");
    }
  }
}
