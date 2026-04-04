package collection_examples;

import java.util.ArrayList;
import java.util.Hashtable;

public class HT {
    public static void main(String[] args) {
            Hashtable<String,Integer> ht = new Hashtable<String,Integer>();
            ht.put("A", 10);
            ht.put("B", 20); 
            ht.put("C", 30);
            ht.put("D", 40);
            ht.put("A", 50);
            ArrayList<Integer> keys = new ArrayList<Integer>(ht.values());
            for(Integer key : keys) {
                System.out.println(key);
            }
            System.out.println(ht.get("A"));    
    }

}
