package wrapper;

public class First {
    public static void main(String[] args) {
        int a = 10;
        Integer i = new Integer(a); // Boxing
        System.out.println(i);
        int b = i.intValue(); // Unboxing
        System.out.println(b);

        double d = 12.34;
        Double d1 = new Double(d); // Boxing

            System.out.println(d1);
        double d2 = d1.doubleValue(); // Unboxing
        System.out.println(d2);
        
    }
    
}
