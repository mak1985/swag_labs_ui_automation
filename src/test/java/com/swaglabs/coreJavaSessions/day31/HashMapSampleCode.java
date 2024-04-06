package day31;

import java.util.HashMap;

public class HashMapSampleCode {
    public static void main(String[] args) {
        //HashMap m = new HashMap();
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(4, "David");
        hashMap.put(1, "Tom");
        hashMap.put(2, "Sam");
        hashMap.put(3, "Tim");
        hashMap.put(5, "Null Value");
        hashMap.put(6, "Null Value");
        hashMap.put(null, "Pooja");
        hashMap.put(null, "Manasa");
        System.out.println(hashMap);

        //Fetch
        System.out.println(hashMap.get(4)); // David

        //remove
        //System.out.println(hashMap.remove(4, "David"));
        System.out.println(hashMap.remove(4));
        System.out.println(hashMap);

        //containsKey()
        System.out.println(hashMap.containsKey(4));

        //containsValue()
        System.out.println(hashMap.containsValue("David"));

        //keySet()
        System.out.println(hashMap.keySet()); //[1, 2, 3]

        //values()
        System.out.println(hashMap.values()); //[Tom, Sam, Tim]

        //entrySet()
        System.out.println(hashMap.entrySet()); //[1=Tom, 2=Sam, 3=Tim]

        System.out.println("***************");

        for (Object i : hashMap.keySet()) {
            System.out.println(i);
        }

        System.out.println("***************");
        for (Object i: hashMap.values()) {
            System.out.println(i);
        }
        System.out.println("***************");
        for(Object i: hashMap.keySet()) {
            System.out.println(i+ " "+hashMap.get(i)); // key & value pair format
        }
    }
}
