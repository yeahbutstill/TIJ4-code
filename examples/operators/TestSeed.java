package operators;

import java.util.Random;

public class TestSeed {
    public static void main(String[] args) {
        Random rand = new Random();
        int i;
        int j;
        int k;
        // Choose value from 1 to 100:
        j = rand.nextInt(20) + 1;
        System.out.println("j : " + j);
        k = rand.nextInt(20) + 1;
        System.out.println("k : " + k);
        i = j + k;
        System.out.println("j + k : " + i);
        i = j - k;
        System.out.println("j - k : " + i);
        i = k / j;
        System.out.println("k / j : " + i);
        i = k * j;
        System.out.println("k * j : " + i);
        i = k % j;
        System.out.println("k % j : " + i);
        j %= k;
        System.out.println("j %= k : " + j);

    }
}
