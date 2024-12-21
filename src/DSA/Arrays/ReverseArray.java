package DSA.Arrays;

import java.util.Arrays;

public class ReverseArray {
    static  void rev (int [] arr){
        int st = 0;
        int end = arr.length-1;
        while (st <end){
            swap(arr , st, end);
            st++;
            end--;
        }

        for (int i = 0; i < arr.length ; i++) {
            System.out.println(arr[i]);

        }

    }
    static void swap(int [] arr , int idx1 , int idx2){
        int temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;
    }
    public static void main(String[] args) {
        int [] arr = {2,4,3,5};
        rev(arr);
//        for (int i = 0; i < arr.length ; i++) {
//            System.out.println(rev(arr[i]));
//
//        }
//        System.out.println(Arrays.toString(arr));

    }
}
