package exe.operators;

import java.util.Date;
import net.mindview.util.Print;

public class E01PrintStatements {
  public static void main(String[] args) {
    Date now = new Date();
    System.out.println("Hello. it's " + now);
    Print.print("Hello. it's " + now);
  }
}
