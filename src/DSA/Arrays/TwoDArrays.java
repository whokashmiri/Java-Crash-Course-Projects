package DSA.Arrays;

import java.util.Arrays;

public class TwoDArrays {
    public static void main(String[] args) {
//        for (int i = 0; i <5 ; i++) {
//            for (int j = 0; j < 5; j++) {
//                System.out.print(i +" " + j );
//
//            }
//            System.out.println();
//
//        }

        int arr[][] = {
                {1,2,3},
                {4,5},
                {8,7,6,7}
        };

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i] [j]+" ");
//                System.out.println(Arrays.toString(arr[i,j));


            }
            System.out.println();

        }
    }
}
