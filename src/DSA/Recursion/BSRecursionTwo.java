package DSA.Recursion;

public class BSRecursionTwo {
    public static void main(String[] args) {
        int [] arr = {12,35,68,98,100,101,150};
        System.out.println(BS(arr , 0, 0 , arr.length-1));

    }
    static  int BS(int [] arr, int target, int s , int e){
        if(s>e){
            return -1;
        }
        int m = s + (e-s)/2;
        if(arr[m] == target){
            return m;
        }
        if(target < arr[m]){
            return  BS(arr , target , s , m-1);
        }
        return BS(arr , target, m+1 , e);
    }
}
