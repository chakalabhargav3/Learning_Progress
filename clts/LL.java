package clts;
import java.util.LinkedList;
import java.util.List;

public class LL {
    public static void main(String[] args) {
        List<Integer> cl = new LinkedList<Integer>();
        cl.add(980);
        cl.add(78);
        cl.add(45);
        cl.add(451);
        cl.add(7);
        cl.add(2);

        System.out.println("Index of 45 "+cl.indexOf(45));
        System.out.println(cl.get(4));
        for(Integer o : cl) {
            System.out.println(o);
        }

    }

}
