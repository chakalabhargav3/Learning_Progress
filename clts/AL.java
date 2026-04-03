package clts;

import java.util.ArrayList;
// import java.util.Collection;
import java.util.List;
import java.util.Scanner;

public class AL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> cl = new ArrayList<Integer>();
        cl.add(980);
        cl.add(78);
        cl.add(45);
        cl.add(451);
        cl.add(7);
        cl.add(2);

        System.out.println("Index of 45 "+cl.indexOf(45));
        try{
        System.out.println(cl.get(6));
        for(Integer o : cl) {
            System.out.println(o);
        } 
    }
    catch(IndexOutOfBoundsException e) {
        System.out.println("Index out of bounds");
        sc.close();  
    }

}
}
