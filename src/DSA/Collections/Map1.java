package DSA.Collections;

import java.util.*;

public class Map1 {
    public static void main(String[] args) {
        Map<Integer , String> map = new HashMap<>();
        map.put(1 ,"A");
        map.put(2 ,"B");
        map.put(3,"C");
        map.put(4,"D");
        map.put(5,"E");
        Set<Integer> keySet = map.keySet();
        System.out.println(keySet);
        Collection<String> set =  map.values();
        System.out.println(set);
        System.out.println();
        System.out.println(map);
        System.out.println(map.get(2));
        System.out.println(map);
        System.out.println(map.containsValue("C"));
        System.out.println(map.hashCode());
        System.out.println(map.replace(1,"A","Z"));
        System.out.println(map);
        System.out.println(map.remove(5));
        System.out.println(map);
    }
}
