package collection_examples;

import java.util.Iterator;
import java.util.LinkedList;

public class LL {

    public static void main(String[] args) {
            LinkedList<Integer> list = new LinkedList<Integer>();
             list.add(10);
             list.add(20);
             list.add(30);
             list.add(40);
             list.add(50);

             Iterator<Integer> it = list.iterator();

             while(it.hasNext()) {
                System.out.println(it.next());
             }
    }

}
