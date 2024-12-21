package DSA.Problems;

import java.util.HashSet;

public class Problems {
    //Brute Force
    static void Duplicates(int[] arr){
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i+1; j < arr.length; j++) {
//                if(arr[i]==arr[j]){
//                    System.out.println("Duplicates" +arr[i]);
//                    break;
//                }
//            }
//        }

//Using Sorting
//        Arrays.sort(arr);
//        for (int i = 0; i < arr.length-1; i++) {
//            if(arr[i] == arr[i+1]){
//                System.out.println("Duplicates " +arr[i]);
//            }
//        }
        //Hashset

        HashSet<Integer> seen = new HashSet<>();
        for (int num:arr){
            if(!seen.add(num)){
                System.out.println(num);
            }
        }

    }

    public static void main(String[] args) {
        int arr [] = {4,5,4,6};
        Duplicates(arr);
    }
}
