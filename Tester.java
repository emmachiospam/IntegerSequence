public class Tester {

  public static void main(String[] args) {
    IntegerSequence r = new Range(10,20);
    IntegerSequence as = new ArraySequence(r);

    System.out.println("ArraySequence(seq):");
    while(as.hasNext()){
      System.out.print(as.next()+", ");
    }
    System.out.println();
  }

}
