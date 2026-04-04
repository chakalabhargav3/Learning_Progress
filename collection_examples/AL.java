package collection_examples;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AL {
    public static void main(String[] args) {
           List<Integer> list = new ArrayList<Integer>();
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
