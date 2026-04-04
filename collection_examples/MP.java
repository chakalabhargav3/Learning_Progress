package collection_examples;

import java.util.*;

public class MP {

    public static void main(String[] args) {
        Map<String,Integer> m = new HashMap<String,Integer>();
        m.put("A", 10);
        m.put("B", 20); 
        m.put("C", 30);
        m.put("D", 40);
        m.put("A", 50);
        // ArrayList<Integer> keys = ((Object) m.values()).toList();
        ArrayList<Integer> keys = new ArrayList<Integer>(m.values());
        for(Integer key : keys) {
            System.out.println(key);
        }
        System.out.println(m.get("A"));
    }

}
