package DSA.Problems;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        int arr [] ={1,2,3,4,5,6,7,8,9};
        System.out.println(OrAgBS(arr,7));
    }

    static int OrAgBS(int [] arr , int  target){
        int start = 0;
        int end = arr.length-1;
        boolean isAsc = arr[0] < arr[end];
        while (start<=end){
            int mid = start + (end - start)/2;
            if(arr[mid] == target){
                return mid;
            }
            if(isAsc){
                if(arr[mid] <target){
                    start = arr[mid] +1;
                }else  {
                    end = mid-1;
                }
            } else {
                if(arr[mid] > target){
                    end = arr[mid]-1;
                }else{
                    start = mid+1;
                }
            }



        }

        return -1;
    }
}
