package DSA.Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class List2 {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Apricot");
        fruits.add("Cherry");
        fruits.add("Peach");
        for (String fruit: fruits){
            System.out.println(fruit);
        }

        for (int i = 0; i < fruits.size(); i++) {
            if(Objects.equals(fruits.get(i), "Cherry")){
                fruits.add("Plum");
                continue;

            }
            System.out.println(fruits.get(i));

        }
    }

}
