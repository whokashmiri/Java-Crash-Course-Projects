package DSA.Arrays;

import java.util.ArrayList;
import java.util.Collections;

public class List {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(2);
        list.add(23);
        list.add(20);
        list.add(3);
        list.add(29);
        list.add(36);
        list.add(0,44);
        System.out.println(list);
        for (int i = 0; i < 5; i++) {
            if(list.get(i) ==3){
                System.out.println(list.get(i));
            }
            System.out.println(list.get(i));
        }
    }
}
