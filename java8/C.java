package java8;

public class C implements A {

    

    public static void main(String[] args) {
        A a = () -> System.out.println("test method implemented in lambda expression");
        a.test();
    }

    @Override
    public void test() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'test'");
    }

}
