package day32;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashTableSampleCode {
    public static void main(String[] args) {

        //Hashtable ht = new Hashtable();

        Hashtable<Integer, String> ht = new Hashtable<Integer, String>();
        ht.put(99, "Rama");
        ht.put(98, "Raman");
        ht.put(97, "Rocky");
        //ht.put(null, "Null Value"); //NullPointerException
        //ht.put(10, null); //NullPointerException

        System.out.println(ht);

        System.out.println(ht.get(99)); //Rama

        //Entry() specific method
        for (Map.Entry entry : ht.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        //Iterator
        Set s = ht.entrySet();
        Iterator it = s.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            System.out.println(entry.getKey() + " " + entry.getValue());
        }


    }
}
