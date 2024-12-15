package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Streams {
    public static void main(String[] args) {
        //Add numbers
//        List<Integer> list = Arrays.asList(5,4,6);
//      Optional<Integer> sum = list.stream().reduce((a,b)->a+b);
//        System.out.println(sum.get());

        //print average of numbers

        List<Integer> list = Arrays.asList(1,2,5,5);
        double avg = list.stream().mapToInt(e->e).average().getAsDouble();
        System.out.println(avg);



    }
}
