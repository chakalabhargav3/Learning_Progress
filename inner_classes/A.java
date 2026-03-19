package inner_classes;

public class A {
    static int x = 10;

    public class B {
        public void print() {
            System.out.println("Hello from B:"+x);
        }
    }

    public static void main(String[] args) {
        A a = new A();
        B b = a.new B();
        b.print();
    }
    
}
