package java8;

public class C implements A {

    

    public static void main(String[] args) {
        A a = () -> System.out.println("test method implemented in lambda expression");
        a.test();
    }

}
