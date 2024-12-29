package DSA.Collections;

import java.util.ArrayList;
import java.util.List;

public class List1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        list.add(10);
        list.add(45);
        list.add(10);

        list1.add(0);
        list1.add(4);
        list1.add(10);
        list1.add(3);
        System.out.println(list);
//        list.addAll(list1);
        list.removeAll(list1);
        System.out.println(list);
//        System.out.println(list.get(3));
//        list.remove(Integer.valueOf(1));
//        System.out.println(list);
    }
}
