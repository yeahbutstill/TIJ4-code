package exe.ch03ex03;

/**
 * Ch03ex03
 * buat kelas yang berisi float dan gunakan untuk mendemonstrasikan aliasing
 * selama pemanggilan method
 */
public class Ch03ex03 {
    public static void main(String[] args) {
        MyClassFloat obj1 = new MyClassFloat();
        obj1.f = 10;
        System.out.println("obj1.f = " + obj1.f);
        g(obj1);
        System.out.println("obj1.f = " + obj1.f);
    }

    public static void g(MyClassFloat x) {
        x.f = 1000;
    }
}

class MyClassFloat {
    float f;
}
