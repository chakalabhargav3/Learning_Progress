package best_approach;

public class B implements A {

    @Override
    public void m1() {
        System.out.println("Hello from m1");
    }

    @Override
    public void m2() {
        System.out.println("Hello from m2");
    }

    public static void main(String[] args) {
        B b = new B();
        System.out.println(A.x);
        b.m1();
        b.m2();
    }
    
}
