package inner;

public class First {

    public void call() {
        System.out.println("Hello from First");
    }

    public static void main(String[] args) {
        First first = new First(){
            @Override
            public void call() {
                System.out.println("Hello from anonymous class");
            }
        };
        first.call();
    }
    
}
