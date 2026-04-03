package clts;

import java.util.TreeSet;
import java.util.Set;

public class Ss {

    public static void main(String[] args) {
        Set<Integer> cl = new TreeSet<Integer>();
        cl.add(980);    
        cl.add(78);
        cl.add(45);
        cl.add(451);
        cl.add(7);
        cl.add(2);
        cl.add(7);
        // cl.add(null);
        System.out.println(cl.contains(45));
        for(Integer o : cl) {
            System.out.println(o);
        }
    }
    
}
