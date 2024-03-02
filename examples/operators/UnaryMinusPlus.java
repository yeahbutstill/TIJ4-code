package operators;

/**
 * UnaryMinusPlus
 */
public class UnaryMinusPlus {
    public static void main(String[] args) {
        int a = 10;
        int b = 10;
        int x;
        x = -a;
        System.out.println("x = " + x);
        x = a * -b;
        System.out.println("x = " + x);
        x = a * (-b);
        System.out.println("x = " + x);
    }
}
