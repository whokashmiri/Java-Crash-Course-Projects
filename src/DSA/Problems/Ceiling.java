package DSA.Problems;

public class Ceiling {
    public static void main(String[] args) {
        //t = 6
        int arr [] ={1,2,3,4,5,6,7,8,9, 11 , 13 , 15};
        System.out.println(ceiling(arr , 12));

    }
    static int ceiling (int [] arr, int target){
        int start = 0;
        int end = arr.length-1;
        while(start <=end){
            int mid = start+ (end -start)/2;
            if(arr[mid] < target){
                start = mid+1;
            } else if (arr[mid]>target) {
                end = mid-1;

            }else{
                return mid;
            }
        }

        return start;
    }
}
