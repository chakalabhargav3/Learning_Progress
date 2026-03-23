package java8;

public class B implements A {

    // @Override
    // public void test() {
    //     System.out.println("test method implemented in class B");
    // }

    public static void main(String[] args) {
        A a = new A(){
            @Override
            public void test() {
                System.out.println("test method implemented in anonymous class");
            }
        };
        a.test();
    }

    @Override
    public void test() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'test'");
    }
}
