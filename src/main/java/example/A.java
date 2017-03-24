package example;

/**
 * Created by greatdreams on 03/03/17.
 */
public class A {
    public A() {
        System.out.println("AAAAAAA");
        System.out.println(100/0.00);
        throw new NullPointerException();
    }
}
