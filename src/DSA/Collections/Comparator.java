package DSA.Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Comparator implements Comparable<Comparator.Animal> {

     int age;

    @Override
    public int compareTo(Animal o) {
        return this.age-o.age;
    }

    static class  Animal{
        int age;
        String name;




        public Animal(int age, String name) {
            this.age = age;
            this.name = name;
        }



        @Override
        public  String toString() {
            return "Animal{" +
                    "age=" + age +
                    ", name='" + name + '\'' +
                    '}';
        }






    }
    public static void main(String[] args) {
        Animal a1 = new Animal(2, "A");
        Animal a2 = new Animal(4, "VB");
        Animal a3 = new Animal(12, "AV");
        Animal a4 = new Animal(1, "V");
        List<Animal> dogs = new ArrayList<>();
        dogs.add(a1);
        dogs.add(a2);
        dogs.add(a3);
        dogs.add(a4);
//        System.out.println(Collections.sort());
//        System.out.println(dogs.sort(Animal));



    }

}
