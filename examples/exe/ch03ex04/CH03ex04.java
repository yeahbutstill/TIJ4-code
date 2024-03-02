package exe.ch03ex04;

/**
 * CH03ex04
 * Write a program that calculates velocity using a constant distance
 * and a constant time
 */
public class CH03ex04 {
    public static void main(String[] args) {
        float s = 150;
        float t = 30;
        float v = Velocity.count(s, t);
        System.out.println("s = " + s + ", t = " + t + ", v = " + v);

        s = 152.15F;
        t = 8.3F;
        v = Velocity.count(s, t);
        System.out.println("s = " + s + ", t = " + t + ",v = " + v);
    }
}

class Velocity {
    static float count(float s, float t) {
        float v = s / t;
        return v;
    }
}
