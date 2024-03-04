package operators;

/** Equivalence2 */
public class Equivalence2 {

  public static void main(String[] args) {
    Integer a = 45;
    Integer b = 45;

    System.out.println(a == b);
    System.out.println(a != b);
    System.out.println(a.equals(b));
    System.out.println();

    Value v1 = new Value();
    Value v2 = new Value();
    v1.i = v2.i = 100;
    System.out.println(v1.equals(v2));
  }
}

class Value {
  int i;
}
