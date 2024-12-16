package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Streams {
    public static void main(String[] args) {
        //Add numbers
//        List<Integer> list = Arrays.asList(5,4,6);
//      Optional<Integer> sum = list.stream().reduce((a,b)->a+b);
//        System.out.println(sum.get());

        //print average of numbers
//
//        List<Integer> list = Arrays.asList(1,2,5,5);
//        double avg = list.stream().mapToInt(e->e).average().getAsDouble();
//        System.out.println(avg);

//        List<Integer> list = Arrays.asList(10,50,5,4,50);
//        double avg =list.stream().map(e->e*e).filter(e->e>100).mapToInt(e -> e).average().getAsDouble();
//        System.out.println(avg);

        List<Integer> list = Arrays.asList(54,26,51,-26,245,256);
       List<Integer> list1 = list.stream().map(e->String.valueOf(e)).filter(e->e.startsWith("2"))
                .map(Integer::valueOf).collect(Collectors.toList());
        System.out.println(list1);



    }
}
