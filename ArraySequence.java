import java.util.NoSuchElementException;
public class ArraySequence implements IntegerSequence{
  private int currentIndex;
  private int[] data;

  /*Construct the sequence by copying values from the other array into the data array*/
  public ArraySequence(int [] other){
    data = new int[other.length];
    for(int i = 0; i < other.length; i++) {
      data[i] = other[i];
    }
  }

  public void reset() {
    currentIndex = data[0];
  }

  public int length() {
    int length = data.length;
    return length;
  }

  public boolean hasNext() {
    if (currentIndex < data.length) {
      return true;
    }
    else {
      return false;
    }
  }

  public int next() throws NoSuchElementException{
    if(hasNext()) {
      currentIndex++;
      return (data[currentIndex-1]);
    }
    else{
      throw new NoSuchElementException("there is not such element");
    }
  }
}
